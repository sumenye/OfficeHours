package OCAMentoring;

public class MethodOverloading {

	/*
	 method overloading:  same name, different parameters (return-type doesnt have to be the same).
	 
	 
	 */
	
	public static void method(int a) {
		
	}
	
	public static void method(double b) {
		
	}
	
	public static int method(long a) {
		return 20;
	}
	
	public static int method(float b) {
		return 20;
	}
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("hello"); 
		main(new int[] {1,2,3});
		
		
		method2('4');
	}
	
	
	public static void method2(int a) {
		System.out.println("int");
	}
	
	public static void method2(double b) {
		System.out.println("double");
	}
	
	public static void method2(float f) {
		System.out.println("float");
		
	}
	
	public static void method2(char f) {
		System.out.println("char");
		
	}
	
	
	
	
	
	
	
	
	public static void main ( int[] arr ) {
		System.out.println("hola");
	}
	
	// only the valid main method can have "run as Application" option

}
