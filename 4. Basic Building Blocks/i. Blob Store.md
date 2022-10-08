- Storage for unstructure data. 
- used for write once, read many (WORM)


### Functional requirements 
- create a container - container holds many blobs. 
- put data, get data, delete data, list blobs, delete container, list containers. 

### Non- functional requ.
- available , durable - once added stays added.
- scalability : system capable of handling blobs. 
- throughput : transferring gb's of data, ensure high data throughput. 
- reliability: our design should detect and recover from failures promptly.
- consistency: system should be strongly consistent. different users have the same view of blob. 

### Resource estimation
- daily active users : five million. 
- request/sec - blob server handles is 500. 
- average size of video is 50mb. 
- thumbnail -20kb. 
- videos uploaded per day 250,000.
- read requests by user per day - 20. 

### Design Considerations for a blob store.

    3 layers of abstraction to hide the internal complexity

    1. user account
    2. container
    3. blob


    Blob metadata

    blob split to small size of chunks.