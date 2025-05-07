public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        IObserver subscriber1 = new Subscriber("Adam");
        IObserver subscriber2 = new Subscriber("Sara");

        agency.addObserver(subscriber1);
        agency.addObserver(subscriber2);

        agency.notifyObservers("Breaking News: Observer Design Pattern!");

        agency.removeObserver(subscriber1);

        agency.notifyObservers("Update: Adam has unsubscribed.");
    }
}
