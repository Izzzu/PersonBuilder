
public class PersonBuilder {
	   private String lastName;
	   private String firstName;
	   private String middleName;
	   private String salutation;
	   private String suffix;
	   private String streetAddress;
	   private String city;
	   private String state;
	   private boolean isFemale;
	   private boolean isEmployed;
	   private boolean isHomewOwner;
	   
	public PersonBuilder setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	public PersonBuilder setFirstName(String firstName) {
		this.firstName = firstName;
		return this;

	}
	public PersonBuilder setMiddleName(String middleName) {
		this.middleName = middleName;
		return this;

	}
	public PersonBuilder setSalutation(String salutation) {
		this.salutation = salutation;
		return this;

	}
	public PersonBuilder setSuffix(String suffix) {
		this.suffix = suffix;
		return this;

	}
	public PersonBuilder setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
		return this;

	}
	public PersonBuilder setCity(String city) {
		this.city = city;
		return this;

	}
	public PersonBuilder setState(String state) {
		this.state = state;
		return this;

	}
	public PersonBuilder setFemale(boolean isFemale) {
		this.isFemale = isFemale;
		return this;

	}
	public PersonBuilder setEmployed(boolean isEmployed) {
		this.isEmployed = isEmployed;
		return this;

	}
	public PersonBuilder setHomewOwner(boolean isHomewOwner) {
		this.isHomewOwner = isHomewOwner;
		return this;

	}
	
	public Person createPerson() {
		return new Person(lastName,  firstName,  middleName,  salutation,  suffix,
				 streetAddress,  city, state,  isFemale, isEmployed,
				 isHomewOwner) ;
	}
}
