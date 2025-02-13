package observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class ShopPublisher implements IPublisher{

    List<ISubscriber> subscribersList;

    public ShopPublisher() {
        this.subscribersList = new ArrayList<>();
    }

    @Override
    public void addSubscriber(ISubscriber s) {
        subscribersList.add(s);
    }

    @Override
    public void removeSubscriber(ISubscriber s) {
        subscribersList.remove(s);
    }

    @Override
    public void notifySubscribers() {
        for (ISubscriber iSubscriber : subscribersList) {
            iSubscriber.update();
        }
    }
}
