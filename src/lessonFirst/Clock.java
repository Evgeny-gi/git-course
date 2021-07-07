package lessonFirst;

public class Clock {

    double time = 12.00;

    void timeUp(double timeUvelich){
        System.out.println("Do " + time);
        time += timeUvelich;
        System.out.println("posle " + time);

    }

    void timeDwn(double timeUmensh){
        System.out.println("Do " + time);
        time -= timeUmensh;
        System.out.println("posle " + time);

    }

}
class ClockTest{
    public static void main(String[] args) {
        Clock c1 = new Clock();
        c1.timeUp(12.9);
        c1.timeDwn(5.33);
    }
}
