package CarShop;

import CarShop.Enums.CountryName;

public class Country {
    private final char countrySign;
    private final CountryName countryName;

    public Country(CountryName countryName) {
        this.countryName = countryName;
        this.countrySign = getChar(countryName);
    }

    public char getChar(CountryName countryName) {
        return countryName.getCountryDisplay().charAt(0);
    }

    public String getCountryNameInFormat() {
        return this.countryName.getCountryDisplay() + " - " + this.countrySign;
    }
}
