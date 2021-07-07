package lesson24;

public class Test5 {


}

interface I1 {
    void abc();

    default void ghi() {
        System.out.println("Eto method ghi");
    }

    default void def() {  /**Дефолтный метод придуманный в джава 8. Дефолт обязательно пишется и у метода обязательно должно быть тело*/
        System.out.println("Eto method def");
    }
}

class Z2 implements I1 {
    public void abc() {
        System.out.println("Eto method abc");

    }

    public static void main(String[] args) {
        Z2 z = new Z2();
        z.abc();
        z.def();
        z.ghi();
        /** ЕСЛИ МЫ НЕ ПЕРЕЗАПИСЫВАЕМ ДЕФОЛТНЫЙ МЕТОД ИЗ ИНТЕРФЕЙСА, ТО МЫ МОЖЕМ ИСПОЛЬЗОВАТЬ ЕГО С ЕГО ДЕФОЛТНОЙ РЕАЛИЗАЦИЕЙ
         * DEFAULT у таких методов не является модификатором доступа и они все PUBLIC, независимо написали мы это или нет*/
    }

}
