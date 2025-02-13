package bookmyshow;

import java.sql.Time;
import java.util.Date;

public class MovieEvent extends Event{

    private int id;
    private Location location;
    private Date date;
    private String name;
    private Time time;
    private int totalOfSeats;


    // MovieA
    // Mumbai - Thane, Navi, Kharghar
            // loc-1 ,  loc-2, loc-3
            // 12:00, 12:00, 12:00

    //movie_metadata -> movieid.
    //casts
    //metadata

    // 1001, loc1, 'MovieA', 12:00, 100,
    // 1002, loc2, 'MovieA', 12:00, 100
    // 1003, loc3, 'MovieA', 12:00, 100

    // 3 entries in db.


    //metadata.


    @Override
    public void setLocation(Location location) {

    }

    @Override
    public void setDate(Date date) {

    }

    @Override
    public void setPerformer(String performer) {

    }

    @Override
    public void setTime(Time time) {

    }

    @Override
    public void setTotalOfSeats(int seats) {

    }
}
