import java.util.Scanner;

import static java.lang.Math.round;

class Carcalculator {
    public static void main(String[] args) {
        final double kmpermile = 1 / 0.6214;
        final double litrespergallon = 8 * 0.5683;
        final double milespergallon = 30;
        final double priceperlitre = 1.34;

        Scanner ourscanner = new Scanner(System.in);
        boolean metricchoice = true;
        int metrics = 0;
        while (metricchoice) {
            System.out.println("Please choose kilometers (enter 1) or miles (enter 2)");
            metrics = ourscanner.nextInt();
            switch (metrics) {
                case 1:
                    System.out.println("You have chosen kilometers");
                    metricchoice = false;
                    break;
                case 2:
                    System.out.println("You have chosen miles");
                    metricchoice = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

        System.out.println("Please enter the distance of your journey");
        double distance = ourscanner.nextDouble();

        double distanceKm = 0;

        if (metrics == 1) {
            distanceKm = distance;
        } else {
            distanceKm = distance * kmpermile;
        }

        double kmpergallon = milespergallon * kmpermile;
        double kmperlitre = kmpergallon / litrespergallon;
        double metresperlitre = round(kmperlitre * 1000);
        double litresneeded = distanceKm / kmperlitre;
        double cost = litresneeded * priceperlitre;

        System.out.printf("Your Kilometers per gallon: %.2f%n", kmpergallon);
        System.out.printf("Your metres per litre: %.2f%n", metresperlitre);
        System.out.printf("This is your cost: %.2f%n", cost);
    }
}
