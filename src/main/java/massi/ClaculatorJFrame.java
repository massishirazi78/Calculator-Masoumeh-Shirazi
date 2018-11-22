package massi;

/**
 * Date 2018-11-20
 * Det är en Claculator med 14 Opretion.
 * @author Massi
 *@version 1.0
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.Color;
import java.awt.Component;
import java.awt.SystemColor;

class ClaculatorJFrame extends JFrame
		implements CalculatorAdvancedOperationsInterface, CalculatorBasicOperationsInterface {

	private static final long serialVersionUID = 1L;

	/**
	 * det är textfield för att vissa function.
	 */
	private JTextField txtDisplay1;

	/**
	 * det är textfield för att vissa resultat.
	 */
	private JTextField txtDisplay2;

	/**
	 * det är String för txtDisplay.
	 */
	private String st;
	/**
	 * det är char för operation.
	 */

	private char op;

	/**
	 * det är integer AdvOperation som vissar att vilken Opreation påverkar .
	 * AdvOperation 1 är exp, AdvOperation 2 är sin, AdvOperation 3 är cos,
	 * AdvOperation 4 är tan, AdvOperation 5 är cotan, AdvOperation 6 är log,
	 * AdvOperation 7 är sqrt, AdvOperation 8 är pi, AdvOperation 9 är e,
	 * 
	 */

	private int AdvOperation;

	/**
	 * det är integer operation som vissar att vilken Opreation påverkar .
	 * Operation 1 är +, Operation 2 är -, Operation 3 är *, Operation 4 är /,
	 * 
	 */

	private int Operation;
	/**
	 * double value för förata nummer.
	 */
	public double FirstNumber = 0;
	/**
	 * double value för andra nummer.
	 */
	public double SecondNumber = 0;
	/**
	 * skann samma nummer som man trykar på knappen
	 */
	private int number;

	/**
	 * The main method of this application
	 * 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClaculatorJFrame frame = new ClaculatorJFrame();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*
	 * 
	 * 
	 * 
	 */
	public void skanntal(int number) {

		st = txtDisplay1.getText();

		switch (number) {
		case (1):

			if (st.length() == 0) {
				txtDisplay1.setText("1");
				txtDisplay2.setText("1");
			} else {
				txtDisplay2.setText(txtDisplay2.getText() + "1");
				txtDisplay1.setText(txtDisplay1.getText() + "1");
			}
			break;
		case (2):

			if (st.length() == 0) {
				txtDisplay1.setText("2");
				txtDisplay2.setText("2");
			} else {
				txtDisplay2.setText(txtDisplay2.getText() + "2");
				txtDisplay1.setText(txtDisplay1.getText() + "2");
			}
			break;
		case (3):

			if (st.length() == 0) {
				txtDisplay1.setText("3");
				txtDisplay2.setText("3");
			} else {
				txtDisplay2.setText(txtDisplay2.getText() + "3");
				txtDisplay1.setText(txtDisplay1.getText() + "3");
			}
			break;
		case (4):

			if (st.length() == 0) {
				txtDisplay1.setText("4");
				txtDisplay2.setText("4");
			} else {
				txtDisplay2.setText(txtDisplay2.getText() + "4");
				txtDisplay1.setText(txtDisplay1.getText() + "4");
			}
			break;
		case (5):

			if (st.length() == 0) {
				txtDisplay1.setText("5");
				txtDisplay2.setText("5");
			} else {
				txtDisplay2.setText(txtDisplay2.getText() + "5");
				txtDisplay1.setText(txtDisplay1.getText() + "5");
			}
			break;
		case (6):

			if (st.length() == 0) {
				txtDisplay1.setText("6");
				txtDisplay2.setText("6");
			} else {
				txtDisplay2.setText(txtDisplay2.getText() + "6");
				txtDisplay1.setText(txtDisplay1.getText() + "6");
			}
			break;
		case (7):

			if (st.length() == 0) {
				txtDisplay1.setText("7");
				txtDisplay2.setText("7");
			} else {
				txtDisplay2.setText(txtDisplay2.getText() + "7");
				txtDisplay1.setText(txtDisplay1.getText() + "7");
			}
			break;
		case (8):

			if (st.length() == 0) {
				txtDisplay1.setText("8");
				txtDisplay2.setText("8");
			} else {
				txtDisplay2.setText(txtDisplay2.getText() + "8");
				txtDisplay1.setText(txtDisplay1.getText() + "8");
			}
			break;
		case (9):

			if (st.length() == 0) {
				txtDisplay1.setText("9");
				txtDisplay2.setText("9");
			} else {
				txtDisplay2.setText(txtDisplay2.getText() + "9");
				txtDisplay1.setText(txtDisplay1.getText() + "9");
			}
			break;
		case (0):

			if (st.length() == 0) {
				txtDisplay1.setText("0");
				txtDisplay2.setText("0");
			} else {
				txtDisplay2.setText(txtDisplay2.getText() + "0");
				txtDisplay1.setText(txtDisplay1.getText() + "");
			}
			break;
		default :
			txtDisplay1.setText("");
			txtDisplay2.setText("");
			
			
		}

	}

	/*
	 * 
	 * 
	 * Den metod tar int AdvOperation och använda ett switch case föratt välja
	 * rätt AdvancedOperation sedan i varje statment , den tar value av double
	 * FirstNumber från txtDisplay1 och anroppa metoden från class interface
	 * class AdvancedOprationInterface
	 *
	 * @param AdvOperation integar
	 * 
	 * 
	 * 
	 */

	public void AdvancedOperation(int AdvOperation) {

		st = txtDisplay2.getText();
		if (st.length() == 0) {
			txtDisplay1.setText("");
			txtDisplay2.setText("");
		}else {
				
		FirstNumber = Double.parseDouble(st);
	
		switch (AdvOperation) {
		case (1):
			
			txtDisplay2.setText("" + EXP(FirstNumber));
			txtDisplay1.setText("exp(" + FirstNumber + ")");
			break;
		case (2):

			
			txtDisplay2.setText("" + sin(FirstNumber));
			txtDisplay1.setText("sin (" + FirstNumber + ")");

			break;
		case (3):

			
			txtDisplay2.setText("" + cos(FirstNumber));
			txtDisplay1.setText("cos ( " + FirstNumber + " )");

			break;
		case (4):
	
			txtDisplay2.setText("" + tan(FirstNumber));
			txtDisplay1.setText("tan (" + FirstNumber + ")");

			break;
		case (5):
		
			
				txtDisplay2.setText("" + xx(FirstNumber));
				txtDisplay1.setText("" +FirstNumber + " ^2");
			

			break;
		case (6):
		
			txtDisplay2.setText("" + LOG(FirstNumber));
			txtDisplay1.setText("log (" + FirstNumber + ")");
			break;
		case (7):

		
			txtDisplay2.setText("" + sqr(FirstNumber));
			txtDisplay1.setText("sqr ( " + FirstNumber + " )");

			break;
		case (8):

			
			txtDisplay2.setText("" + PI(FirstNumber));
			txtDisplay1.setText("PI * " + FirstNumber);
			break;
		case (9):

	
			txtDisplay2.setText("" + E(FirstNumber));
			txtDisplay1.setText("e * " + FirstNumber);

			break;
		default :
			txtDisplay1.setText("");
			txtDisplay2.setText("");
			
		}
		}
		FirstNumber=0;

	}
	/*
	 * 
	 * Den metod tar char op och använda ett switch case föratt välja rätt
	 * BasicOperation sedan i varje statment , den tar value av double
	 * FirstNumber från txtDisplay1 och lägga till operation sedan det skannar i
	 * txtDisplay1.
	 *
	 * @param op character
	 * 
	 * @param Operation Integer value.
	 * 
	 * @param FirstNumber : First Number value double.
	 * 
	 * 
	 * 
	 */

	public void BasicOperation(char op) {

		String st1 = txtDisplay1.getText();
		if (st1.length() == 0) {
			txtDisplay1.setText("");
			txtDisplay2.setText("");
		}
		
		st = txtDisplay2.getText();
	

		switch (op) {
		case '+':
			if (FirstNumber == 0) {
				FirstNumber = Double.parseDouble(st);	
				
				txtDisplay1.setText(FirstNumber + " + ");
				Operation = 1; // plus
				txtDisplay2.setText("");

			} else {
				txtDisplay1.setText(FirstNumber + " + ");
				Operation = 1; // plus
				txtDisplay2.setText("");
			}

			break;
		case '-':
			if (FirstNumber == 0) {
				FirstNumber = Double.parseDouble(st);
				txtDisplay1.setText(FirstNumber + " - ");
				Operation = 2; // minus
				txtDisplay2.setText("");

			} else {
				txtDisplay1.setText(FirstNumber + " - ");
				Operation = 2; // minus
				txtDisplay2.setText("");
			}

			break;
		case '*':
			if (FirstNumber == 0) {
				FirstNumber = Double.parseDouble(st);
				txtDisplay1.setText(FirstNumber + " * ");
				Operation = 3; // Multiply
				txtDisplay2.setText("");

			} else {
				txtDisplay1.setText(FirstNumber + " * ");
				Operation = 3; // Multiply
				txtDisplay2.setText("");
			}

			break;
		case '/':
			if (FirstNumber == 0) {
				FirstNumber = Double.parseDouble(st);
				txtDisplay1.setText(FirstNumber + " / ");
				Operation = 4; // division
				txtDisplay2.setText("");

			} else {
				txtDisplay1.setText(FirstNumber + " / ");
				Operation = 4; // Division
				txtDisplay2.setText("");
			}

			break;
		case '%':

			if (FirstNumber == 0) {
				FirstNumber = Double.parseDouble(st);
				txtDisplay1.setText(FirstNumber + " % ");
				Operation = 5; // Modulus opretion
				txtDisplay2.setText("");

			} else {
				txtDisplay1.setText(FirstNumber + " % ");
				Operation = 5; // Modulus opretion
				txtDisplay2.setText("");
			}

			break;
		default :
			txtDisplay2.setText("");
			
		}
		
	}

	/**
	 * Skapar frame.
	 */
	public ClaculatorJFrame() {
		setResizable(false);
		setTitle("CALCULATOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 473);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		/**
		 * Skapar Button 0.
		 */

		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn0.setBounds(196, 350, 60, 45);
		btn0.addActionListener(new ActionListener() {
			/*
			 * Den metod anropa metod skanntal.
			 * 
			 * 
			 */
			public void actionPerformed(ActionEvent e) {

				skanntal(0);
			}
		});

		/**
		 * Skapar Button 1.
		 */
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn1.setBounds(196, 286, 60, 45);
		btn1.addActionListener(new ActionListener() {
			/*
			 * Den metod anropa metod skanntal.
			 * 
			 * 
			 */
			public void actionPerformed(ActionEvent e) {
				skanntal(1);
			}
		});

		/**
		 * Skapar Button 2.
		 */
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn2.setBounds(273, 286, 60, 45);
		btn2.addActionListener(new ActionListener() {
			/*
			 * Den metod anropa metod skanntal.
			 * 
			 * 
			 */
			public void actionPerformed(ActionEvent e) {
				skanntal(2);

			}
		});

		/**
		 * Skapar Button 3.
		 */
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn3.setBounds(347, 285, 60, 45);
		btn3.addActionListener(new ActionListener() {
			/*
			 * Den metod anropa metod skanntal.
			 * 
			 * 
			 */
			public void actionPerformed(ActionEvent e) {

				skanntal(3);

			}
		});

		/**
		 * Skapar Button 4.
		 */
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn4.setBounds(196, 225, 60, 45);
		btn4.addActionListener(new ActionListener() {
			/*
			 * Den metod anropa metod skanntal.
			 * 
			 * 
			 */
			public void actionPerformed(ActionEvent e) {

				skanntal(4);
			}

		});

		/**
		 * Skapar Button 5.
		 */
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn5.setBounds(273, 225, 60, 45);
		btn5.addActionListener(new ActionListener() {
			/*
			 * Den metod anropa metod skanntal.
			 * 
			 */
			public void actionPerformed(ActionEvent e) {

				skanntal(5);
			}
		});

		/**
		 * Skapar Button 6.
		 */
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn6.setBounds(347, 224, 60, 45);
		btn6.addActionListener(new ActionListener() {
			/*
			 * Den metod anropa metod skanntal.
			 * 
			 * 
			 */
			public void actionPerformed(ActionEvent e) {

				skanntal(6);
			}

		});

		/**
		 * Skapar Button 7.
		 */
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn7.setBounds(196, 168, 60, 45);
		btn7.addActionListener(new ActionListener() {
			/*
			 * Den metod anropa metod skanntal.
			 * 
			 * 
			 */
			public void actionPerformed(ActionEvent e) {

				skanntal(7);
			}
		});

		/**
		 * Skapar Button 8.
		 */
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn8.setBounds(273, 168, 60, 45);
		btn8.addActionListener(new ActionListener() {
			/*
			 * Den metod anropa metod skanntal.
			 * 
			 * 
			 */

			public void actionPerformed(ActionEvent e) {

				skanntal(8);
			}

		});

		/**
		 * Skapar Button 9.
		 */
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn9.setBounds(347, 168, 60, 45);
		btn9.addActionListener(new ActionListener() {
			/*
			 * Den metod anropa metod skanntal.
			 * 
			 * 
			 */

			public void actionPerformed(ActionEvent e) {

				skanntal(9);
			}
		});

		/**
		 * Skapar Button Equal =
		 */
		JButton btnEquals = new JButton("=");
		btnEquals.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEquals.setBounds(273, 349, 134, 45);
		btnEquals.addActionListener(new ActionListener() {
			/*
			 * Den metod anropa 4 metoder från interface class
			 * CalculatorBasicOperationsInterface och ett metod från interface
			 * class CalculatorAdvancedOperationsI. Den kontrolerar vilken
			 * opreation påverkas . Operation 1 är plus , Operation 2 är minus,
			 * Operation 3 är multiply, Operation 4 är division , Operation 5 är
			 * Modulus. Den räknar resultaten och skannar i txtDisplay2.
			 * 
			 * @param FirstNumber Double
			 * 
			 * @param SecondNumber Double
			 * 
			 * @param Operation integer
			 * 
			 * 
			 */

			public void actionPerformed(ActionEvent e) {

				st = txtDisplay2.getText();

				if (FirstNumber == 0 || st.length() == 0) {
					txtDisplay2.setText("");
					txtDisplay2.setText("");
				}

				else {
					
					

					SecondNumber = Double.parseDouble(st);

					/*
					 * Operation =1 plus ,Operation =2 minus, Operation =3
					 * multiply, Operation =4 division , Operation=5 Modulus
					 * 
					 */

					switch (Operation) {
					case 1:
						txtDisplay1.setText(FirstNumber + " + " + SecondNumber);
						txtDisplay2.setText("" + addition(FirstNumber, SecondNumber));
						break;
					case 2:
						txtDisplay1.setText(FirstNumber + " - " + SecondNumber);
						txtDisplay2.setText("" + subtraction(FirstNumber, SecondNumber));

						break;
					case 3:
						txtDisplay1.setText(FirstNumber + " * " + SecondNumber);
						txtDisplay2.setText("" + multiplikation(FirstNumber, SecondNumber));

						break;
					case 4:
						if (SecondNumber == 0) {
							JOptionPane.showMessageDialog(null, " You can not perform a division by zero");
							txtDisplay1.setText("");
							txtDisplay2.setText("");

						} else {
							txtDisplay1.setText(FirstNumber + " / " + SecondNumber);
							txtDisplay2.setText("" + dividera(FirstNumber, SecondNumber));
						}
						break;
					case 5:
						if (SecondNumber == 0) {
							JOptionPane.showMessageDialog(null, " You can not perform a division by zero");
							txtDisplay1.setText("");
							txtDisplay2.setText("");
						} else {
							txtDisplay1.setText(FirstNumber + " % " + SecondNumber);
							txtDisplay2.setText("" + modulus(FirstNumber, SecondNumber));
						}
						break;

					}
				}
				FirstNumber = 0;
				SecondNumber = 0;
			}

		});

		/**
		 * Skapar Button Plus +
		 */

		JButton btnPlus = new JButton("+");
		btnPlus.setBounds(422, 167, 60, 45);
		btnPlus.addActionListener(new ActionListener() {
			/*
			 * 
			 * Den metod call metod BasicOperation()
			 * 
			 * 
			 * 
			 */

			public void actionPerformed(ActionEvent e) {

				BasicOperation('+');

			}

		});

		btnPlus.setFont(new Font("Tahoma", Font.PLAIN, 20));

		/**
		 * Skapar Button Minus -
		 */
		JButton btnMinus = new JButton("-");
		btnMinus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMinus.setBounds(422, 224, 60, 45);
		btnMinus.addActionListener(new ActionListener() {
			/*
			 * 
			 * Den metod anrop metod BasicOperation
			 * 
			 * 
			 * 
			 */
			public void actionPerformed(ActionEvent e) {
				BasicOperation('-');
			}

		});

		/**
		 * Skapar Button Multiply *
		 */

		JButton btnMultiply = new JButton("*");
		btnMultiply.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMultiply.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMultiply.setBounds(422, 283, 60, 45);
		btnMultiply.addActionListener(new ActionListener() {
			/*
			 * 
			 * Den metod anrop metod BasicOperation
			 * 
			 * 
			 */
			public void actionPerformed(ActionEvent e) {
				BasicOperation('*');

			}
		});

		/**
		 * Skapar Button Division /
		 */
		JButton btnDivision = new JButton("\uF0B8");
		btnDivision.setBounds(422, 347, 60, 45);
		btnDivision.addActionListener(new ActionListener() {

			/*
			 * 
			 * 
			 * Den metod anrop metod BasicOperation
			 * 
			 */
			public void actionPerformed(ActionEvent e) {
				BasicOperation('/');

			}
		});
		btnDivision.setFont(new Font("Symbol", Font.BOLD, 20));

		/**
		 * Skapar Button Cotan.
		 */
		JButton btnxx = new JButton("X^2");
		btnxx.setHorizontalTextPosition(SwingConstants.CENTER);
		btnxx.setBounds(107, 350, 76, 42);
		btnxx.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnxx.addActionListener(new ActionListener() {

			/*
			 * 
			 * Den metod anropa metod AdvancedOperation
			 * 
			 * 
			 */
			public void actionPerformed(ActionEvent arg0) {

				AdvancedOperation(5);

			}
		});

		/**
		 * Skapar Button Sin
		 */
		JButton btnSin = new JButton("sin");
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSin.setHorizontalTextPosition(SwingConstants.CENTER);
		btnSin.setBounds(107, 168, 76, 42);
		btnSin.addActionListener(new ActionListener() {

			/*
			 * 
			 * Den metod anropa metod AdvancedOperation
			 * 
			 * 
			 */
			public void actionPerformed(ActionEvent e) {
				AdvancedOperation(2);

			}
		});

		/**
		 * Skapar Button exp
		 */
		JButton btnExp = new JButton("exp");
		btnExp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnExp.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		btnExp.setBounds(107, 115, 76, 42);
		btnExp.addActionListener(new ActionListener() {
			/*
			 * Den metod anropa metod AdvancedOperation
			 * 
			 * 
			 */
			public void actionPerformed(ActionEvent arg0) {
				AdvancedOperation(1);

			}
		});

		/**
		 * Skapar Button Backspace
		 */
		JButton btnDel = new JButton("<");
		btnDel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDel.addActionListener(new ActionListener() {
			/*
			 * Den metod tar length av string txtDisplay1.Om lenght var mer än 0
			 * sedan skappar ett objekt av StringBuilder och tabort sista
			 * character av txtDisplay1. Det funkar som Backspace.
			 * 
			 * 
			 * 
			 * 
			 * 
			 */
			public void actionPerformed(ActionEvent arg0) {
				String store;
				int Length = txtDisplay1.getText().length();

				if (Length > 0) {
					StringBuilder back = new StringBuilder(txtDisplay1.getText());
					back.deleteCharAt(Length - 1);
					store = back.toString();
					txtDisplay2.setText(store);
					txtDisplay1.setText(store);
				}

			}
		});
		btnDel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		btnDel.setBounds(273, 114, 60, 45);

		/**
		 * Skapar Button PI.
		 */

		JButton btnPi = new JButton("\u213C");
		btnPi.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPi.setHorizontalTextPosition(SwingConstants.CENTER);
		btnPi.setBounds(22, 286, 70, 42);
		btnPi.addActionListener(new ActionListener() {
			/*
			 * 
			 * Den metod anropa metod AdvancedOperation
			 * 
			 */

			public void actionPerformed(ActionEvent e) {

				AdvancedOperation(8);

			}

		});

		/**
		 * Skapar Button Sqrt
		 */
		JButton btnSqr = new JButton("\u221A");
		btnSqr.setHorizontalTextPosition(SwingConstants.CENTER);
		btnSqr.setBounds(22, 225, 70, 42);
		btnSqr.addActionListener(new ActionListener() {
			/*
			 * 
			 * Den metod anropa metod AdvancedOperation
			 * 
			 * 
			 */
			public void actionPerformed(ActionEvent e) {
				AdvancedOperation(7);

			}

		});

		btnSqr.setFont(new Font("Tahoma", Font.PLAIN, 20));

		/**
		 * Skapar Button Cos
		 */
		JButton btnCos = new JButton("cos");
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCos.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCos.setBounds(107, 225, 76, 42);
		btnCos.addActionListener(new ActionListener() {
			/*
			 * 
			 * Den metod anropa metod AdvancedOperation
			 * 
			 * 
			 */
			public void actionPerformed(ActionEvent e) {
				AdvancedOperation(3);

			}

		});

		/**
		 * Skapar Button Modulus %
		 */
		JButton btnModulus = new JButton("%");
		btnModulus.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		btnModulus.setBounds(22, 115, 70, 42);
		btnModulus.addActionListener(new ActionListener() {

			/*
			 * 
			 * Den metod anrop BasicOperation
			 * 
			 * 
			 * 
			 */
			public void actionPerformed(ActionEvent e) {

				BasicOperation('%');

			}
		});
		btnModulus.setFont(new Font("Tahoma", Font.PLAIN, 20));

		/**
		 * Skapar Button e
		 */

		JButton btnE = new JButton("e");
		btnE.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnE.setHorizontalTextPosition(SwingConstants.CENTER);
		btnE.setBounds(22, 350, 70, 42);
		btnE.addActionListener(new ActionListener() {
			/*
			 * Den metod anropa metod AdvancedOperation
			 * 
			 * 
			 */

			public void actionPerformed(ActionEvent e) {

				AdvancedOperation(9);

			}
		});

		/**
		 * Skapar Button point
		 */
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDot.addActionListener(new ActionListener() {

			/*
			 * 
			 * Den metod skannar point i txtDisplay1 och txtDisplay2. Först tar
			 * String st från txtDisplay2. Räkna length av st om length var 0
			 * skannar (0.) i txtDisplay1 och txtDisplay2. men om length var mer
			 * än 0 , söker eftre (.)i String st. När det hittar inte point i st
			 * sedan den Skannar en point.
			 * 
			 * 
			 * 
			 * 
			 * 
			 */

			public void actionPerformed(ActionEvent e) {

				st = txtDisplay2.getText();

				if (st.length() == 0) {
					st = st + "0.";
					txtDisplay1.setText(txtDisplay1.getText() + st);
					txtDisplay2.setText(st);

				} else if (!st.contains(".")) {

					txtDisplay2.setText(txtDisplay2.getText() + ".");
					txtDisplay1.setText(txtDisplay1.getText() + ".");
				}

			}
		});
		btnDot.setBounds(198, 114, 60, 45);

		/**
		 * Skapar Button tan
		 */

		JButton btnTan = new JButton("tan");
		btnTan.setHorizontalTextPosition(SwingConstants.CENTER);
		btnTan.setBounds(107, 286, 76, 42);
		btnTan.addActionListener(new ActionListener() {

			/*
			 * Den metod anropa metod AdvancedOperation
			 * 
			 * 
			 */
			public void actionPerformed(ActionEvent e) {

				AdvancedOperation(4);

			}
		});
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 20));

		/**
		 * Skapar Button logaritmer
		 */

		JButton btn26 = new JButton("log");
		btn26.setBounds(220, 176, 0, 29);
		JButton btnLog = new JButton("log");
		btnLog.setHorizontalTextPosition(SwingConstants.CENTER);
		btnLog.setBounds(22, 168, 70, 42);
		btnLog.addActionListener(new ActionListener() {
			/*
			 * 
			 * Den metod anropa metod AdvancedOperation
			 * 
			 */

			public void actionPerformed(ActionEvent e) {
				AdvancedOperation(6);

			}
		});
		btnLog.setFont(new Font("Tahoma", Font.PLAIN, 20));

		/**
		 * Skapar Button Clean.
		 */
		JButton btnClear = new JButton("AC");
		btnClear.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		btnClear.setBounds(348, 114, 134, 45);
		btnClear.addActionListener(new ActionListener() {
			/**
			 * 
			 * Den metod rensa txtDisplay1 och txtDisplay2 . txtDisplay1=""
			 * txtDisplay2="" FirstNumber och SecondNumber blir zero.
			 * 
			 */

			public void actionPerformed(ActionEvent e) {
				txtDisplay1.setText(null);
				txtDisplay2.setText(null);
				FirstNumber = 0;
				SecondNumber = 0;

			}
		});

		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		/*
		 * Skapar txtDisplay 1
		 * 
		 */

		txtDisplay1 = new JTextField();
		txtDisplay1.setBounds(22, 16, 460, 42);
		txtDisplay1.setEditable(false);
		txtDisplay1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay1.setBackground(SystemColor.control);
		txtDisplay1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtDisplay1.setColumns(15);
		/*
		 * Skapar txtDisplay 2
		 * 
		 */

		txtDisplay2 = new JTextField();
		txtDisplay2.setBounds(22, 57, 460, 42);
		txtDisplay2.setEditable(false);
		txtDisplay2.setBackground(Color.WHITE);
		txtDisplay2.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtDisplay2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay2.setColumns(15);

		/*
		 * Skapa Layout
		 * 
		 */
		contentPane.setLayout(null);
		/*
		 * lägga till Buttons
		 * 
		 */

		contentPane.add(btnSin);
		contentPane.add(btnTan);
		contentPane.add(btnCos);
		contentPane.add(btnxx);

		contentPane.add(btnE);
		contentPane.add(btnPi);
		contentPane.add(btnLog);
		contentPane.add(btnSqr);
		contentPane.add(btnExp);

		contentPane.add(btn0);
		contentPane.add(btn1);
		contentPane.add(btn2);
		contentPane.add(btn3);
		contentPane.add(btn4);
		contentPane.add(btn5);
		contentPane.add(btn6);
		contentPane.add(btn7);
		contentPane.add(btn8);
		contentPane.add(btn9);

		contentPane.add(btnEquals);
		contentPane.add(btnPlus);
		contentPane.add(btnDivision);
		contentPane.add(btnMultiply);
		contentPane.add(btnMinus);
		contentPane.add(btnModulus);

		contentPane.add(btnClear);
		contentPane.add(btnDel);
		contentPane.add(btnDot);
		/*
		 * lägga till txtDisplay1 och txtDisplay2
		 * 
		 */

		contentPane.add(txtDisplay2);
		contentPane.add(txtDisplay1);
	}
}
/*
 * slut av ClaculatorJF class
 * 
 */
