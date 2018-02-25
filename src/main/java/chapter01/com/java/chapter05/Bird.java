package chapter01.com.java.chapter05;

public class Bird {

    private String name;
    private boolean canFly;

    public  Bird(String name, boolean canFly){
            this.name = name;
            this.canFly = canFly;
    }

    public String getName() {
        return name;
    }

    public boolean isCanFly() {
        return canFly;
    }


}
