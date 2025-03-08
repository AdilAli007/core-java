import java.util.ArrayList;
import java.util.List;

public class UniversityTest {
    public static void main(String[] args) {
        List<University> universities = new ArrayList<>();
        University university = new University("SINDH UNIVERSITY","JAMSHORO","JAMSHORO MAIN INDUS HIGHWAY","SAIN KALHORO",52,10,3,100000,50000,45000);
        universities.add(university);
        for(int i=0; i < universities.size(); i++){
            System.out.println("List of University Object: "+universities.get(i));
        }
    }
}
