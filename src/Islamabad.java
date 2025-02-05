public class Islamabad implements Country, Capital {

    @Override
    public void location() {
        System.out.println("Capital City Province: Punjab");
    }

    @Override
    public void primeMinister() {
        System.out.println("Prime Minister Name: Shahbaz Shareef");
    }

    @Override
    public void provinces() {
        System.out.println("Total Provinces: 5");
    }

    @Override
    public void population() {
        System.out.println("Total Population of Pakistan: 240.54 million");
    }
}
