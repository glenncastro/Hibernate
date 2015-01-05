Single Table Strategy
- DTYPE - discriminator type
- @Inheritance(strategy=InheritanceType.SINGLE_TABLE)
- @DiscriminatorColumn(name="VEHICLE_TYPE", discriminatorType=DiscriminatorType.STRING)
- @DiscriminatorValue("Bike")
