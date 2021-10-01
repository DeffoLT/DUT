package LEK2;

public class Gravity {
    public static void main(String[] args) {
        double x0 = Integer.parseInt(args[0]);
        double v0 = Integer.parseInt(args[1]);
        double t = Integer.parseInt(args[2]);
        final double g = 9.80665;
        System.out.println(x0 + v0 * t + g * t * t / 2);
    }
}