## Scaling from 0 to Millions. 

- 1. Starting with an architecture where server and database are hosted in a single application. Client can be a separate one.
- 2. Moving further, separate server and db.
- 3. Now if the requests scale up, we need to deploy copies of the server, which can be navigated by the load balancer. This also adds a layer of security as the load balancer and the server communicate through a private IP. 
- 4. Database also need to scale up - we need database replication. A master slave concept comes up, write requests goes to the master and read go to any one of the slaves.
- 5. Now the db operations are very expensive, so the information which is accessed frequently can be stored in a cache, with an expiry time/date.
  - CDN can be used for caching.
  - Can be used to overcome geographical constraints, and solve latency issues for people living in areas away from the main datacenter.
  - Can be used to cache STATIC data, which does not change frequently. If the data is not found in the CDN, it will search in the nearby CDNs instead of hitting the main datacenter.
- 6. We can have multiple datacentres, and the load balancer can handle requests based upon the geographical locations. If by any chance, the whole of the datacentre 1 goes down, it can re direct it's queries to datacentre 2. replication in these can happen periodically.
- 7. Messaging queues - rabbit mq, kafka. helps the process execution in an async manner. 
- 8. Scaling database - either vertical or horizontal.
  - vertical scaling is increasing the cpu/ram etc.
  - horizontal scaling -> 
  - implementing sharding. split table row wise or column wise