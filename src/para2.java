public class para2 {     //На 2й парі ми рішали задачки, ось вони :)
    public static void main(String[] args) {
        System.out.println("№ 1.1 ");
        System.out.println("Welcome to Java, ");
        System.out.println("Welcome to Computer Science, ");
        System.out.println("Programming is fun.");

        System.out.println(" ");
        System.out.println("-----------------------------------------------------------");
        System.out.println(" ");

        System.out.println("№ 1.2 ");
        for (int a = 1; a <= 5; a++) {
            System.out.println("Welcome to Java");
        }

        System.out.println(" ");
        System.out.println("-----------------------------------------------------------");
        System.out.println(" ");

        System.out.println("№ 1.3 ");
        System.out.println("     J     A    V     V     A    ");
        System.out.println("     J    A A    V   V     A A   ");
        System.out.println("J    J   A A A    V V     A A A  ");
        System.out.println(" JJJ    A     A    V     A     A ");

        System.out.println(" ");
        System.out.println("-----------------------------------------------------------");
        System.out.println(" ");

        System.out.println("№ 1.4 ");
        System.out.println(" a    a^2  a^3 ");
        System.out.println(" 1    1    1   ");
        System.out.println(" 2    4    6   ");
        System.out.println(" 3    9    27  ");
        System.out.println(" 4    16   64  ");

        System.out.println(" ");
        System.out.println("-----------------------------------------------------------");
        System.out.println(" ");

        System.out.println("№ 1.5 ");
        System.out.println(9.5 * 4.5 - 2.5 * 3 / 45.5 - 3.5);

        System.out.println(" ");
        System.out.println("-----------------------------------------------------------");
        System.out.println(" ");

        System.out.println("№ 1.6 ");
        System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9);

        System.out.println(" ");
        System.out.println("-----------------------------------------------------------");
        System.out.println(" ");

        System.out.println("№ 1.7 ");
        System.out.println(4 * (1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11));
        System.out.println(4 * (1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13));

        System.out.println(" ");
        System.out.println("-----------------------------------------------------------");
        System.out.println(" ");

        System.out.println("№ 1.9 ");
        int formula;
        double width = 4.5;
        double height = 7.9;
        double area = width * height;
        System.out.println(area);

        System.out.println(" ");
        System.out.println("-----------------------------------------------------------");
        System.out.println(" ");

        System.out.println("№ 1.10 ");
        double mile = 1 / 1.6; // 1 mile = 1.6 km
        double mile1 = mile * 14; // 8.75 миль
        double time = 45.5 / 60; // 0.75 мин в час
        double speed = mile1 / time;
        System.out.printf("%.1f", speed);
        System.out.print(" km/h");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("-----------------------------------------------------------");
        System.out.println(" ");

        System.out.println("№ 1.11");
        long population = 312032486;
        double year = 3600 * 365 * 24;
        double birthday = year / 7;
        double dead = year / 13;
        double immigrant = year / 45;
        double delta = birthday - dead + immigrant;
        for (int a = 0; a < 5; a++) {
            population += delta;
            System.out.println((int) population);
        }

        System.out.println(" ");
        System.out.println("-----------------------------------------------------------");
        System.out.println(" ");

        System.out.println("№ 1.12");
        double km = 1.6 * 24; // 1.6 км = 1 миль ; відстань
        double times = (60 + 40.35) / 60; // 100.35 мин / 1 час ; час
        double kmspeed = km / times; // Середня швидкість
        System.out.printf("%.1f", kmspeed);
        System.out.print(" km/h");
    }
}
