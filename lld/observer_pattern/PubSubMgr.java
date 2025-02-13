package observer_pattern;

public class PubSubMgr {

    public void addSubscriberToPublisher(ISubscriber subscriber, IPublisher publisher){
        publisher.addSubscriber(subscriber);
    }

}
