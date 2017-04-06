package Student;

public class Student {
	
	//private variables
	private String name;		//Name of the student
	private int id;				//ID of the student
	private String phone;		//Contact number of student
	private int age;			//Age of the student
	
	private String department;	//Department of the student
	private String address;		//Address of the student

	//public functions
	//constructor
	public Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	//getName returns name of the student as a String
	public String getName(){
		return name;
	}
	
	//getId returns id of the student as an integer
	public int getId()
	{
		return id;
	}
	
	//setAddress takes in a String argument and sets it as the address of the student
	public void setAddress(String address){
		this.address = address;
	}
	
	//getAddress gets the address of the student and returns it as a String
	public String getAddress(){
		return address;
	}
	
	//setPhone takes in a String argument and sets it as the student's phone number
	public void setPhone(String phone){
		this.phone = phone;
	}
	
	//getPhone returns the phone number of the student as a String
	public String getPhone(){
		return phone;
	}
	
	//setAge takes an integer argument and sets it as the age of the student
	public void setAge(int age){
		this.age = age;
	}
	
	//getAge returns the age of the student as an integer
	public int getAge(){
		return age;
	}
	
	//setDepartment takes in a String argument and sets it as student's department
	public void setDepartment(String department){
		this.department = department;
	}
	
	//getDepartment returns student's department as a String
	public String getDepartment(){
		return department;
	}
	
	//printStudentInfo does not return anything but prints all the information related to the student
	public void printStudentInfo(){
		System.out.println("Name of Student: " + name);
		System.out.println("ID of Student: " + id);
		System.out.println("Phone of Student: " + phone);
		System.out.println("Age of Student: " + age);
		System.out.println("Department of Student: " + department);
		System.out.println("Address of Student: " + address);
		System.out.println();
	}

	public static void main(String[] args) {
		//We start with creating an object of type 'Student' --> object = student
		Student student = new Student(661681404, "Chandan Singh Troughia"); // using constructor to set student id and name
		System.out.println("Name: " + student.getName()); // using '.' operator to get the name of the student
		System.out.println("ID: " + student.getId()); // using '.' operator to get the id of the student
		student.setAddress("74 College Ave"); // using '.' operator to call setAddress
		System.out.println("Address: " + student.getAddress()); //using '.' operator to call setAddress
		student.setAge(26); //using '.' operator to call setAge 
		System.out.println("Age: " + student.getAge()); //using '.' operator to call getAge
		student.setDepartment("ITWS");//using '.' operator to call setDepartment
		System.out.println("Department: " + student.getDepartment()); //using '.' operator to call getDepartment
		student.setPhone("+1-518-961-5749"); //using '.' operator to call setPhone
		System.out.println("Phone Number: " + student.getPhone()); //using '.' operator to call getPhone
		/*===============All these details can be
		displayed by calling printStudentInfo()*/
		System.out.println("*******************************************************");
		student.printStudentInfo();  //using '.' operator to call printStudentInfo
	}
}