RPC's 
    Remote procedure calls.
    
    client invokes server function remotely. 
    inherently complex, induces vulnerability. 
    (CORBA, JAVA RMI are implementations of the same).

SOAP
    based on SOA (services oriented architecture)
    client and server exchange xml-based data. 
    works over DCP & HTTP. 
    heavy payload leads to performance issues in distributed apps.

REST
    service, with unique URL
    works with http protocol. 
    machines generates data in binary, it has to converted to http to be transmitted, again to binary on the receiver's side - performance overhead. 
    exposes only crud. 

GRP
    binary protocol. (message transmission happens in )
    Course: https://www.linkedin.com/learning/building-java-microservices-with-grpc/microservices-with-grpc?autoplay=true&resume=false&u=73045713
    