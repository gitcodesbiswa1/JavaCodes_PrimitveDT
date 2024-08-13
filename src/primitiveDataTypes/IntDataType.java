package primitiveDataTypes;

public class IntDataType {

	public static void main(String[] args) {
		int range=-4250000;
		IntDataType it= new IntDataType();
		it.TestMethod(range);
		System.out.println(range);
		
	}
	public void TestMethod(int x) {
		if(x<0)
			System.out.println("Negative");
		if(x>0)
			System.out.println("Positive");
		if(x==0)
			System.out.println("None");
	}
}
