import javax.swing.*;
public class javax.swing*{
    public static void main(String[]args){
        Char first_name= ('M');
		Char middle_name= ('D');
		Char last_name= ('L');
		

	public class InputBoxes{
		public static void main(String[]args){
				String first_name;
				frist_name= JOptionPane.showInputDialog("First Name");
				String middle_name;
				middle_name=JOptionPane.showInputDialog("Middle Name");
				String last_name;
				last_name=JOptionPane.showInputDialog("Last Name");
				String full_name;
				full_name="You are"+ first_name+""+ middle_name+""+ last_name;
				
				JOptionPane.showMessageDialog(null,full_name);
				System.exit(0);
		}

    }
 }