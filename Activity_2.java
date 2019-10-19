import java.util.*;
public class Activity_2{
	public static void main(String[]args){
	Scanner sc = new Scanner (System.in);
	 String s;
	 int q;
	 int x;
	 int y;
	 int sum;

	System.out.print("Enter the Operation: ");
	 q = sc.nextInt();
	System.out.print("Enter All Operation in one Line: ");
	
	for(int p=0;p<q;p++){
		 s = sc.next();
	if (s.equals("max")){
		x=sc.nextInt();
		y=sc.nextInt();
		if (x<y){
			System.out.println(y);
			
		}
		else{
			System.out.println(x);
		}
	}
	else if (s.equals ("add")){
		x=sc.nextInt();
		y=sc.nextInt();
		sum=x+y;
		System.out.println(sum);
	}
	else if (s.equals("negate")){
		x=sc.nextInt();
		if(x>0){
			System.out.println("-"+x);
		}
		else{
			System.out.println(x*-1);
		}
		}
	}
	}
}
