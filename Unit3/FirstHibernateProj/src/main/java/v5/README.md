One To Many Mapping
- @OneToMany
- @JoinTable(name="USER_VEHICLE", joinColumns=@JoinColumn(name="USER_ID"), inverseJoinColumns=@JoinColumn(name="VEHICLE_ID"))
- private Collection\<Vehicle\> vehicle = new ArrayList\<Vehicle\>();
<br> <br>
- @OneToMany or @ManyToOne, involves Entity...@ElementCollection involves @Embeddable or Basic Types
