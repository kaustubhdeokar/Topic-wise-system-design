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