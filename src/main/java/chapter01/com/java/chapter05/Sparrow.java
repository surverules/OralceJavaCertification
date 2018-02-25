package chapter01.com.java.chapter05;

public class Sparrow extends Bird{

    public Sparrow(String name, Boolean canFly){
        super(name, canFly);
    }

    public Sparrow(){
    super("sparrow", true);
    }

    public static void main(String[] args) {

        Sparrow sparrow = new Sparrow();
        System.out.println(sparrow.getName() + " can fly in the sky:  " + sparrow.isCanFly());

    }
}
