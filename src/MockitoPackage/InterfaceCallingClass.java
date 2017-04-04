package MockitoPackage;

public class InterfaceCallingClass {
	
	public InterfaceToBeTested getSample() {
		return sample;
	}
	public void setSample(InterfaceToBeTested sample) {
		this.sample = sample;
	}
	InterfaceToBeTested sample; //varible of type InterfaceToBeTested
	public int squareOfANumber(int number){ //method calling method in the interface

		
		return sample.square(number);
				
	}
	
}
