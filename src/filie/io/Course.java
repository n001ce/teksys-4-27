package filie.io;

/*Model is a class containing variables corresponding to each
 * column of the delimited file, and contain everything a normal
 * class can contain.
 */

public class Course {
	
	String code, name, instructor;
	
	public Course(String code, String name, String instructor) {
		this.code = code;
		this.name = name;
		this.instructor = instructor;
	}
	
	public String getCode() {
		return this.getCode();
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getInstructor() {
		return this.instructor;
	}
	

}
