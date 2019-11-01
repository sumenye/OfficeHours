package OCAMentoring;

	class parent{
		
		int num1=100;
		
		parent(){
			System.out.println("parent Constructor");
		}
		
		public void method() {
			System.out.println("Instance method");
		}
		
		{
			System.out.println("Instance block");
		}
		
		
	}


	public class super_Keywords extends parent{   // instance block is also inharitable
		
		
	// super: calls super class object instances.  it refers to the super class' object instances
		
		public static void method5() {
		//	super.num1=200;    // there is no object isnatnce in static method
		}
		
		static {
//			super.num1=300;  // there is no object isnatnce in static method
		}
		
		
//		super. can be used in : constructor, instance method, instance block
		// super.  is used to call object instances from super class ( cannot call instance block , and constructor)
		
		public super_Keywords() {
			super.num1=300;
		}
		
		public void methodA() {
			super.num1=600;
		}
		
		{
			super.num1 =700;
		}
		
		
		// super() : it's used to call constructor from super class. can only be used in sub class' constructor
		
		public void methodB() {
		//	super();   // only constructor can call constructor
		}
		
		
		super_Keywords(int a){
			super();  // parent constructor
			System.out.println("sub class constructor");
		}
		
		public static void main(String[] args) {
			new super_Keywords(9);
			
			System.out.println(new super_Keywords().num1);
			System.out.println(new parent().num1 );
			
			
		}

	}