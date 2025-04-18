import java.util.Comparator;

public class NameSorter implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if(o1.getName().compareTo(o2.getName())>1){
            return 1 ;
        }else if (o1.getName().compareTo(o2.getName())<1){
            return -1 ;
        }else{
            return 0 ;
        }
    }
}
