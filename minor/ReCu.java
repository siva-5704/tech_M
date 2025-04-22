package minor;
import java.util.Scanner;

public class ReCu {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Cust ob1 = new Cust();
        ob1.addItem("poha", 100);
        
        System.out.println("Type 'exit' to quit the program.");

        while (true) {
            System.out.println("\nEnter the number for action --->");
            System.out.println("1 ---> Show menu");
            System.out.println("2 ---> Add order");
            System.out.println("3 ---> Display order");
            System.out.println("4 ---> Display bill");
            System.out.println("5 ---> Random Dish 🎉");
            System.out.println("Type 'exit' to quit");

            String ch = sc.nextLine(); 

           
            if (ch.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for using our restaurant app! Goodbye!");
                break; 
            }

         
            switch (ch) {
                case "1":
                    ob1.show();
                    break;

                case "2":
                    System.out.println("Enter the item you want to order:");
                    String namei = sc.nextLine();
                    System.out.println("Enter the quantity:");
                    int quan = Integer.parseInt(sc.nextLine());
                    ob1.addorder(namei, quan);
                    break;

                case "3":
                    ob1.disorder();
                    break;

                case "4":
                    ob1.bill();
                    break;

                case "5":
                    ob1.randomDish();
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

    }
}