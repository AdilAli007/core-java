import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoComparator1 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car car = new Car(1500000,"Mehran", "2000");
        Car car1 = new Car(2000000,"City","2001");
        cars.add(car);
        cars.add(car1);

       Comparator<Car> nameSorter = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Collections.sort(cars,nameSorter);
        System.out.println("Name Sorter: "+cars);

        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                if (o1.getModel().compareTo(o2.getModel()) > 1) {
                    return 1;
                } else if (o1.getModel().compareTo(o2.getModel()) < 1) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println("Model Sorter: "+cars);
    }
}
