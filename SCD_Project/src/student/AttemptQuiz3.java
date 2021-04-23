package student;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;

public class AttemptQuiz3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AttemptQuiz3 frame = new AttemptQuiz3();
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
	public AttemptQuiz3() {
		setTitle("Attempt Quiz");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQuestion = new JLabel("Question");
		lblQuestion.setToolTipText("Type your question in empty box");
		lblQuestion.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblQuestion.setBounds(40, 63, 85, 30);
		contentPane.add(lblQuestion);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(150, 59, 362, 64);
		contentPane.add(textField);
		
		JLabel lblChoice = new JLabel("Choice 1");
		lblChoice.setToolTipText("Type your choice in empty box");
		lblChoice.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChoice.setBounds(150, 165, 85, 30);
		contentPane.add(lblChoice);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(260, 166, 200, 30);
		contentPane.add(textField_1);
		
		JLabel lblChoice_2 = new JLabel("Choice 2");
		lblChoice_2.setToolTipText("Type your choice in empty box");
		lblChoice_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChoice_2.setBounds(150, 232, 85, 30);
		contentPane.add(lblChoice_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(260, 233, 200, 30);
		contentPane.add(textField_2);
		
		JLabel lblChoice_1_1 = new JLabel("Choice 3");
		lblChoice_1_1.setToolTipText("Type your choice in empty box");
		lblChoice_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChoice_1_1.setBounds(150, 294, 85, 30);
		contentPane.add(lblChoice_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(260, 295, 200, 30);
		contentPane.add(textField_3);
		
		JLabel lblChoice_1_1_1 = new JLabel("Choice 4");
		lblChoice_1_1_1.setToolTipText("Type your choice in empty box");
		lblChoice_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChoice_1_1_1.setBounds(150, 350, 85, 30);
		contentPane.add(lblChoice_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(260, 351, 200, 30);
		contentPane.add(textField_4);
		
		JLabel lblDataEnter = new JLabel("Please Enter Data :");
		lblDataEnter.setBounds(40, 11, 110, 30);
		contentPane.add(lblDataEnter);
		
		JButton btnFinish = new JButton("Finish");
		btnFinish.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnFinish.setBounds(494, 415, 85, 30);
		contentPane.add(btnFinish);
		
		JCheckBox chckbx1 = new JCheckBox("");
		buttonGroup.add(chckbx1);
		chckbx1.setBounds(47, 170, 97, 23);
		contentPane.add(chckbx1);
		
		JCheckBox chckbx2 = new JCheckBox("");
		buttonGroup.add(chckbx2);
		chckbx2.setBounds(47, 232, 97, 23);
		contentPane.add(chckbx2);
		
		JCheckBox chckbx3 = new JCheckBox("");
		buttonGroup.add(chckbx3);
		chckbx3.setBounds(47, 299, 97, 23);
		contentPane.add(chckbx3);
		
		JCheckBox chckbx4 = new JCheckBox("");
		buttonGroup.add(chckbx4);
		chckbx4.setBounds(47, 355, 97, 23);
		contentPane.add(chckbx4);
		
		JButton btnNext_1 = new JButton("Next");
		btnNext_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNext_1.setBounds(382, 415, 85, 30);
		contentPane.add(btnNext_1);
	}
}
