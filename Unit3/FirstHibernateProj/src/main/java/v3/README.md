Proxy Objects and Eager and Lazy Fetch Types
- Hibernate creates proxy objects for Entity classes
- @ElementCollection(fetch=FetchType.EAGER)
- @ElementCollection(fetch=FetchType.LAZY)
- LAZY is the default, values of collections (second level) are only fetched at first use (e.g. user.getListOfAddresses)
