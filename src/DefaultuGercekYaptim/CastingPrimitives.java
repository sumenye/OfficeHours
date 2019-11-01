package DefaultuGercekYaptim;

public class CastingPrimitives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=(int)3.9;
		double d=200;
		System.out.println(i);
		System.out.println(d);
		
		byte b1=5;
		short sh1=400;
		//b=s;  DOES NOT COMPILE, WE HAVE TO USE EXPLICIT CASTING
		b1=(byte)sh1;//NOW IT COMPILES 
		System.out.println(b1);
		
		double price=200.55;
		int iPrice=(int)price;
		System.out.println(iPrice);
		
		//int int1=5/2.0; DOES NOT COMPILE BECAUSE IT NEEDS TO BE CONVERTED TO DOUBLE 
		//OR THE assignment needs to be converted to integer
		int int1=(int)(5/2.0);
		System.out.println(int1);
		
		String str="10";
		//int n1=(int)str: DOES NOT COMPILE BECAUSE 
		//CASTING IS DONE BYTE>SHORT>INT>LONG>FLOAT>DOUBLE HIERARCHY
		
		

	}

}
