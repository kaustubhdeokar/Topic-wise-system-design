Bloom filters
- guarantees that string has not been searched earlier.

- Application
  - So suppose user searches for a random string, that he maybe not query the next time, if this search result is brought to the cache and it replaces some other search which was accessed much more frequently, it would result in a bad cache state and would result in a lot of miss.
  - So, in order to see that the string has searched atleast k number of times we use the bloom filter.
  - Also, we can use h number of hash functions, to make the results of the string more unique.

How many hard drives can a computer have ?
- As many hard drives as number of SATA slots on a motherboard. 
- SATA - serial advanced technology attachment - these are ports that connect hard drive to a motherboard.

RAID 
- Redundant Array of Independent Disks
- aim to improve performance and/or reliability
  - RAID 0
  - data is distributed across multiple drives.
  
RAID 1
- two or more drives. drives have copy of the exact data. 
  
There are many combinations of RAID, like RAID 5 or RAID 10, which use multiple drives together to improve performance and/or reliability.