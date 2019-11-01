package DefaultuGercekYaptim;

public class Day13 {

	public static void main(String[] args) {
		
		/* equal method---> str1.equal(str2)---->return boolean result
		 * equals ignore method---> str1.equalsIgnoreCase(str2)---->returt boolean result without 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		
String s1 = "abc";
String s2 = "ABC";
boolean b1 = s1.equals("abc");
boolean b2 = s1.equals(s2);
boolean b3 = s1.equalsIgnoreCase(s2);
System.out.println(b1);
System.out.println(b2);
System.out.println(b3);
System.out.println(s1+"---uppercase " +s1.toUpperCase());

System.out.println(s1+"---lowercase " +s1.toLowerCase());
	}

}
