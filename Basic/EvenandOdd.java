package basic;

import java.util.Scanner;

public class EvenandOdd {
	public static void main(String[] args) {
		double integer;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		integer= sc.nextInt();
        if (integer %2==0)
        {
        	System.out.println("Entered value is Even");
        }
        else
        	System.out.println("Entered value is Odd");
        	
	}

}
