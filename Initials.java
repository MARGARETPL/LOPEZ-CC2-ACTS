import javax.swing.*;
public class Initials {
    
	public static void main(String[]args){
		String first_name= JOptionPane.showInputDialog("Enter your first name's initial:");
		String middle_name=JOptionPane.showInputDialog("Enter your middle name's initial:");
		String last_name=JOptionPane.showInputDialog("Enter your last name's initial:");
		String full_name= first_name + "." + middle_name + "." + last_name;
		
		JOptionPane.showMessageDialog(null,full_name);
		System.exit(0);
	}
}