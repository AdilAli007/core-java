public class Car {
    private String name ;
    private String model ;
    private String company ;
    private String manufacturedCountry ;
    private String manufacturedCity ;
    private String enginePower ;
    private String highSpeed ;
    private double price;
    private int cashPrice ;
    private int loanPrice ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getManufacturedCountry() {
        return manufacturedCountry;
    }

    public void setManufacturedCountry(String manufacturedCountry) {
        this.manufacturedCountry = manufacturedCountry;
    }

    public String getManufacturedCity() {
        return manufacturedCity;
    }

    public void setManufacturedCity(String manufacturedCity) {
        this.manufacturedCity = manufacturedCity;
    }

    public String getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(String enginePower) {
        this.enginePower = enginePower;
    }

    public String getHighSpeed() {
        return highSpeed;
    }

    public void setHighSpeed(String highSpeed) {
        this.highSpeed = highSpeed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCashPrice() {
        return cashPrice;
    }

    public void setCashPrice(int cashPrice) {
        this.cashPrice = cashPrice;
    }

    public int getLoanPrice() {
        return loanPrice;
    }

    public void setLoanPrice(int loanPrice) {
        this.loanPrice = loanPrice;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", company='" + company + '\'' +
                ", manufacturedCountry='" + manufacturedCountry + '\'' +
                ", manufacturedCity='" + manufacturedCity + '\'' +
                ", enginePower='" + enginePower + '\'' +
                ", highSpeed='" + highSpeed + '\'' +
                ", price=" + price +
                ", cashPrice=" + cashPrice +
                ", loanPrice=" + loanPrice +
                '}';
    }
}
