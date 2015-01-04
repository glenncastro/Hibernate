CascadeTypes and Other Things
- @OneToMany(cascade=CascadeType.PERSIST)
- session.persist(user);
- @NotFound(action=NotFoundAction.IGNORE)
- Hibernate Collections
- - Bag semantic - List / ArrayList
- - Bag semantic with ID - List / ArrayList
- - List semantic - List / ArrayList
- - Set semantic - Set
- - Map semantic - Map
