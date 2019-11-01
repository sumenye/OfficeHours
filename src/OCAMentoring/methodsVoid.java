package OCAMentoring;

import java.util.Arrays;

public class methodsVoid {

	
		/*
		 return type:
		  		void:  method doesnt return any value, and the method is for executing 
		  					the body only with out returning any data. 
		 */
		
		public void method1() {
		//	return;   // usually we dont use it, becasue void doesnt allow return any value
			System.out.println("How are you");
			method2();
		}
		
		public static void method2() {
			// method1();   static only accepts static.
			System.out.println("Hello");
		}
		public static void method3() {
			System.out.println("Batch11");
			method2();
		}
		
		public static void main(String[] args) {
			method3();
			
		//	RevStr();  if method signature contains parameter, argument must be provided
			
			RevStr("Cybertek");
			
			LargestSmallest(new int[] {1,2,3,4,5,600,7,8,9});
			Largest(new int[] {1,2,3,4,5,600,7,8,9});
			
			SecondLargest(new int[] {1,2,3,4,5,600,7,8,9});
			
		}
		// create method that can reverse any given string:
		
		public static void RevStr ( String str ) {
			String result="";
			
			for(int i=str.length()-1; i >= 0 ; i--) {
				result = result+ str.charAt(i);
			}
			System.out.println(result);
		}
		
		
		// create method that retuns the larsgest and smallest numbers from the array
		public static void LargestSmallest (int[] arr) {
					Arrays.sort(arr);
				System.out.println("Largest value is: "+arr[arr.length-1] + "\nSmallest number is: "+arr[0]);
			
		}
		
		public static void Largest(int[] arr) {
			int max=-9999999;
			for(int i=0; i<arr.length ; i++) {
				if(arr[i] > max) {
					max=arr[i];
				}
			}
			System.out.println(max);
		}
		
		
		// create method that returns the second largest value from the array (without using sort)
		public static void SecondLargest(int[] arr) {
			int max=-9999999;
			for(int i=0; i<arr.length ; i++) {
				if(arr[i] > max) {
					max=arr[i];
				}
			}
			
			
			int[] arr2=new int[arr.length];
			
			int max2=-9999999;

			for(int i=0; i<arr.length; i++) {
				
				if(arr[i]!=max) {
				arr2[i]=arr[i];
				}
				
			}
			
			for(int i=0; i<arr.length ; i++) {
				if(arr2[i] > max2) {
					max2=arr2[i];
				}
			}
			System.out.println(Arrays.toString(arr));
			System.out.println(Arrays.toString(arr2));
			
		System.out.println(max2);	
			
			
		}

}
