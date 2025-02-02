import com.child.Abstraction.*;
import com.parent.Abstraction.Animal;
import com.parent.Abstraction.Laptop;
import com.parent.Abstraction.Mobile;
import com.parent.Abstraction.Shapes;

public class Main {
    public static void main(String[] args) {
        Animal carnivore = new Carnivore();
        carnivore.setName("Leopard");
        carnivore.setColor("Yellowish with brown dots");
        carnivore.show();
        carnivore.numberOfLegs();

        Animal herbivore = new Herbivore();
        herbivore.setName("Rabbit");
        herbivore.setColor("Multi-colors White,Black,Brown");
        herbivore.show();
        herbivore.numberOfLegs();

        Animal omnivore = new Omnivore();
        omnivore.setName("Bear");
        omnivore.setColor("Multi-colors White,Black,Brown");
        omnivore.show();
        omnivore.numberOfLegs();

        System.out.println("---------------------------------");

        Laptop dell = new Dell();
        dell.setName("Dell Laptop");
        dell.setModel("2017");
        dell.show();
        dell.maximumPrice();

        Laptop hp = new Hp();
        hp.setName("Hp Laptop");
        hp.setModel("2023");
        hp.show();
        hp.maximumPrice();

        Laptop macbook = new MacBook();
        macbook.setName("MacBook Apple Laptop");
        macbook.setModel("2024");
        macbook.show();
        macbook.maximumPrice();

        System.out.println("---------------------------------");

        Mobile iphone = new Iphone();
        iphone.setName("Iphone Mobile");
        iphone.setColor("Silver Titanium");
        iphone.show();
        iphone.maximumRam();

        Mobile samsung = new Samsung();
        samsung.setName("Samsung Mobile");
        samsung.setColor("Jet Black");
        samsung.show();
        samsung.maximumRam();

        Mobile vivo = new Vivo();
        vivo.setName("Vivo Mobile");
        vivo.setColor("Aqua Blue");
        vivo.show();
        vivo.maximumRam();

        System.out.println("---------------------------------");

        Shapes circle = new Circle();
        circle.setName("Circle");
        circle.setTotalSides("Circle does not contain sides , It is oval type");
        circle.show();
        circle.calculateArea();

        Shapes square = new Square();
        square.setName("Square");
        square.setTotalSides("Four sides");
        square.show();
        square.calculateArea();

        Shapes triangle = new Triangle();
        triangle.setName("Triangle");
        triangle.setTotalSides("Three sides");
        triangle.show();
        triangle.calculateArea();

    }
}