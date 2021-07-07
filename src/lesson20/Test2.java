package lesson20;
import java.util.ArrayList;
public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Poka");
        list.add("Privet");
        list.add("ok");
        list.add(1, "Hello");


        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Petrov");
        list2.add("Sidorov");
        list.addAll(1,list2);
       /* for (int i = 0;i<list.size();i++)
        System.out.println(list.get(i));*/
        list.set(1, "!!!");
        for (String s : list) {
            System.out.print(s + " ");
        }
    }
}
