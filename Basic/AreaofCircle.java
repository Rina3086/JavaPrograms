package basic;

import java.util.Scanner;

public class AreaofCircle {
	public static void main(String[] args) {
		float radius;
		float pi= 3.14f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		radius = sc.nextFloat();
		float area= pi * radius * radius;
		System.out.println("Area of Circle:"+area);
	}

}
