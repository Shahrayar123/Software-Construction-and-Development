package teacher;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window.Type;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;

@SuppressWarnings({ "serial", "unused" })
public class TeachersMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					TeachersMenu frame = new TeachersMenu();
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
	public TeachersMenu() {
		setResizable(false);
		setForeground(SystemColor.textHighlight);
		setTitle("Teacher's Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTeacherActions = new JLabel("Please Select an action from below ");
		lblTeacherActions.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblTeacherActions.setBounds(121, 11, 194, 40);
		contentPane.add(lblTeacherActions);
		
		JButton btnGetResult = new JButton("Get Result of a Quiz");
		btnGetResult.setBounds(120, 81, 195, 40);
		contentPane.add(btnGetResult);
		
		JButton btnCreateQuiz = new JButton("Create a Quiz");
		btnCreateQuiz.setBounds(121, 168, 195, 40);
		contentPane.add(btnCreateQuiz);
	}
}
