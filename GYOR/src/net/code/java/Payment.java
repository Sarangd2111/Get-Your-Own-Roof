package net.code.java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Payment {

	private JFrame frmPaymentPortal;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JTextField textField_2;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payment window = new Payment();
					window.frmPaymentPortal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Payment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPaymentPortal = new JFrame();
		frmPaymentPortal.setTitle("Payment Portal");
		frmPaymentPortal.setBounds(100, 100, 1236, 772);
		frmPaymentPortal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPaymentPortal.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 102, 153));
		panel.setBounds(10, 10, 1202, 166);
		frmPaymentPortal.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Payment Portal");
		lblNewLabel.setForeground(new Color(255, 255, 204));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 45));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(423, 47, 344, 66);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPaymentPortal.dispose();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\arrow-back-icon.png"));
		btnNewButton_1.setBounds(0, 0, 43, 36);
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 204, 204));
		panel_1.setBounds(10, 186, 1202, 539);
		frmPaymentPortal.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Pay");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Asset Booked Successfully. You can now contact its owner for further details... !!");
				flat_bung_room fbh = new flat_bung_room();
				frmPaymentPortal.dispose();

			}
		});
		btnNewButton.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\Cash-icon.png"));
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton.setBounds(476, 438, 202, 44);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Card Number");
		lblNewLabel_1.setForeground(new Color(51, 102, 153));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(355, 135, 186, 44);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 204));
		textField.setBounds(551, 135, 325, 44);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name");
		lblNewLabel_1_1.setForeground(new Color(51, 102, 153));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(355, 205, 186, 44);
		panel_1.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(255, 255, 204));
		textField_1.setBounds(551, 208, 325, 44);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("CVV");
		lblNewLabel_1_1_1.setForeground(new Color(51, 102, 153));
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_1_1_1.setBounds(355, 279, 186, 44);
		panel_1.add(lblNewLabel_1_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(749, 240, -96, 27);
		panel_1.add(passwordField);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Amount");
		lblNewLabel_1_1_1_1.setForeground(new Color(51, 102, 153));
		lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_1_1_1_1.setBounds(355, 348, 186, 44);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(255, 255, 204));
		textField_2.setBounds(551, 348, 242, 44);
		panel_1.add(textField_2);
		
		JLabel lblNewLabel_2 = new JLabel("Payment Details");
		lblNewLabel_2.setForeground(new Color(51, 102, 153));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblNewLabel_2.setBounds(395, 28, 376, 57);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\paycard.png"));
		lblNewLabel_3.setBounds(292, 135, 49, 39);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("");
		lblNewLabel_3_1_1.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\Cash-icon (1).png"));
		lblNewLabel_3_1_1.setBounds(296, 350, 49, 39);
		panel_1.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("");
		lblNewLabel_3_1_2.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\name-card-icon.png"));
		lblNewLabel_3_1_2.setBounds(292, 201, 53, 51);
		panel_1.add(lblNewLabel_3_1_2);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBackground(new Color(255, 255, 204));
		passwordField_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		passwordField_1.setBounds(551, 279, 127, 44);
		panel_1.add(passwordField_1);
		
		JLabel lblNewLabel_3_1_2_1 = new JLabel("");
		lblNewLabel_3_1_2_1.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\cvv.png"));
		lblNewLabel_3_1_2_1.setBounds(292, 276, 53, 51);
		panel_1.add(lblNewLabel_3_1_2_1);
		
		frmPaymentPortal.setVisible(true);
	}
}
