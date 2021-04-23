package admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class SearchTeacher extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchTeacher frame = new SearchTeacher();
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
	public SearchTeacher() {
		setTitle("Search Teacher Data");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setToolTipText("For Searching individual Teacher");
		btnSearch.setBounds(168, 169, 89, 23);
		contentPane.add(btnSearch);
		
		JLabel lblTeacherUName = new JLabel("Please Enter Teacher Username");
		lblTeacherUName.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblTeacherUName.setBounds(120, 53, 187, 40);
		contentPane.add(lblTeacherUName);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(45, 104, 331, 40);
		contentPane.add(textField);
		
		JButton btnAllTeachersData = new JButton("Show All Teachers Data");
		btnAllTeachersData.setToolTipText("To get data for all teachers");
		btnAllTeachersData.setBounds(134, 212, 187, 23);
		contentPane.add(btnAllTeachersData);
	}

}
