package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

@SuppressWarnings("serial")
public class MainScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MainScreen frame = new MainScreen();
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
	public MainScreen() {
		setResizable(false);
		setForeground(SystemColor.textHighlight);
		setFont(new Font("Times New Roman", Font.PLAIN, 12));
		setTitle("Main Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 466, 323);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Please select a category from below to continue");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel.setBounds(85, 11, 303, 33);
		contentPane.add(lblNewLabel);
		
		JButton btn_Admn = new JButton("Administrator");
		btn_Admn.setForeground(UIManager.getColor("Button.light"));
		btn_Admn.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btn_Admn.setBounds(169, 70, 118, 47);
		contentPane.add(btn_Admn);
		
		JButton btn_Teacher = new JButton("Teacher");
		btn_Teacher.setForeground(UIManager.getColor("Button.light"));
		btn_Teacher.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btn_Teacher.setBounds(169, 148, 118, 47);
		contentPane.add(btn_Teacher);
		
		JButton btn_Student = new JButton("Student");
		btn_Student.setForeground(UIManager.getColor("Button.light"));
		btn_Student.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btn_Student.setBounds(169, 226, 118, 47);
		contentPane.add(btn_Student);
	}
}
