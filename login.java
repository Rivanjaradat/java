import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class login  extends UserClass implements ActionListener{
	//JFrame ,JTextField  JPasswordField and Creation
public   JFrame b= new JFrame();
JTextField text = new JTextField("                                 ");
JPasswordField text2= new JPasswordField("");

UserClass user= new UserClass();
public  login() {
	
	b. setLayout(new BorderLayout());
	             //FRAME TITLE               
	b.setTitle("consumption value System");
	b.setSize(300,300);
	b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel panel =new JPanel();
	text2.setAlignmentX(100);
	text2.setAlignmentY(200);
	
	JLabel label = new JLabel("UserName:");
	JLabel label2= new JLabel(" Password");
	//ADD ELEMENT TO PANEL
	panel.add(label);
	panel.add(text);
	JPanel panel2= new JPanel();
	panel2.add(label2);
	panel2.add(text2);
	JPanel panel3= new JPanel();
	panel3.add(panel);
	panel3.add(panel2);
	JLabel label3= new JLabel("LOGIN VIEW");
	label3.setHorizontalAlignment(JLabel.CENTER);
	b.add(label3,BorderLayout.NORTH);
	b.add(panel3,BorderLayout.CENTER);
	// FONT Properties
	label3.setFont(new Font("Arial",Font.BOLD,30));
	label.setFont(new Font("Arial",Font.BOLD,15));
	label2.setFont(new Font("Arial",Font.BOLD,15));
	JButton v= new JButton("login");
	// BUTTON Properties
	v.setPreferredSize(new Dimension(20,50));
	b.add(v,BorderLayout.SOUTH);
	v.addActionListener(this);
	b.setVisible(true);
	
	
	

	
	
}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String x=String.valueOf(user.getPass());
		String name= text.getText();
		String pass=text2.getText();
		if (name.trim().equalsIgnoreCase(user.getUsername())&& pass.trim() .equalsIgnoreCase(x)) {
			JOptionPane.showMessageDialog(b," THE LOGIN SUCSSES");
			new Welcom();
		}
		else 
			JOptionPane.showMessageDialog(b," THE LOGIN not  SUCSSES");
		
	
		
	}
	
	
	

	

}
