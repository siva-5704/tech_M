package minor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
public class Cust extends Rest {
	 HashMap<String,Integer>order = null;
	 Cust() {
			order = new HashMap<String,Integer>();
			
			}
	 void show()
	 {
		 super.dismenu();
	 }
	 void disorder()
		{
			System.out.println("ordered food items are :>");
			Set<String>food=order.keySet();
			for(String f : food)
			{
				
				System.out.println("item name is "+f+ " "+ order.get(f) +"*"+super.menu.get(f)+"="+order.get(f)*super.menu.get(f));
			}
		}
	 boolean addorder(String iname ,int quant)
	 {
		 if(menu.containsKey(iname)) 
		 {
			 order.put(iname, quant);
			 System.out.println("order added successfully");
				return true;
				}
				else
				{

					return false;
				}
		 }
	 void randomDish() {
	        System.out.println("🎉 Surprise Dish Selected! 🎉");
   
	        List<String> items = new ArrayList<>(menu.keySet());
     
	        Random random = new Random();
	     
	        String surpriseItem = items.get(random.nextInt(items.size()));
	        int price = menu.get(surpriseItem);
	        order.put(surpriseItem, 1);
            System.out.println("Your surprise dish is: " + surpriseItem);
	        System.out.println("Original Price: ₹" + price);
	        System.out.println("This item has been added to your order!");
	   
	 }

	    private String couponCode = "SAVE10";

	    void applyCoupon(String enteredCode, int total) {
	        if (enteredCode.equals(couponCode)) {
	            double discountAmount = total * 0.1; // 10% discount
	            int discountedTotal = total - (int) discountAmount;

	            System.out.println(" 🎈🎈 Coupon Applied Successfully! 🎈🎈");
	            System.out.println(" 10 % discount added....!!!");
	            System.out.println("Original Total: ₹" + total);
	            System.out.println("Discounted Total: ₹" + discountedTotal);
	        } else {
	            System.out.println("🙄🙄 Invalid Coupon Code! No discount applied.");
	            System.out.println("Final Bill: ₹" + total);
	        }
	    }
	
	    void bill() {
	        int total = 0;
	        Set<String> food = order.keySet();
	        for (String f : food) {
	            total += order.get(f) * super.menu.get(f);
	        }

	        System.out.println("The total bill amount is ₹" + total);

	        // Ask the user if they want to apply a coupon code
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Do you have a coupon code? (yes/no)");
	        String response = sc.nextLine();

	        if (response.equalsIgnoreCase("yes")) {
	            System.out.println("Enter your coupon code:");
	            String enteredCode = sc.nextLine();
	            applyCoupon(enteredCode, total); // Apply the coupon code
	        } else {
	            System.out.println("No coupon code applied. Final bill: ₹" + total);
	        }
	    }
	
}
