package basic;

import java.util.Scanner;

public class AreaofRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double length,breadth,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        length= sc.nextDouble();
        System.out.println("Enter breadth");
        breadth=sc.nextDouble();
        
        area = length*breadth;
        System.out.println("Area of Rectangle "+area);
        
	}

}
