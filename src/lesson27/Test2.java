package lesson27;

public class Test2 {
    void abv() {
        int[] array = {1, 2, 3};
        try {
            System.out.println(array[7]);

        } catch (ArrayIndexOutOfBoundsException e) {
            String s = null;
            try {

                System.out.println(s.length());
            } catch (NullPointerException e2) {

            }
        } catch (NullPointerException e) {
            System.out.println("Poyman MullPointerException");
        }
    }

    public static void main(String[] args) {
        Test2 t = new Test2();
        t.abv();
    }
}
