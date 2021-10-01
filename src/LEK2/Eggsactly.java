package LEK2;

import java.util.Scanner;

public class Eggsactly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int egg = scanner.nextInt();
        scanner.close();

        int box = egg / 12;
        int ost = egg % 12;

        System.out.println(box + " " + ost);
    }
}
