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

public class AttempQuiz extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AttempQuiz frame = new AttempQuiz();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public AttempQuiz() {
		setResizable(false);
		setTitle("Attemp Quiz_1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 366, 259);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.add(contentPane_1, BorderLayout.CENTER);
		contentPane_1.setLayout(null);
		
		JLabel lblQuizID = new JLabel("Please Enter Quiz ID");
		lblQuizID.setBounds(106, 25, 118, 40);
		lblQuizID.setFont(new Font("Times New Roman", Font.BOLD, 13));
		contentPane_1.add(lblQuizID);
		
		textField = new JTextField();
		textField.setBounds(72, 76, 187, 40);
		textField.setColumns(10);
		contentPane_1.add(textField);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(130, 141, 89, 23);
		contentPane_1.add(btnNext);
	}

}
