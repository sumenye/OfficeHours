package OCAMentoring;

public class May24MuhtarConstructor {
		class data{
			
			data(){
			//	this();  Reason:  #7
				// this(10);  Reason: #8
				this(9, 9.5);
			}
			
			data(int a){
			//	data();  reason: #6
				this(); 
				method1();
			}
			
			data(double a, int b){
				
			}
			
			data(int a, double b){
				System.out.println("Hello cybertek");	
			//	 this(8.5, 9);  Reason: #9
			//	this();  reason: #8
			}
			
			
			
			public void method1() {
			//	this();   reason: #5
			}
			
			
			
		}


		class A1{
			
			A1( int a){
				System.out.println("constructor int");
			}
			
			A1(double a){
				System.out.println("Constructor double");
			}
			A1(float b){
				System.out.println("constructor float");
			}
			
		}



		public class Constructors {
			
			// Methods:
//			AM		      specifer       return type     methodname    parameter
	//		 public       static         void              methodname( String name) {   }
//		    op           op            Required	         Required    optional
			 
			 
			// constructor:
//		    AM	       methodname ( method name has to be same with class anme)      Reason:  #2
			 public      Constructors() {
//				op           Required		 reason: #3  
				  	System.out.println("This is a constructor");
			  }
			  
	//		public static void main(String[] args) {
					Constructors obj=	new Constructors();   // Reason : #4
					data obj2 =	new data(); //  reason :#1
						
				//	A1 obj3 =	new A1( );     Reason: #10
					
					A1 obj4 = new A1( 10/000 );
					// 100,000,000
					
					long A2 = 10l;
					float f1 = 10L;
					
					int num = 10 / 0 ;
			}
			
			/*
			 
			 Constructor:   special method. execution depends on the creation of the object
			 
			1. every class MUST have constructor, if there isn't any declared then compiler will give default constructor(no-arg constructor)  
			2. constructor' method CAN NOT have Return-Type and specifier ( only have access modifier and classname (required)  )
			3. constructor' method name MUST be same with className
			4. constructor' execution depends on the creation of the object
			5. Only Constructor can call the constructor, other methods or blocks cannot call the constructor
			6. constructor CAN NOT be called by constructor name, MUST use this or super (to call superclass' constructor) keywords.
			7. constructor CAN NOT call or contain itself
			8. constructor CAN NOT call more than one constructor
			9. in constructor' body  constructor call needs to be the first step.
			10. class' object MUST be created with the existing constructors 
			
			
			11. super class' default constructor (no-arg) is called in sub class' constructor(any constructor) by default 
			12. super class' constructor ( except for default) MUST be called in sub class' constructor
						(if there is no default constructor in super class)
				
				
				
				
				// this():  calls the class' constructor .        this. :    calls fileds( instance variables)
				// super():  calls the super class' constructor  .     super. :  calls the instance variable from the super class  
			 
			 */
			
			
			
			
			/*
			 OOP: object Oriented programming
			 		4 main concepts are : Encapsulation, Inheritance, Abstraction, Polymorphisim
			 		
			 1. Encapsulation: hides the instance variables ( usually have private access modifiers )
			 
						 getter: Read ONLY
						 	1. return method ( Return-Type cannot be void)
						 	2. access modifier Should not be private
						 	3. return Type must be same data-type with the instance variable'
						 	4. does not have any argument
						 	
						 	
						 Setter: Modify
						 	1. none return method ( void)
						 	2. access modifier should not be private
						 	3. must have an argument and argument' data-type MUST be same with instance variable'
						 	4. argument must be initialized to the instance variable
						 	
			
						 
			 */
	}


