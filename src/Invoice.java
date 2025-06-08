import java.sql.SQLOutput;
import java.util.*;

public class Invoice {
    private Customer customer;
    private List<Services> servicelist;
    private double totalAmount;

    public Invoice(Customer customer){
        this.customer = customer;
        this.servicelist = new ArrayList<>();
        this.totalAmount = 0;
    }

    public void addService(Services service){
        servicelist.add(service);
        totalAmount += service.getPrice();
    }
    public void getInvoice(){
        System.out.println("-------------Invoice---------------");
        System.out.println("Customer: "+customer.getName()+" | Phone no "+customer.getPhone());
        System.out.println("Car: "+customer.getCar().getCarNumber()+" | Number: "+customer.getCar().getModel());
        System.out.println("Services:");
        for(Services service : servicelist){
            System.out.println("# "+service.getName()+" $"+service.getPrice());
        }
        System.out.println("Total Amount: $"+totalAmount);
        System.out.println("-------------Thank You--------------");

    }
}
