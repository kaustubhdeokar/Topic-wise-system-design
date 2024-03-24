### Benefits

- Performance
- Scalability
- Availability

### Assumptions that we make in this course. 

- The network is reliable
- Latency is zero - library calls such as grpc, thrift 
- Bandwidth is infinite
- Network is secure
- Transport cost is zero (transportation of data between two points incurs costs). 
- !! The global clock fallacy. (can be studied in depth). !!

### Dificulties in designing distributed systems.

- Network Asynchrony
- - There is no guarantee when a message delivery will be completed.
- - They may also deliver out of order. 

- Partial failures 
- - Some components fail in a system. 
    
- Concurrency
- - Problems when multiple transaction work on a same piece of data. 

### Measure of correctness. 
    Two properties that should be satisfied. 

    Safety 
    A safety property defines something that must never happen in a correct system.

    Lively
    A liveness property defines something that must eventually happen in a correct system.


### Types of faliures

- Fail-stop
- - A node halts permanently. Can be due to hardware malfunction, software errors, environmental factors.
  - other nodes can detect it by communication with this node. 
  - How to avoid ?
  - - Using monitoring tools for critical components and restart them if they stop working.
  
- Crash
- - Halts silently. other nodes cannot detect that the node has stopped working.
  - Enters an unpredicatable or inconsistent state.

- Omission failures.
- - Node fails to send or receive messages. 
- - Send failure- send omission failure
- - Receive failure - receieve omission failure

- Temporal failures
- - Failures could be due to bad algorithm, design, loss of synchronization between processor clocks.

- Byzantine failures
- - random failures, transmitting arbitary messages, producing wrong results. 
- - mostly due to a malicious attack, bug.
- - most challenging. 

### Exactly Once Semantics. 

    A message can get delivered multiple times due to network failure for the acknowledgement, thus executing a process
    twice can have disastrous effects. 

    methods to solve this.

        Idempotent Operations - operation will have no effect, when executed after the first time.
        like for a certain input parameters, it be added to a set, such that it's executed only once.
        this is tougher to build. 

        De-duplication approach - every message is given a unique identifier. (we should have control on both sides as the id is generated on the sender, processed on receiver)


### Detecting failures

    Timeouts. are a way.
    asynchronous network in a distributed system it's hard to differentiate between a crashed node and a node that is slow to respond to requests.
    tradeoffs in small timeout value vs large timeout value. 

    Failure detectors. 

    To categorize failure detectors we judge them on accuracy & completeness. 

### Stateful and Stateless systems. 

    Stateless - maintains no state of what happened in the past, purely outputs on the inputs given. (eg. cost of cab ride based on distance, location, traffic)
    Stateful - saves user details, some operations may be in referrence to previous transactions. (banking)

    Pros and cons. 

    Stateful - more useful in real life, decisions on how to backup have to be made hence complex.
    Stateless - easily scalable as all nodes are identical. 
            
