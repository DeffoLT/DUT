package LEK2;

public class RandomNumbers  {
    public static void main(String[] args) {
        int max = Integer.parseInt(args[0]);
        int min = Integer.parseInt(args[1]);
        int rand = (int) (Math.random() * (max - min) + min);
        System.out.println(rand);
    }
}
