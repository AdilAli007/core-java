public class Laptop {
    private String name ;
    private String company ;
    private String model ;
    private String generation ;
    private String manufacturedCountry ;
    private String manufacturedCity ;
    private String deviceNo ;
    private int price ;
    private double cashPrice ;
    private double loanPrice ;

    public Laptop(String name, String company, String model, String generation, String manufacturedCountry, String manufacturedCity, String deviceNo, int price, double cashPrice, double loanPrice) {
        this.name = name;
        this.company = company;
        this.model = model;
        this.generation = generation;
        this.manufacturedCountry = manufacturedCountry;
        this.manufacturedCity = manufacturedCity;
        this.deviceNo = deviceNo;
        this.price = price;
        this.cashPrice = cashPrice;
        this.loanPrice = loanPrice;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", generation='" + generation + '\'' +
                ", manufacturedCountry='" + manufacturedCountry + '\'' +
                ", manufacturedCity='" + manufacturedCity + '\'' +
                ", deviceNo='" + deviceNo + '\'' +
                ", price=" + price +
                ", cashPrice=" + cashPrice +
                ", loanPrice=" + loanPrice +
                '}';
    }
}
