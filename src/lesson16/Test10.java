package lesson16;

public class Test10 {
    public static void main(String[] args) {
        String x = "Privet";
        String y = " Privet".trim();  // ТК СТОИТ ПРОБЕЛ, ТРИМ ЕГО УБИРАЕТ И СОЗДАЕТ НОВЫЙ ОБЪЕКТ, ПОЭТОМУ ФОЛС!!!!!!!
        System.out.println(x == y);
    }
}
