package CarShop;

public class Country {
    private final String countryName;
    private final char countrySign;

    public Country(String countryName) {
        this.countryName = countryName;
        this.countrySign = getChar(countryName);
    }

    public char getChar (String countryName){
        return countryName.charAt(0);
    }

    public String getCountryNameInFormat() {
        return this.countryName + " - " + this.countrySign;
    }
}
