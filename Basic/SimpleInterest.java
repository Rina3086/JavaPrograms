package basic;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         float a,p,r,t;
         Scanner sc = new Scanner (System.in);
         System.out.println("Enter Principle amount");
         p=sc.nextFloat();
         System.out.println("Enter interest rate");
         r=sc.nextFloat();
         System.out.println("Enter time");
         t=sc.nextFloat();
         
         a=(p*r*t)/100;
         System.out.println("Simple Interest is "+a);
	}

}
