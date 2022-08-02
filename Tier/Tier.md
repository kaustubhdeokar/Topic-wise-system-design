## Tier
    - logical and physical separation of a component in an application or a service.
    - Separation at component level
        -Components are 
            - Database, backend application server, user interface, messaging, caching. 

### Single Tier
    Latency is the least. No data has to be transmitted.
    Security wise - 
        Good that no data has to be transmitted, hence safer
        but a person can get access of the code, modify/pirate etc. This is unlikely which there is security for application server.

### Two - tier. 
    Client server. 
    client ui & business logic in one & db calls in another. 
    fewer network calls to the backend server. 

### Three - tier
    Client server database. 

### N-tier
    more tiers 
        - cache, messaging queues, load balancers, search servers, components for processing massive amounts of data. 

    Why ?
        - SRP
        - Separation of concerns (Same thing b). 

If you are getting confused between what is a layer and a tier, 
    a layer is just a logical separation, where a tier an actual physical separation of components. 
    one or more layer, can belong to the same tier, 
        like for an example, the business logic may have object model as well as data access part, so though these are separate layers, 
        these come under the same tier. 