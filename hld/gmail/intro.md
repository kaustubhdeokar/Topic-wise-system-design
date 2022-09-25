Services that are being targeted:

1. Send and receive emails:


    each device that wants to connect to any gmail server, will go through a gateway server. 

    1. gateway server which routes the requests to the proper service.

    for example to access authentication service which is reached to by the method /auth. 
    
    gmail.com/auth?username=<>&password=<>

    the gmail.com will point to the gateway server, this routing will happen via the dns server. 
    (root nameserver -> com nameserver -> gmail.com nameserver)

    Prior to this, the auth service has to register itself to the gateway server. 

    2. gateway server also does the task of rate limiting. 

    3. translates the requests. 
        clients send requests to the gateway server via http. 
        the microservices that it communicates to may not use http, it may use some protocol built 
        over tcp. hence this translation is done by the gateway server. 

Functionality to Register.  

the gateway server has too much responsibility, we can use another service which is used to keep a track of the services. 

    let's call this service  as SERVICE MANAGER/REGISTRY. 

on request this can tell the gateway server about the correct microservice to contact, which then can be sent to the auth server. auth server may then store this information, and send a sms. we can use a different database for sms service. 

if the user has authenticated themselves or confirmed their login, we can set the verified login column in the table as true.

service manager/service registry keep tracks of the services and their ip addresses by a heartbeat mechanism. 

but each time the gateway has to call the service manager/service registry. hence there is a small cache present in the gateway to speed up this process.

![gmail](gmail1.png)

## Part 2

Authentication:

Once logged in every subsequent request, should contain the secret key. 
the secret key can be the password also. 
in such cases it can be stored on the client's browser in the  form of cookie. 
but using the password is not recommended.

instead of the password using the token is recommended. 
the AUTH SERVICE can invalidate the token, hence it can act like a session. 
after which the user will have to re-login, in which a new token can be assigned.


this possess a similar problem as the service registry, every time a user request comes in it has to go to the auth service. auth service like the service registry will also store the cache to gateway server.

so each updation of the cache in the gateway server by the auth service or the service registry is to be sent by a message queue.

but there is a problem that the gateway handles too much. 

### A solution to that is we can use a global cache. (some kind of key value store as redis). any update can be sent to the global cache via a message queue.

![architecture using global cache for auth service & service registry](gmail2.png)
*architecture using global cache for auth service & service registry*

## Part 3.

Every service has a set of parameters it needs to execute the method -> contract. 
this contract is set on the service registry. 
but other service can also require the contract. hence these would also require the contracts. 

this serves a problem when a new service comes or a different service updated it's contract.

a service can push it's updates to the service registry, but it will require the restart of all the services and cannot be done on-fly. 

instead of this the services can pull the contract updates, from the service registry. so to manually update the developers to use the new contract. or when the service is restarted then the new contract can be in action. 

but now again we see that the service registry it taking up a lot of the job 
as 
1. heartbeats
2. routing to differents routes. 
3. and now this. 

So, 
### Contract Registry. 

we can maintain a contract registry to keep tracks of the updated contracts. 
Also these services may be in different languages hence we need to keep our contracts in contract registry language independent. 

Good to have versioning for contracts.

Once last change in creating profile, when you add an image you don't send the entire image in the post request, the image is uploaded to some storage earlier and then the url is sent from the post request for create profile. 

### user preferences, mailbox layout

it can be a stored in a json format hence a no sql database can be used for the same. 

![contracts registry, mailbox preferences](gmail3.png)
*contracts registry, mailbox preferences*

## Sending emails.

two different tables ,
first with (id, from, to , subject, timestamp)

other with (id & content)

virus checker has to run on all the image urls, hence it's better to be running on the drive/blob store. 

and the spam detector can run on the first table scheduling a cron job, where it can take up from the message queue which is populated each time a message arrives. 

apart from this we also have a tagging table, stores the tags for each of the mails. 

to do a search on this is very tough, hence to have a search engine like elastic search - known for search texts 
is beneficial.

![sending of emails](gmail4.png)
*sending of emails*

## Part 4

see
> message queue
> push vs pull

Group messages -> can be a userid vs json object, or a single one to one if we want to run a separate query on the groups.

### External emails. 

send mails to external systems - send email to their smtp servers, recieve from externals -> receive from imap's.

![complete architecture](gmail5.png)
*complete architecture*