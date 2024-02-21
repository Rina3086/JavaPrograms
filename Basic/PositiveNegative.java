package basic;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
	       Scanner sc =new Scanner(System.in);
	       System.out.println("Enter Number");
	       number= sc.nextInt();
	       if(number>0)
	       {
	    	   System.out.println(number+" is Positive");
	       }
	       else if(number<0)
	       {
	    	   System.out.println(number+" is Negative");
	       }
	       else
	    	   System.out.println(number+ " is Zero");
	}

}
