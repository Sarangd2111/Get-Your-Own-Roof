package net.code.java;
import javax.swing.*;

import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Button;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

public class Login_1 {
	public String id ;
	public JFrame frmLogin;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_1 window = new Login_1();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login_1() {
		initialize();
		frmLogin.setVisible(true);
		id = textField.getText();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.getContentPane().setBackground(new Color(255, 255, 255));
		frmLogin.getContentPane().setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		frmLogin.setBounds(100, 100, 871, 622);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 102, 153));
		panel.setBounds(10, 10, 837, 191);
		frmLogin.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel Login_label = new JLabel("Login");
		Login_label.setBounds(377, 10, 98, 47);
		panel.add(Login_label);
		Login_label.setForeground(new Color(255, 255, 153));
		Login_label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(377, 44, 115, 147);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\Apps-preferences-system-login-icon.png"));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 204, 204));
		panel_1.setBounds(10, 211, 837, 364);
		frmLogin.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(367, 250, 135, 43);
		panel_1.add(btnNewButton);
		btnNewButton.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\Login-icon.png"));
		btnNewButton.setHorizontalAlignment(SwingConstants.LEADING);
		//		btnNewButton.setBackground(new Color(255, 255, 255));
				btnNewButton.setForeground(new Color(0, 102, 153));
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
					    String username = "system";
					    String password = "sarang"; 
					    
					     id = textField.getText();
					    String pass = passwordField.getText();
					    int flag=0;
					    Connection connection =null;
					    Statement stat = null;
					    ResultSet rs = null;
					    Connection connection1 =null;
					    Statement stat1 = null;
					    ResultSet rs1 = null;
					    try {
					    	
					    	connection = DriverManager.getConnection(dbURL, username, password);
					    	System.out.println("Connected");
					    	
					    	String sql = "select * from user_1 where ID = '"+id+"' and password = '"+pass+"'";
					    	
							 stat = connection.createStatement();
							stat.executeUpdate(sql);
							 rs = stat.executeQuery(sql);
							
							if(rs.next()) {
								flag =1;
								JOptionPane.showMessageDialog(null,"Login Successfull !!");
								Buy_sell bs = new Buy_sell();
								frmLogin.dispose();
							}
					    	else {
					    		JOptionPane.showMessageDialog(null,"Incorrect username or password !!");
					    	}
							if(flag==1) {
								connection1 = DriverManager.getConnection(dbURL, username, password);
						    	System.out.println("Connected");
						    	String userid = textField.getText();
						    	String sql1 = "INSERT INTO user_id(id) VALUES ('"+userid+"')";
						    	
								 stat1 = connection1.createStatement();
								stat1.executeUpdate(sql1);
								 rs1 = stat1.executeQuery(sql1);
							}
					    }
					   	catch (SQLException e1) {
					    	//TODO Auto-generated catch block
					    	System.out.println("Not yet");
					    	e1.printStackTrace();
					   	}
					}
				});
				btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
				
				JButton btnNewButton_1 = new JButton("Forgot Password ?");
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						ForgotPassword fp = new ForgotPassword();
					}
				});
				btnNewButton_1.setForeground(new Color(51, 102, 153));
				btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
				btnNewButton_1.setBounds(350, 303, 167, 35);
				panel_1.add(btnNewButton_1);
				
				textField = new JTextField();
				textField.setBounds(415, 39, 212, 47);
				panel_1.add(textField);
				textField.setFont(new Font("Times New Roman", Font.PLAIN, 25));
				textField.setBackground(new Color(255, 255, 204));
				textField.setColumns(10);
				
				passwordField = new JPasswordField();
				passwordField.setBounds(415, 118, 212, 47);
				panel_1.add(passwordField);
				passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 25));
				passwordField.setBackground(new Color(255, 255, 204));
				
				JLabel pass_label = new JLabel("Password");
				pass_label.setBounds(298, 118, 105, 38);
				panel_1.add(pass_label);
				pass_label.setForeground(new Color(51, 102, 153));
				pass_label.setFont(new Font("Times New Roman", Font.PLAIN, 25));
				
				JLabel User_ID_Label = new JLabel("User ID");
				User_ID_Label.setBounds(298, 38, 90, 47);
				panel_1.add(User_ID_Label);
				User_ID_Label.setForeground(new Color(51, 102, 153));
				User_ID_Label.setFont(new Font("Times New Roman", Font.PLAIN, 25));
				
				JLabel lblNewLabel_1 = new JLabel("");
				lblNewLabel_1.setBounds(244, 38, 48, 47);
				panel_1.add(lblNewLabel_1);
				lblNewLabel_1.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\man-icon.png"));
				
				JLabel lblNewLabel_2 = new JLabel("");
				lblNewLabel_2.setBounds(244, 118, 48, 38);
				panel_1.add(lblNewLabel_2);
				lblNewLabel_2.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\key-icon.png"));
				
				JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
				chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
				chckbxNewCheckBox.setBackground(new Color(255, 255, 204));
				chckbxNewCheckBox.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(chckbxNewCheckBox.isSelected()) {
							passwordField.setEchoChar((char)0);
						}
						else {
							passwordField.setEchoChar('*');
						}
					}
				});
				chckbxNewCheckBox.setForeground(new Color(51, 102, 153));
				chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.PLAIN, 20));
				chckbxNewCheckBox.setBounds(350, 196, 167, 27);
				panel_1.add(chckbxNewCheckBox);
		
//		btnNewButton.addActionListener(e -> actionPerformed(e));
	}
}
