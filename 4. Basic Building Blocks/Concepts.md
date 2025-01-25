Bloom filters
- guarantees that string has not been searched earlier.

- Application
  - So suppose user searches for a random string, that he maybe not query the next time, if this search result is brought to the cache and it replaces some other search which was accessed much more frequently, it would result in a bad cache state and would result in a lot of miss.
  - So, in order to see that the string has searched atleast k number of times we use the bloom filter.
  - Also, we can use h number of hash functions, to make the results of the string more unique.

How many hard drives can a computer have ?
- As many hard drives as number of SATA slots on a motherboard. 
- SATA - serial advanced technology attachment - these are ports that connect hard drive to a motherboard.

RAID 
- Redundant Array of Independent Disks
- aim to improve performance and/or reliability
  - RAID 0
  - data is distributed across multiple drives.
  
RAID 1
- two or more drives. drives have copy of the exact data. 
  
There are many combinations of RAID, like RAID 5 or RAID 10, which use multiple drives together to improve performance and/or reliability.


Microservices
[Microservice arch](res/microservices.png)

Resilience patterns in microservices:
1. Circuit Breaker
2. Timeout
3. Bulkhead
4. Fallback


Circuit breaker
- when a service is down, the client service should not keep on trying to contact the service.

Fallback
- when a service is down, it should switch to some default or other backup service which should be used.

Bulkhead
- when a service is down, it should not affect the other services. isolation of services.


Client side load balancing.
 - each microservice when communcating with other microservices - contacts a discovery service (eureka) and gets the ip address of the microservice it wants to communicate with.
 - but repeatedly contacting the discovery service is not efficient.
 - hence we maintain a some sort of cache on the client side when one request is done.
 - when contacting an instance when is cached, if it fails beyond certain calls, we remove it from the cache and contact the discovery service again.
