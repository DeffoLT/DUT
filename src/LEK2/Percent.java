package LEK2;

import java.util.Scanner;

public class Percent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double t = scanner.nextDouble();
        double P = scanner.nextDouble();
        double r = scanner.nextDouble();
        System.out.println(P * Math.pow(Math.E, r * t));
    }
}