package chapter01.com.java.chapter05;

public class Snake extends Reptile {

    public static void main(String[] args) {
        Snake snake = new Snake();
        try {
            snake.isHaveLegs(0);

        } catch (NoDateException no) {
            System.out.println(no.message);

        }
    }
}
