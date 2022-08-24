ACID

    Atomicity, Consistency, Isolation, Durability.

CAP

    2/3 (Consistency, Availability, Partition Tolerance)

    Consistency - should be able to see the data of most recent write. 
    Avalability - 

Eventual consistency - The value that is returned does not guarantee that it is the most recent value. 
                       But eventually, it gets updated to the latest value.

                       It ensures high availability.

                       Example: Domain Name Server. 

                       Database example: Cassandra.(NoSQL)

Causal consistency - categorizes into dependent and independent events. Dependent operations are called casually-related operations. 
                     they are carried out in the correct order. 

                     It is used to prevent non-intutive behaviours. 

Sequential consistency - preserves the order specified by each client's program. not the overall order. 
        - on social networking sites, there might be different ordering of all the friend's posts. 
        - but a single friend's post will come in a sorted manner. 

Strict - read request from any replica will get the latest write value. 
       - so the value updation on one node, will trigger a synchronus replication on other nodes as well, 
         and a confirmation will not be sent until new value is written to all the nodes. 

        - to increase the availability we can use techniques likes quorum based replication. 

