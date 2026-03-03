import java.util.Scanner;

public class kmToMile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();

        double miles = km * 1.6;

        System.out.println("The distance " + km + " km in miles is " + miles);
        input.close();
    }
}