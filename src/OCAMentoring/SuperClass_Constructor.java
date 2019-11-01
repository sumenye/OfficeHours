package OCAMentoring;

import java.util.Arrays;

public class SuperClass_Constructor {
	public static void main(String[] args) {
	int ints[][] = new int[3][];
	System.out.println(Arrays.deepToString(ints));
	ints[1]=new int[] {1,2,3};
	System.out.println(Arrays.deepToString(ints));
	ints[2]=new int[] {4,5};
	System.out.println(Arrays.deepToString(ints));
	
//System.out.println(ints[1][1]);
	

}}
