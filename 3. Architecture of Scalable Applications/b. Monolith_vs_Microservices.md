## Monolith
    entire application code in a codebase. 
    all modules strongly coupled. 

    For example, an app maybe have feature for ads, users posts, video streams, etc. 
    If all this is a system, instead of having a microservice for each of them, then it is called as monolith. 

    PROS: each to build, test, deploy. 
    CONS: 
        cannot scale, 
        continuous deployment,
        cannot support different technologies.
        regression testing. 

    Should be choosen when requirements are simple. 

## Microservices

    diff features are deployed as a loosely coupled services. 
    these combine to form the whole thing. 

    PROS: no single point of failure, heterogenous tech, independent and continuous deployment. 
    CONS: 
        maintainence, consistency issues(most of them support eventual consistency)
        it can lead to a dependency problem is the microservice as not loosely coupled.
        monitoring is a difficult task as compared to the monolith application.




<strong>todo: check</strong>

        Transaction management - if a query updates database in multiple tables, if the failure occurs in one table, how do we rollback in other table if it's already committed ?

#### How to decide that how small can the microservice be broken down. 

Decomposition 
- decompose by business: https://microservices.io/patterns/decomposition/decompose-by-business-capability.html
- decompose by subdomain: https://microservices.io/patterns/decomposition/decompose-by-subdomain.html

Database
- how many separate dbs needed ? 

Communication: 
- how are apis communicating with each other, how are events..

Integration 

#### ways to convert a monolith to a microservice,
- Strangler pattern: https://microservices.io/patterns/refactoring/strangler-application.html
    - monolith usage is reduced over time from 100 to 0.
- hello

SAGA:
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

### SAGA pattern:
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


#### Problem of joining tables in separate databases - Solved through CQRS.
- CQRS - Command Query Request Segregation.
- Commands to create, update, delete - handled in a different table.
- Commands of read handled in a different table.
- So, for read we use a different common database which has data from different service and databases.
- so whenever the database for individual service gets updated, it also updates the common database through an event.

Resources:

To read:
1. https://segment.com/blog/goodbye-microservices/
2. https://segment.com/blog/introducing-centrifuge/
3. https://blog.christianposta.com/microservices/istio-as-an-example-of-when-not-to-do-microservices/