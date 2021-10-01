package LEK2;

public class ThreeSoft {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        System.out.println(Math.min(Math.min(a, b), c));
        System.out.println((a + b + c) / 3);
        System.out.println(Math.max(Math.min(a, b), c));
    }
}
