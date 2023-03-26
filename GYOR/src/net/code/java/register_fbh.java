package net.code.java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.DefaultComboBoxModel;

public class register_fbh{

	private JFrame frmAssetRegistration;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					register_fbh window = new register_fbh();
					window.frmAssetRegistration.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public register_fbh() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAssetRegistration = new JFrame();
		frmAssetRegistration.setTitle("Asset Registration");
		frmAssetRegistration.getContentPane().setBackground(new Color(255, 255, 255));
		frmAssetRegistration.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 25));
//		frame.setBounds(100, 100, 1340, 780);
		frmAssetRegistration.setSize(1650,1080);
		frmAssetRegistration.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frmAssetRegistration.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAssetRegistration.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 102, 153));
		panel.setBounds(10, 10, 1520, 136);
		frmAssetRegistration.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Asset Registration");
		lblNewLabel_1.setBounds(586, 37, 350, 61);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(new Color(255, 255, 204));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 45));
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Buy_sell bs = new Buy_sell();
				frmAssetRegistration.dispose();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\arrow-back-icon.png"));
		btnNewButton_1.setBounds(0, 0, 51, 40);
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 204, 204));
		panel_1.setBounds(10, 156, 1520, 641);
		frmAssetRegistration.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(51, 102, 153));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Flat", "Bunglow", "Hostel"}));
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		comboBox.setBackground(new Color(255, 255, 204));
		comboBox.setBounds(655, 20, 187, 49);
		panel_1.add(comboBox);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setBounds(675, 559, 165, 49);
		panel_1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a=comboBox.getSelectedIndex(),flag=0;
				String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
		        String username = "system";
		        String password = "sarang";
		        String asset_id = textField.getText();
