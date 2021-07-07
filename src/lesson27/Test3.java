package lesson27;

public class Test3 {
    void marafon(int temperaturaVozduha, int tempBega) throws PodvernutNoguException{
        if (tempBega>12){
            throw new PodvernutNoguException("Темп бега был слишком высоким: " + tempBega);
        }
        if (temperaturaVozduha>32){
            throw new SveloMishcuException(); /**ЭКСЭПШН подсемейства RunTime, можно не делать try\catch и в сигнатеру не указывать, что даннай метод марафон выбрасывает этот эксэпшн*/
        }
        System.out.println("Вы пробежали марафон");
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        try {


        t.marafon(20,8);}
        catch (PodvernutNoguException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("В любом случае вы получите грамоту");
        }
    }
}

class PodvernutNoguException extends Exception {

    PodvernutNoguException(String message) {
        super(message);
    }

    PodvernutNoguException() {
    }
}

class SveloMishcuException extends RuntimeException {
    SveloMishcuException(String message) {
        super(message);
    }

    SveloMishcuException() {
    }

}
