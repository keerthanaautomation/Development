package rail;

public class Ifconditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    //Conditional statements are used to make decisions in the code based on certain conditions
        //types of conditional statements
        //1.if statement
        //2.if else statement
        //3.nested statements(else if,if else)
        //4.switch statement
        
        //1.if statement
        
      
   
        
        
        int a=41;
        int b=41;
        
        
        if(a==b)
        {
            System.out.println("Both are equal");
            
        }
        
        
        
       
       
        
        int x=3;
        if(x>1)
        {
            System.out.println("The value of x is greater than one");
        }
      
        if(x<1)
        {
            System.out.println("The value of x is greater than one");
        }
       
        if(x>=1)
        {
            System.out.println("The value of x is greater than one");
        }
        
        if(x<=1)
        {
            System.out.println("The value of x is greater than one");
        }
        
        //////
        
        //if else condition
     
        
        
        
        
        //if else
        
        int j=1;
        int k=2;
        if(j==k)
        {
            System.out.println("both are equal");
        }
        else
        {
            System.out.println("both are not equal");
        }
        int n=1;
        if(n>=0)
        {
            System.out.println("this is +ve number");
        }
        else
        {
            System.out.println("this is -ve number");
        }
        
        
        int en=0;
        if(en%2==0)
        {
            System.out.println("this is even number");
        }
        else
        {
            System.out.println("this is odd number");
        }
        
        
        //== and .equal
        
        
        String s="heLlo";
        String s1="hello";
        if(s.equals(s1))
        {
            System.out.println("both are equal");
        }
        else {
            System.out.println("not equal");
            
        }
            
        String s11="Hai";
        String s12="HAI";
        if(s11.equalsIgnoreCase(s12))
        {
            System.out.println("both are equal");
        }
        else {
            System.out.println("not equal");
            
        }
        

        
        

   	
   	
   	////nested if
   	
   	 String browser="fir";
        if(browser.equalsIgnoreCase("firefox"))
        {
            if(browser.equals("chrome"))
            {
                System.out.println("launch chrome");
                
            }
            if(browser.equals("ie"))
            {
                    System.out.println("launch ie");
            }
            if(browser.equals("firefox"))
            {
                System.out.println("launch firefox");
            }
            if(browser.equals("safari"))
            {
                System.out.println("launch safari");
            }
        }
        else
        {
            System.out.println("Please pass the vaild browser name");
        }
        
        ///switch statement
        
        int monthoftheyear=12;
        
        String yearmonth = null;
        switch(monthoftheyear) {
        
        case 1:
       	 System.out.println("Name of month");
       	 yearmonth="janauary";
       	 break;
        case 2:
       	 System.out.println("Name of month");
       	 yearmonth="feb";
       	 break;
        case 3:
       	 System.out.println("Name of month");
       	 yearmonth="mar";
       	 break;
        case 4:
       	 System.out.println("Name of month");
       	 yearmonth="apr";
       	 break;
        case 5:
       	 System.out.println("Name of month");
       	 yearmonth="may";
       	 break;
        case 6:
       	 System.out.println("Name of month");
       	 yearmonth="june";
       	 break;
        case 7:
       	 System.out.println("Name of month");
       	 yearmonth="july";
       	 break;
        case 8:
       	 System.out.println("Name of month");
       	 yearmonth="aug";
       	 break;
        case 9:
       	 System.out.println("Name of month");
       	 yearmonth="sep";
       	 break;
        case 10:
       	 System.out.println("Name of month");
       	 yearmonth="oct";
       	 break;
        case 11:
       	 System.out.println("Name of month");
       	 yearmonth="nov";
       	 break;
        case 12:
       	 System.out.println("Name of month");
       	 yearmonth="dec";
       	 break;
       	 
       	 
       	 default:
       		 System.out.println("invalid data");
        
        }
        
        
        System.out.println("monthoftheyear:" +yearmonth);
	}
}
        
        
        
        
        
        
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
        
	
	
	 
     
 
        
        
	 
    

	


