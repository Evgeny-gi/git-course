package lesson20;
import java.util.ArrayList;
public class Test3 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("ok");
        StringBuilder sb3 = new StringBuilder("Privet");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        for (int i = 0; i < list.size(); i++) {
            list.get(i).append("!!!");
        }
        for (StringBuilder sb : list) {
            System.out.print(sb + " ");
        }
        System.out.println();
        list.remove(2);
       // list.remove(sb1); //удаление по объекту
       // list.remove("ok"); так же удаление по объекту
        for (StringBuilder sb : list) {
            System.out.print(sb + " ");

        }
    }
}
