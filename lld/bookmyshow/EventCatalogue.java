package bookmyshow;

import java.util.List;

public class EventCatalogue {

    List<Event> eventList;

    public List<Event> getEventList() {
        return eventList;
    }

    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }


    public void removeEvent(Event event){
        eventList.remove(event);
    }

}
