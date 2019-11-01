package officeHours;

public class May1_Repl166 {
	  public static void main(String[] args) {
		    //test your code
		    System.out.println( uniqueChars("wooden-spoon") ) ;
		  }
		  
		  public static String uniqueChars(String str) {
		    //TODO: write your below
		    
		    //we declared a variable that will store unique characters
		    String result = "";
		    //we are looping through the string
		    for(int i = 0; i < str.length();i++){
		      //if result variable doesn't contain this characters
		      //skip it
		      if(!result.contains(String.valueOf(str.charAt(i)))){
		        //otherwise, if there is no such a character
		        //add it to the result 
		          result+=str.charAt(i);
		      }
		    }
		    //at the end return string with unique characters
		    return result;
		    
		  }

}
