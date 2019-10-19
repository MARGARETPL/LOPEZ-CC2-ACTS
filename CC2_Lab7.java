
import java.util.*;
public class CC2_Lab7{
	public static void main(String[]args){
		
	Scanner sc = new Scanner(System.in);
		int grade =sc.nextInt();
		if(grade>=92&&grade<=100){
			System.out.println("A");
		}
		else if (grade>=87&&grade<=91){
				System.out.println("B+");
					
		}
		else if (grade>=83&&grade<=86){
				System.out.println("B");
					
		}
		else if (grade>=79&&grade<=82){
				System.out.println("C+");
					
		}
		else if (grade>=75&&grade<=78){
			
				System.out.println("C");
		}
		else if (grade>=70&&grade<=74){
			
				System.out.println("D");
		}
		else if (grade<=70){
			
			System.out.println("F");
		}
		
		
		
	}	
		
		
		
}