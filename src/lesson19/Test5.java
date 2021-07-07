package lesson19;

public class Test5 {
    public static void main(String[] args) {
        String [] students = {"ivanov","petrov","sidorov"};
        String [] eksams = {"mat analiz","phylosophy"};
        for (String s1: students){
            for (String s2:eksams){

                System.out.println(s1 + " " + s2);
            }
        }
    }
}
