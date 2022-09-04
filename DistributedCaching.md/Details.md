Writing policies:
    how do we want to store data into database and cache

1. Write through cache:
    Write first to cache and then to database. (high latency issue)
2. Write-back cache:
    first written to cache, and then to database async. (can have stale data issue.)
3. Write-around cache:
    first written to database, and then updated onto the cache after read. 

Eviction policies:
    LRU least recently used. 
    MRU most recently used. 
    LFU least frequently used. 
    MFU most frequently used. 

Cache invalidation:
    use of ttl for a particular data.
    We can use either active expiration mechanism(daemon process) or passive (at the time of access) 

Memcached:
    caching system in the form of key value pair. 
    both need to be strings. (if not they need to be serialised)

    servers don't know about each other, there is no sync between them. hence it's pretty fast with no latency. 

    in facebook it sits between mysql and requesting client.

Redis:
    understands different data structures. 
    it separates data access from management. results in scalability & reliability.
    no strong consistency due to async replication. 