import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoComparator {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car car = new Car(1500000,"Mehran", "2000");
        Car car1 = new Car(2000000,"City","2001");

        cars.add(car);
        cars.add(car1);

        Collections.sort(cars, new PriceSorter());

        for(Car c :cars){
            System.out.println("Price Sorter"+c);
        }

        Collections.sort(cars, new NameSorter());

        for(Car d :cars){
            System.out.println("Name Sorter"+d);
        }

        Collections.sort(cars, new ModelSorter() );

        for(Car e :cars){
            System.out.println("Model Sorter"+e);
        }

    }
}