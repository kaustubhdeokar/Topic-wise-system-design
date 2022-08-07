Client ->  Server  -> DB
          (Cache)

caching:
    done on the server side, into ssd's such that the retrieval of the data is faster. 
    reducing of network calls. 
    reducing load on db. 
    

popular caching policy: 
    least recently used. (LRU)

problems:
    each time the user doesn't find the data in the cache, it is an extra call to the cache. 
    Thrashing - the caching policy does not work well as the data is hardly found in the cache. 

So where to place the cache ?

    - on the server side itself, in memory to each server. 
        - PROS: fast, good for a small amount of data.
        - CONS: 
        -   this can be dangerous if the server fails, it can take the cache down as well and as 
            a result, the data in both the servers might not be in sync. 
        -   this can be a problem in many cases as some financial records or so. 

    - can have some as a global cache, where each server queries the global cache. (REDIS)
    