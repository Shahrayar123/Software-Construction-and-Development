package teacher;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;

public class CreateQuiz extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldTName;
	private JTextField textFieldQzTitle;
	private JTextField textFieldCourseID;
	private JTextField textFieldCourseCode;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateQuiz frame = new CreateQuiz();
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
	public CreateQuiz() {
		setResizable(false);
		setTitle("Quiz Introduction 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 359);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPlEnterData = new JLabel("Please Enter Data :");
		lblPlEnterData.setBounds(10, 11, 113, 28);
		contentPane.add(lblPlEnterData);
		
		JLabel lblTName = new JLabel("Teacher Name");
		lblTName.setBounds(10, 50, 113, 28);
		contentPane.add(lblTName);
		
		JLabel lblQuizTitle = new JLabel("Quiz Title");
		lblQuizTitle.setBounds(10, 89, 113, 28);
		contentPane.add(lblQuizTitle);
		
		JLabel lblCourseId = new JLabel("Course ID");
		lblCourseId.setBounds(10, 128, 113, 28);
		contentPane.add(lblCourseId);
		
		JLabel lblCourseCode = new JLabel("Course Code");
		lblCourseCode.setBounds(10, 167, 113, 28);
		contentPane.add(lblCourseCode);
		
		textFieldTName = new JTextField();
		textFieldTName.setBounds(133, 50, 173, 24);
		contentPane.add(textFieldTName);
		textFieldTName.setColumns(10);
		
		textFieldQzTitle = new JTextField();
		textFieldQzTitle.setColumns(10);
		textFieldQzTitle.setBounds(133, 93, 173, 24);
		contentPane.add(textFieldQzTitle);
		
		textFieldCourseID = new JTextField();
		textFieldCourseID.setColumns(10);
		textFieldCourseID.setBounds(133, 132, 173, 24);
		contentPane.add(textFieldCourseID);
		
		textFieldCourseCode = new JTextField();
		textFieldCourseCode.setColumns(10);
		textFieldCourseCode.setBounds(133, 171, 173, 24);
		contentPane.add(textFieldCourseCode);
		
		JLabel lblDueDate = new JLabel("Due Date");
		lblDueDate.setBounds(10, 207, 113, 28);
		contentPane.add(lblDueDate);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(133, 206, 173, 24);
		contentPane.add(dateChooser);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(34, 270, 89, 23);
		contentPane.add(btnNext);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(285, 270, 89, 23);
		contentPane.add(btnCancel);
	}
}
