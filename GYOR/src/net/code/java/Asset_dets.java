package net.code.java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Asset_dets {
	public String asset_id;
	public JFrame frame1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Asset_dets window = new Asset_dets();
					window.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Asset_dets() {
		initialize();
		asset_id = textField.getText();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame1 = new JFrame();
		frame1.setTitle("Asset Booking");
//		frame1.setBounds(100, 100, 1344, 792);
		frame1.setSize(1650,1080);
		frame1.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 102, 153));
		panel.setBounds(10, 10, 1520, 122);
		frame1.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Asset Details");
		lblNewLabel.setBounds(614, 17, 276, 83);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 204));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 50));
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame1.dispose();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\arrow-back-icon.png"));
		btnNewButton_1.setBounds(0, 0, 47, 41);
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 204, 204));
		panel_1.setBounds(10, 141, 1520, 704);
		frame1.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(665, 465, 160, 113);
		panel_1.add(lblNewLabel_7);
		lblNewLabel_7.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\handshake-3312.png"));
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.setForeground(new Color(51, 102, 153));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Payment pay = new Payment();
				String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
			    String username = "system";
			    String password = "sarang"; 
			    
			    Connection connection =null;
			    Statement stat = null;
			    ResultSet rs = null;
			    try {
			    	connection = DriverManager.getConnection(dbURL, username, password);
			    	System.out.println("Connected");
			    	
			    	String sql = "";
			    	
					 stat = connection.createStatement();
					stat.executeUpdate(sql);
					 rs = stat.executeQuery(sql);
			    }
			    catch (SQLException e1) {
			    	//TODO Auto-generated catch block
			    	System.out.println("Not yet");
			    	e1.printStackTrace();
			   	}
			    Payment pay = new Payment();