//		        String asset_name = null;
		        String Location = textField_1.getText();
		        String pin = textField_2.getText();
		        String On = textField_3.getText();
		        String type = textField_4.getText();
		        String Price_Rent = textField_5.getText();
		        String ID = textField_6.getText();

		        Connection connection =null;
		        Statement stat=null;
		        Connection connection1 = null;
		        Statement stat1 = null;
		        if(a==0) {
		        	flag=1;
		        	try {
			        	  connection = DriverManager.getConnection(dbURL, username, password);
			        	 System.out.println("Connected");
			        	 String sql = "INSERT INTO Asset_1(ID,f_b_h) VALUES ('"+asset_id+"','FLAT')";
			        	  stat = connection.createStatement();
			        	 stat.executeUpdate(sql);
			        	
			         } 
			        	 catch (SQLException e1) {
			        	 // TODO Auto-generated catch block
			        	 System.out.println("Not yet");
			        	 e1.printStackTrace();
			         }
		        	if(flag==1) {
		            	try {
		    	        	 connection1 = DriverManager.getConnection(dbURL, username, password);
		    	        	 System.out.println("Connected");
		    	        	 String sql1 = "INSERT INTO Flat (flat_id,owner_id,pin,location,type,flat_on,price_rent) Values('"+asset_id+"','"+ID+"','"+pin+"','"+Location+"','"+type+"','"+On+"','"+Price_Rent+"')";
		    	        	  stat1 = connection1.createStatement();
		    	        	 stat1.executeUpdate(sql1);
		    	        	 
		    	         }
		    	         
		           	 	catch (SQLException e2) {
		           		 // TODO Auto-generated catch block
		           		 System.out.println("Not yet");
		           		 e2.printStackTrace();
		           	 }
		            }
		        }
		        
		        if(a==1) {
		        	flag=1;
			        try {
			        	  connection = DriverManager.getConnection(dbURL, username, password);
			        	 System.out.println("Connected");
			        	 String sql = "INSERT INTO Asset_1(ID,f_b_h) VALUES ('"+asset_id+"','BUNGLOW')";
			        	  stat = connection.createStatement();
			        	 stat.executeUpdate(sql);
			       
			        } 
			        	 catch (SQLException e1) {
			        	 // TODO Auto-generated catch block
			        	 System.out.println("Not yet");
			        	 e1.printStackTrace();
			        }
			        if(flag==1) {
			        	try {
				        	 connection1 = DriverManager.getConnection(dbURL, username, password);
				        	 System.out.println("Connected");
				        	 String sql1 = "INSERT INTO Bunglow (bunglow_id,owner_id,pin,location,type,bunglow_on,price_rent) Values('"+asset_id+"','"+ID+"','"+pin+"','"+Location+"','"+type+"','"+On+"','"+Price_Rent+"')";
				        	  stat1 = connection1.createStatement();
				        	 stat1.executeUpdate(sql1);
				        	 
			        	}
			        	catch (SQLException e1) {
				        	 // TODO Auto-generated catch block
				        	 System.out.println("Not yet");
				        	 e1.printStackTrace();
			        	}
			        	
			        }
		       }
		        
		        if(a==2) {
		        	flag=1;
			         try {
			        	  connection = DriverManager.getConnection(dbURL, username, password);
			        	 System.out.println("Connected");
			        	 String sql = "INSERT INTO Asset_1(ID,f_b_h) VALUES ('"+asset_id+"','ROOM')";
			        	  stat = connection.createStatement();
			        	 stat.executeUpdate(sql); 
			        	 
			         } 
			        	 catch (SQLException e1) {
			        	 // TODO Auto-generated catch block
			        	 System.out.println("Not yet");
			        	 e1.printStackTrace();
			        	 }
			         if(flag==1) {
			         	try {
			         		connection1 = DriverManager.getConnection(dbURL, username, password);
			 	        	 System.out.println("Connected");
			 	        	 String sql1 = "INSERT INTO Hostel (room_id,owner_id,pin,location,seater,rent) Values('"+asset_id+"','"+ID+"','"+pin+"','"+Location+"','"+type+"','"+Price_Rent+"')";
			 	        	  stat1 = connection1.createStatement();
			 	        	 stat1.executeUpdate(sql1);
			 	        	
			         	}
			         	catch (SQLException e1) {
			 	        	 // TODO Auto-generated catch block
			 	        	 System.out.println("Not yet");
			 	        	 e1.printStackTrace();
			        	}
			         }
		      }
				JOptionPane.showMessageDialog(null,"Asset registered Successfully !!");
				Buy_sell bs = new Buy_sell();
				frmAssetRegistration.dispose();
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\check-mark-3280.png"));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(693, 398, 128, 151);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\Home-icon (2).png"));
		
		textField = new JTextField();
		textField.setBounds(411, 131, 238, 43);
		panel_1.add(textField);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		textField.setBackground(new Color(255, 255, 204));
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(411, 201, 238, 43);
		panel_1.add(textField_1);
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(255, 255, 204));
		
		textField_2 = new JTextField();
		textField_2.setBounds(411, 273, 238, 43);
		panel_1.add(textField_2);
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(255, 255, 204));
		
		JLabel lblFlatbunglowroomId = new JLabel("Asset ID");
		lblFlatbunglowroomId.setBounds(153, 131, 184, 43);
		panel_1.add(lblFlatbunglowroomId);
		lblFlatbunglowroomId.setForeground(new Color(51, 102, 153));
		lblFlatbunglowroomId.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		

		JLabel lblLocation = new JLabel("Location");
		lblLocation.setBounds(153, 201, 184, 43);
		panel_1.add(lblLocation);
		lblLocation.setForeground(new Color(51, 102, 153));
		lblLocation.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		JLabel lblPin = new JLabel("Pin");
		lblPin.setBounds(153, 273, 184, 43);
		panel_1.add(lblPin);
		lblPin.setForeground(new Color(51, 102, 153));
		lblPin.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		textField_3 = new JTextField();
		textField_3.setBounds(1007, 131, 238, 43);
		panel_1.add(textField_3);
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(255, 255, 204));
		
		textField_4 = new JTextField();
		textField_4.setBounds(1007, 201, 238, 43);
		panel_1.add(textField_4);
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(255, 255, 204));
		
		textField_5 = new JTextField();
		textField_5.setBounds(1007, 273, 238, 43);
		panel_1.add(textField_5);
		textField_5.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		textField_5.setColumns(10);
		textField_5.setBackground(new Color(255, 255, 204));
		
		JLabel lblPricerent = new JLabel("On");
		lblPricerent.setBounds(813, 131, 184, 43);
		panel_1.add(lblPricerent);
		lblPricerent.setForeground(new Color(51, 102, 153));
		lblPricerent.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		JLabel lblType = new JLabel("Type/Seater");
		lblType.setBounds(813, 201, 184, 43);
		panel_1.add(lblType);
		lblType.setForeground(new Color(51, 102, 153));
		lblType.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		JLabel lblPricerent_2 = new JLabel("Price/Rent");
		lblPricerent_2.setBounds(813, 273, 184, 43);
		panel_1.add(lblPricerent_2);
		lblPricerent_2.setForeground(new Color(51, 102, 153));
		lblPricerent_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		textField_6.setColumns(10);
		textField_6.setBackground(new Color(255, 255, 204));
		textField_6.setBounds(411, 342, 238, 43);
		panel_1.add(textField_6);
		
		JLabel lblYourId = new JLabel("Your ID");
		lblYourId.setForeground(new Color(51, 102, 153));
		lblYourId.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblYourId.setBounds(153, 342, 184, 43);
		panel_1.add(lblYourId);

		frmAssetRegistration.setVisible(true);
	
	}
}
