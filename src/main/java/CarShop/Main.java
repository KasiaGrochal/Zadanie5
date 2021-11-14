package CarShop;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Country> businessMarketList = new ArrayList<>();
        List<Country> privateMarketList = new ArrayList<>();
        List<Country> sohoMarketList = new ArrayList<>();
        List<Country> governmentMarketList = new ArrayList<>();
        List<Country> vipMarketlist = new ArrayList<>();

        Country country = new Country("Poland");
        Country country1 = new Country("China");
        Country country2 = new Country("Netherlands");
        Country country3 = new Country("Denmark");
        Country country4 = new Country("Australia");

        Market business = new Market("Business", businessMarketList, country, country1, country3);
        Market privateUsage = new Market("Private", privateMarketList, country, country3, country2);
        Market soho = new Market("SOHO", sohoMarketList, country, country1, country2);
        Market gov = new Market("Government", governmentMarketList, country, country4, country2);
        Market vip = new Market("VIP", vipMarketlist, country4, country3, country1);
        business.addCountryToMarket(country4, businessMarketList);


        Dimension dimension1 = new Dimension(20, 20, 350);
        Dimension dimension2 = new Dimension(10, 10, 350);
        Dimension dimension3 = new Dimension(15, 15, 500);
        Dimension dimension4 = new Dimension(40, 30, 200);
        Dimension dimension5 = new Dimension(25, 18, 100);
        Dimension dimension6 = new Dimension(20, 19, 150);
        Dimension dimension7 = new Dimension(27, 21, 250);
        Dimension dimension8 = new Dimension(28, 22, 300);
        Dimension dimension9 = new Dimension(29, 23, 290);
        Dimension dimension10 = new Dimension(30, 29, 180);

        Producent producent1 = new Producent(Producent.Model.Z4_ROADSTER, Producent.Type.KABRIOLET);
        Producent producent2 = new Producent(Producent.Model.X3, Producent.Type.SUV);
        Producent producent3 = new Producent(Producent.Model.XC40, Producent.Type.SUV);
        Producent producent4 = new Producent(Producent.Model.i4M50, Producent.Type.COUPE);
        Producent producent5 = new Producent(Producent.Model.AVENSIS, Producent.Type.SEDAN);
        Producent producent6 = new Producent(Producent.Model.A3, Producent.Type.SEDAN);
        Producent producent7 = new Producent(Producent.Model.A4, Producent.Type.SEDAN);
        Producent producent8 = new Producent(Producent.Model.A6, Producent.Type.COUPE);
        Producent producent9 = new Producent(Producent.Model.S60, Producent.Type.COUPE);
        Producent producent10 = new Producent(Producent.Model.YARIS, Producent.Type.MIKRO);


        List<Car> carList = new ArrayList<>();

        Car carA = new Car(producent1, true, business, dimension3, Car.Segment.PREMIUM);
        Car carB = new Car(producent2, false, privateUsage, dimension4, Car.Segment.MEDIUM);
        Car carC = new Car(producent3, true, gov, dimension5, Car.Segment.STANDARD);
        Car carD = new Car(producent4, false, privateUsage, dimension7, Car.Segment.MEDIUM);
        Car carE = new Car(producent5, true, business, dimension9, Car.Segment.PREMIUM);
        Car carF = new Car(producent6, false, soho, dimension6, Car.Segment.STANDARD);
        Car carG = new Car(producent7, true, business, dimension2, Car.Segment.PREMIUM);
        Car carH = new Car(producent8, false, soho, dimension1, Car.Segment.MEDIUM);
        Car carI = new Car(producent9, true, business, dimension8, Car.Segment.STANDARD);
        Car carJ = new Car(producent10, false, business, dimension10, Car.Segment.PREMIUM);
        Car carK = new Car(producent1, true, privateUsage, dimension3, Car.Segment.MEDIUM);
        Car carL = new Car(producent1, true, business, dimension8, Car.Segment.PREMIUM);
        Car carM = new Car(producent1, false, gov, dimension8, Car.Segment.PREMIUM);
        Car carN = new Car(producent2, true, business, dimension4, Car.Segment.STANDARD);
        Car carO = new Car(producent3, false, vip, dimension7, Car.Segment.MEDIUM);

        carList.add(carA);
        carList.add(carB);
        carList.add(carC);
        carList.add(carD);
        carList.add(carE);
        carList.add(carF);
        carList.add(carG);
        carList.add(carH);
        carList.add(carI);
        carList.add(carJ);
        carList.add(carK);
        carList.add(carL);
        carList.add(carM);
        carList.add(carN);
        carList.add(carO);

        Car.filterCars(carList);


    }


}










