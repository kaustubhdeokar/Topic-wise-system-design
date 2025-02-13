package observer_pattern;

public class CustomerSubscriber implements ISubscriber {

    public CustomerSubscriber() {

    }

    @Override
    public void update() {
        System.out.println("on update.");
    }
}
