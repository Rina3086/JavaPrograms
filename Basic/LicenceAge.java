package basic;

import java.util.Scanner;

public class LicenceAge {
	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age : ");
		age = sc.nextInt();
		if(age>=18)
		{
			System.out.println("Valid for Licence");
		}
		else
		{
			System.out.println("Not Valid for Licence");
		}
	}

}
