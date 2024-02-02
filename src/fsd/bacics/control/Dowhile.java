package fsd.bacics.control;

import fsd.bacics.control.Arith;

public class Dowhile {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     int arr[]= {2,3,4,5,6};
     int total =0;
     Arith arith = new Arith();
     for(int i =0;i<arr.length;i++)
{
    	 System.out.println(i+":"+arr[i]);
    	 total = Arith.div(total, arr[i]);
    	 Arith.add(total, i);
     }
{
     System.out.println("Total :"+ total);
	}
	
}    
}   
  