defn: gives the idea of being a single system.

### Characteristics:
1. Computers operate concurrently. 
2. Computers fails independently. 
3. computers do not share a global clock.

Three topics, storage, computation, messaging. 

## Storage

### Single-Master storage.
    read >> writes. 
    (primary nodes taking write, secondary node taking reads)
    
    has broken consistency, 
        read from a node which might not have the latest data. (eventually consistent)
    
    now at some point the writes are very slow. 
    can apply sharding - multiple primary server. 
    can be joining shards, any operations between two different nodes is difficult. 
    if the reads are still slower we can add an index. 
    if the scale increases even more we can change our data model and de normalise the db. 

2 photos from april 19th&20th from the brown calendar 

### Computation.


### Messaging .

    loosely coupling subsystems. 
    consumed by subscribers. 
    produced by producers. 
    organized over topics. 
    processed by brokers. 


### Synchronisation

    point 3 in the characteristics of distributed systems. 
        -> there is no shared clock. 
        -> you can get clocks close, but not the same. 
    
    how can we figure out the time at a node in a distributed system. 

### NTP

    put a very accurate clock somewhere. 
    latency is an issue. 
    ntp measures and accounts for this latency.  
    uses layers of time servers called strata. 











