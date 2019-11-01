package OCAMentoring;

import java.util.Arrays;

public class OCAQuiz2Questions {
public static void main(String[] args) {
		
		/*
		   1. What's the result of the following code fragment? 

                  String[][] arr= { {"A","B","C"}, {"D","E"} };
                  
                         for(int i=0; i<arr.length; i++) {                               
                         
                              for(int j=0; j<arr[i].length; j++) {               
                              
                                     System.out.print( arr[ i ][ j ] ) ;   
                                     
                                     if(arr[ i ][ j ].equals("B")) {
                                              break;
                                                    }
                                                    
                                              }
                                              
                                        }
		 
		 		A. ACDE					     		B. ABC
		 		C. ABDE								C. Compile Error
		 		
		 */
		
		
	String[][] arr= { {"A","B","C"}, {"D","E"} };
        
    for(int i=0; i<arr.length; i++) {             //    i=0                  i=1                   
    			//	   j < 3
         for(int j=0; j<arr[i].length; j++) {   // j=0   j=1  j=2           j=0    j=1  
        	 	//    j < 2		
                System.out.print( arr[ i ][ j ] ) ;  // [0][0] 
                									   // [0][1]
                //ABDE								//		[1][0]  [1][1]
                if(arr[ i ][ j ].equals("B")) {
                         break;    // it exits the inner loop and switch statment
                               }
                
            //    System.out.print( arr[ i ][ j ] ) ;
                               
                         }
                         
                   }
	
	
    
    	int[] arrr = {1,2,3,4,5,6};
    		for(int i=0; i < arrr.length; i++) {
    			
    			
    			if(arrr[i]==3) continue;
    			
    			System.out.print("\n"+arrr[i]);
    			
    		}
    
    		for(int i=1; i < 10 ; i++) {
    			
    			if( i%2 == 0 )
    				continue;
    			
    			System.out.print(i+" ");
    			
    			
    		}
		
		
		
		/*
		     2. What's the result of the given code fragment? 

                              int wd=0;
          		String[] days= {"sun","mon","wed","sat"};
          		
                    for(int i=0; i<days.length; i++) {
                    
                            switch (days[i]) {
                                    case "sat": 
                                    case "sun": 
                                                  wd -=1;
                                                  break;
                                    case "mon": 
                                                   wd++;
                                    case "wed": 
                                                  wd += 2; 
                                               }                                               
                                       }
                                       
                         System.out.println(wd);
                         
              A. 0 									B. 4
              C. compile error						D. 3       ( Correct)    
		 
		 */
    		
    		
            		int wd=0;   //  -1+1+2+2-1  = 3
        		String[] days= {"sun","mon","wed","sat"};
        		
                  for(int i=0; i<days.length; i++) {
                  
                          switch (days[i]) {   // sun mon, 
                                  case "sat":  
                                	  
                                  case "sun": 
                                                wd -=1;
                                                break;
                                  case "mon": 
                                                 wd++;
                                  case "wed": 
                                                wd += 2; 
                                        
                                             }                                               
                                     }
                  System.out.println();
                                     
                       System.out.println(wd);
    		
    		
		
		
		/*
		 		3. what is the result? 

                  String[][] arr= { {"A","B","C"}, {"D","E"} };
                       for(int i=0; i<arr.length; i++) {
                             for(int j=0; j<arr[i].length; j++) {
                                   if(arr[i][j].equals("B")) {
                                       break;
                                         }
                          System.out.print(arr[i][j]);
                               }
                   }
                	
             A. ADE		( Correct)						B. ABDE      
		 		C. ACDE 							D. Compile Error
		 		
		 */
                       		//					A            DE
                       String[][] arr6= { {"A","B","C"}, {"D","E"} };
                //      [0][0]   A
                       //[0][1]  B
                       
                       //			i < 2
                       for(int i=0; i<arr6.length; i++) {          // i=0;             i=1
                    	
                         // when i is 0: j <3           		
                    	   for(int j=0; j<arr6[i].length; j++) {   // j=0, j=1, j=2      j=0, j=1
                    		   // when i si 1:  j <2
                                   if(arr6[i][j].equals("B")) {   
                                       break;
                                         }
                          System.out.print(arr6[i][j]);
                               }
                    	   
                    	  
                   }
		
		
		
		
		/*
		 4. what's the result of the given code fragment?

               int[] num1=new int[3];
               int[] num2= {1,2,3,4,5};
                    num1=num2;
          for(int i=0; i<num1.length; i++) {
                     System.out.print(num1[i]);
                 }
             
          A. 000								B. 12345  ( correct)
          C. Compile Error					D. 123
		 
		 
		 */
		
                       int[] num1=new int[3];  // [0, 0, 0]
                       
                       
                       int[] num2= {1,2,3,4,5};
                              
                            num1=num2;
                       //     num1 and num2: {1,2,3,4,5};
                            System.out.println();
                  for(int i=0; i<num1.length; i++) {
                             System.out.print(num1[i]);
                         }
                       
                       
              
                  
                  int arrp[] = new int[2];
                  	arrp[0]=100;
                  	arrp[1]=200;
                  	
                  	
                 	arrp = new int[5];   // arrays size is fiexed.
                  	
                  	System.out.println(Arrays.toString(arrp));
                       
		
		
		/*
		 	5. Given the code fragent:

                   int[] arr1 = {1,2,3,4,5};
                              for(  XXX ) {
                      System.out.print(arr1[e]);
                        }

				Which option can replace xxx to enable the code to print 135 ?
				
		 A. int e = 0;  e < 5;  e += 2    (correct)              B. int e = 1;  e <= 5;  e += 1
		 C. int e = 0;  e <= 4;  e++                           D. int e = 1;  e  <  5;  e +=2
		 
		 
		 */
		
                 //          	   0  1   2  3  4
                  	int[] arr1 = { 1, 2, 3, 4, 5  };  // 1, 3, 5
                    for( int e=0; e < arr1.length;  e+=2  ) {
                    		System.out.print(arr1[e]);
              }
                    
                    System.out.println();
                    int[] arr2= {1,2,3,4,5,6,7,8,9};   // 1  4   7
                    for( int e=0; e < arr2.length;  e+=3  ) {
                		System.out.print(arr2[e]);
          }
		System.out.println();
                    
                    for(int i=0; i < 20; i +=2) {
                    	System.out.print(i+" ");
                    }
                    
                    // e +=3   &    e= e+3
                    
                    
		
		/*
		   6. Which statement is true about the switch statement?

				A. It must contain the default section. 
				
				B. The break statement, at the end of each case block, is mandatory.
				
				C. Its case label literals can be changed at run time.
				
				D. Its expression must evaluate to a single value.  ( Correct)
		 
		 
		 */
                 switch(98) {
                 case 98:  System.out.println("hi");
                 }
                    
                    
		
		
		
		
		/*
		 7. Given the code fragment: 

                 int x=100;
                 int a=x++;
                 int b=++x;
                 int c=x++;

           int d = (a<b) ? (a < c) ? a : ( b<c )? b : c;
           
            System.out.println(d);

			what's the result?
			
			A.  Compilation fails     (Correct)                   B. 100
			C. 101 										          D. 102
			
		 */  
		
		
                 int x=100;
                 int a=x++;
                 int b=++x;
                 int c=x++;

      //     int d = (a<b) ? (a < c) ? a : ( b<c )? b : c;    
                 // in ternary:  total number of ? and : MUST be equal in order to compile
           
           // System.out.println(d);
            
            
		
		/*
		   8. Which method signature do you use at line 1?
		   
		   public static void main(String[] args) {
		   
					int[] numbers= {1, 2, 3, 4, 5};
					int max = findMax(numbers);
					
				}
				
				 		line 1     {
					int max =0;
					return max;
							
				}
				
				A.  static int findMax (int[] numbers)   ( Correct)
				B.  public int findMax (int[] numbers)   // static only accepts static ( directly )
				C.  static int[] findMax (int max)
				D.  static int findMax (int numbers)   
		   		
		   
		 */
		
		
		/*
		 	9. What's the result of the following code fragment?
		 				public static void main(String[] args) {
								int num = 10;
								add10(num);
								System.out.println(num);
								
							}
							public static void add10(int num) {
								num=num+10;
										
							}
		 	
			A. 0							B. 10  ( Correct)
			C. compile error				D. 20

		 
		 */
		
		
		
		
	}

}

