package demo.controller;

import demo.entities.Country;
import demo.repo.CountryRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
public class CountryController {
    private final CountryRepo countryRepo;

    public CountryController(CountryRepo countryRepo) {
        this.countryRepo = countryRepo;
    }

//    @InitBinder
//    public void initBinder(WebDataBinder binder) {
//        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
//        binder.registerCustomEditor(Date.class, new CustomDateEditor(sf, true));
//    }

    @RequestMapping(value = {"/", "/listCountries"})
    public String listTrip(Model model) {
        List<Country> countries = countryRepo.findAllCountries();
        model.addAttribute("list", countries);
        return "listCountries";
    }

    @RequestMapping("/initInsertCountry")
    public String initInsertTrip(Model model) {
        Country p = new Country();
        model.addAttribute("p", p);
        return "insertCountry";
    }

    @RequestMapping("/insertCountry")
    public String insertTrip(@ModelAttribute("p") Country p, Model model, HttpServletRequest request) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        boolean bl = countryRepo.insertCountry(p);
        if (bl) {
            return "redirect:/listCountries";
        } else {
            model.addAttribute("error", "Insert failed!");
            model.addAttribute("p", p);
            return "insertCountry";
        }
    }
}
