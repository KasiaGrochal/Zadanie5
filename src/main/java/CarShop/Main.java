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

        Country poland = new Country("Poland");
        Country china = new Country("China");
        Country netherlands = new Country("Netherlands");
        Country denmark = new Country("Denmark");
        Country australia = new Country("Australia");

        Market business = new Market("Business", businessMarketList, poland, china, denmark);
        Market privateUse = new Market("Private", privateMarketList, poland, denmark, netherlands);
        Market soho = new Market("SOHO", sohoMarketList, poland, china, netherlands);
        Market gov = new Market("Government", governmentMarketList, poland, australia, netherlands);
        Market vip = new Market("VIP", vipMarketlist, australia, denmark, china);
        business.addCountryToMarket(australia, businessMarketList);


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

        Producent bmw = new Producent(Producent.Model.Z4_ROADSTER, Producent.Type.KABRIOLET);
        Producent bmw2 = new Producent(Producent.Model.X3, Producent.Type.SUV);
        Producent volvo1 = new Producent(Producent.Model.C30, Producent.Type.SUV);
        Producent bmw3 = new Producent(Producent.Model.i4M50, Producent.Type.COUPE);
        Producent toyota = new Producent(Producent.Model.AVENSIS, Producent.Type.SEDAN);
        Producent audi = new Producent(Producent.Model.A3, Producent.Type.SEDAN);
        Producent toyota3 = new Producent(Producent.Model.COROLLA, Producent.Type.SEDAN);
        Producent audi1 = new Producent(Producent.Model.A6, Producent.Type.COUPE);
        Producent volvo = new Producent(Producent.Model.S60, Producent.Type.COUPE);
        Producent toyota1 = new Producent(Producent.Model.YARIS, Producent.Type.MIKRO);


        List<Car> carList = new ArrayList<>();

        Car bmwRoadster = new Car(bmw, true, business, dimension3, Car.Segment.PREMIUM);
        Car bmwRoadster_2 = new Car(bmw, true, privateUse, dimension3, Car.Segment.MEDIUM);
        Car bmwX3 = new Car(bmw2, false, privateUse, dimension4, Car.Segment.MEDIUM);
        Car bmwX3_2 = new Car(bmw2, true, business, dimension8, Car.Segment.PREMIUM);
        Car bmwI4M50 = new Car(bmw3, false, privateUse, dimension7, Car.Segment.MEDIUM);
        Car volvoC30 = new Car(volvo1, true, gov, dimension5, Car.Segment.STANDARD);
        Car volvoS60 = new Car(volvo, true, business, dimension8, Car.Segment.STANDARD);
        Car volvoS60_2 = new Car(volvo, false, gov, dimension2, Car.Segment.MEDIUM);
        Car toyotaAvensis = new Car(toyota, true, business, dimension9, Car.Segment.PREMIUM);
        Car toyotaAvensis_2 = new Car(toyota, false, privateUse, dimension7, Car.Segment.MEDIUM);
        Car toyotaYaris = new Car(toyota1, false, business, dimension10, Car.Segment.STANDARD);
        Car toyotaCorolla = new Car(toyota3, true, vip, dimension2, Car.Segment.MEDIUM);
        Car audiA6 = new Car(audi1, false, soho, dimension1, Car.Segment.MEDIUM);
        Car audiA6_2 = new Car(audi1, true, business, dimension8, Car.Segment.PREMIUM);
        Car audiA3 = new Car(audi, false, soho, dimension6, Car.Segment.STANDARD);

        carList.add(bmwRoadster);
        carList.add(bmwRoadster_2);
        carList.add(bmwX3);
        carList.add(bmwX3_2);
        carList.add(bmwI4M50);
        carList.add(volvoC30);
        carList.add(volvoS60);
        carList.add(volvoS60_2);
        carList.add(toyotaAvensis);
        carList.add(toyotaAvensis_2);
        carList.add(toyotaYaris);
        carList.add(toyotaCorolla);
        carList.add(audiA6);
        carList.add(audiA6_2);
        carList.add(audiA3);

        Car.filterCars(carList);


    }


}










