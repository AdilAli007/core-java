import java.util.ArrayList;
import java.util.List;

public class BikeTest {
    public static void main(String[] args) {
        List<Bike> bike = new ArrayList<>();
        Bike bike1 = new Bike();
        bike1.setName("CD");
        bike1.setCompany("HONDA");
        bike1.setCashPrice(150000);
        bike1.setLoanPrice(200000);
        bike1.setEnginePower("70 CC");
        bike1.setHighSpeed("120 K/H");
        bike1.setManufacturedCity("LAHORE");
        bike1.setManufacturedCountry("PAKISTAN");
        bike1.setModel("2025");
        bike1.setPrice(150000);
        bike.add(bike1);
        System.out.println("List of Bike Object: "+bike);

    }
}
