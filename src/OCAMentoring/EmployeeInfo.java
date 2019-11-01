package OCAMentoring;

public class EmployeeInfo {
	private String username ="123123";
	private boolean password = true;
	private float ssn =  new Float("10");  // it executes the valueOf 
			// float ssn  = Float.valueOf("10");   returns wrapper Float ,    unboxing
			// float ssn = Float.parseFloat( "10" );    returns primitive
	
	/*
	 access modifers: public, protected, default, private
	 specifiers:  static
	 
	 */

	public String getusername() {
		return username;
	}
	
	public float getSSN() {
		return ssn;
	}
	
	public void setSSN( float ssn) {
		this.ssn = ssn;
	}
	
}

 class EncapsulationPractices {
	
	
			static int z;


			public static void main(String[] args) {
				int y;
		//		System.out.println(y);   local variables has to be initilized before use it
				System.out.println(z);  //  instance variables does not have to be initilized
				
				
				
				EmployeeInfo obj = new EmployeeInfo();
						System.out.println( obj.getusername() );
						
						System.out.println( obj.getSSN() + 2  );
						
						obj.setSSN(98);
						System.out.println( obj.getSSN());
						
				EmployeeInfo obj2 = new EmployeeInfo();
					System.out.println( obj2.getSSN());
						
						
						
			}
}
