package bookmyshow;

import java.sql.Time;
import java.util.Date;

public abstract class Event {


    public abstract void setLocation(Location location);
    public abstract void setDate(Date date);
    public abstract void setPerformer(String performer);
    public abstract void setTime(Time time);
    public abstract void setTotalOfSeats(int seats);

}
