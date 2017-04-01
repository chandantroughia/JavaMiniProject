	package Student;
	import org.apache.log4j.BasicConfigurator;
	import org.apache.log4j.Logger;
	import org.apache.log4j.chainsaw.Main;
	
	public class StudentDisplay implements StudentDetails{
		static final Logger logger = Logger.getRootLogger();
		
		public void studentData(Student obj){
			System.out.println("Name: " + obj.getName() + " Phone: " + obj.getPhone() );
	}
		
		public static void printDetails(Student obj){
			logger.info("Print the Details");
			if(obj == null){
				logger.fatal("Student details are abasent");
				
			}else{
				System.out.println("Below are the details of the student:");
				System.out.println("Name: " + obj.getName());
				System.out.println("ID: " + obj.getId());
				System.out.println("Department: " + obj.getDepartment());
				System.out.println("Phone: " + obj.getPhone());
				System.out.println("Address: " + obj.getAddress());
				System.out.println("----------End o Details----------------");
			}
		}
		
		public static String sendId(Student obj){
			logger.info("You are about to access the ID: ");
			return "Name: " + obj.getName() + " ID: " + obj.getId();
	}

		public static void main(String[] args){
			BasicConfigurator.configure();
			Student chandan = new Student(661681404, "Chandan Troughia");
			logger.info("Object Created!");
			chandan.setAddress("74 College Avenue, Second Floor");
			chandan.setAge(26);
			
			if(chandan.getAge() <= 0){
				logger.error("Wrong Value of age!");
			}
			chandan.setDepartment("ITWS");
			chandan.setPhone("+1-518-961-5749");
			
			if(chandan.getPhone() == null || chandan.getPhone() == " "){
				logger.warn("No contact details available!");
			}
			
			System.out.println(sendId(chandan));
			printDetails(chandan);
			
			Student ankur = null;
			
			printDetails(ankur);
			
			
			
		}
		
	}
