package homeWorkAgain;

public class Time {

    public static void chas(){

        OUTER:for (int Chas = 0;Chas<=6;Chas++) {


            MIDDLE:
            for (int minuta = 0; minuta <= 59; minuta++) {


                INNER:
                for (int sekunda = 0; sekunda <= 59; sekunda++) {
                    System.out.println(Chas + ":" + minuta + ":" + sekunda);

                }

            }
        }
        }


    public static void main(String[] args) {
        Time t = new Time();
        chas();
    }

}
