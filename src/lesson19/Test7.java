package lesson19;

public class Test7 {
    static class Xxx {
    }

    public static void main(String[] args) {
        String[] array = {"privet", "poka", "ok"};
        for (String s : array) {
            s = new String("hello");
        }


        for (int i = 0; i < args.length; i++) {
            System.out.print(array[i] + " ");

        }
    }
}

