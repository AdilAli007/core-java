public class Boeing implements Airport,Aeroplane {

    @Override
    public void passengerCapacity() {
        System.out.println("Boeing Passenger Capacity: Boeing plane has total capacity of 660 passengers");
    }

    @Override
    public void totalPlanes() {
        System.out.println("Boeing Total Planes: Boeing company has total 200 planes in world");
    }

    @Override
    public void aeroplaneName() {
        System.out.println("Aeroplane Name: Boeing 747");
    }

    @Override
    public void companyName() {
        System.out.println("Company Name: Boeing Company");
    }

    @Override
    public void countryName() {
        System.out.println("Country Name: United States");
    }
}
