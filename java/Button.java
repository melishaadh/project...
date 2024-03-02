package java;

import javax.swing.*;
import java.awt.*;
import java.awt.Component;
import java.awt.event.*;
class Button extends JFrame implements ActionListener{
	JButton b1, b2, b3;
	public Button() {
	
	setSize(400,500);
		 b1= new JButton("Insert");
		 b2= new JButton("View");
		 b3= new JButton("Delete");
		b1.setAlignmentX(Component.CENTER_ALIGNMENT);
		b2.setAlignmentX(Component.CENTER_ALIGNMENT);
		b3.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(b1);
		add(b2);
		add(b3);

	setLayout(new FlowLayout());
		
		setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			Insert.main(null);//null to call main method without passing arguments
			}
		if(e.getSource()==b2){
			View.main(null);
			}
		
				}
}
	
	public static void main(String[]args) {
		new Button();
    }
    
