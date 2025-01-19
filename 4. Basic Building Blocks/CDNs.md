- CDN - cache which is geographically nearer to the client.
  - example: cloudflare, akamai.
  - CDNs can help in short circuiting network calls to the webserver or further processing that has to be done. improving performance, decreasing costs and compute power.
  - 

Two things can be done in a cdn 
- proxy
- - you can point to your original site. in which case cdn will act as a proxy
- server
- - you can copy all the files that you need to your cdn in which case in will act as a host

CNAME, AAAA, and A records are types of DNS (Domain Name System) records used to map domain names to IP addresses or other domain names.

Ex:- Object/Proxy CDN configured in bunny.

A Record (Address Record):
Maps a domain name to an IPv4 address.
Example: example.com -> 192.0.2.1

AAAA Record (IPv6 Address Record):
Maps a domain name to an IPv6 address.
Example: example.com -> 2001:0db8:85a3:0000:0000:8a2e:0370:7334

CNAME Record (Canonical Name Record):
Maps a domain name to another domain name (alias).
Example: www.example.com -> example.com