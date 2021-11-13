package CarShop;

import java.util.List;

public class Market {
    private String name;
    private List<Country> countries;


    public Market(String name, List<Country> countries, Country country1, Country country2, Country country3) {
        this.name = name;
        this.countries = countries;
        countries.add(country1);
        countries.add(country2);
        countries.add(country3);
    }

    public void addCountryToMarket(Country newCountry, List<Country> marketCountryList) {
        marketCountryList.add(newCountry);
    }

    public String getName() {
        return name;
    }

    public List<Country> getCountries() {
        return countries;
    }
}
