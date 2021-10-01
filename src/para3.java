public class para3 {
    public static void main(String[] args) {
        double x1 = 1234.56;
        System.out.println("simple double value " + x1);
        x1 = 1.23456e3;
        System.out.println("in formate " + x1);
        double x2 = 1.0 / 3;
        System.out.println("example of limited accuracy " + x2);
        x2 = x2 -1e-16;
        System.out.println(x2);
        double x4 = Math.sqrt(2);
        System.out.println("square root of 2 is equal " + x4);
        System.out.println("example of spec, values:");
        System.out.println(1.0 / 0);
        System.out.println(Math.sqrt(-1));
    }
}