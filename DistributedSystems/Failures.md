Fail-stop
    a node halts permanently. other nodes can detect it by communication with this node. 

Crash
    halts silently. other nodes cannot detect that the node has stopped working. 

Omission failures.
    node fails to send or receive messages. 
    (send failure- send omission failure)
    (receive failure - receieve omission failure)

Temporal failures
    too late to be used now. 
    failures could be due to bad algorithm, design, loss of synchronization between processor clocks.

Byzantine failures
    random failures, transmitting arbitary messages, producing wrong results. 
    mostly due to a malicious attack, bug. 
    most challenging. 