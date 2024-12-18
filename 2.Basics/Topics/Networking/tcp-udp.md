> TCP
- Pros
  - reliable connection.
  - guaranteed delivery (retry mechanism in case of failure).
  - connection based protocol
  - congestion control 
  - ordering of packets
- Cons
  - Larger packets with all metadata of packets ordering ...
  - more bandwith due to larger packet
  - hence slower
  - stateful transport

> Info
- Segment is a block of data at the TCP layer.
- A packet refers to segment wrapped with IP header at the network layer.

Suppose machine A wants to send packets to machine B , how does it happen ?
- First a 3-way handshake happens between machine A and machine B. 
- each packet that a sends is tagged with a unique sequence number, 
  - packet 1 sequence number: x, 
  - packet 2 sequence number: x+ mss (max segment size).
- once b receives a packet, it sends the acknowledgement with the sequence number of next excepted packet num.
- if by chance b does not receive a packet, it will send a duplicate acknowledgement to a, asking to resend the packet. (3 times if a ack is sent to machine A, machine A will then resent the packet)

- Congestion control - is controlled by slow start and linear growth.

Connection termination is a four-way handshake. 
-  A - fin packet is sent to machine B.
-  B - acknowledgement is sent to machine A. 
-  B - sends fin packet to machine A.
-  A - acknowledgement is sent to machine B for B's fin packet.
-  

> UDP
All pros of tcp are cons of udp & vice versa.