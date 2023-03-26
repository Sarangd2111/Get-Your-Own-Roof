package net.code.java;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class ForgotPassword {
//	Login_1 log = new Login_1();
//	Variables var = new Variables();
	private JFrame frame;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgotPassword window = new ForgotPassword();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ForgotPassword() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 1012, 660);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 102, 153));
		panel.setForeground(new Color(255, 255, 204));
		panel.setBounds(10, 10, 978, 161);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Reset Password");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel.setForeground(new Color(255, 255, 204));
		lblNewLabel.setBounds(374, 10, 260, 58);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\Generate-keys-icon (1).png"));
		lblNewLabel_3.setBounds(439, 52, 104, 99);
		panel.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\arrow-back-icon.png"));
		btnNewButton_1.setBounds(0, 0, 50, 39);
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 204, 204));
		panel_1.setBounds(10, 181, 978, 432);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New Password");
		lblNewLabel_1.setForeground(new Color(51, 102, 153));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(265, 121, 198, 44);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Confirm Password");
		lblNewLabel_2.setForeground(new Color(51, 102, 153));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(265, 236, 198, 44);
		panel_1.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		passwordField.setBackground(new Color(255, 255, 204));
		passwordField.setForeground(new Color(0, 0, 0));
		passwordField.setBounds(501, 121, 244, 44);
		panel_1.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		passwordField_1.setBackground(new Color(255, 255, 204));
		passwordField_1.setBounds(501, 236, 244, 44);
		panel_1.add(passwordField_1);
		
		JButton btnNewButton = new JButton("Reset Password");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\arrow-circle-down-icon.png"));
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
		         String username = "system";
		         String password = "sarang";
				    Connection connection =null;
				    Statement stat = null;
				    ResultSet rs = null;
				   String pass = passwordField.getText();
				  String confirm_pass = passwordField_1.getText();
				  String id = textField.getText();
		         
		try {
		if(pass.compareTo(confirm_pass) == 0) {
		 connection = DriverManager.getConnection(dbURL, username, password);
		System.out.println("Connected");
		String sql = "UPDATE user_1 SET password = '"+pass+"' WHERE ID = '"+id+"' ";
		 stat = connection.createStatement();
		stat.executeUpdate(sql);
		rs = stat.executeQuery(sql);
		if(rs.next()) {
			JOptionPane.showMessageDialog(null,"Password changed Successfully !!");
			frame.dispose();
		}
		else {
			JOptionPane.showMessageDialog(null,"No such User ID exists !!");
		}
		}
		else {
			JOptionPane.showMessageDialog(null,"Passwords dosent match in both fields !!");
		}
		} 
		catch (SQLException e1) {
		// TODO Auto-generated catch block
		System.out.println("Not yet");
		e1.printStackTrace();
		}
			}

		});
		btnNewButton.setForeground(new Color(51, 102, 153));
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		btnNewButton.setBounds(373, 361, 216, 44);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\key-icon.png"));
		lblNewLabel_2_1.setBounds(207, 127, 48, 38);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\key-icon.png"));
		lblNewLabel_2_1_1.setBounds(207, 242, 48, 38);
		panel_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("( Password of max 8 charachters )");
		lblNewLabel_4.setForeground(new Color(51, 102, 153));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(342, 175, 296, 34);
		panel_1.add(lblNewLabel_4);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected()) {
					passwordField.setEchoChar((char)0);
					passwordField_1.setEchoChar((char)0);
				}
				else {
					passwordField.setEchoChar('*');
					passwordField_1.setEchoChar('*');
				}
			}
		});
		chckbxNewCheckBox.setForeground(new Color(51, 102, 153));
		chckbxNewCheckBox.setBackground(new Color(255, 255, 204));
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		chckbxNewCheckBox.setBounds(389, 309, 185, 27);
		panel_1.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_1_1 = new JLabel("Your ID");
		lblNewLabel_1_1.setForeground(new Color(51, 102, 153));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(265, 44, 198, 44);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("");
		lblNewLabel_2_1_2.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\man-icon.png"));
		lblNewLabel_2_1_2.setBounds(207, 40, 59, 48);
		panel_1.add(lblNewLabel_2_1_2);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 204));
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField.setBounds(501, 44, 244, 44);
		panel_1.add(textField);
		textField.setColumns(10);
		
		frame.setVisible(true);
		
	}
}
