package admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class AdminMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMenu frame = new AdminMenu();
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
	public AdminMenu() {
		setResizable(false);
		setForeground(SystemColor.textHighlight);
		setTitle("Administrator Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdminAction = new JLabel("Please Select an action from below ");
		lblAdminAction.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblAdminAction.setBounds(116, 21, 194, 40);
		contentPane.add(lblAdminAction);
		
		JButton btnManagTeacher = new JButton("Manage Teachers");
		btnManagTeacher.setBounds(115, 91, 195, 40);
		contentPane.add(btnManagTeacher);
		
		JButton btnCheckResultsQuiz = new JButton("Check Results of Quizs");
		btnCheckResultsQuiz.setBounds(116, 178, 195, 40);
		contentPane.add(btnCheckResultsQuiz);
	}
}
