import java.io.*;
import java.text.*;

public class Room {
    
	public static void main(String[]args) throws java.lang.Exception
	{
		BufferedReader one = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter length: ");
		double length = Double.parseDouble(one.readLine()); 
		
		System.out.print("Enter width: ");
		double width = Double.parseDouble(one.readLine());
		
		double area = length * width;
		
		DecimalFormat two = new DecimalFormat("0.00");
		
		System.out.println("The floor space of the room is "+ two.format(area) + " square units");
		
	}
}