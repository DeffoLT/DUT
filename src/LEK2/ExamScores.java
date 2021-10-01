package LEK2;

public class ExamScores {
    public static void main(String[] args) {
        int tru1 = Integer.parseInt(args[0]); //Количество правильных вопросов на первой части екзамена
        int blok1 = Integer.parseInt(args[1]); //Общее количество вопросов первой части
        int tru2 = Integer.parseInt(args[2]); //Количество правильных вопросов на второй части екзамена
        int blok2 = Integer.parseInt(args[3]); //Общее количество вопросов второй части

        int allblok = blok1 + blok2;
        int alltru = tru1 + tru2;
        double  bal = ((double)alltru / allblok) * 100;
        System.out.println("%" + bal);
    }
}
