## Patterns followed in System design


### 1. Command and Query Responsibility Segregation (CQRS) Pattern
 - Different DB for writes and reads. 
 - https://www.freecodecamp.org/news/design-patterns-for-distributed-systems/

### 2.Phase Commit. 
 - https://medium.com/geekculture/distributed-transactions-two-phase-commit-c82752d69324
 - Use of a transaction coordinator to communicate between two databases to guarantee atomicity.

### SAGA:
- Data management in microservices.
- Each service can have it's own db or multiple services can share a database.

- Problems of services sharing a single database 
  - Increase in calls of one service, will cause the scaling up of the common database, which is also used for other services.
  - Manipulation of a row column can impact multiple services at once. 
- Advantages of a single database.
  - Transactional properties - ACID is maintained, failure to update one transaction, will rollback the entire query.
  - Joining of tables is each.

Now the advantages of single database are a problem for architecture where each service has a separate databse.
- Problem where transactional properties won't be maintained if a query affects multiple databases and transaction on any one database fails. How would the rollback happen there ? - SAGA pattern.
- Joining of table is a big problem - CQRS pattern.

#### SAGA pattern:
- Sequence based transaction execution.
  - It occurs in steps. 
  - 1. transaction 1 for service 1 goes through, it fires a success event. 
  - 2. then service 2 listens for that event and then executes it's own transactions. upon success it triggers an event for service 3 to listen.
  - 3. service 3 listens that event, supposed the transaction fails for service 3, it triggers a failure event for service 2 to listen.
  - 4. service 2 listens the failure event by service 3 and rollbacks the last operation. it triggers a failure event for service 1 to listen.
  - 5. Finally service1 rollbacks the operation.

SAGA pattern can take place in two ways.
- Choreography - through message queues.
- Orchestration - a component responsible to communicate appropriate events for databases in question.

- The problem is choreography can be that it can introduce a circular dependency.

Interview question:

When a payment is done from person A to person B, suppose there are 2 microservices, balance and payment. 

Person A has balance of 100.
A transfer 10 to B. 
The balance microservice deducts 10 from person A's account.
But now the payment fails. 
Here using SAGA pattern, payment microservice should trigger a failure event which is heard by the balance microservice and it should reverse the transaction.

#### Difference between SAGA vs 2PC : https://www.baeldung.com/cs/two-phase-commit-vs-saga-pattern

