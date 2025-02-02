import com.overriding.Artist;
import com.overriding.Eagle;
import com.overriding.Parrot;
import com.overriding.Teacher;
import com.polymorphism.Birds;
import com.polymorphism.Human;

public class Main {
    public static void main(String[] args) {
        Birds e = new Eagle();
        e.setName("Eagle");
        e.setColor("Multi colors");
        e.displayName();
        e.displayColor();

        e = new Parrot();
        e.setName("Parrot");
        e.setColor("Green , Yellow , White etc");
        e.displayName();
        e.displayColor();

        Human h = new Teacher();
        h.setName("JOHN");
        h.setAge(50);
        h.setEmpNo("12.JN");

        h.displayName();
        h.displayAge();
        h.displayEmpNo();

        h = new Artist();
        h.setName("ALEX");
        h.setAge(34);
        h.setEmpNo("10.ALX");

        h.displayName();
        h.displayAge();
        h.displayEmpNo();

    }
}
