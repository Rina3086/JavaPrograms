package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PercentageBufferReader {

	public static void main(String[] args) throws Throwable, IOException {
		// TODO Auto-generated method stub
          int id;
          String name;
          double phy,chem,maths,total,percentage;
          BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter ID : ");
          id = Integer.parseInt(reader.readLine());
          System.out.println("Enter Name: ");
          name =reader.readLine();
          System.out.println("Enter marks of phy,chem and maths :");
          phy = Double.parseDouble(reader.readLine());
          chem = Double.parseDouble(reader.readLine());
          maths = Double.parseDouble(reader.readLine());
          
          total =phy+chem+maths;
          percentage= total/3;
           System.out.println("Student Id : "+id+"\nName : "+name);
           System.out.println("Total : "+total+"\nPercent : "+percentage);
          
          
          
          
          
	}

}
