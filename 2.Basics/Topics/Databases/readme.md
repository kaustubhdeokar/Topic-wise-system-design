ACID properties.

### Acid properties - refers to the properties of the transaction.

- Atomicity - all the statements (1 to n) from a transaction will be executed or none will be executed. If one fails, everything is rolled back.

- Isolation - it should make no difference if a single transaction is executed  or a transaction is executed with 10 other transactions at the same time.

- Durability - once persisted, it stays persisted.

- Consistency - Consistent state before and after transactions.
    Valid State: A database is in a consistent state when all data adheres to the defined rules, constraints, and relationships (e.g., primary keys, foreign keys, data types, business rules). For example, if a database rule specifies that an account balance cannot be negative, the database is consistent when all account balances are non-negative.