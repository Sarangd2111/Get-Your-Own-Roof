package net.code.java;

import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.text.Caret;

import net.proteanit.sql.DbUtils;

import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollBar;

public class Owner_info {
	public String id;
	private JFrame frmOwnerInfo;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField otxtfld;
	private JTable table;
	private JTable table_2;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Owner_info window = new Owner_info();
					window.frmOwnerInfo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Owner_info() {
		initialize();
		 id = otxtfld.getText();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmOwnerInfo = new JFrame();
		frmOwnerInfo.setTitle("Owner Info");
//		frame.setBounds(100, 100, 1264, 730);
		frmOwnerInfo.setSize(1650,1080);
		frmOwnerInfo.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frmOwnerInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmOwnerInfo.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 102, 153));
		panel.setBounds(10, 10, 1520, 151);
		frmOwnerInfo.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(0, 0, 52, 41);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				flat_bung_room fbh = new flat_bung_room();
				frmOwnerInfo.dispose();
			}
		});
		btnNewButton.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\arrow-back-icon.png"));
		
		JLabel lblNewLabel_1 = new JLabel("Owner Information");
		lblNewLabel_1.setBounds(603, 17, 396, 74);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(new Color(255, 255, 204));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 45));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int flag=0,flag1=0,flag2=0; 
				String id = otxtfld.getText();
				 String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
		         String username = "system";
		         String password = "sarang";
		         Connection connection = null;
		         Statement stat = null;
		         ResultSet rs =null;
		         Connection connection1 = null;
		         Statement stat1 = null;
		         ResultSet rs1 =null;
		         Connection connection2 = null;
		         Statement stat2 = null;
		         ResultSet rs2 =null;
		         Connection connection3 = null;
		         Statement stat3 = null;
		         ResultSet rs3 =null;
		try {
		 connection = DriverManager.getConnection(dbURL, username, password);
		System.out.println("Connected");
		
		String sql = "SELECT name,contact,mail from User_1 WHERE ID = '"+id+"'";
		stat = connection.createStatement();
		stat.executeUpdate(sql);
		rs = stat.executeQuery(sql);
		if(rs.next()) {
			flag=1;
			flag1=1;
			flag2=1;
			String name = rs.getString(1);
			String cont = rs.getString(2);
			String mail = rs.getString(3);
			textField.setText(name);
			textField_1.setText(id);
			textField_2.setText(cont);
			textField_3.setText(mail);
		}
		else {
			JOptionPane.showMessageDialog(null,"No such ID exist!!");
		}
		if(flag==1) {
			connection1 = DriverManager.getConnection(dbURL, username, password);
			System.out.println("Connected");
			String sql1 = "SELECT f_b_h,flat_ID,pin,location,type,flat_on,price_rent FROM Flat INNER JOIN asset_1 on Flat.flat_ID = asset_1.ID WHERE owner_ID = '"+id+"'";
			stat1 = connection1.createStatement();
			stat1.executeUpdate(sql1);
			rs1 = stat1.executeQuery(sql1);
		}
		if(flag1==1) {
			connection2 = DriverManager.getConnection(dbURL, username, password);
			System.out.println("Connected");
			String sql2 = "SELECT f_b_h,bunglow_ID,pin,location,type,bunglow_on,price_rent FROM Bunglow INNER JOIN asset_1 on Bunglow.bunglow_ID = asset_1.ID WHERE owner_ID = '"+id+"'";
			stat2 = connection1.createStatement();
			stat2.executeUpdate(sql2);
			rs2 = stat2.executeQuery(sql2);
		}
		if(flag2==1) {
			connection3 = DriverManager.getConnection(dbURL, username, password);
			System.out.println("Connected");
			String sql3 = "SELECT f_b_h,room_ID,pin,location,seater,rent FROM Hostel INNER JOIN asset_1 on Hostel.room_ID = asset_1.ID WHERE owner_ID = '"+id+"'";
			stat3 = connection1.createStatement();
			stat3.executeUpdate(sql3);
			rs3 = stat3.executeQuery(sql3);
		}
		} 
		catch (SQLException e1) {
		// TODO Auto-generated catch block
		System.out.println("Not yet");
		
		e1.printStackTrace();
		}
		
		table.setModel(DbUtils.resultSetToTableModel(rs1));

		table_1.setModel(DbUtils.resultSetToTableModel(rs2));
		table_2.setModel(DbUtils.resultSetToTableModel(rs3));
		}
		});
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton_1.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\Start-Menu-Search-icon.png"));
		btnNewButton_1.setForeground(new Color(51, 102, 153));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton_1.setBounds(849, 91, 150, 41);
		panel.add(btnNewButton_1);

		otxtfld = new JTextField();
		otxtfld.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		otxtfld.setColumns(10);
		otxtfld.setBackground(new Color(255, 255, 204));
		otxtfld.setBounds(603, 91, 231, 41);
		panel.add(otxtfld);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 204, 204));
		panel_1.setBounds(10, 166, 1520, 638);
		frmOwnerInfo.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(328, 54, 237, 261);
		panel_1.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\man-icon (2).png"));
		
		
		
		textField = new JTextField();
		textField.setBounds(789, 62, 462, 47);
		panel_1.add(textField);
		
	
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		textField.setBackground(new Color(255, 255, 204));
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setBounds(606, 62, 165, 47);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(51, 102, 153));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		textField_1 = new JTextField();
		textField_1.setBounds(789, 132, 231, 47);
		panel_1.add(textField_1);
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		textField_1.setBackground(new Color(255, 255, 204));
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("ID");
		lblNewLabel_3.setBounds(606, 132, 165, 47);
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setForeground(new Color(51, 102, 153));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		textField_2 = new JTextField();
		textField_2.setBounds(789, 199, 231, 47);
		panel_1.add(textField_2);
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		textField_2.setBackground(new Color(255, 255, 204));
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Contact");
		lblNewLabel_4.setBounds(606, 199, 165, 47);
		panel_1.add(lblNewLabel_4);
		lblNewLabel_4.setForeground(new Color(51, 102, 153));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		textField_3 = new JTextField();
		textField_3.setBounds(789, 268, 462, 47);
		panel_1.add(textField_3);
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		textField_3.setBackground(new Color(255, 255, 204));
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Mail");
		lblNewLabel_5.setBounds(606, 268, 165, 47);
		panel_1.add(lblNewLabel_5);
		lblNewLabel_5.setForeground(new Color(51, 102, 153));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		table.setForeground(new Color(51, 102, 153));
		table.setBackground(new Color(255, 255, 204));
		table.setBounds(24, 370, 699, 96);
		panel_1.add(table);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(728, 370, 17, 96);
		panel_1.add(scrollBar);
		
		
		JScrollBar scrollBar_2 = new JScrollBar();
		scrollBar_2.setBounds(1194, 515, 17, 96);
		panel_1.add(scrollBar_2);
		
		table_2 = new JTable();
		table_2.setForeground(new Color(51, 102, 153));
		table_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		table_2.setBackground(new Color(255, 255, 204));
		table_2.setBounds(366, 515, 826, 96);
		panel_1.add(table_2);
		
		table_1 = new JTable();
		table_1.setForeground(new Color(51, 102, 153));
		table_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		table_1.setBackground(new Color(255, 255, 204));
		table_1.setBounds(778, 371, 699, 96);
		panel_1.add(table_1);
		
		JScrollBar scrollBar_3 = new JScrollBar();
		scrollBar_3.setBounds(1481, 370, 17, 96);
		panel_1.add(scrollBar_3);
		
		JLabel lblNewLabel_4_1 = new JLabel("Flats");
		lblNewLabel_4_1.setForeground(new Color(51, 102, 153));
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4_1.setBounds(337, 332, 165, 47);
		panel_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Bunglows");
		lblNewLabel_4_1_1.setForeground(new Color(51, 102, 153));
		lblNewLabel_4_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4_1_1.setBounds(1077, 332, 165, 47);
		panel_1.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("Hostel");
		lblNewLabel_4_1_2.setForeground(new Color(51, 102, 153));
		lblNewLabel_4_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_4_1_2.setBounds(725, 476, 165, 47);
		panel_1.add(lblNewLabel_4_1_2);
		
		
		frmOwnerInfo.setVisible(true);
	}
}
