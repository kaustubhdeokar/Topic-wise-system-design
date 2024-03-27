Ways in which load balancing is performed

1. round robin
2. weighted round robin - based on the server, if a particular server supports more requests than the other two.
3. ip based, hash of the ip address of the client is done at the server side and hence every request from the same client can go to the same server.
4. path based - for a particular path it goes to a particular server.

Divide client requests fairly to all the servers. 
first point of contact after the data center firewall.

### Services offered

    Health checking
    
    TLS termination: reduces burden on servers by handling TLS termiantion. 

    Service discovery: client requests are forwarded to appropriate hosting servers by inquiring about service registry.

    Security: protection against Dos attacks.

### Types of LBs.

    Global server load balancing.
        distribution of traffic load across multiple regions. 
    Local load balancing
        withing a data center.


For a load balancer setup, the clients reach the web servers through load balancers. 
Users connect to the public IPs of load balancers directly. 

A private IP is something reachable only between the servers of the same network.
load balancers communicates to the web servers 

Copy the pages for consistent hashing, ring hash, sharding. 