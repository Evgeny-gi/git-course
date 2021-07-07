package Egor;

    public class CarTest {

        public static void main(String[] args) {
            Car c = new Car("BMV","i8");

            //System.out.println(c.getName() + ": " + c.getModel());
            changeName(c);
            changeModel(c);
            System.out.println(c.getName() + ": " + c.getModel());
        }

        static public void changeName(Car car){
            car.setName("MERSEDES");
        }

        static public void changeModel(Car car){
            car.setModel("TTT");
        }

}
