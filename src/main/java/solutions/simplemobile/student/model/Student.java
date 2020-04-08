package solutions.simplemobile.student.model;


public class Student {
	
	public Student(int i, String string, String string2) {
		this.id = i;
		this.firstName = string;
		this.lastName = string2;
	}
	private Integer id;
	private String firstName;
	private String lastName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	
	

}
