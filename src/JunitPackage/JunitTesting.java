package JunitPackage;

public class JunitTesting {
	public int square(int n){
		return n * n;
	}
	
	public String oddEven(int n){
		if(n % 2 == 0){
			return "Even";
		}
		else{
			return "Odd";
		}
	}
	
	public String reverse(String str){
		return new StringBuilder(str).reverse().toString();
	}
}
