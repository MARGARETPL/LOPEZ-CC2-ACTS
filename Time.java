import java.util.*;
import java.lang.Math;

	public class Time{
		public static void main(String[]args){
			
			Scanner scan = new Scanner(System.in);
			int minutes;
			int total_hours;
			int re_minutes;
			
			System.out.print("Enter number of minutes: ");
			minutes = scan.nextInt();
			total_hours = minutes/ 60;
			re_minutes = minutes % 60 ;
			
			System.out.println(minutes + " minutes is " + total_hours + " hours and " + re_minutes + " minutes.");
			

			
		}
	}