After the messages are placed on a messaging queue, 
the ordering of the consumption of messages matter in some cases, 

in such cases, the messages in the queue are blocked,
but in cases where the ordering is not important, they are put in a dead-letter queue, and the queue continues to function normally. 


Pub-subs:

async service-service communication that's popular in serverless & microservices architecture. 
when there are multiple consumers for a single message produced. 

functional requirements: 
    creating a topic.   
    write messages. 
    subscription - to any topics. 
    read messages. 
    delete. 

components:

    distributed messaging queue - for each topics. 
    database: relational database to save customer-based data, structure also ensures data integrity. 

    message director - will copy the work from the message queue to the consumer queue. 

    here the fundamental problem is we have a separate queue for each consumer. 
    this will result in lots of queues being used. 

    So the solution would be to place a solution in a common broker. and let consumers pull the message from these brokers as per their subscription. 

advantages of these are it is scalable, guarantees that the messages will reach the subscriber sometime in the future.
it helps in decoupling the system and due to it's async behaviour and returns quick response. 

disadvantages are that it can produce inconsistency in the system. hence it should not be used in systems like the financial ones.