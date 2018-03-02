package chapter01.com.java.chapter05;

public class Reptile {

    protected boolean isHaveLegs(int legs) throws NoDateException {
            if (legs ==0) throw new NoDateException();

        return false;
    }
}
