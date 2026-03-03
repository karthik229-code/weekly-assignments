import java.util.Scanner;

public class EarthVolume {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double radius = 6378;
        double pi = 3.14159;

        double volumeKm = (4.0 / 3.0) * pi * Math.pow(radius, 3);
        //1km = 0.621 miles
        double volumeMiles = volumeKm * Math.pow(0.621371, 3);

        System.out.println("The volume of earth in cubic kilometers is " 
                + volumeKm + 
                " and cubic miles is " + volumeMiles);

        input.close();
    }
}