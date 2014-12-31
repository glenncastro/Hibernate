Configuring Collections and Adding Keys
- use ArrayList to have an index
- from org.hibernate.annotation package: @CollectionId, @GenericGenerator, @Type

Usage:
-	@ElementCollection
-	@JoinTable(name="USER_ADDRESS",
-		joinColumns=@JoinColumn(name="USER_ID")
-	)
-	@GenericGenerator(name="hilo-gen", strategy="hilo")
-	@CollectionId(columns = { @Column(name="ADDRESS_ID") }, generator = "hilo-gen", type = @Type(type="long"))
-	private Collection<Address> listOfAddresses = new ArrayList<Address>();
