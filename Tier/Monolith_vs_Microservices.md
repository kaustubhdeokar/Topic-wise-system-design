## Monolith
    entire application code in a codebase. 
    all modules strongly coupled. 

    For example, an app maybe have feature for ads, users posts, video streams, etc. 
    If all this is a system, instead of having a microservice for each of them, then it is called as monolith. 

    PROS: each to build, test, deploy. 
    CONS: cannot scale, continuous deployment, regression testing. 

    Should be choosen when requirements are simple. 

## Microservices

    diff features are deployed as a loosely coupled services. 
    these combine to form the whole thing. 

    PROS: no single point of failure, heterogenous tech, independent and continuous deployment. 
    CONS: maintainence, consistency issues(most of them support eventual consistency)
