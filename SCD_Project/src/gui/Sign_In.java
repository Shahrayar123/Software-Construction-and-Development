package gui;
//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.TextField;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Label;

@SuppressWarnings("serial")
public class Sign_In extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Sign_In frame = new Sign_In();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//		 UIManager.LookAndFeelInfo[] looks = UIManager.getInstalledLookAndFeels();
//	        for (UIManager.LookAndFeelInfo look : looks) {
//	            System.out.println(look.getClassName());
//	        }
//	}

	/**
	 * Create the frame.
	 */
	public Sign_In() {
		
		setResizable(false);
			try {
				UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
					| UnsupportedLookAndFeelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		setFont(new Font("Calibri Light", Font.PLAIN, 13));
		setForeground(SystemColor.textHighlight);
		setTitle("Log In");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//contentPane.setVisible(true);
		
		JButton btnLogIn = new JButton("Login");
		btnLogIn.setBounds(115, 159, 106, 23);
		contentPane.add(btnLogIn);
		
		JButton btnSign_In = new JButton("Sign up");
		btnSign_In.setBounds(299, 227, 106, 23);
		contentPane.add(btnSign_In);
		
		TextField textField_UserName = new TextField();
		textField_UserName.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_UserName.setBackground(SystemColor.inactiveCaption);
		textField_UserName.setBounds(130, 31, 275, 29);
		contentPane.add(textField_UserName);
		
		JButton btnForgotPassword = new JButton("Forgot Password");
		btnForgotPassword.setBounds(267, 159, 138, 23);
		contentPane.add(btnForgotPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(SystemColor.inactiveCaption);
		passwordField.setEchoChar('*');
		passwordField.setBounds(130, 86, 275, 29);
		contentPane.add(passwordField);
		
		Label label_Username = new Label("User Name");
		label_Username.setFont(new Font("Calibri", Font.BOLD, 13));
		label_Username.setAlignment(Label.CENTER);
		label_Username.setBounds(10, 31, 77, 29);
		contentPane.add(label_Username);
		
		Label label_Password = new Label("Password");
		label_Password.setFont(new Font("Calibri", Font.BOLD, 13));
		label_Password.setAlignment(Label.CENTER);
		label_Password.setBounds(10, 86, 77, 29);
		contentPane.add(label_Password);
	}
}
