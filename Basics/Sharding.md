divide a database by some primary attribute, such that specific set of data is searched on. 
For ex:
    Tinder, we can shard on the location of the people. 

Types of sharding:
    Horizontal - primary attributes, rows are sharded. 
    Vertical - columns are sharded, normalisation and beyond. 

In horizontal sharding
 - it is more difficult when two nodes have to perform joins. 
 - each database node, can have a master slave architecture. 

but this is fairly complicated to implement in a real world, hence using indexing, no sql databases should be tried out first.
