Taken from : https://www.youtube.com/watch?v=7AMRfNKwuYo

### Steps 

- Source : any video recording over an encoder (OBS, Youtube also allows to directly stream from it's platform)
- Encoder's job is to package the data and send it to the live streaming platform's server.
  - To send this data over, the protocol used can be 
  - RTMP - Real time messaging protocol. (TCP based)
  - SRT - Secure Reliable Transport (UDP based)
- For best upload conditions, a streamer connects to a POP server, (it's choosen automatically based on DNS based latency routing) 
- On the streaming platform, it's broken down into various video resolutions and bitrates - this process is called TRANSCODING.
- After which it's broken down into different segments usually of 1-2 seconds - SEGMENTATION.
- ***
- After which it's divided into various live streaming formats 
  - hls (http live streaming) - consists of manifest and video chunks of seconds. 
  - dash (dynamic adaptive streaming over http)
- these are stored in cdn for faster last mile delivery.
- viewers get the video - decode decompress.z