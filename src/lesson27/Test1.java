package lesson27;

public class Test1 {
    public static void main(String[] args) {
        int [] array = {4,8,2};
        System.out.println("Massiv");

        try {
            System.out.println(array[5]);
            System.out.println("Good day");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Был пойман эксэпшн");
        }
        System.out.println("Этот код уже не имеет отношения к исключениям");
    }
}
