package rail;

public class Strng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///string-anything is enclosed with double quotes called string
		//print the given strimg
		String s="welcome to selenium";
		System.out.println(s);

      //to find the number of characters in the given string
		 System.out.println(s.length());
		 
		 ///to find the index of the str
		 
		    System.out.println(s.indexOf("e"));
	        System.out.println(s.indexOf("s"));
	        
	        
	        //substring
	        String kk="Welcome to selenium class";
	        System.out.println(kk.substring(0, 5));
	        System.out.println(kk.substring(0,3));
		 
		//How to get the character in the given string
	        System.out.println(s.charAt(3));
	        System.out.println(s.charAt(2));
	        
	        ////How to get the index of the character in the given string
	        
	        System.out.println(s.indexOf('c'));
	        
	      //to remove the space present the given string
	        String ss="      welcome   java";
	        System.out.println(ss);
       
	      //trim is used to remove the space in the beginning of the string
	        System.out.println(ss.trim());
	        
	        //string replace
	        System.out.println(ss.replace(" ", ""));
	        
	      //contains
	        String s2="this is java program";
	        
	        
	        System.out.println(s2.contains("java"));
	        System.out.println(s2.contains("hai"));
	        
	        //string concat
	        int aa=98;
	        int bb=25;
	        int cc=aa+bb;
	        System.out.println(cc);//addition
	        String k11="java";
	        String k22="selenium";
	        String k33=k11+k22;//concat
	        System.out.println(k33);//concat
	        System.out.println(k33+aa+bb);
	        System.out.println(k33+(aa+bb));//String + integer
	        
	        
		
		
		
	}

}
