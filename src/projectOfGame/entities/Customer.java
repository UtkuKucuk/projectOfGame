package projectOfGame.entities;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private String nationalityId;
	private int birthYear;
	
	
	public Customer()
	{
		
	}
	public Customer(String firstName, String lastName, String NationalityId, int birthYear) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = NationalityId;
		this.birthYear = birthYear;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String NationalityId) {
		this.nationalityId = NationalityId;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	
}
