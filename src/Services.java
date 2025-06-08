public class Services {
    private  String name;//servicename
    private double price;//serviceprice

    public Services(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
