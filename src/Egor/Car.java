package Egor;

public class Car {

   private String name;
   private String model;

    Car(String n, String m){
        name = n;
        model = m;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}


