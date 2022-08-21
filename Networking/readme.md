figure out your ip address:
    curl ifconfig.me -s

isp provider - provides you with a modem/router. 
router has a global ip address. 
each device connected to the router has the same global ip address.

the router/model assigns separate ip address to each of the device. (d1, d2, d3)
this will be given by the DHCP. (Dynamic host configuration protocol).
To figure out which device had the query, it uses NAT (network address translation). 

(image1)

Ports:
each application runs on a separate port. 
there are 2^16 ports. 

reserved ports - (0-1023) (-2^10)
application- (1024-49152)
remainder - for use. 

LAN: in an area, connected by ethernet cables, wifi. 
MAN: across a city
WAN: country, optical fibre cables. 


OSI Model. 

open systems interconnection. 

application - 
    software. 
presentation - 
    takes data from application layer, converts to machine format (translation), encoding, encryption(ssl), compression, 
session
    setting up, managing a session, authentication, authorization. 
transport
    data transfer, data recieved divided into small segments, 
    all segment have the application port, sequence num/checksum for each packet, error control, 
    TCP - connection oriented, safer
    UDP - connection less.
network
    communication with other networks, logical addressing(IP addressing) to every packet. 
    router resides in this layer. this layer performs routing. (best path), 
    load balancing also happens here. 
data link 
    receives data packet from network,  
    to the packet, it adds the mac addresses of sender and receiver to form a frame. 
physical 
    hardware part. 
