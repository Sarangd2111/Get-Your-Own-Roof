package net.code.java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JPanel;

public class Signup {
	public String id;
	private JFrame frmSignup;
	private JTextField textField;
	public JTextField user_id;
	private JTextField contact_1;
	private JTextField textField_4;
	private JTextField mail;
	private JPasswordField passwordField;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup window = new Signup();
					window.frmSignup.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public Signup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSignup = new JFrame();
		frmSignup.setTitle("Signup");
		frmSignup.getContentPane().setBackground(new Color(255, 255, 255));
//		frame.setBounds(100, 100, 1357, 785);
		frmSignup.setSize(1650,1080);
		frmSignup.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frmSignup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSignup.getContentPane().setLayout(null);
		
		JLabel name_label = new JLabel("Name");
		name_label.setForeground(new Color(51, 102, 153));
		name_label.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		name_label.setBounds(616, 205, 76, 32);
		frmSignup.getContentPane().add(name_label);
		
		JLabel user_label = new JLabel("User_ID \r\n(Max 8 characters)");
		user_label.setForeground(new Color(51, 102, 153));
		user_label.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		user_label.setBounds(395, 271, 285, 32);
		frmSignup.getContentPane().add(user_label);
		
		JLabel Pass_label = new JLabel("Password\r\n (Maximum length 20)");
		Pass_label.setForeground(new Color(51, 102, 153));
		Pass_label.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		Pass_label.setBounds(358, 325, 321, 59);
		frmSignup.getContentPane().add(Pass_label);
		
		JLabel Contact_label = new JLabel("Contact");
		Contact_label.setForeground(new Color(51, 102, 153));
		Contact_label.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		Contact_label.setBackground(new Color(255, 255, 255));
		Contact_label.setBounds(600, 400, 80, 59);
		frmSignup.getContentPane().add(Contact_label);
		
		JLabel Mail_label = new JLabel("E-Mail");
		Mail_label.setForeground(new Color(51, 102, 153));
		Mail_label.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		Mail_label.setBounds(612, 513, 80, 59);
		frmSignup.getContentPane().add(Mail_label);
		
		textField = new JTextField();
		textField.setForeground(new Color(0, 0, 0));
		textField.setBackground(new Color(255, 255, 204));
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		textField.setBounds(721, 202, 514, 39);
		frmSignup.getContentPane().add(textField);
		textField.setColumns(10);
		
		user_id = new JTextField();
		user_id.setBackground(new Color(255, 255, 204));
		user_id.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		user_id.setBounds(721, 269, 275, 39);
		frmSignup.getContentPane().add(user_id);
		user_id.setColumns(10);
		
		contact_1 = new JTextField();
		contact_1.setBackground(new Color(255, 255, 204));
		contact_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		contact_1.setBounds(721, 395, 275, 40);
		frmSignup.getContentPane().add(contact_1);
		contact_1.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBackground(new Color(255, 255, 204));
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		textField_4.setBounds(721, 459, 275, 39);
		frmSignup.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		mail = new JTextField();
		mail.setBackground(new Color(255, 255, 204));
		mail.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		mail.setBounds(721, 523, 514, 39);
		frmSignup.getContentPane().add(mail);
		mail.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		passwordField.setBackground(new Color(255, 255, 204));
		passwordField.setBounds(721, 332, 275, 39);
		frmSignup.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\Mail-icon.png"));
		lblNewLabel_1.setBounds(554, 516, 48, 46);
		frmSignup.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\Phone-icon.png"));
		lblNewLabel_2.setBounds(542, 409, 48, 40);
		frmSignup.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\key-icon.png"));
		lblNewLabel_2_1.setBounds(300, 334, 48, 38);
		frmSignup.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\man-icon.png"));
		lblNewLabel_1_1.setBounds(337, 256, 48, 47);
		frmSignup.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\name-card-icon.png"));
		lblNewLabel_1_1_1.setBounds(558, 191, 48, 59);
		frmSignup.getContentPane().add(lblNewLabel_1_1_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 102, 153));
		panel.setBounds(10, 10, 1520, 123);
		frmSignup.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel Signup_label = new JLabel("Signup");
		Signup_label.setBounds(697, 30, 132, 59);
		panel.add(Signup_label);
		Signup_label.setForeground(new Color(255, 255, 153));
		Signup_label.setBackground(Color.PINK);
		Signup_label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 45));
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(0, 0, 44, 38);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_1 login = new Login_1();
				frmSignup.dispose();
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\arrow-back-icon.png"));
		panel.add(btnNewButton_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 204, 204));
		panel_1.setBounds(10, 143, 1520, 654);
		frmSignup.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Terms & Conditions\r\n");
		btnNewButton_1.setBounds(632, 458, 237, 49);
		panel_1.add(btnNewButton_1);
		btnNewButton_1.setForeground(new Color(51, 102, 153));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Accept the terms and conditions");
		chckbxNewCheckBox.setForeground(new Color(51, 102, 153));
		chckbxNewCheckBox.setBackground(new Color(255, 255, 204));
		chckbxNewCheckBox.setBounds(574, 530, 346, 39);
		panel_1.add(chckbxNewCheckBox);
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		
		JButton btnNewButton = new JButton("Signup");
		btnNewButton.setBounds(675, 583, 141, 47);
		panel_1.add(btnNewButton);
		btnNewButton.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\signup-icon.png"));
		btnNewButton.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected()) {
				// TODO Auto-generated method stub
				String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
			    String username = "system";
			    String password = "sarang"; 
			    id = user_id.getText();
			    String number = contact_1.getText();
			    String pass = passwordField.getText();
			    String mail_Sql = mail.getText();
			    String name = textField.getText();
			    
			    try {
			    	Connection connection = DriverManager.getConnection(dbURL, username, password);
			    	System.out.println("Connected");
					String sql = "INSERT INTO user_1(ID,buyer_seller,password,name,contact,mail) VALUES ('"+id+"','','"+pass+"','"+name+"','"+number+"','"+mail_Sql+"')";
					Statement stat = connection.createStatement();
					stat.executeUpdate(sql);
			    } 
			   	catch (SQLException e1) {
			    	//TODO Auto-generated catch block
			    	System.out.println("Not yet");
			    	e1.printStackTrace();
			   	}
			    JOptionPane.showMessageDialog(null,"Signup Successfull !!");
			    Login_1 log = new Login_1();
			    frmSignup.dispose();
			}
				else {
					JOptionPane.showMessageDialog(null,"Terms and Conditions not accepted !!");
				}
			}
		});
		btnNewButton.setForeground(new Color(51, 102, 153));
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				T_C terms_conditions = new T_C();
			}
		});
		


		frmSignup.setVisible(true);
		
//		btnNewButton.addActionListener(e -> actionPerformed(e));
	}
	

}
