public class ConcurrencyControl {

    //shared lock - read lock
    //exclusive lock - write/read lock.

    //shared lock present - another shared lock can be requested.
    //if exclusive lock is present no other lock can be requested.
    //locks of opposite type cannot be requested.

    // two phase locking
    // 1st phase - growing phase - process can only acquire lock.
    // if any lock is to be upgraded - it can be done now, after this step is done, it is deemed to have all necessary locks and perform the action.
    // 2nd phase - shrinking phase - process can only release the lock.
    //if any lock is to be downgraded - it can be done now.

    /*

            for (Lock lock : acquiredLocks) {
                lock.unlock();  // <-- Locks released here!
            }

            // Commit happens after locks are released
            commit();  // Potential issue: other transactions can see uncommitted data
    */

    //strict 2-pl
    // only releases the locks after commit / rollback is done.


    /*
            updateResource1();
            updateResource2();

            // Commit first
            commit();  // <-- Commit happens while still holding locks

            // Release locks AFTER commit
            for (Lock lock : acquiredLocks) {
                lock.unlock();
            }
     */



}
