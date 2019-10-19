import java.lang.Math;

public class CC2_Lab5{
  public static void main (String [] args){
    double rand = Math.random() * 1000;
    int messageCount = (int)rand;
    float price=0.5f;
    
    if (messageCount>200){
      System.out.println("You have sent "+messageCount+" messsages.");
      System.out.println("You have incurred "+price * (messageCount-200)+" PHP in charges.");
    }else if (messageCount<=200){
      System.out.println("You have sent "+messageCount+" messsages.");
      System.out.println("You have incurred 0.0 PHP in charges.");
    }
  }
}