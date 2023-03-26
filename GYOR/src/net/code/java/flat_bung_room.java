package net.code.java;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

import net.proteanit.sql.DbUtils;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JScrollBar;

public class flat_bung_room {
	public String id;
	JComboBox<String> asset_list;
	private JFrame frmGetYourOwn;
	private JTextField location_text;
//	private JTable table;
	private JTable table_1;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					flat_bung_room window = new flat_bung_room();
					window.frmGetYourOwn.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public flat_bung_room() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGetYourOwn = new JFrame();
		frmGetYourOwn.setTitle("GET YOUR OWN ROOF");
//		frame.setBounds(100, 100, 1356, 777);
		frmGetYourOwn.setSize(1650,1080);
		frmGetYourOwn.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frmGetYourOwn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGetYourOwn.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 1520, 135);
		frmGetYourOwn.getContentPane().add(panel);
		panel.setBackground(new Color(51, 102, 153));
		panel.setLayout(null);
		
		
		JButton back = new JButton("");
		back.setBounds(0, 0, 55, 41);
		panel.add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Buy_sell bs = new Buy_sell();
				frmGetYourOwn.dispose();
			}
		});
		back.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\arrow-back-icon.png"));
		
		asset_list = new JComboBox<String>();
		asset_list.setForeground(new Color(51, 102, 153));
		asset_list.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		asset_list.setModel(new DefaultComboBoxModel<String>(new String[] {"Flat", "Bunglow", "Hostel"}));
		asset_list.setBounds(692, 30, 141, 30);
		panel.add(asset_list);
		
		JButton location_search = new JButton("Search Location");
		location_search.setBounds(422, 10, 200, 50);
		panel.add(location_search);
		location_search.setHorizontalAlignment(SwingConstants.LEADING);
		location_search.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\Start-Menu-Search-icon.png"));
		//		btnNewButton.setBackground(new Color(255, 255, 255));
				location_search.setForeground(new Color(51, 102, 153));
				location_search.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						 asset_search();
					}
				});
				location_search.setFont(new Font("Times New Roman", Font.PLAIN, 20));
				
				location_text = new JTextField();
				location_text.setBounds(107, 10, 309, 49);
				panel.add(location_text);
				location_text.setBackground(new Color(255, 255, 204));
				location_text.setFont(new Font("Times New Roman", Font.ITALIC, 30));
				location_text.setColumns(10);
				
				JButton btnNewButton = new JButton("Book Asset");
				btnNewButton.setHorizontalAlignment(SwingConstants.LEADING);
				btnNewButton.setForeground(new Color(51, 102, 153));
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Asset_dets ad = new Asset_dets();
					}
				});
				btnNewButton.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\Home-icon.png"));
				btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
				btnNewButton.setBounds(949, 10, 200, 52);
				panel.add(btnNewButton);
				
				JButton logout = new JButton("Logout");
				logout.setBounds(1366, 10, 144, 52);
				panel.add(logout);
				logout.setHorizontalAlignment(SwingConstants.LEADING);
				logout.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\Logout-icon.png"));
				//		btnNewButton_1.setBackground(new Color(255, 255, 255));
						logout.setForeground(new Color(51, 102, 153));
						logout.setSelectedIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\Logout-icon.png"));
						logout.setFont(new Font("Times New Roman", Font.PLAIN, 25));
						
								
								JButton owner_search = new JButton("Owner Search\r\n");
								owner_search.setBounds(1156, 10, 200, 52);
								panel.add(owner_search);
								owner_search.setHorizontalAlignment(SwingConstants.LEADING);
								owner_search.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\man-icon.png"));
								owner_search.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										Owner_info owner = new Owner_info();
									}
								});
								owner_search.setForeground(new Color(51, 102, 153));
								owner_search.setFont(new Font("Times New Roman", Font.PLAIN, 20));
						logout.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								Login_1 log = new Login_1();
								frmGetYourOwn.dispose();
							}
						});
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(51, 102, 153));
		panel_1.setBackground(new Color(204, 204, 204));
		panel_1.setBounds(10, 155, 1520, 643);
		frmGetYourOwn.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		table_1 = new JTable();
		table_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		table_1.setBackground(new Color(255, 255, 204));
		table_1.setForeground(new Color(51, 102, 153));
		table_1.setBounds(335, 157, 845, 454);
		panel_1.add(table_1);
		
		JButton show_all = new JButton("Show All");
		show_all.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				show_all();
			}
		});
		show_all.setHorizontalAlignment(SwingConstants.LEADING);
		show_all.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\Notes-icon.png"));
		show_all.setForeground(new Color(51, 102, 153));
		show_all.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		show_all.setBounds(653, 30, 219, 50);
		panel_1.add(show_all);
		
		JLabel lblNewLabel = new JLabel("Asset ID");
		lblNewLabel.setForeground(new Color(51, 102, 153));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(335, 121, 103, 26);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Owner ID");
		lblNewLabel_1.setForeground(new Color(51, 102, 153));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(465, 121, 103, 26);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Pin");
		lblNewLabel_1_1.setForeground(new Color(51, 102, 153));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(613, 121, 78, 26);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Location");
		lblNewLabel_1_1_1.setForeground(new Color(51, 102, 153));
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(711, 121, 103, 26);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Type");
		lblNewLabel_1_1_1_1.setForeground(new Color(51, 102, 153));
		lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1.setBounds(847, 121, 103, 26);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("ON");
		lblNewLabel_1_1_1_1_1.setForeground(new Color(51, 102, 153));
		lblNewLabel_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1.setBounds(946, 121, 103, 26);
		panel_1.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Price/Rent");
		lblNewLabel_1_1_1_1_1_1.setForeground(new Color(51, 102, 153));
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1_1.setBounds(1059, 121, 103, 26);
		panel_1.add(lblNewLabel_1_1_1_1_1_1);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(1182, 157, 17, 454);
		panel_1.add(scrollBar);
		
		frmGetYourOwn.setVisible(true);

	}
	
	public void asset_search() {
		int a=asset_list.getSelectedIndex();
        String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "system";
        String password = "sarang";
        String loc = location_text.getText();
	    Connection connection =null;
	    Statement stat = null;
	    ResultSet rs = null;
		if(a==0) {
			try {
				 connection = DriverManager.getConnection(dbURL, username, password);
				System.out.println("Connected");
				String sql = "SELECT * FROM Flat WHERE Location = '"+loc+"'";
				stat = connection.createStatement();
//				stat.executeUpdate(sql);
				rs = stat.executeQuery(sql);

			} 
				catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Not yet");
				e.printStackTrace();

			}
			table_1.setModel(DbUtils.resultSetToTableModel(rs));
		}
		if(a==1) {
			try {
				 connection = DriverManager.getConnection(dbURL, username, password);
				System.out.println("Connected");
				String sql = "SELECT * FROM Bunglow WHERE Location = '"+loc+"'";
				stat = connection.createStatement();

				rs = stat.executeQuery(sql);
			} 
				catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Not yet");
				e.printStackTrace();
			}
			table_1.setModel(DbUtils.resultSetToTableModel(rs));
		}
		if(a==2) {
			try {
				 connection = DriverManager.getConnection(dbURL, username, password);
				System.out.println("Connected");
				String sql = "SELECT * FROM Hostel WHERE Location = '"+loc+"'";
				stat = connection.createStatement();
//				stat.executeUpdate(sql);
				rs = stat.executeQuery(sql);
			} 
				catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Not yet");
				e.printStackTrace();

			}	
			table_1.setModel(DbUtils.resultSetToTableModel(rs));
		}
	}
	
	public void show_all() {
		int a=asset_list.getSelectedIndex();
        String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "system";
        String password = "sarang";
        String loc = location_text.getText();
	    Connection connection =null;
	    Statement stat = null;
	    ResultSet rs = null;
	    location_text.setText("");
	    
	    if(a==0) {
			try {
				 connection = DriverManager.getConnection(dbURL, username, password);
				System.out.println("Connected");
				String sql = "SELECT * FROM Flat";
				stat = connection.createStatement();
//				stat.executeUpdate(sql);
				rs = stat.executeQuery(sql);
			} 
				catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Not yet");
				e.printStackTrace();
			}
			table_1.setModel(DbUtils.resultSetToTableModel(rs));		
		}
		if(a==1) {
			try {
				 connection = DriverManager.getConnection(dbURL, username, password);
				System.out.println("Connected");
				String sql = "SELECT * FROM Bunglow";
				stat = connection.createStatement();
//				stat.executeUpdate(sql);
				rs = stat.executeQuery(sql);
			} 
				catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Not yet");
				e.printStackTrace();
			}
			table_1.setModel(DbUtils.resultSetToTableModel(rs));	
		}
		if(a==2) {
			try {
				 connection = DriverManager.getConnection(dbURL, username, password);
				System.out.println("Connected");
				String sql = "SELECT * FROM Hostel";
				stat = connection.createStatement();
//				stat.executeUpdate(sql);
				rs = stat.executeQuery(sql);
			} 
				catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Not yet");
				e.printStackTrace();
			}
			table_1.setModel(DbUtils.resultSetToTableModel(rs));	
		}
	}
}
