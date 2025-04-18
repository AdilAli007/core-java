public class Car {
    private int price ;
    private String name ;
    private String model ;

    public Car(int price, String name, String model) {
        this.price = price;
        this.name = name;
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

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

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
