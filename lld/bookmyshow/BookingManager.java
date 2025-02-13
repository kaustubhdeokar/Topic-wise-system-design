package bookmyshow;

import java.util.concurrent.atomic.AtomicLong;

public class BookingManager {

    public static BookingManager instance;
    AtomicLong localState = new AtomicLong(0);

    public static BookingManager getInstance() {
        synchronized (BookingManager.class) {
            if (instance == null) {
                instance = new BookingManager();
            }
            return instance;
        }
    }

    // pessimistic lock - process the entry in a complete synchronized way.
    // one thread in the book function.
    // does not work.

    // optimistic lock
    // updatetimestamp, event, noOfSeats
    // database - updatedTimeStamp matches
    //process the query.
    //fetch the details from the manager and then try to book it.


    //
    //   LB ->  S1 | S2  - DB0

    // events table | state
    // ----               0

    //       <1001, loc1, 'MovieA', 12:00, 100> - <seat_ids>, dbSyncState
    // A book seats A1 B1 - 0
    // B book seats B1 C1 - s0 (1) rejected
    // B will do a fetch.
    // B will again query for booking state = 1
    // dbState = 0

    public boolean book(Event event, int noOfSeats) {

        //atomic

        synchronized (localState) {

            // SELECT FOR UPDATE - sql

            int dbSyncState = getDBState();
            if (localState.get() == dbSyncState) {
                long result = fireBook();
                localState.set(result);
                return true;
            }
        }
        return false;
    }


    private int getDBState() {
        //fetches from db.
        return 0;
    }

    private long fireBook() {
        return 0;
    }

}
