package Student;

public class GradesDemo extends Grades{
	public GradesDemo(String name, int id, int c1, int c2, int c3) {
		super(name, id, c1, c2, c3);
	}
	
	//Override
	public static void finalGrade(int avg){
		
		if(avg <= 70){
			System.out.println("C");
		}
		else if(avg > 70 && avg <= 90){
			System.out.println("B");
		}
		else{
			System.out.println("A");
		}
	}
	
	//Overriding
	public static int getTotal(int c1, int c2, int c3){
		return c1 + c2 + c3;
		
	}
	public static void main(String[] args) {
		GradesDemo chandan = new GradesDemo("Chandan", 661681404, 83, 88, 90);
		int avg = getTotal(83, 88, 90)/3;
		finalGrade(avg);
	}
	
}
