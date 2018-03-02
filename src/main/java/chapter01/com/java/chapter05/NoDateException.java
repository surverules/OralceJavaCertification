package chapter01.com.java.chapter05;

public class NoDateException extends Exception {

    String message = "no Matching data";

    @Override
    public String getMessage() {
        return this.message;
    }
}
