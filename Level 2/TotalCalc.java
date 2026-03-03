import java.util.Scanner;

public class TotalCalc {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("Purchase Details:");
        System.out.println("Unit Price = INR " + unitPrice);
        System.out.println("Quantity = " + quantity);
        System.out.println("Total Purchase Price = INR " + totalPrice);

        input.close();
    }
}