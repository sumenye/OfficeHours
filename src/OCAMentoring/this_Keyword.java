package OCAMentoring;

public class this_Keyword {
	/* 
	 
	 Today's reveiw: 
	 		1. this(this. , this() ) & super keywords (super. , super() ),  
	 		2. method overriding , 
	 				overload vs override 
	 
	 */
	
	
	// this: call instance variables, instance methods and constructor
	
	 String name = "batch11";
	
	
	public static void main(String[] args) {
		//  this.name ="batch12";   //  there is no object instance in static method
		new this_Keyword();
		
		System.out.println(  new this_Keyword().name );   
		// when object is created, intsance block will be executed, then the constructor
		
	}
	
	static {
		// this.name = "Batch11";   //  there is no object instance 
	}
	
	
	public this_Keyword() {
		// this();   // cannot call itself
		this.name ="batch 11";   // constructor belongs to the object.
	}
	
	public void method1() {
		this.name="Batch 12";   // instance method belongs to the object
	}
	
	{
		this.name = "Batch 13"; // instance block belongs to the object.
	}
	
	
	// this key word refers to the object instances in the class.
	// this keyword can be used in: constructor, instance methods and instance blocks
	
	
	
	// this(): call constructors
	
	public void method2() {
	//	this();    //   only constructor can call the constructor
	}
	
	

	/*
	 	final:  value cannot be modified
	 			applicable to variables, methods, class
	 		
	 			variable: cannot re-assign it's value,
	 						instance variables MUST be initilized before use:
	 										    if it's static: it can be initialized in static block
	 										    if it's instance: it can be initialized either in constructor or in insitance block
	 								
	 			
	 			class: cannot be extended
	 			
	 			method: method cannot be override
	 			
	 			
	 		break : 7:15
	 
	 
	 */
	

}