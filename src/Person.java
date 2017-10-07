
public class Person {

	   private String lastName = "Jan";
	   private String firstName = "Ble";
	   private String middleName;
	   private String salutation;
	   private String suffix;
	   private String streetAddress;
	   private String city;
	   private String state;
	   private boolean isFemale;
	   private boolean isEmployed;
	   private boolean isHomewOwner;
	   
	public Person(String lastName, String firstName, String middleName, String salutation, String suffix,
			String streetAddress, String city, String state, boolean isFemale, boolean isEmployed,
			boolean isHomewOwner) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.middleName = middleName;
		this.salutation = salutation;
		this.suffix = suffix;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.isFemale = isFemale;
		this.isEmployed = isEmployed;
		this.isHomewOwner = isHomewOwner;
	}

	@Override
	public String toString() {
		return "Person{" +
				"lastName='" + lastName + '\'' +
				", firstName='" + firstName + '\'' +
				", middleName='" + middleName + '\'' +
				", salutation='" + salutation + '\'' +
				", suffix='" + suffix + '\'' +
				", streetAddress='" + streetAddress + '\'' +
				", city='" + city + '\'' +
				", state='" + state + '\'' +
				", isFemale=" + isFemale +
				", isEmployed=" + isEmployed +
				", isHomewOwner=" + isHomewOwner +
				'}';
	}
}
