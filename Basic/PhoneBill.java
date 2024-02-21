package basic;

import java.util.Scanner;

public class PhoneBill {
	public static void main(String[] args) {
		int noOfCalls, billAmount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of Calls");
		noOfCalls= sc.nextInt();
		if(noOfCalls<200)
		{
			billAmount = noOfCalls*1;
		}
		else {
			billAmount = noOfCalls*3;
		}
		System.out.println("Bill Amount : "+billAmount);
	}

}
