### Writing Policies
    > Refer c.Caching # Cache  invalidation. 

### Eviction policies
    1. LRU
    2. MRU
    3. LFU - least frequently used.
    4. MFU - most frequently used.

### Cache invalidation
    active expiration (ttl)
    passive (at the time of access)

### Architectural change
    
    1.We can either have dedicated cache servers, ie. we separate web servers & application servers from cache servers. 

    This gives us flexibility to choose different hardwares, possible to scale web & application servers differently. 

    2. same server, beneficial monetary wise.

    > Also, hash function should be used for the selection of cache servers, but what entity performs this ? Cache client. 

### Functional requirements

    1. Ability to read & write

### Non-functional 

    > High performance
    > Scalability
    > High availability
    > Consistency
    > Affordability

### Design
```
Client -> Load balancer -> Client services     Cache servers () 
                        -> Client services  -> Cache servers () ->  Storage.
                        -> Client services     Cache servers () 
```

client services are connected to all cache servers. 

Limitations:
