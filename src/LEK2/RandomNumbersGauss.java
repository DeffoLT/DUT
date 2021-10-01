package LEK2;

public class RandomNumbersGauss {
    public static void main(String[] args) {
        double u = Math.random();
        double v = Math.random();
        double r = Math.sin(2 * Math.PI * v) * Math.pow(-2 * Math.log1p(u-1), 0.5);
        System.out.println(r);
    }
}