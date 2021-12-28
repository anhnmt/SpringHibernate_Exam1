package demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TblCountries")
public class Country {
    @Id
    @Column(name = "CountryId", columnDefinition = "varchar(10)", nullable = false, unique = true)
    private String countryId;

    @Column(name = "CountryName", columnDefinition = "nvarchar(200)")
    private String countryName;

    @Column(name = "Area")
    private Double area;

    @Column(name = "Population")
    private Integer population;

    public Country() {
        super();
    }

    public Country(String countryId, String countryName, Double area, Integer population) {
        this.countryId = countryId;
        this.countryName = countryName;
        this.area = area;
        this.population = population;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String tripId) {
        this.countryId = tripId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String tripName) {
        this.countryName = tripName;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }
}
