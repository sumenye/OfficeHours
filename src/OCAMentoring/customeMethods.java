package OCAMentoring;

public class customeMethods {

	public static void main(String[] args) {
		 String A="Cybertek";
	        for(int i=A.length()-1; i >=0;i--) {
	            System.out.print(A.substring(i,i+1));
	        }
	        System.out.println();
	        
	        String B="batch11";
	        
	        reverse("batch11");
	        
	        
	    }
	    
	    public static void reverse(String B) {
	        for(int i=B.length()-1; i >=0;i--) {
	            System.out.print(B.substring(i,i+1));
	        }
	        
	    }
	/*
	 * method decletarion:
	 * 
	 * access modifier  specifier   return type  methodname   ( parameter)  {  }
	 * optional         optional      required   required
	=========================================================
	 
	 access-modifers (optional):  public, protected, default, private
     specifer (optional):  static , final, abstract
     return type (required):  void(u cannot return any value) or any class, or primitives, objects
     methodname (required): it can be anyname must start with apphebets.
     {  body of the method }  (required)
     
     ==========================================================
     
	 * */
//access modifier  specifier   return type  methodname    parameter
	public          static      void           name      ( String a    ) {
		
	}
		
		static void nam2() {
			
		}
		void name56() {
			return;
		}
	

}
