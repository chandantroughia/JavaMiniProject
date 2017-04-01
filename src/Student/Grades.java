package Student;
//using keyword abstract to declare the abstract call Grades
public abstract class Grades {
	//instance variables of the class
	private String name;
	private int id;
	protected int course1;
	protected int course2;
	//constructor
	public Grades(String name, int id, int c1, int c2, int c3){
		this.name = name;
		this.id = id;
		this.course1 = c1;
		this.course2 = c2;
	}
	
	//method to get the total points of the student
	public static int getTotal(int c1, int c2){
		return c1 + c2;
		
	}
	
	//abstract method to print the grade
	public static void finalGrade(int avg){
		
	}
}
