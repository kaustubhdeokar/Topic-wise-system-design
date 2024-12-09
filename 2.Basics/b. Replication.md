To improve scalability, avalability.

Introduces a new set of complexity, to keep the data in sync.
performance vs data in sync.

### Strategy for replication

1. Pessimistic - guarantees from beginning all are in sync.
2. Optimisitc - eventual consistency.

### Single Master Replication.

    Single node as the leader. This nodes receives all the updates. 
    This propagates them to other follower nodes. read operations are executed from the follower nodes.

    > Two ways to propogate information
        Synchronous
        at the same time. (node replies to the client only after the receiving acknowledgements from the other replicas)
        Pros: increased durability, updates are not lost.
        Cons: this makes writing requests slower.

        Async
        exactly opposite of sync, 
        sends the response to the client after done writing in the primary node. (in async manner syncs with follower nodes).
        Pros: writing requests faster.
        Cons: no durability.
    
    Overall this is quite easy to implement.

    If the leader node crashes, it takes some time for a follower node to take over.
    This can be done manually, or automatically by a voting in the followers.

    used in : postgreSQL, mysql - support both sync & async single master theorem.

### Multi-master replication

    high availability and performance over data consistency. 
    write requests are concurrently handled by all the nodes. 
    Some nodes might disagree - results in a conflict. 

    Conflict resolution
        - during write
        - during read.
    
    Conflicts can be solved by
        - last write(mostly doesn't work)
        - exposing to the customers.
        - causality tracking algorithms (To be looked later)

    problems in synchronous replication are clear to use, that they take a lot time to process write queries.


### Better way to solve replication issue - Quorums.

    write to majority - (for ex. 2/3) read from majority. 
    so atleast one overlapping node will be common for read and write. The concept of quorum is used extensively in consensus protocols. 