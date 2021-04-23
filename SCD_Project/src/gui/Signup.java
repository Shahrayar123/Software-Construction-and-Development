package gui;
//
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.UIManager;
//import javax.swing.UnsupportedLookAndFeelException;
//import javax.swing.GroupLayout.Alignment;
//import javax.swing.GroupLayout;
//import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
//import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JPasswordField;

import com.toedter.calendar.JDateChooser;
import javax.swing.JFrame;
//import javax.swing.JCheckBoxMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

/**
 *
 * @author University
 */
@SuppressWarnings("serial")
public class Signup extends javax.swing.JFrame {
	private JTextField textField_FirstName;
	private JTextField textField_lastName;
	private JTextField textField_Username;
	private JTextField textField_Email;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private final ButtonGroup buttonGroup_Gender = new ButtonGroup();
	private JTextField textField_User_Phne;
	public Signup() {
	
		
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setResizable(false);
	
		getContentPane().setFont(new Font("Calibri Light", Font.PLAIN, 13));
		getContentPane().setForeground(Color.LIGHT_GRAY);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Sign Up");
		getContentPane().setLayout(null);
		setSize(420,516);
		
		JLabel lbl_FirstName = new JLabel("First Name");
		lbl_FirstName.setBackground(Color.WHITE);
		lbl_FirstName.setBounds(31, 19, 92, 31);
		getContentPane().add(lbl_FirstName);
		
		JLabel lbl_LastName = new JLabel("Last Name");
		lbl_LastName.setBounds(31, 64, 92, 31);
		getContentPane().add(lbl_LastName);
		
		JLabel lbl_Gender = new JLabel("Gender");
		lbl_Gender.setBounds(31, 114, 46, 14);
		getContentPane().add(lbl_Gender);
		
		JLabel lbl_DOB = new JLabel("Date of Birth");
		lbl_DOB.setBounds(31, 150, 92, 31);
		getContentPane().add(lbl_DOB);
		
		JLabel lbl_UserName = new JLabel("User Name");
		lbl_UserName.setBounds(31, 192, 92, 31);
		getContentPane().add(lbl_UserName);
		
		JLabel lbl_UserPass = new JLabel("Password");
		lbl_UserPass.setBounds(31, 234, 92, 31);
		getContentPane().add(lbl_UserPass);
		
		JLabel lbl_UserPass_Retype = new JLabel("Retype Password");
		lbl_UserPass_Retype.setBounds(31, 277, 117, 31);
		getContentPane().add(lbl_UserPass_Retype);
		
		JLabel lbl_User_Email = new JLabel("Email Address");
		lbl_User_Email.setBounds(31, 334, 92, 31);
		getContentPane().add(lbl_User_Email);
		
		textField_FirstName = new JTextField();
		textField_FirstName.setBounds(176, 19, 158, 25);
		getContentPane().add(textField_FirstName);
		textField_FirstName.setColumns(10);
		
		textField_lastName = new JTextField();
		textField_lastName.setColumns(10);
		textField_lastName.setBounds(176, 69, 158, 25);
		getContentPane().add(textField_lastName);
		
		textField_Username = new JTextField();
		textField_Username.setColumns(10);
		textField_Username.setBounds(176, 197, 158, 25);
		getContentPane().add(textField_Username);
		
		textField_Email = new JTextField();
		textField_Email.setColumns(10);
		textField_Email.setBounds(176, 337, 158, 25);
		getContentPane().add(textField_Email);
		
		JCheckBox chckbxMale = new JCheckBox("Male");
		buttonGroup_Gender.add(chckbxMale);
		chckbxMale.setBounds(176, 110, 54, 23);
		getContentPane().add(chckbxMale);
		
		JCheckBox chckbxFemale = new JCheckBox("Female");
		buttonGroup_Gender.add(chckbxFemale);
		chckbxFemale.setBounds(232, 110, 67, 23);
		getContentPane().add(chckbxFemale);
		
		JCheckBox chckbxOther = new JCheckBox("Other");
		buttonGroup_Gender.add(chckbxOther);
		chckbxOther.setBounds(301, 110, 67, 23);
		getContentPane().add(chckbxOther);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(176, 239, 158, 26);
		getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(176, 281, 158, 26);
		getContentPane().add(passwordField_1);
		
		JDateChooser dateChooser =new JDateChooser();
		dateChooser.setBounds(176, 150, 158, 34);
		getContentPane().add(dateChooser);
		
		JLabel lbl_User_Phn = new JLabel("Phone Number");
		lbl_User_Phn.setBounds(31, 389, 92, 31);
		getContentPane().add(lbl_User_Phn);
		
		textField_User_Phne = new JTextField();
		textField_User_Phne.setColumns(10);
		textField_User_Phne.setBounds(176, 390, 158, 25);
		getContentPane().add(textField_User_Phne);
		
		JButton btn_Finish = new JButton("Finish");
		btn_Finish.setBackground(Color.GREEN);
		btn_Finish.setBounds(301, 443, 90, 28);
		getContentPane().add(btn_Finish);
		
		JButton btn_Cancel = new JButton("Cancel");
		btn_Cancel.setBackground(Color.RED);
		btn_Cancel.setBounds(31, 443, 90, 28);
		getContentPane().add(btn_Cancel);
		
		}
}
