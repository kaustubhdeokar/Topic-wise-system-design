### Http request & response. 

![res/http-request.png](../../../res/http-request.png)

- point 3 is the tcp connection request, which is the 3 way handshake.

### Https Request and reponse.

![res/https-request.png](../../../res/https-1.png)

- the first phase of the establishing the https connection is the same as http. A 3 way handshake between the client and the server.
- The second phase is where, the client sends the supported SSL versions, the encryption that it supports and etc. details. 
- The server then sends one of the client supported encryption suite and SSL versions, in the Server-Hello. 
- Then the server sends the certificate which contains the public key to the client. The client uses this public key to encrypt the data. The data once encrypted by the client using the public key can only be decrypted by the private key.
- This concludes the payload from server to the client.


