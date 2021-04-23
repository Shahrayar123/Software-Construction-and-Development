package teacher;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CreateQuiz2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateQuiz2 frame = new CreateQuiz2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CreateQuiz2() {
		setResizable(false);
		setTitle("Create Quiz Q/A");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDataEnter = new JLabel("Please Enter Data :");
		lblDataEnter.setBounds(25, 24, 110, 30);
		contentPane.add(lblDataEnter);
		
		JLabel lblQuestion = new JLabel("Question");
		lblQuestion.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblQuestion.setToolTipText("Type your question in empty box");
		lblQuestion.setBounds(25, 81, 85, 30);
		contentPane.add(lblQuestion);
		
		textField = new JTextField();
		textField.setBounds(135, 65, 362, 64);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblChoice = new JLabel("Choice 1");
		lblChoice.setToolTipText("Type your choice in empty box");
		lblChoice.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChoice.setBounds(25, 158, 85, 30);
		contentPane.add(lblChoice);
		
		JLabel lblChoice_2 = new JLabel("Choice 2");
		lblChoice_2.setToolTipText("Type your choice in empty box");
		lblChoice_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChoice_2.setBounds(25, 211, 85, 30);
		contentPane.add(lblChoice_2);
		
		JLabel lblChoice_1 = new JLabel("Choice 3");
		lblChoice_1.setToolTipText("Type your choice in empty box");
		lblChoice_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChoice_1.setBounds(25, 259, 85, 30);
		contentPane.add(lblChoice_1);
		
		JLabel lblChoice_1_1 = new JLabel("Choice 4");
		lblChoice_1_1.setToolTipText("Type your choice in empty box");
		lblChoice_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChoice_1_1.setBounds(25, 313, 85, 30);
		contentPane.add(lblChoice_1_1);
		
		JLabel lblChoice_1_2 = new JLabel("Correct Choice");
		lblChoice_1_2.setToolTipText("Type your choice in empty box");
		lblChoice_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChoice_1_2.setBounds(25, 367, 110, 30);
		contentPane.add(lblChoice_1_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(135, 159, 200, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(135, 212, 200, 30);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(135, 260, 200, 30);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(135, 313, 200, 30);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(135, 368, 200, 30);
		contentPane.add(textField_5);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(450, 406, 89, 23);
		contentPane.add(btnCancel);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(450, 372, 89, 23);
		contentPane.add(btnNext);
	}

}
