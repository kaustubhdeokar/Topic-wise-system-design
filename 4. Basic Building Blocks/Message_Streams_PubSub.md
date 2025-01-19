Message queues vs streams:
- Queues are meant for a reliable communication. 
  - Messages are usually stored on disks, or in some cases periodically stored in memory and then flushed to the disk after a certain amount of time.
  - Mostly FIFO, unless prioritization done.
  - Receivers must acknowledge the receipt and processing of messages. This ensures that messages are not lost and can be re-delivered if processing fails.

- Streams
  - meant for fast, low latency processing of messages, in real-time.
  - not really stored, transient, used for event-based processing.
  - divided into partitions for fast processing / also same for sharding.

- Queues are meant for homogeneous consumers. All the consumers do the same things. (Typically).

- in streams - the same event/message can be consumed by multiple consumers. Doing different things. For a message queue we would have to push this into multiple queues while keeping the track of the consumer queues. THIS IS HIGHLY BENEFICIAL.
  - Suppose you have a system where your consumer does - process1 & process2. Consumer after receiving the message sends the acknowledgement, it performs task1, but fails to do process2.  In such cases, discrepancy can creep in. Hence, this is helpful in case of a stream.

![res/message-queue-stream.png](/4.%20Basic%20Building%20Blocks/res/queues_streams.png)

Topics & partition in kafka.

- Partition are created in a topic.
- Based on the hash key of the topic, the message can reach a partition.
- Consumers from the same consumer group have a one to one relationship with the partitions in the topic.
- If any extra consumer is present (greater than the partition), it is starved.
![res/message-queue-stream.png](/4.%20Basic%20Building%20Blocks/res/topics_partition_kafka.png)

- Also, consumers can maintain a read pointer to state till where they have read it - this can be done by COMMITTING the message.

- Todo BUILD.

### Publisher subscriber.
- in above system, (queues and streams), consumers were pulling data from the broker/topic.  (pull model)
- They can also have a push model - but it's not typically seen in streams/queues.

- Here in the pub sub, 
  - brokers fan out the messages to all the subscribers present.
  - It does not persist the messages

- BUILD:- redis PUB SUB. 