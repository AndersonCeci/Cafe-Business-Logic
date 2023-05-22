import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class CafeUtil {
    public int getStreakGoal(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the week number: ");
        int numWeeks = scanner.nextInt();
        int sum = 0;


        for (int i = 1; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;

    }

    public double getOrderTotal(double[] prices){
        double sum = 0;
        for (double price : prices){
            sum += price;
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for (int i = 0; i<menuItems.size(); i++){
            String menuItem = menuItems.get(i);
            System.out.println(menuItem);
        }
    }
    public void addCustomer(ArrayList<String> customers){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String userName = scanner.nextLine();
        System.out.println("Hello, "+userName);
        customers.add(userName); // to add an item to an ArrayList
        for (int i = 0; i<customers.size(); i++){
            System.out.println("There are "+i+" people in front of you");
            System.out.println(customers);
        }



    }
    public void printPriceChart(String product, double price, int maxQuantity){

        System.out.println(product);
        for (int i = 1; i<=maxQuantity; i++){
            double sum = i*price;
            System.out.println(i +" - "+sum);
        }
    }

}
