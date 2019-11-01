package OCAMentoring;

public class MethodClass {

	public static void main(String[] args) {
		
	}
		/*
		 method declerations:
		 
		 access-modifier    specifier     return-type    methodname (  parameter   )  {  body of method   }
		 ( optional)        (optional)     (Required)      (Required)  ( optional)
		 
		 Access Modifier (optional):  public, protected, deafult, private.
		 specifiers (optional):  static, final, abstract
		 return-type (Required) : void, all primitives, all classes
		 methodname(Required) : any name  (must start with letters).
		 { }  (Required) : it contains the body of method, 
		 
		 
		 primitives: byte, short, int, long, float, double, char, boolean
		 classes: String,  all wrapper class : Byte, Short, Integer, Long, Float, Double, Character, Boolean
		 
		 */
		
		// void: doesn't retun any value
		public static void methodname (int a) {   	}     // body of the methods.  
		
		static void method1(double b) { }
		
			void method2(String a) { }
			
			static public void method3() { }     // AM and Specifier can switch thoier position in method signature.
		
			static void method4() {
		//		return "wss";        void doesnt return any value
			}
			
			
			
		// wihtout void: method must return a Value	
			
			public static String method5() {
				//  return 100;  return value MUST match with retun type
				return "";
			}
	

}
