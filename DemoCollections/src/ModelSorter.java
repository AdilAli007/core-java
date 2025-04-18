import java.util.Comparator;

public class ModelSorter implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if(o1.getModel().compareTo(o2.getModel())>1){
            return 1;
        }else if (o1.getModel().compareTo(o2.getModel())<1){
            return -1;
        }else{
            return 0 ;
        }
    }
}
