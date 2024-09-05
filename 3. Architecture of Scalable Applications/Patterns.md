### Patterns followed in System design


#### Command and Query Responsibility Segregation (CQRS) Pattern
 - Different DB for writes and reads. 
 - https://www.freecodecamp.org/news/design-patterns-for-distributed-systems/

#### 2 Phase Commit. 
 - https://medium.com/geekculture/distributed-transactions-two-phase-commit-c82752d69324
 - Use of a transaction coordinator to communicate between two databases to guarantee atomicity.