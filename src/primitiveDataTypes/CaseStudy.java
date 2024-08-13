package primitiveDataTypes;

public class CaseStudy {

	public static void main(String[] args) {
		int first=90;
		double second=98.872;
		char third= 'a';
		byte fourth= 126;
		float fifth= 12.3471833f;
		long sixth= 382383923983723L;
		short seventh= 32000;
		boolean eight=false;
		double res= first + fourth;
		System.out.println("adding float with int " + (fifth+first));
		int res2= (int) (first + fifth);
		System.out.println("adding float with int but storing result in integer " + res2);
		System.out.println("adding int and short and storing it in double "+res);
		
		
	}

}
