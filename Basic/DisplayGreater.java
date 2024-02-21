package basic;

import java.util.Scanner;

public class DisplayGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num1,num2,num3;
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter 3 Numbers");
       num1= sc.nextInt();
       num2= sc.nextInt();
       num3=sc.nextInt();
       if(num1>num2 && num1>num3)
       {
    	   System.out.println(num1+" is Greater");
       }
       else if(num2>num1 && num2>num3)
       {
    	   System.out.println(num2+" is Greater");
       }
       else
    	   System.out.println(num3+" is Greater");
	}

}
