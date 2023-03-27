import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Welcom  extends JFrame implements ActionListener{
	 static JFrame f= new JFrame();

 public Welcom()  {
	 setLayout(new BorderLayout());
	 // set Title frame
		setTitle("consumption value System");
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JLabel Creation
	JLabel label = new JLabel("	Welcome in claculate consumption value System");
	//JButton Creation
	JButton button = new JButton("Start");
	button.setFont(new Font("Arial",Font.BOLD,18));
	label.setFont(new Font("Arial",Font.BOLD,15));
	
	 ImageIcon icon = new ImageIcon("dow.png");
	//JLabel Creation
	 JLabel label1 = new JLabel(); 
	 label1.setIcon(icon);
	 label1.setHorizontalAlignment(JLabel.CENTER);
	 label1.setVerticalAlignment(JLabel.BOTTOM);
    add(label1,BorderLayout.CENTER);
	Color color1= new Color(230,100,77);
	button.setBackground(color1);
	//add the element in JFrame
	add(label,BorderLayout.NORTH);
	add(button,BorderLayout.SOUTH);
	add(label1);
	button.addActionListener(this);
	setVisible(true);
 }
	 
	
	
	//method to find consumption value
public double consumValue(double salary,double valueWater,double electricityBill, double internetbill , double  transportation) {
	double value=salary -(valueWater+electricityBill+internetbill+ transportation);
			return value;
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	// use JOption to allow to  user enter the values
	String salary   =JOptionPane.showInputDialog(f,"Enter Salary Value");     
	 double Salary =Double.parseDouble(salary);
	 
	 String waterbill   =JOptionPane.showInputDialog(f,"Enter water bill Value");     
	 double valueWater =Double.parseDouble(waterbill);
	 String elecbill   =JOptionPane.showInputDialog(f,"Enter electricity bill Value");     
	 double electricityBill=Double.parseDouble(elecbill);
	 String intbill   =JOptionPane.showInputDialog(f,"Enter internet billValue");     
	 double internetbill=Double.parseDouble(intbill);
	 String trans   =JOptionPane.showInputDialog(f,"Enter  transportation Value");     
	 double  transportation=Double.parseDouble(trans);
	 //call method 
double value =consumValue( Salary, valueWater, electricityBill,  internetbill , transportation);

if (value==0) {
	 JOptionPane.showMessageDialog(null, "consumption value  is:"+value+"\nYou spent your entire salary, be careful","consumption value", JOptionPane.PLAIN_MESSAGE);
			 
}
else if (value>0) {
	 JOptionPane.showMessageDialog(null, "consumption value  is:" +value+"\n nice, you have the Remaining amount of your salary","consumption value", JOptionPane.PLAIN_MESSAGE);
}
else 
	 JOptionPane.showMessageDialog(null, "consumption value  is:" +value+"\nOOOPS...You spent more than the value of your salary, you should reduce expenses","consumption value", JOptionPane.PLAIN_MESSAGE);

}
}
