TABLE_PER_CLASS Strategy
- @Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
- In MySQL, used @GeneratedValue(strategy=GenerationType.TABLE) to avoid the error
- No need for the @DiscriminatorColumn or @DiscriminatorValue
