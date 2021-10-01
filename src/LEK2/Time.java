package LEK2;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();
        scanner.close();

        int hours = minutes / 60;
        int min = minutes % 60;
        System.out.println(hours + " hours and " + min + " minutes");
    }
}
