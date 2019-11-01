package OCAMentoring;

import java.util.Arrays;

public class OCAQuiz1Questions {
	
	public static void main(String[] args) {
	/*
	 
	 1. What's the result of the following code fragments?
	 //                             0       1
	  	int[][] arr=new int[][] { {1,2}, {3,4} };
	  							{ {1,2}, {1,2}	}
	  	
	  			arr[1] = arr[0];
	  			
	 		System.out.println( arr[0]);
	 		
	 		A. Compile Error         B. [ 1, 2 ]
	 		C. [ 3, 4 ]				 C. hashcodes    (Correct)
	 		
	 	[][]: [index number of single dimentional array] [index number of the values in the given single dimentional]
	 
	 */
	
	int[] arrz= {1,2,3};
	
	System.out.println(arrz);   // the variable contains more than one elements
	
	// Arrays.toString : converts single dimenbtional arrays to String
	System.out.println(Arrays.toString(arrz));
	
	
	int[][] arr=new int[][] { {1,2}, {3,4} };


	// Arrays.deepToString: converts multi-dimentional array to String
	System.out.println( Arrays.deepToString(arr));
	
	
	
	/*
	 2. which one of the following will give compile error?
	 
	 	A. int[][] arr=new int[2][];
	 	B. double[][] arr = new double[][] { {1,2}, {3,4} };
	 	C. long[][] arr=new long[2][] { {1,2}, {3,4} };     ( correct)  Array's size is fixed
	 	D. int[][] arr ={ {'A', 'B'}, {'C' , 'D' } };
	 		
	 		byte < short <int < long < float < double            char          boolean
	deafult: 0      0      0       0    0.0       0.0            empty           false
	
	Wrapper class' defualt values: null
	 */
	
	int[][] arr2=new int[2][4];
	System.out.println(Arrays.deepToString(arr2));
	
	//double[][] arr3=new double[3][] { {1,2}, {3,4} };
//	System.out.println(Arrays.deepToString(arr3));
	
	int[][] arr4 ={ {'A', 'B'}, {'C' , 'D' } };
	
	char a='l';
	int z='l';
	System.out.println(z);
	
	int[][] arr9 ={ {'A', 'B'}, {'C' , 'D' } };
	System.out.println(Arrays.deepToString(arr9));
	
	
	
	
	/*
	 3. what's the result of the following code fragment?
		 		int[][] arr= { {1,2,3}, {3,4} };
			for(int i=0; i<2; i++) {
				for(int j=0; j<2; j++) {
					System.out.println(arr[i][j]+" ");
				}
			}
			
			A.  1 2 3 3 4                             B. 1 2 3 4        (Correct)
	 		C.  1 2 3								  D. Throws an Exception
	 		E. Compile Error
	 
	 */
	
	
	int[][] arry= { {1,2,3}, {3,4} };
	for(int i=0; i<2; i++) {      // i=0,  i=1
		
		for(int j=0; j<2; j++) {   // j=0,   j=1
			
			System.out.println(arry[i][j]+" "); 
			//  when i is 0: [0][0]     [0][1]         1, 2
			// when i is 1:    [1][0]  [1][1]          3, 4
			
		}
		
	}
	
	
	
	
	
	
	
	/*
	  4. Which Three lines fail to compile?
	 		1	int ivar = 100;
			2	double dvar = 123;
			3	float fvar = 200; 
			4		ivar = fvar;     error
			5		fvar = ivar;     compiles
			6		dvar = fvar;     comiple
			7		fvar = dvar;     error
			8		dvar = ivar;       compiles
			9		ivar = dvar;      error
			
		A. line 3, line 5, line 8                        B. line 4, line 7, line 9  ( correct)
		C. line 5, line 6, line 9						 D. line 4, line 5, line 8
		
		byte < short < int < long < float < double
	 
	 */
	
	short zz=10;
	int y= zz;   
	
	
	long u=10L;
	
	double d1=10F;
	double d2=10L;
	
	
	/*
	 5. Which code fragment, when inserted at line 3, enables the code to print 10:20?
			public static void main(String[] args) {
			
				 line 3 **
				 arr[0]=10;
				 arr[1]=20;
				 System.out.println(arr[0]+" "+ arr[1]); 
			}
			
			A. int arr[2] ;                           B. int[] arr n = new int[2];
			C. int[] arr;     arr = int[2];           D. int arr[] = new int[2];  (Correct).

	 
	 */
	
		int[] arrp = new int[   2  ];
		
			 arrp[0]=10;
			 arrp[1]=20;
	 System.out.println(arrp[0]+" "+ arrp[1]); 
	
	
	
	
	 /*
	  		6.  What's the result?
	  		public static void main(String[] args) {
		
					System.out.println("Result A"+0+1);
					System.out.println("Result B"+(1)+(2));
					
				}

		A. ResultA01     ResultB12                     B. ResultA01     ResultB3
	    C. ResultA1      ResultB3 					   C. ResultA1      ResultB12
	  
	  */
	
	 
	 System.out.println("Result A"+0+1);
	 		System.out.println(  "Result A".concat("0").concat("1") );  // Result A 01
	 
	 
		System.out.println("Result B" + (1)+(2));
		System.out.println("Result B".concat("1").concat("2"));   // Result B12
	
		System.out.println("Result B"+(1+2));
		
		System.out.println( 1+2 +"A"); //3A
		
		
	
	  /*
	   			7.  What's the result ?
	   			
	   			public static void main(String[] args) {
		
						System.out.println("5 + 2 = "+3+4);
						System.out.println("5 + 2 = "+(3+4));
						
					}
			
	    	A. 5 + 2 = 34     5 + 2 = 7	  (Correct)     	       B. 5 + 2 = 34    5 + 2 =34
	   		C. 7 = 7        7 + 7				   D. 5 + 2 = 3 + 4     5 + 2 = 7
	   
	   */
	
		System.out.println("5 + 2 = "+3+4);
		System.out.println("5 + 2 = ".concat("3").concat("4"));  // 5 +2 =34
		
		System.out.println("5 + 2 = "+(3+4));
		System.out.println("5 + 2 = ".concat("7"));
	
		System.out.println("4"+3+"A");//43A
	
	
	  
	   /*
	      8. What's the result?
	      
	      	public static void main(String[] args) {
					String str = " ";
						str.trim();
					System.out.println(str.equals("") +"   "+ str.isEmpty());	
				}
				
		   A. false     true		            B. true    true
		   C. false     false	 (Correct)			    D. true    false
	 
	   */
	
		String str = " ";
			 str.trim();  
	System.out.println(str.equals("") +"   "+str.isEmpty());
	
	
	String A1= "     Cyber tek         ";
			A1.trim() ;          //    "Cyber tek"
		System.out.println(A1);
		
		
		
		
		/*
		    9. what's the result ?
		    		public static void main(String[] args) {
							int[][] arr=  { {1,2}, {3,4} };
							for(int i=arr.length-1; i>=0; i-- ) {
								for(int j=0; j<arr.length; j++) {
									System.out.println(arr[i][j]+" ");
								}
							}
						}
						
			A.  3 4 1 2	 ( Correct)						B. 1 2 3 4
			C.  4 3 2 1						    D. 2 1 3 4
		 
		 */
		//					0      1
		int[][] arru=  { {1,2}, {3,4} };
		
		for(int i=arru.length-1; i>=0; i-- ) {          // i=1              i=0 
			
			for(int j=0; j<arru.length; j++) {  //j=0   j=1              j =0     j=1
				
				System.out.println(arru[i][j]+" ");  // arru[1][0] 3         arru[i][1]  4
													//  arru[0][0]  1         arru[0][1]  2
			}
			
		}
		
		
		
	
	
	
		/*
		     10. Which statement is true about Java byte code?

			      A.  it can run on any platform.   
			
			      B. it can run on any platform only if it was compiled for that platform.
			
			      C. It can run on any platform that has the Java Runtime Environment.   ( correct)
			
			      D. It can run on any platform that has a Java compiler.
			      
		 
		 */

		
    }
}