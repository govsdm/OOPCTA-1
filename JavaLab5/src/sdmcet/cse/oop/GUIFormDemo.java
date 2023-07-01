package sdmcet.cse.oop;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;

class Form extends JFrame implements ActionListener {
	Container contentPane;
	JButton b;
	JPanel p;
	JLabel l, l1,l2;
	JTextField t,t1;
	
	public Form(String title) {
		super(title);
		contentPane = this.getContentPane();
		b= new JButton("Calculate");
		p = new JPanel();
		l = new JLabel("Result: ");
		l1 = new JLabel("Enter Height:");
		l2 = new JLabel("Enter 	Base:");
		t = new JTextField(5);
		t1 = new JTextField(5);
		
		p.add(l1);
		p.add(t);
		p.add(l2);
		p.add(t1);
		p.add(b);
		
		contentPane.add(p, BorderLayout.SOUTH);
		contentPane.add(l, BorderLayout.CENTER);
		b.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		l.setText("Area: "+area());
		
		
	}
	
	double area() {
		double a = Double.parseDouble(t.getText());
		double b = Double.parseDouble(t1.getText());
		return 0.5*a*b;
	}
}
public class GUIFormDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new Form("Area Computation");
		
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 400, 300);
		f.setVisible(true);
	}

}
