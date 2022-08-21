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


Protocols:


Socket: interface between internet and the process. host id and port together form socket.

POP protocol: email protocol. on recipient's server. 

difference between transport layer and network layer.
    network layer transfers the data between networks. 
    the connection between application and network layer is the transport layer. 
    it handles the breaking down of the information into packets, the port to which it has to send the data etc. 

Video transmission:

    Taken from fireship video: https://www.youtube.com/watch?v=WmR9IMUD_CY

    codec:
    a device(hardware) or program(software) that compresses data to enable faster transmission and decompresses received data.
    
    web rtc - allows to establish a peer to peer connection between two or more browsers.
    client machine creates a session description protocol object, containing information about the video codec, etc. 
    this is saved in the server, which is read by a different machine, and it creates a sdp answer object, and written to the same server. 
    this above process is known as signalling and is handled by a third party server. 

    both the machines generates some ip addresses, port (sockets) which can be used by other machines which can be used for connections. 

    these ip addresses, can be saved in the same database. 

    Further use the above link to build a video chat app from scratch: