import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoCompareable {
    public static void main(String[] args) {
        List<Bike> bikeList = new ArrayList<>();
        Bike bike = new Bike(64000 ,"Unique");
        Bike bike1 = new Bike(100000, "CD");
        bikeList.add(bike);
        bikeList.add(bike1);
        Collections.sort(bikeList);
        System.out.println(bikeList);
    }
}
