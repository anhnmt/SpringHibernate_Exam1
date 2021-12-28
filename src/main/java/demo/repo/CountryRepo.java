package demo.repo;

import demo.entities.Country;

import java.util.List;

public interface CountryRepo {
    List<Country> findAllCountries();

    boolean insertCountry(Country c);
}
