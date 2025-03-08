public class Flat {
    private String name ;
    private String ownerName ;
    private String address ;
    private String city ;
    private String numberOfRooms ;
    private String numberOfWashrooms ;
    private double totalPrice ;
    private double monthlyRent ;
    private int numberOfKitchen ;
    private boolean singleStory ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(String numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getNumberOfWashrooms() {
        return numberOfWashrooms;
    }

    public void setNumberOfWashrooms(String numberOfWashrooms) {
        this.numberOfWashrooms = numberOfWashrooms;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(double monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public int getNumberOfKitchen() {
        return numberOfKitchen;
    }

    public void setNumberOfKitchen(int numberOfKitchen) {
        this.numberOfKitchen = numberOfKitchen;
    }

    public boolean isSingleStory() {
        return singleStory;
    }

    public void setSingleStory(boolean singleStory) {
        this.singleStory = singleStory;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "name='" + name + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", numberOfRooms='" + numberOfRooms + '\'' +
                ", numberOfWashrooms='" + numberOfWashrooms + '\'' +
                ", totalPrice=" + totalPrice +
                ", monthlyRent=" + monthlyRent +
                ", numberOfKitchen=" + numberOfKitchen +
                ", singleStory=" + singleStory +
                '}';
    }
}
