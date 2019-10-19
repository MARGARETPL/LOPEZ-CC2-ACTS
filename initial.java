import javax.swing.*;
public class Initials{
    public static void main(String[]args){
    String f_name = " ",input;
		String m_name = " ";
		String l_name = " ";
		
		f_name = JOptionPane.showInputDialog("Enter your first name initial");
		m_name = JOptionPane.showInputDialog("Enter your middle name initial");
		l_name = JOptionPane.showInputDialog("Enter your last name initial");
		
		char alpha = f_name.charAt(0);
		char bravo = m_name.charAt(0);
		char charlie= l_name.charAt(0);
		
		JOptionPane.showMessageDialog(null, alpha + "."+ bravo + "." + charlie);

		
	}

    } 