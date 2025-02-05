//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat t = new Cat();
        System.out.println("------Animal One Details-------");
        t.nameOne();
        t.eatOne();
        t.soundOne();

        System.out.println("------Animal Two Details--------");
        t.name();
        t.eat();
        t.sound();
        t.run();
        t.numberOfLegs();

        System.out.println("----------Airport & Aeroplane-------");
        Boeing boeing = new Boeing();
        boeing.aeroplaneName();
        boeing.countryName();
        boeing.companyName();
        boeing.passengerCapacity();
        boeing.totalPlanes();

        System.out.println("---------Market & Employee------------");
        ImtiazMarket imtiazMarket = new ImtiazMarket();
        imtiazMarket.name();
        imtiazMarket.address();
        imtiazMarket.totalBranches();
        imtiazMarket.empName();
        imtiazMarket.empNo();
        imtiazMarket.salary();

        System.out.println("-------------Country & Capital----------");
        Islamabad islamabad = new Islamabad();
        System.out.println("Country Name: "+Country.name);
        islamabad.primeMinister();
        islamabad.population();
        islamabad.provinces();
        System.out.println("Capital Name: "+Capital.name);
        islamabad.location();

        System.out.println("------------ Division & District-----------");
        Qasimabad qasimabad = new Qasimabad();
        System.out.println("Division Name: "+Division.name);
        qasimabad.populationOfDivision();
        qasimabad.totalUniversities();
        qasimabad.totalCities();
        qasimabad.districtTalukas();
        qasimabad.districtPopulation();
    }

}