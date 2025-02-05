public class Cat implements Animal,AnimalTwo{

    @Override
    public void nameOne() {
        System.out.println("Animal One Name: Cheetah");
    }

    @Override
    public void eatOne() {
        System.out.println("Cheetah: Cheetah is carnivore kills another animals for living");
    }

    @Override
    public void soundOne() {
        System.out.println("Sound: It makes sound like tiger");
    }

    @Override
    public void name() {
        System.out.println("Animal Two Name: Cat");
    }

    @Override
    public void eat() {
        System.out.println("Cat: Cat eats mouses");
    }

    @Override
    public void sound() {
        System.out.println("Sound: Cat makes sound meaow meaow");
    }

    @Override
    public void run() {
        System.out.println("Run: Cat runs fast");
    }

    @Override
    public void numberOfLegs() {
        System.out.println("Legs: Cat has four legs");
    }
}

