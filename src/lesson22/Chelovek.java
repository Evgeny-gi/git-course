package lesson22;

public class Chelovek {

    final String pol;
    Chelovek(String pol){
        this.pol = pol;
    }

    private String name;

    public String getName(){
        return name;
    }
    public void setName(String s){
        name = s;
    }
    private int vozrost;

    public int getVozrost(){
        return vozrost;
    }
    public void setVozrost(int i){
        if (i>0){
            vozrost = i;
        }
    }
    private int ves;
    public int getVes(){
        return ves;
    }
    public void setVes(int i){
        if (i>0){
            ves = i;
        }
    }

}
class Test{
    public static void main(String[] args) {
        Chelovek c = new Chelovek("male");
        c.setName("Vlad");
        c.setVozrost(35);
        c.setVes(65);
        System.out.println(c.getName());
        System.out.println(c.getVes());
        System.out.println(c.getVozrost());
    }
}
