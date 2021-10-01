package LEK2;

public class
OverflowOfIntValue {
    public static void main(String[] args) {
        int value = Integer.MAX_VALUE;
        int overflowValue = value + 1000;
        System.out.println(overflowValue);
        int value1 = Integer.MIN_VALUE;
        int overflowValue1 = value1 - 1000;
        System.out.println(overflowValue1);
    }
}
/*
    Тому що ціле число переповнюється.
    Коли він переповнюється, таке значення буде
    Integer.MIN_VALUE

    Якщо при додаванні цілих чисел відбувається переповнення,
    то результатом є молодші біти математичної суми,
    представлені в деякому досить великому форматі з доповненням до двох.
    Якщо відбувається переповнення,
    то знак результату не збігається зі знаком математичної суми двох значень операндів.
*/