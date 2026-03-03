import java.util.Scanner;
public class pcmAvg {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Maths marks: ");
        float maths = input.nextFloat();

        System.out.print("Enter Physics marks: ");
        float physics = input.nextFloat();

        System.out.print("Enter Chemistry marks: ");
        float chemistry = input.nextFloat();

        float average = (maths + physics + chemistry) / 3;

        System.out.println("Average mark in PCM is " + average + "%");
        input.close();
    }
}