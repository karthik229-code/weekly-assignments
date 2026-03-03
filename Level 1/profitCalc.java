import java.util.Scanner;

public class profitCalc {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Cost Price: ");
        double costPrice = input.nextDouble();

        System.out.print("Enter Selling Price: ");
        double sellingPrice = input.nextDouble();

        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;

        System.out.println(
            "The Cost Price is INR " + costPrice +
            "\nThe Selling Price is INR " + sellingPrice +
            "\nThe Profit is INR " + profit +
            "\nThe Profit Percentage is " + profitPercentage + "%"
        );
        input.close();
    }
}