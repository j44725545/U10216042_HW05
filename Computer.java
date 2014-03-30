package hw05;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Computer extends JFrame {
	private JButton jbtOne = new JButton("1");
	private JButton jbtTwo = new JButton("2");
	private JButton jbtThree = new JButton("3");
	private JButton jbtFour = new JButton("4");
	private JButton jbtFive = new JButton("5");
	private JButton jbtSix = new JButton("6");
	private JButton jbtSeven = new JButton("7");
	private JButton jbtEight = new JButton("8");
	private JButton jbtNine = new JButton("9");
	private JButton jbtZero = new JButton("0");
	private JButton jbtAdd = new JButton("+");
	private JButton jbtSubtract = new JButton("-");
	private JButton jbtMultiply = new JButton("*");
	private JButton jbtExcept = new JButton("/");
	private JButton jbtDot = new JButton(".");
	private JButton jbtEqual = new JButton("=");
	private JTextField textField_output = new JTextField("0.");
	public Computer(){
		JPanel p1 = new JPanel(new GridLayout(4, 4));
		p1.add(jbtSeven);
		p1.add(jbtEight);
		p1.add(jbtNine);
		p1.add(jbtAdd);
		p1.add(jbtFour);
		p1.add(jbtFive);
		p1.add(jbtSix);
		p1.add(jbtSubtract);
		p1.add(jbtOne);
		p1.add(jbtTwo);		
		p1.add(jbtThree);		
		p1.add(jbtMultiply);		
		p1.add(jbtZero);
		p1.add(jbtDot);
		p1.add(jbtEqual);
		p1.add(jbtExcept);
		JPanel p2 = new JPanel(new BorderLayout());
		p2.add(textField_output,BorderLayout.NORTH);
		textField_output.setEditable(false);
		p2.add(p1,BorderLayout.CENTER);
		add(p2, BorderLayout.CENTER);
		jbtSeven.addActionListener(new ButtonListener());
		jbtEight.addActionListener(new ButtonListener());
		jbtAdd.addActionListener(new ButtonListener());
		jbtFour.addActionListener(new ButtonListener());
		jbtFive.addActionListener(new ButtonListener());
		jbtSix.addActionListener(new ButtonListener());
		jbtSubtract.addActionListener(new ButtonListener());
		jbtOne.addActionListener(new ButtonListener());
		jbtTwo.addActionListener(new ButtonListener());
		jbtMultiply.addActionListener(new ButtonListener());
		jbtZero.addActionListener(new ButtonListener());
		jbtDot.addActionListener(new ButtonListener());
		jbtEqual.addActionListener(new ButtonListener());
		jbtExcept.addActionListener(new ButtonListener());
		
	}
	private class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
		
		}
	}
	public static void main(String[] args){
		Computer frame = new Computer();
		frame.setTitle("Computer");
		frame.setSize(300,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
