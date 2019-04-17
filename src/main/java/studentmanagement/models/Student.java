package studentmanagement.models;

public class Student {
	
	private static int sequencer = 1000;

	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Student(String name) {
		this.id = ++sequencer;
		this.name = name;

	}
	@Override
	public String toString() {
		return "Student " + " " + id + ": " + name;
	}

}
