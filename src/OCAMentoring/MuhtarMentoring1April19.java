package OCAMentoring;

public class MuhtarMentoring1April19 {
	public static void main(String[] args) {
		
		/*
		 * 
  		Question 01:  
  			what's the result of the Following code fragment?
  			
  			double A=10;
			switch (A) {
				case 10:  System.out.println("Hello");
				case 11: System.out.println("Hola"); 
						  break;
				default: System.out.println("invalid");	
				
			}		
			
			A. Hello  Hola                     B. Invalid
			C. Compile error   (C)                D. Hello
			
		//switch does not accept: double, long, boolean, float/				 
		 */
		int A=10;
		switch (A) {
			case 10:  System.out.println("Hello");
			case 11: System.out.println("Hola"); 
					  break;
			default: System.out.println("invalid");	
			
		}
	//==============================================================
		/*
		  	Question 02: 
		  	
		  	public static void main(String[] args) { 
		  	  System.out.println("2"+(3)+(4));
		  	  }
		  	
		  A. 27     					B. 234 (correct)
		  C. 9							D. compile error
		  
		 */
		System.out.println("2"+(3+4));
		String str1="2".concat("7");
		System.out.println(str1);
		
		
		
		/*
		 Question 03: 
		    public static void main(String[] args) { 
		  	      System.out.println("2"+( 3 + 4 ) );
		  	  }
		 
		 A. 27	(correct)					B. 234
		 C. 9						D. 2+7
		 
		 */
		
		
		
		
		
		
		
		/*
		 Question 04:
		 
		    public static void main(String[] args) { 
		  	      method1();
		  	      
		  	      public static void method1() {
				System.out.println("hello batch 11");
					}
					
		  	  }
		  	  
		  	  A. hello Batch 11					 B. compile error (correct)
		 
		 */
		
		
		
		
		
		/*
		 Question 05: 
		 	 Which statement is true about Java byte code?
		 	 	
		 	 	A. it can run on any platform.
		 	 	
		 	 	B. it can only run on Eclipse.
		 	 	
		 	 	C. it can run on any platform that has Java runtime environment. (correct)
		 	 	
		 	 	D. none of the above.
		 	
		 */
		
		
		/*
		 	Question 06:
		 			static public void main(String... OCA){
		 			
		 					int[][] arr= { {1,2}, {3,4} };
		 				System.out.println(Arrays.toString(arr));
		 				
		 					}
		 		A. compile error             B. [ [1, 2], [3, 4] ]
		    C. [[I@7852e922, [I@4e25154f]	 D. [ 1, 2 ]	
		 
		 */
		
		
		/*
		  Question 07:
		  		Whichstatement is true about the switch statement?
		  		  	A. It must contain the default section
		  			B. The break statement is mandatory at the end of case block.
		  			C. Its expression must evaluate to a single value (correct)  
		  			
		 */
		
		
		
		
		/*
		 Question 08:
		      Which option can replace xxx to enable the code to print 135 ?
		      
		      	 int[] arr1 = {1,2,3,4,5};
		      		for( XXX ) {
		      			System.out.println(arr1[e]);
		      			}
		 
		 		A. int e = 1;  e <= 5;  e += 1        B. int e = 0;  e <= 4;  e++
		 		C. int e = 0;  e < 5;  e += 2 (correct)        D. int e = 1;  e  <  5;  e +=2
		 
		 */
		
		
		
		
		/*
		 Question 09: 
		 	 Whichcode fragment causes a compilation error?
		 	 
		 	   A.  float flt =100F ;           B. float flt = 100;
		 	   
		 	   C. double y = 203.22;             D. int  y =10;    
		 	    float A= y;					         float flt= y; 
		 	     
		 
		 */
		
		
		
		
		/*
		  Question 10:
		     which one of the following will give compile error?
		       A. int a= 'B' ;         B. double a =100L ;
		  	   C. long a='8' ;          D. int a= 200F ;(correct)
		  
		 */
		
		
		/*
		  Question 11:
		  		int x=100; // 101
		  		int y=x++;  //100++---->y=100
		  		int z= y++;  //100++-------->z=100
		  			++z;      //++100------>z=101
		  	System.out.println(z);		
		  
		  A. 100           B. 101
		  C. 102           D. 103
		  
		 */
		
		
		
		/*
		 Question 12:
		 	
		 		int x=100;
		 		int a=x++;
		 		int b=++x;
		 		int c=x++;
		 		
		 		int d=(a<b) ? (a < c) ? a : ( b<c )? b : c; // in order to compile 
		 		//it has to be equal number of question and columns
		 		System.out.println(d);
		 		
			A. 100						B. compile error (correc)
			C. 101          		    D. 102			 	
		 		
		 */
		
		int e=0;
		if(10>9)e=20;
		else e=40;
	int t = (10>9) ? 20 :40;
	//---------------------
	int z1=10;
	if(true==false) z1=20;
	else if ( true==!false) z1=30;
	else if ( !false==!true) z1=40;
		
	int y1=	(true==false)? 20 : ( true==!false) ? 30 : ( !false==!true)?40 : 0;
	
	
		/*
		 Question 13:
		 	String[][] arr = { {"A","B"}, {"C","D"} };
			for(int i=0; i<arr.length; i++) {
			
				for(int z=0; z<arr[i].length; z++) {
					System.out.print(arr[i][z]);
					
					break;
				}
			}
			
			A. ABCD         B. AB
			C. AC (correct)          D. CD
		 
		 
		 */
		
		
		
	

	}

}

