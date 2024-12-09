### Partitioning

- to achieve scalability. 
- breaking down data and storing them into different nodes. 

### Types 

- Vertical - columns are split. achieved by normalization & beyond that.  
    - Vertical - joins from a different table. 
- Horizontal - rows are split. - number of ways, to be seen.
    - Horizontal - query multiple nodes for range query. 

### Range paritioning
    - splitting on based of a specific attribute. 

    Adv:
        - range queries. 
    Dis:
        - not performing range queries for other attributes except the primary attribute used to split data. 
        - uneven partition of data. 

    Example: Google's Bigtable, Apache HBase.

### Hash partition
    - hash function applied to specific attribute of the row. 
    eg: name, hash(name) mod n.

    Adv:
        - calculate partitioning mapping at runtime & no need to store & maintain mapping. 
        - even partition of data in most cases. 

    Dis:
        - no range query option here. 
        - when a node is unfunctional or when the nodes are added or removed, takes a lot of moving around.

### Consistent partitioning/hashing.
    - similar to has but solves increased data movement caused by hash partitioning. 
    - each node in the system is randomly assigned an integer in range of [0,l], this range is called the ring. 

    - when a new node enters the ring, it receives data only from the previous node. 
    - when a node is deleted, it transfers data to the next node. 

    Adv:
        - reduced hash moment when the nodes are added or removed. 
    Dis:
        - potential for imbalanced data distribution for nodes randomly assigned. 
        - imbalanced data distribution, after adding or removing nodes. 

    this can be solved with virtual nodes - each physical node has multiple locations in the ring.

    Ex: Apache cassandra.

### Another way of hashing

rendezvous hashing - for every client - it returns a set of possible servers.
if a server gets taken down, it requests the next server in it's set of possible servers.