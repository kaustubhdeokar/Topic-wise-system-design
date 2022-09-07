put limits on requests served. 

### Why ?
    avoid excessive usage, dos attack.
    managing resources among users.
    delegating work equally amound a large number of systems, to avoid overloading a single machine.

### Functional requirments.

    limits api calls from client to a certain service. 
    calls should be configurable.
    client gets a message when the threshold is reached.

### Non-functional

    should be always available,
    have low latency
    highly scalable - serving increasing number of client requests. 

### Throttling
    Types of limiting user requests
    1. Hard - request discarded when the limit exceeds
    2. Soft - can exceed by a certain percentage.
    3. Elastic dynamic throttling - can cross excess limit if resources are available.

### Where to place it ?
    1. Client side - not preferred can be tampered with.
    2. Server side
    3. Middle ware
        A decision made by the stakeholders.
    
### Models for implementing it
    1. Centralised database - all the calls will go through a centralised database. 
        always have the consistency as a result but lose out on latency.
    2. Distributed databases - cluster of nodes monitoring this - possible problem in this it could momentarily exceed the limit, while collecting the states from everyone. 
        A solution to this could be we could keep the session for a particular user in the load balancer - sticky session.  

### Design of a rate limiter.

    1. Rule database: stores rules for rate limiting. 
    2. Throttle rule retriever - background service to fetch for updated rules from db to cache.
    3. Throttles rule cache:- rules retrieved from the rules database. faster fetching of the rules for the decision maker.
    4. Decision maker - allow/reject based on rules from rule cache. 
    5. client identifier builder - unique id request received from client. could be remote ip address, login id, (WHY can't sequencer be used here ?)
    
     