// as a ui
import java.util.Scanner;
public class GarageBillingApp {
    public static void main(String args[]) {
        GarageService garageService = new GarageService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("-------------Car Service Center-------------");
            System.out.println("1. Add customer");
            System.out.println("2. Show Services");
            System.out.println("3. Exit");
            System.out.println("Enter your Choice");
            int choice = sc.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("Enter Customer Name: ");
                    String name = sc.next();
                    System.out.println("Enter Phone no : ");
                    String phone = sc.next();
                    System.out.println("Enter Car no: ");
                    String carNum = sc.next();
                    System.out.println("Enter Car Model:  ");
                    String carModel = sc.next();
                    garageService.addCustomer(name, phone, carNum, carModel);
                    break;
                case 2:
                    System.out.println("Enter Car number");
                    String carNo = sc.next();
                    garageService.createInvoice(carNo);
                    break;
                case 3:
                    System.out.println("Exiting ----Thank you----");

                        sc.close();


                    return;
                default:
                    System.out.println("Invalid choice Try again.");

            }

        }
    }
}