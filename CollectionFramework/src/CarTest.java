import java.util.ArrayList;
import java.util.List;

public class CarTest {
    public static void main(String[] args) {
        List<Car> car = new ArrayList<>();
        Car car1 = new Car();
        car1.setName("Swift");
        car1.setCompany("Suzuki");
        car1.setCashPrice(5000000);
        car1.setLoanPrice(6000000);
        car1.setEnginePower("1100 CC");
        car1.setHighSpeed("240 K/H");
        car1.setManufacturedCity("KHI");
        car1.setManufacturedCountry("PAKISTAN");
        car1.setModel("2023");
        car1.setPrice(5000000);
        car.add(car1);
        System.out.println("List of Car Object: "+car);

    }
}