//				flat_bung_room flburo = new flat_bung_room();
				frame1.dispose();
			}
		});
		btnNewButton.setBounds(665, 588, 165, 54);
		panel_1.add(btnNewButton);
		btnNewButton.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\Register-icon (1).png"));
		btnNewButton.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		
		JLabel lblNewLabel_1 = new JLabel("Asset ID");
		lblNewLabel_1.setBounds(523, 11, 184, 40);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(new Color(51, 102, 153));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		
		JLabel lblNewLabel_2 = new JLabel("Owner ID");
		lblNewLabel_2.setBounds(227, 197, 184, 40);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(51, 102, 153));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		
		JLabel lblNewLabel_3 = new JLabel("Location");
		lblNewLabel_3.setBounds(227, 258, 184, 40);
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setForeground(new Color(51, 102, 153));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		
		JLabel lblNewLabel_4 = new JLabel("Pin");
		lblNewLabel_4.setBounds(227, 318, 184, 40);
		panel_1.add(lblNewLabel_4);
		lblNewLabel_4.setForeground(new Color(51, 102, 153));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		
		textField_4 = new JTextField();
		textField_4.setForeground(Color.BLACK);
		textField_4.setBounds(1077, 317, 224, 43);
		panel_1.add(textField_4);
		textField_4.setBackground(new Color(255, 255, 204));
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Type/Seater");
		lblNewLabel_5.setBounds(850, 318, 184, 40);
		panel_1.add(lblNewLabel_5);
		lblNewLabel_5.setForeground(new Color(51, 102, 153));
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		
		textField_3 = new JTextField();
		textField_3.setBounds(421, 317, 224, 43);
		panel_1.add(textField_3);
		textField_3.setBackground(new Color(255, 255, 204));
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		textField_3.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(421, 258, 224, 43);
		panel_1.add(textField_2);
		textField_2.setBackground(new Color(255, 255, 204));
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		textField_2.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(421, 196, 224, 43);
		panel_1.add(textField_1);
		textField_1.setBackground(new Color(255, 255, 204));
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(636, 10, 224, 43);
		panel_1.add(textField);
		textField.setBackground(new Color(255, 255, 204));
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		textField.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Search");
		btnNewButton_2.setForeground(new Color(51, 102, 153));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
		         String username = "system";
		         String password = "sarang";
					Connection connection = null;
					Statement stat=null;
					ResultSet rs =null;
					Connection connection1 = null;
					Statement stat1=null;
					ResultSet rs1 =null;
					Connection connection2 = null;
					Statement stat2=null;
					ResultSet rs2 =null;
					String asset_id = textField.getText() ;
					int flag=0,flag1=0;
		         
		try {
		connection = DriverManager.getConnection(dbURL, username, password);
		System.out.println("Connected");
		String sql = "SELECT contact,owner_ID,pin,location,flat_on,type,price_rent FROM Flat inner join user_1 on Flat.owner_ID = user_1.ID where flat_ID = '"+asset_id+"'";
		 stat = connection.createStatement();
		stat.executeUpdate(sql);
		rs=stat.executeQuery(sql);
		flag=1;
		flag1=1;
		if(flag==1){
			connection1 = DriverManager.getConnection(dbURL, username, password);
			System.out.println("Connected");
			String sql1 = "SELECT contact,owner_ID,pin,location,bunglow_on,type,price_rent FROM Bunglow inner join user_1 on Bunglow.owner_ID = user_1.ID where bunglow_ID = '"+asset_id+"'";
			 stat1 = connection1.createStatement();
			stat1.executeUpdate(sql1);
			rs1=stat1.executeQuery(sql1);
		}
		if(flag1==1){
			connection2 = DriverManager.getConnection(dbURL, username, password);
			System.out.println("Connected");
			String sql2 = "SELECT contact,owner_ID,pin,location,seater,rent FROM Hostel inner join user_1 on Hostel.owner_ID = user_1.ID where room_ID = '"+asset_id+"'";
			 stat2 = connection2.createStatement();
			stat2.executeUpdate(sql2);
			rs2=stat2.executeQuery(sql2);
		}

		if(rs.next()) {
			textField_8.setText(rs.getString(1));
			textField_5.setText("Flat");
			textField_1.setText(rs.getString(2));
			textField_2.setText(rs.getString(4));
			textField_3.setText(rs.getString(3));
			textField_6.setText(rs.getString(5));
			textField_4.setText(rs.getString(6));
			textField_7.setText(rs.getString(7));
		}
		else if(rs1.next()) {
			textField_8.setText(rs1.getString(1));
			textField_5.setText("Bunglow");
			textField_1.setText(rs1.getString(2));
			textField_2.setText(rs1.getString(4));
			textField_3.setText(rs1.getString(3));
			textField_6.setText(rs1.getString(5));
			textField_4.setText(rs1.getString(6));
			textField_7.setText(rs1.getString(7));
		}
		else if(rs2.next()) {
			textField_8.setText(rs2.getString(1));
			textField_5.setText("Room");
			textField_1.setText(rs2.getString(2));
			textField_2.setText(rs2.getString(4));
			textField_3.setText(rs2.getString(3));
			textField_6.setText("Rent");
			textField_4.setText(rs2.getString(5));
			textField_7.setText(rs2.getString(6));
		}
		else {
			textField_8.setText("");
			textField_5.setText("");
			textField_1.setText("");
			textField_2.setText("");
			textField_3.setText("");
			textField_6.setText("");
			textField_4.setText("");
			textField_7.setText("");
			textField.setText("");
			JOptionPane.showMessageDialog(null,"No such Asset exist !!");
		}
		} 
	
		catch (SQLException e1) {
		// TODO Auto-generated catch block
		System.out.println("Not yet");
		e1.printStackTrace();
		}
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\Start-Menu-Search-icon.png"));
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton_2.setBounds(870, 13, 150, 40);
		panel_1.add(btnNewButton_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Asset ");
		lblNewLabel_1_1.setForeground(new Color(51, 102, 153));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(618, 100, 113, 40);
		panel_1.add(lblNewLabel_1_1);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		textField_5.setColumns(10);
		textField_5.setBackground(new Color(255, 255, 204));
		textField_5.setBounds(741, 99, 224, 43);
		panel_1.add(textField_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("On");
		lblNewLabel_5_1.setForeground(new Color(51, 102, 153));
		lblNewLabel_5_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_5_1.setBounds(850, 255, 150, 46);
		panel_1.add(lblNewLabel_5_1);
		
		textField_6 = new JTextField();
		textField_6.setForeground(Color.BLACK);
		textField_6.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		textField_6.setColumns(10);
		textField_6.setBackground(new Color(255, 255, 204));
		textField_6.setBounds(1077, 257, 224, 43);
		panel_1.add(textField_6);
		
		JLabel lblNewLabel_5_2 = new JLabel("Rent/Price");
		lblNewLabel_5_2.setForeground(new Color(51, 102, 153));
		lblNewLabel_5_2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_5_2.setBounds(569, 396, 184, 40);
		panel_1.add(lblNewLabel_5_2);
		
		textField_7 = new JTextField();
		textField_7.setForeground(Color.BLACK);
		textField_7.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		textField_7.setColumns(10);
		textField_7.setBackground(new Color(255, 255, 204));
		textField_7.setBounds(741, 395, 224, 43);
		panel_1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		textField_8.setColumns(10);
		textField_8.setBackground(new Color(255, 255, 204));
		textField_8.setBounds(1077, 197, 224, 43);
		panel_1.add(textField_8);
		
		JLabel lblNewLabel_2_1 = new JLabel("Owner Contact");
		lblNewLabel_2_1.setForeground(new Color(51, 102, 153));
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_2_1.setBounds(850, 197, 184, 40);
		panel_1.add(lblNewLabel_2_1);
		
		frame1.setVisible(true);
	}
}
