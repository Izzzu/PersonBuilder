
public class Main {

	public static void main(String[] args) {
		Person person1 = new PersonBuilder()
				.setFirstName("Ala")
				.setCity("Kraków")
				.createPerson();
		System.out.println(person1);
	}
}
