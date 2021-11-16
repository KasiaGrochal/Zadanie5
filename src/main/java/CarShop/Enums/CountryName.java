package CarShop.Enums;

public enum CountryName {
    POLAND("Polska"),
    CHINA("China"),
    AUSTRALIA("Australia"),
    DENMARK("Denmark"),
    NETHERLANDS("Netherlands");

    private String countryDisplay;

    CountryName(String countryDisplay) {
        this.countryDisplay = countryDisplay;
    }

    public String getCountryDisplay() {
        return countryDisplay;
    }
}
