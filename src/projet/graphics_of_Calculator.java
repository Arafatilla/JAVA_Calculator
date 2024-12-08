/*here is our code that is inside the source code of the design 
we tried to use our OOP consepts to use it in this simple calculator but unfortunetlley 
it does not completley work

package Projet_de_POO;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextPane;

import Project_POO.Calulator;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
 
public class graphics_of_Calculator {

	public JFrame frame;
	public String backSpace = "";
	public 	CalculMath result ; 
	public String operation ; 
	public CalculMath answer ;
	public static double c ;
	public static double d; 
	public static double u ;

	public static CalculMath array[]	= new CalculMath[9];
	public static void main(String[] args) {		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calulator window = new Calulator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public void Calulator() {
		
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 357, 426);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.getContentPane().setLayout(null);
		
		 final JTextPane text = new JTextPane();
		 text.setBounds(20, 50, 299, 62);
		text.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(text);
		
		JButton clearButton = new JButton("C");
		clearButton.setBounds(10, 319, 59, 48);
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText(null);

			}
		});
		clearButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		clearButton.setToolTipText("");
		frame.getContentPane().add(clearButton);
		
		JButton button_0 = new JButton("0");
		button_0.setBounds(71, 319, 59, 48);
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_0.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(button_0);
		
		JButton dot_button = new JButton(".");
		dot_button.setBounds(132, 319, 59, 48);
		dot_button.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(dot_button);
		
		final JButton sqrt_button = new JButton("√ ");
		sqrt_button.setBounds(201, 144, 49, 39);
		sqrt_button.setForeground(new Color(0, 0, 0));
		sqrt_button.setFont(new Font("Tahoma", Font.BOLD, 8));
		sqrt_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = text.getText()+ sqrt_button.getText();
				text.setText(number);
			}
		});
		frame.getContentPane().add(sqrt_button);
		
		final JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = text.getText()+ btnNewButton_2.getText();
				text.setText(number);
			}
		});
		btnNewButton_2.setBounds(71, 273, 59, 43);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(btnNewButton_2);
		
		 final JButton button_1 = new JButton("1");
		 button_1.setBounds(10, 273, 59, 43);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = text.getText()+ button_1.getText();
				text.setText(number);
				

			}
		});
		frame.getContentPane().add(button_1);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setBounds(10, 273, 51, 43);
		frame.getContentPane().add(btnNewButton_6);
		
		 final JButton button_7 = new JButton("7");
		button_7.setBounds(10, 188, 59, 39);
		button_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = text.getText()+ button_7.getText();
				text.setText(number);

			}
		});
		frame.getContentPane().add(button_7);
		
		 final JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = text.getText()+ button_5.getText();
				text.setText(number);

			}
		});
		button_5.setBounds(71, 229, 59, 43);
		button_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(button_5);
		
		final JButton btnNewButton_3 = new JButton("3");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = text.getText()+ btnNewButton_3.getText();
				text.setText(number);

				
			}
		});
		btnNewButton_3.setBounds(132, 273, 59, 43);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(btnNewButton_3);
		
		JButton expo_button = new JButton("ex");
		expo_button.setBounds(260, 144, 59, 41);
		expo_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		expo_button.setFont(new Font("Tahoma", Font.PLAIN, 5));
		frame.getContentPane().add(expo_button);
		
		final JButton log_button = new JButton("log");
		log_button.setBounds(132, 146, 59, 41);
		log_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = text.getText()+ log_button.getText();
				text.setText(number);
			}
		});
		frame.getContentPane().add(log_button);
		
		JButton minus_button = new JButton("-");
		minus_button.setBounds(201, 274, 49, 42);
		minus_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c = Double.parseDouble(text.getText());
				text.setText("");
				operation = "-";
			}
		});
		minus_button.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(minus_button);
		
		JButton div_button = new JButton("÷");
		div_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c = Double.parseDouble(text.getText());
				text.setText("");
				operation = "÷";
			}
			
		});
		div_button.setBounds(201, 188, 49, 39);
		div_button.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(div_button);
		
		JButton mul_button = new JButton("x");
		mul_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c = Double.parseDouble(text.getText());
				text.setText("");
				operation = "x";
			}
		});
		mul_button.setBounds(201, 229, 49, 43);
		mul_button.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(mul_button);
		
		final JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = text.getText()+ button_6.getText();
				text.setText(number);

			}
		});
		button_6.setBounds(132, 229, 59, 43);
		button_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(button_6);
		
		final JButton sin_button = new JButton("sin");
		sin_button.setBounds(71, 146, 59, 41);
		sin_button.setFont(new Font("Tahoma", Font.BOLD, 12));
		sin_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = text.getText()+ sin_button.getText();
				text.setText(number);
			}
		});
		frame.getContentPane().add(sin_button);
		
		final JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String number = text.getText()+ button_8.getText();
				text.setText(number);

			}
		});
		button_8.setBounds(71, 188, 59, 39);
		button_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(button_8);
		
		final JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = text.getText()+ button_4.getText();
				text.setText(number);

			}
		});
		button_4.setBounds(10, 228, 59, 44);
		button_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(button_4);
		
		 final JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = text.getText()+ button_9.getText();
				text.setText(number);

			}
		});
		button_9.setBounds(132, 188, 59, 39);
		button_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(button_9);
		
		final JButton cos_button = new JButton("cos");
		cos_button.setBounds(10, 146, 59, 41);
		cos_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = text.getText()+ cos_button.getText();
				text.setText(number);
			}
		});
		cos_button.setFont(new Font("Tahoma", Font.BOLD, 10));
		frame.getContentPane().add(cos_button);
		
		JButton plus_button = new JButton("+");
		plus_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c = Double.parseDouble(text.getText());
				text.setText("");
				operation = "+";
			}
		});
		plus_button.setBounds(201, 319, 49, 48);
		plus_button.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(plus_button);
		
		JButton equal_button = new JButton("=");
		equal_button.setBounds(260, 230, 59, 137);
		equal_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double result ;
				c = Double.parseDouble(text.getText());
				d = Double.parseDouble(text.getText());
				if (operation.equals("+")) {
					array[0] = new Addition(c,d);
					result = array[0].calculer();
					text.setText(String.valueOf(result));
				}
				c = Double.parseDouble(text.getText());
				d = Double.parseDouble(text.getText());
				 if(operation.equals("÷")) {
					 array[1] = new Division(c,d);
					result = array[1].calculer();
					text.setText(String.valueOf(result));
					}
				 c = Double.parseDouble(text.getText());
				 d = Double.parseDouble(text.getText());
				if (operation.equals("x")) {
					array[2] = new Multiplication(c,d);
					result = array[2].calculer();
					text.setText(String.valueOf(result));
				}
				 c = Double.parseDouble(text.getText());
				 d = Double.parseDouble(text.getText()); 
				 if (operation.equals ("-")) {
					 array[3] = new Soustraction(c,d);
					result = array[3].calculer();
					text.setText(String.valueOf(result));
				}
				 if(operation.equals ("sin")) {
				 u = Double.parseDouble(text.getText());
					array[4] = new Sin(u);
					result = array[4].calculer();
					text.setText(String.valueOf(result));
				}
				if (operation.equals("cos")) {
					u = Double.parseDouble(text.getText());
					array[5] = new Cos(u);
					result = array[5].calculer();
					text.setText(String.valueOf(result));
							}
				if(operation.equals( "log")) {
					u = Double.parseDouble(text.getText());
					array[6] = new Sin(u);
					result = array[6].calculer();
					text.setText(String.valueOf(result));
				}
				if (operation.equals( "ex")) {
					u = Double.parseDouble(text.getText());
					result = array[7].calculer();
					text.setText(String.valueOf(result));
				}
				 if(operation.equals( "sqrt")) {
					 u = Double.parseDouble(text.getText());
					result = array[8].calculer();
					text.setText(String.valueOf(result));
				}
					
					
					
				
			}
		});
		equal_button.setFont(new Font("Tahoma", Font.PLAIN, 10));
		frame.getContentPane().add(equal_button);
		
		JButton back_button = new JButton("\uF0E7");
		back_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder str = new StringBuilder(text.getText());
				str.deleteCharAt(text.getText().length()-1);
				backSpace = str.toString();
				text.setText(backSpace);
				
			}
		});
		back_button.setBounds(260, 188, 59, 39);
		back_button.setFont(new Font("windings", Font.BOLD, 10));
		frame.getContentPane().add(back_button);
	}
}*/
