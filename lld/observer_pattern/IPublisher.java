package observer_pattern;

public interface IPublisher {
    void addSubscriber(ISubscriber s);
    void removeSubscriber(ISubscriber s);
    void notifySubscribers();
}
