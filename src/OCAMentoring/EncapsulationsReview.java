package OCAMentoring;


class Data{ 
	
	   private int ssn = 123456;
	      // private: it cannot be access other class or objects
	   
	   // getter: it's a method that can read the private data in other objects  , a return method
	   		//  return-type of the getter has to be same with data type that we wanna return
	   public int getSSN() {
		   return ssn;   // the value that method returns has to be same data type with the return-type of the method
	   }
	   
	   
	  // setter: modifying the privtae data,or setting it's value.
	   			// return-type Has to be void,  parameter' data type has to be same with the instance varaible' data type
	   				// this:  instance
	   
	   public void setSSN( int ssn ) {
		     this.ssn = ssn;
	   	}
	   
	   
}


public class EncapsulationsReview {
	
	
	
	/*
	 	wncapsulation: hiding data ( initance variables)
	 				
	 
	 */
	
	static int y=10;   // instance variable
	
	public static void main(String[] args) {
		int num1=10;  // local variable: declared with in the block or methods.
					// can only be used with in the block or methods
//		System.out.println(y);
		
		Data obj = new Data();
			System.out.println( 	obj.getSSN() ); 
			
			int ssn= obj.getSSN();
			System.out.println(ssn);
			ssn =  654321;
			System.out.println( 	obj.getSSN() );   // getter is for Read ONLY
		
				obj.setSSN( 654321);
				System.out.println( 	obj.getSSN() ); 
		
	}
	
	
	public static void method2() {
		System.out.println(y);
		
	}
}
	
	

