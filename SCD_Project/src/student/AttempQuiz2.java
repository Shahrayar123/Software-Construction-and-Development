package student;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AttempQuiz2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AttempQuiz2 frame = new AttempQuiz2();
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
	public AttempQuiz2() {
		setTitle("Attempt Quiz 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 402, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(0, 0, 388, 289);
		contentPane.add(contentPane_1);
		
		JLabel lblPlEnterData = new JLabel("Please Enter Data :");
		lblPlEnterData.setBounds(10, 11, 113, 28);
		contentPane_1.add(lblPlEnterData);
		
		JLabel lblStuName = new JLabel("Student Name");
		lblStuName.setBounds(10, 50, 113, 28);
		contentPane_1.add(lblStuName);
		
		JLabel lblQuizTitle = new JLabel("Reg No");
		lblQuizTitle.setBounds(10, 89, 113, 28);
		contentPane_1.add(lblQuizTitle);
		
		JLabel lblCourseId = new JLabel("Course ID");
		lblCourseId.setBounds(10, 128, 113, 28);
		contentPane_1.add(lblCourseId);
		
		JLabel lblCourseCode = new JLabel("Course Code");
		lblCourseCode.setBounds(10, 167, 113, 28);
		contentPane_1.add(lblCourseCode);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(133, 50, 173, 24);
		contentPane_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(133, 93, 173, 24);
		contentPane_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(133, 132, 173, 24);
		contentPane_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(133, 171, 173, 24);
		contentPane_1.add(textField_3);
		
		JButton btnNext = new JButton("Start Quiz");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNext.setBounds(164, 238, 89, 23);
		contentPane_1.add(btnNext);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(289, 238, 89, 23);
		contentPane_1.add(btnCancel);
	}
}
