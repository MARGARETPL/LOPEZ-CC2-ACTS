public class VariablesAndDataTypes{
  public static void main (String[]args){
  String head="The temperature in Baguio City has warmed throughout the years.";
  char firstLetter='A';
  float firstNumber=16;
  double secondNumber=23.5;
  byte hours=24;
  short day=7;
  int week=4;
  byte months=12;
  boolean jane= 1<9;
  
  if(jane==true){
    System.out.print(head+"\n");
    System.out.print("\t"+firstLetter+" recent news article stated that the City has been averaging " +firstNumber+ " degrees celsuis at dawn and "+ secondNumber+" at noon.\n");
    System.out.print("\t\tRegardless,lowlanders still feel cold "+hours+" hours a  day, "+ day+" days a week, "+week+" weeks per month and "+months+" months each year.");
    }
  
  else{
    System.out.print("The boolean was changed to False value.");
    }
    
    
  }  
}
  
  
  
  
  
  