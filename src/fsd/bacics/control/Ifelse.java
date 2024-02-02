package fsd.bacics.control;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    if (5 == 5)
    {
    	System.out.println(" 5 == 5 : True");
    }
    else {
    	System.out.println("5 == 5 : False");
    }
    
// not equal to
    if(4 != 5)
    {
    	System.out.println("4 != 5 : True");
    }
    else {
    	System.out.println("4 != 5 : False");
    }
 //  Not 
    if (!(5 != 6))
    {
    	System.out.println("5 != 6 : True");
    }
    else {
    	System.out.println("5 != 6 : False");
    }
 // less then 
    if (4 < 5)
    {
    	System.out.println("4 < 5 : True");
    }
    else {
    	System.out.println("4 < 5 : False");
    }
  // greater then 
    if (7 > 6)
    {
    	System.out.println("7 > 6 : True");
    }
    else {
    	System.out.println("7 > 6 : False");
    }
   //  Greater then or equal to
    if (7 >= 7)
    {
    	System.out.println("7 >= 7 : True");
    }
    else {
    	System.out.println("7 >= 7 : False");
    }
    // Less then or equal to
    if (7 <= 7)
    {
    	System.out.println("7 <= 7 : True");
    }
    else {
    	System.out.println("7 <= 7 : False");
    }
    // and 
    if (7 <= 7 && 7 ==7 )
    {
    	System.out.println("7 <= 7 && 7 ==7 : True");
    }
    else {
    	System.out.println("7 <= 7 && 7 ==7 : False");
    }
    // or
    if (8 >= 7 || 7 == 6 )
    {
    	System.out.println("7 >= 7 || 7 == 6 : True");
    }
    else {
    	System.out.println("7 >= 7 || 7 == 6 : False");
    }
	}

}
