import java.util.ArrayList;
import java.util.List;

public class ScientistTest {
    public static void main(String[] args) {
        List<Scientist> scientists = new ArrayList<>();
        Scientist scientist = new Scientist();
        scientist.setName("Muhammad ibn Musa al-Khwarizmi");
        scientist.setAge(70);
        scientist.setMainSubjects("Mathematics");
        scientist.setOtherSubjects("Astronomy and Geography");
        scientist.setAchievement("To solve quadratic equations by completing the square, for which he provided geometric justifications");
        scientist.setNotableBooks("Al-Jabr, also known as The Compendious Book on Calculation by Completion and Balancing");
        scientist.setBornYear("c.780");
        scientist.setDeathYear("c.850");
        scientist.setEraName("Islamic Golden Age");
        scientist.setIdeas("Hindu-Arabic Numeral System");
        scientists.add(scientist);
        for(int i=0 ; i < scientists.size(); i++){
            System.out.println("List of Scientist Object: "+scientists.get(i));
        }
    }
}
