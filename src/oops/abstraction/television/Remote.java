package oops.abstraction.television;

public class Remote extends Television{
    @Override
    void turnOn() {
        System.out.println("Turned On");
    }

    @Override
    void turnOff() {
        System.out.println("Turned Off");
    }
}
