package DefaultuGercekYaptim;

import java.util.Scanner;

public class DataTypesInScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int i=input.nextInt();
		System.out.println("You entered integer value: "+i);
		
		Scanner input1=new Scanner(System.in);
		byte b=input.nextByte();
		System.out.println("You entered byte value: "+b);
		
		Scanner input2=new Scanner(System.in);
		short s=input.nextShort();
		System.out.println("You entered short value: "+s);
		
		Scanner input3=new Scanner(System.in);
		float f=input.nextFloat();
		System.out.println("You entered float value: "+f);
		
		Scanner input4=new Scanner(System.in);
		double d=input.nextDouble();
		System.out.println("You entered double value: "+d);
		
		//NO WAY TO USE CHAR PRIMITIV

		System.out.println("Are you hungry ? " );
		Scanner input5=new Scanner(System.in);
	    boolean isHungry = input.nextBoolean();
	    System.out.println(" I am hungry " + isHungry);
	    
	    input.close();

	}

}
