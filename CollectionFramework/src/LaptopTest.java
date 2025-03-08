import java.util.ArrayList;
import java.util.List;

public class LaptopTest {
    public static void main(String[] args) {
        List<Laptop> laptop = new ArrayList<>();
        Laptop laptop1 = new Laptop("DELL CORE i5","DELL","2020","7","USA","NEWYORK","9001",45000,50000,60000);
        laptop.add(laptop1);
        System.out.println("List of Laptop Object: "+laptop);
    }
}
