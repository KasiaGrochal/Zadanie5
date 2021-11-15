package CarShop;

import java.util.List;

public class Car {

    private final Producent producent;
    private final boolean isAutomaticGear;
    private final Market market;
    private final Dimension dimension;
    private final Segment segment;

    public enum Segment {
        STANDARD, MEDIUM, PREMIUM
    }

    public Car(Producent producent, boolean isAutomaticGear, Market market, Dimension dimension, Segment segment) {
        this.producent = producent;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.dimension = dimension;
        this.segment = segment;
    }

    public static void filterCars(List<Car> carList) {
        for (Car car : carList) {
            if ((car.producent.getProducentName(car.producent.getModel()) == Producent.ProducentName.BMW) && (car.isAutomaticGear) && (car.dimension.getTankCapaity() > 300)) {
                System.out.println("Found matching car in the " + car.market.getName() + " Market.\n" + "It is available in the following countries:");
                for (Country country : car.market.getCountries()) {
                    System.out.println(country.getCountryNameInFormat());
                }
                System.out.println("");
            }
        }
    }

}



