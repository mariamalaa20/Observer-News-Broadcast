
public class Subscriber implements IObserver {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Message for " + name + ": " + message);
    }
}
