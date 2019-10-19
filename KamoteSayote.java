import java.util.*;
	public class KamoteSayote{
		public static void main (String[]args){
			
			Scanner sc = new Scanner (System.in);
			int n,m,k=0;
			
			System.out.print("Enter Input: ");
				n=sc.nextInt();
				m=sc.nextInt();
				k=sc.nextInt();
				
				int x=n/m;
				int y=n%m;
				int z=y*k;
				
				if (n<=1000&& n >=1 && m<=1000 && k <=1000 && k>=1){
					System.out.println(x+" Kamotes\n"+z+ " Sayotes ");
					
				}
				else{System.out.println("Invalid input.");
				}
				
				
			
		}
	}