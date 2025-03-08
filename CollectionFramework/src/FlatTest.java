import java.util.ArrayList;
import java.util.List;

public class FlatTest {
    public static void main(String[] args) {
        List<Flat> flats = new ArrayList<>();
        Flat flat = new Flat();
        flat.setName("A 62/2 HAPPY HOMES");
        flat.setOwnerName("HAJI SAHAB");
        flat.setAddress("CITIZEN, QASIMABAD");
        flat.setCity("HYDERABAD");
        flat.setNumberOfRooms("6 Rooms");
        flat.setNumberOfWashrooms("7 Washrooms");
        flat.setSingleStory(false);
        flat.setTotalPrice(5000000);
        flat.setMonthlyRent(30000);
        flat.setNumberOfKitchen(2);
        flats.add(flat);
        for(int i = 0; i < flats.size(); i++){
            System.out.println("List of Flat Objects: "+flats.get(i));
    }
}
}
