Two types of Keys:<br><br>
1. Natural Key - has business use, e.g. email, userId, etc.<br><br>
2. Surrogate Key - no business use, let hibernate generate the IDs<br>
- a. @GeneratedValue(strategy=GenerationType.AUTO)
- b. Strategy options: AUTO, IDENTITY, SEQUENCE, TABLE
