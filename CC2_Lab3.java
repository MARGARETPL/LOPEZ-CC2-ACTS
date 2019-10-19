public class CC2_Lab3{
  public static void main(String[]args){
  char first='M';
  char second='A';
  char third='R';
  char fourth='G';
  char fifth='!';
  int a=first;
  int b=second;
  int c= third;
  int d= fourth;
  int e= fifth;
  int sum=a+b+c+d+e;
  int product=a*b*c*d*e;
  int average=sum/5;
  int remainder=product%average;
  
  System.out.println(first+" - "+a);
  System.out.println(second+" - "+b);
  System.out.println(third+" - "+c);
  System.out.println(fourth+" - "+d);
  System.out.println(fifth+" - "+e);
  
  System.out.println(first+""+second+""+third+""+fourth+""+fifth);
  
  System.out.println("Sum: "+sum);
  System.out.println("Product: " +product);
  System.out.println("Average: "+ average);
  System.out.println("Reaminder:"+ remainder);
  
  
  }
  
}