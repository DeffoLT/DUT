package LEK2;

import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Integer.parseInt(args[0]);
        double y = Integer.parseInt(args[1]);

        double x1 = Math.sqrt((x * x) + (y * y));
        System.out.println("(0, 0) to " + "(" + (int)x + ", " + (int)y + ") is " + x1);
    }
}