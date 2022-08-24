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
    CONS: maintainence, consistency issues(most of them support eventual consistency)

Resources:

To read:
1. https://segment.com/blog/goodbye-microservices/
2. https://segment.com/blog/introducing-centrifuge/
3. https://blog.christianposta.com/microservices/istio-as-an-example-of-when-not-to-do-microservices/