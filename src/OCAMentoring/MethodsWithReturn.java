package OCAMentoring;

public class MethodsWithReturn {

	/*
	 return-type: no void keyword in method.
	 
	 	return types can be:  all primitives, classes...
	 	
	 	primitives: byte, short, int, long, float, double, char, boolean
	 classes: String,  all wrapper class : Byte, Short, Integer, Long, Float, Double, Character, Boolean
	 
	 
	 */
	
	public static void main(String[] args) {
		
		method1(); // return method is actuallyb a value, so therefore it should initilized or printed out
		
		System.out.println( method1() );
		
		String A1 = method1();
		System.out.println(A1);
		
		System.out.println( revSTR("Cybertek is greatest school in the world, batch 11 is the best batch") );
		
		
		   System.out.println( PalindromeTest("eye") );
		
		}

	public static String method1() {
		return "Hello Batch11";
	}
	
	
	public static String revSTR( String str ) {
		
		String result="";
		
		for(int i=str.length()-1; i >= 0 ; i--) {
			result = result+ str.charAt(i);
		}
		return result;
		
		}
	
	// level ,  eye..
	
	public static boolean PalindromeTest(String str) {
		
		String result="";
		for(int i=str.length()-1; i >= 0 ; i--) {
			
			result = result+ str.charAt(i);
			
		}
		
		return result.equals(str) ? true : false ;	
		
	}

}
