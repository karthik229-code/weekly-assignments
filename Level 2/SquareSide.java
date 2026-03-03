import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter perimeter of square: ");
        double perimeter = input.nextDouble();

        double side = perimeter / 4;

        System.out.println("Square Details:");
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Side length = " + side);

        input.close();
    }
}