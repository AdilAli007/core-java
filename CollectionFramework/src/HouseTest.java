import java.util.ArrayList;
import java.util.List;

public class HouseTest {
    public static void main(String[] args) {
        List<House> houses = new ArrayList<>();
        House house = new House();
        house.setName("Bugti House");
        house.setOwnerName("Mohsin Bhai");
        house.setAddress("Punjab Colony, 16 No Street");
        house.setCity("Karachi");
        house.setNumberOfRooms("3 Rooms");
        house.setNumberOfWashrooms("2 Washrooms");
        house.setSingleStory(true);
        house.setTotalPrice(5000000);
        house.setMonthlyRent(30000);
        house.setNumberOfKitchen(1);
        houses.add(house);
        for(int i = 0; i<houses.size();i++){
            System.out.println("List of House Object: "+houses.get(i));
        }
    }
}
