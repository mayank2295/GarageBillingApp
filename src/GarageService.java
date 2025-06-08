import java.util.*;
public class GarageService {
    private Map<String,Customer> customersMap;
    private List<Services> availableService;

    public GarageService() {
        this.customersMap = new HashMap<>();
        this.availableService = new ArrayList<>();
        loadServices();
    }
    public void loadServices(){
        availableService.add(new Services("Car Wash ",500));
        availableService.add(new Services("Oil change ",700));
        availableService.add(new Services("Wheel Alignment ",300));
        availableService.add(new Services("Tyre Replacement ",3000));
        availableService.add(new Services("Puncture ",50));

    }

    public void addCustomer(String name,String phone,String carNumber,String model){
        Car car = new Car(carNumber,model);
        Customer customer = new Customer(name,phone,car);
        customersMap.put(carNumber,customer);
        System.out.println("Customer Addes Succesfully");
    }
    public void createInvoice(String carNumber) {

        if (!customersMap.containsKey(carNumber)) {
            System.out.println("No Customer Found with Car No: " + carNumber);
            return;
        }
        Scanner sc= new Scanner(System.in);
        Customer customer = customersMap.get(carNumber);
        Invoice invoice = new Invoice(customer);

        System.out.println("Available Services");
        for (int i = 0; i < availableService.size(); i++) {
            System.out.println((i + 1) + ". " + availableService.get(i).getName() + " -$" + availableService.get(i).getPrice());
        }
        while(true){
            System.out.println("Enter Service Number to add or 0 to exit ");
            int choice = sc.nextInt();
            if(choice==0) break;
            if(choice>0 && choice<=availableService.size()){
                invoice.addService(availableService.get(choice-1));
                System.out.println("Service done");

            }
            else{
                System.out.println("Invalid Choice");
            }
        }
        invoice.getInvoice();
    }
}
