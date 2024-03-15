
package electricitybillingsystem;

import java.util.Scanner;

public class ElectricityBillingSystem {

    static String name;
    static String address; 
    static String contact;
    static double wattsConsumed;
    static int originalWatts = 500;
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to the Electricity Billing System");
       
        System.out.println("Please enter your name");
        name = input.nextLine();

        System.out.println("Please enter Address");
        address = input.nextLine();

        System.out.println("Please enter contact details");
        contact = input.nextLine();
        
        showMenu();
        
 
    }

    private static void wattsConsumed() {
       Scanner input = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        wattsConsumed = input.nextDouble();

    }

    private static void calculateBill() {
       Scanner input=new Scanner(System.in);
        double fixedCharges = 5.50;
        double ratePerWatt = 0.5;
        
        double totalBill = (wattsConsumed * ratePerWatt) + fixedCharges;
       
        System.out.println("Bill for " + name + ": $" + totalBill);

    }

    private static void showMenu() {
       
        Scanner scanner = new Scanner(System.in);
       
       int choice;
       do {
        System.out.println("1. Buy More Watts");
        System.out.println("2. Check Remaining Watts");
        System.out.println("3. Calculate Bill");
         System.out.println("4. Exit");
       
        System.out.print("Enter choice: ");
        choice = scanner.nextInt();

          if (choice == 1) {
              System.out.println("Please select desired pack");
              buyWatts();
              
            } else if (choice == 2) {
                System.out.println("check remaining watts");
                checkWatts();
                
            } else if (choice ==3){
                System.out.println("Calculate Bill");
                wattsConsumed();
                calculateBill();
                
            } else if (choice == 4) {
                System.out.println("Exiting...");
                
                
            } else {
                if (choice != 4) {
                }
                System.out.println("Invalid choice");
            }
          
       }while (choice!=4);
       

    }

    private static void buyWatts() {
       Scanner input= new Scanner (System.in);
        System.out.println("Watts Packs Available: ");
       
        int[] wattsOptions = {100, 200, 300, 400, 500};
       
        for(int packs : wattsOptions) {
            System.out.print(packs + " ");
        }

        System.out.print("\nEnter Pack to Buy: ");       
        int buyWatts = input.nextInt();
       
        if(buyWatts > 0) {
           
           
            originalWatts += buyWatts;
           
            System.out.println(buyWatts + " watts added.");          
            System.out.println("Total watts now: " +originalWatts);
           
        } else {
           
            System.out.println("Invalid choice");
       
        }
    }
    private static void checkWatts() {
       Scanner input= new Scanner(System.in);
    
    int remainingWatts = (int) (originalWatts - wattsConsumed);

    if(remainingWatts <= 100) {
        System.out.println("Remaining watts low. Please add more.");
    } else {
        System.out.println("Remaining watts: " + remainingWatts);
    }

}

    }

