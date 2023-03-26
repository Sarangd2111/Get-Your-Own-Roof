package net.code.java;

import java.awt.EventQueue;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JPanel;

public class T_C {

	private JFrame frameT;
	private JScrollPane scrollPane_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					T_C window = new T_C();
					window.frameT.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public T_C() {
		initialize();
	}

	/**
	 * Initialize the contents of the frameT.
	 */
	private void initialize() {
		frameT = new JFrame();
		frameT.setTitle("Terms and conditions");
		frameT.getContentPane().setBackground(new Color(255, 255, 255));
//		frameT.setBounds(100, 100, 1353, 789);
		frameT.setSize(1650,1080);
		frameT.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frameT.setDefaultCloseOperation(frameT.EXIT_ON_CLOSE);
		frameT.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("TERMS & CONDITIONS :");
		lblNewLabel_1.setForeground(new Color(51, 102, 153));
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(14, 4, 347, 47);
		frameT.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("ACCOUNT REGISTRATION :");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_4.setForeground(new Color(255, 255, 204));
		lblNewLabel_4.setBounds(10, 111, 395, 47);
		frameT.getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_2_1 = new JLabel("=> To use the Service Users must register or create a User account, providing all required data or information in a complete and truthful manner.\r\n");
		lblNewLabel_2_1.setForeground(new Color(255, 255, 204));
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(10, 147, 1174, 35);
		frameT.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Failure to do so will cause unavailability of the Service.");
		lblNewLabel_2_1_1.setForeground(new Color(255, 255, 204));
		lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2_1_1.setBounds(37, 170, 452, 35);
		frameT.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("=> Users are responsible for keeping their login credentials confidential and safe.");
		lblNewLabel_2_1_2.setForeground(new Color(255, 255, 204));
		lblNewLabel_2_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2_1_2.setBounds(10, 202, 709, 35);
		frameT.getContentPane().add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("For this reason, Users are also required to choose passwords that meet the highest standards of strength permitted by this Application.");
		lblNewLabel_2_1_2_1.setForeground(new Color(255, 255, 204));
		lblNewLabel_2_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2_1_2_1.setBounds(37, 228, 1070, 35);
		frameT.getContentPane().add(lblNewLabel_2_1_2_1);
		
		JLabel lblNewLabel_2_1_2_2 = new JLabel("=> By registering, Users agree to be fully responsible for all activities that occur under their username and password.");
		lblNewLabel_2_1_2_2.setForeground(new Color(255, 255, 204));
		lblNewLabel_2_1_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2_1_2_2.setBounds(10, 258, 965, 35);
		frameT.getContentPane().add(lblNewLabel_2_1_2_2);
		
		JLabel lblNewLabel_4_1 = new JLabel("ACCOUNT TERMINATION :");
		lblNewLabel_4_1.setForeground(new Color(51, 102, 153));
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_4_1.setBounds(14, 293, 395, 47);
		frameT.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_2_1_2_2_1 = new JLabel("=> Users can terminate their account and stop using the Service at any time by doing the following:\r\n");
		lblNewLabel_2_1_2_2_1.setForeground(new Color(51, 102, 153));
		lblNewLabel_2_1_2_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2_1_2_2_1.setBounds(10, 329, 965, 35);
		frameT.getContentPane().add(lblNewLabel_2_1_2_2_1);
		
		JLabel lblNewLabel_2_1_2_2_1_1 = new JLabel("By directly contacting the Owner at the contact details provided in this document.");
		lblNewLabel_2_1_2_2_1_1.setForeground(new Color(51, 102, 153));
		lblNewLabel_2_1_2_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2_1_2_2_1_1.setBounds(35, 351, 709, 35);
		frameT.getContentPane().add(lblNewLabel_2_1_2_2_1_1);
		
		JLabel lblNewLabel_2_1_2_2_1_1_1 = new JLabel("The suspension or deletion of User accounts shall not entitle Users to any claims for compensation, damages or reimbursement.");
		lblNewLabel_2_1_2_2_1_1_1.setForeground(new Color(51, 102, 153));
		lblNewLabel_2_1_2_2_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2_1_2_2_1_1_1.setBounds(35, 374, 1019, 35);
		frameT.getContentPane().add(lblNewLabel_2_1_2_2_1_1_1);
		
		JLabel lblNewLabel_2_1_2_2_1_1_1_1 = new JLabel("The Owner reserves the right, to suspend or delete at any time and without notice, User accounts which it deems offensive or in violation of these Terms.");
		lblNewLabel_2_1_2_2_1_1_1_1.setForeground(new Color(51, 102, 153));
		lblNewLabel_2_1_2_2_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2_1_2_2_1_1_1_1.setBounds(37, 397, 1219, 35);
		frameT.getContentPane().add(lblNewLabel_2_1_2_2_1_1_1_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("SOFTWARE LICENSE :");
		lblNewLabel_4_1_1.setForeground(new Color(255, 255, 204));
		lblNewLabel_4_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_4_1_1.setBounds(16, 438, 395, 47);
		frameT.getContentPane().add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_2_1_2_2_1_2 = new JLabel("=> Any intellectual or property rights, and any other exclusive rights on software or technical applications embedded in Application are held its licensors.");
		lblNewLabel_2_1_2_2_1_2.setForeground(new Color(255, 255, 204));
		lblNewLabel_2_1_2_2_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2_1_2_2_1_2.setBounds(10, 474, 1246, 35);
		frameT.getContentPane().add(lblNewLabel_2_1_2_2_1_2);
		
		JLabel lblNewLabel_2_1_2_2_1_2_1 = new JLabel("=> All rights and license grants to Users shall immediately terminate upon any termination or expiration of the Agreement.");
		lblNewLabel_2_1_2_2_1_2_1.setForeground(new Color(255, 255, 204));
		lblNewLabel_2_1_2_2_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2_1_2_2_1_2_1.setBounds(10, 495, 1246, 35);
		frameT.getContentPane().add(lblNewLabel_2_1_2_2_1_2_1);
		
		JLabel lblNewLabel_2_1_2_2_1_2_1_1 = new JLabel("=> The User may download, install, use and run the software on one device.");
		lblNewLabel_2_1_2_2_1_2_1_1.setForeground(new Color(255, 255, 204));
		lblNewLabel_2_1_2_2_1_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2_1_2_2_1_2_1_1.setBounds(10, 519, 632, 35);
		frameT.getContentPane().add(lblNewLabel_2_1_2_2_1_2_1_1);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("PRIVACY POLICY :");
		lblNewLabel_4_1_1_1.setForeground(new Color(51, 102, 153));
		lblNewLabel_4_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_4_1_1_1.setBounds(20, 574, 395, 47);
		frameT.getContentPane().add(lblNewLabel_4_1_1_1);
		
		JLabel lblNewLabel_2_1_2_2_1_2_1_2_1 = new JLabel("=> No user have access to another user's private credentials.");
		lblNewLabel_2_1_2_2_1_2_1_2_1.setForeground(new Color(51, 102, 153));
		lblNewLabel_2_1_2_2_1_2_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2_1_2_2_1_2_1_2_1.setBounds(10, 607, 1246, 35);
		frameT.getContentPane().add(lblNewLabel_2_1_2_2_1_2_1_2_1);
		
		JLabel lblNewLabel_2_1_2_2_1_2_1_2 = new JLabel("=> To learn more about the use of their Personal Data, Users may refer to the privacy policy of this Application.");
		lblNewLabel_2_1_2_2_1_2_1_2.setForeground(new Color(51, 102, 153));
		lblNewLabel_2_1_2_2_1_2_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2_1_2_2_1_2_1_2.setBounds(10, 628, 1246, 35);
		frameT.getContentPane().add(lblNewLabel_2_1_2_2_1_2_1_2);
		
		JButton btnNewButton = new JButton("Back to Signup page");
		btnNewButton.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\arrow-back-icon.png"));
		btnNewButton.setHorizontalAlignment(SwingConstants.LEADING);
//		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameT.dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton.setBounds(598, 724, 243, 40);
		frameT.getContentPane().add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 204));
		panel.setBounds(10, 8, 1520, 104);
		frameT.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("=> Single or additional conditions of use or access may apply in specific scenarios and in such cases are additionally indicated within this document.");
		lblNewLabel_2.setBounds(10, 37, 1199, 35);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2.setForeground(new Color(51, 102, 153));
		
		JLabel lblNewLabel_3 = new JLabel("=> By using this Application, Users confirm to meet the following requirements:\r\n"
				+ "There are no restrictions for Users in terms of being Buyer or Seller.");
		lblNewLabel_3.setBounds(10, 63, 1193, 35);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_3.setForeground(new Color(51, 102, 153));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 102, 153));
		panel_1.setBounds(10, 117, 1520, 174);
		frameT.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(204, 204, 204));
		panel_2.setBounds(10, 299, 1520, 133);
		frameT.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(51, 102, 153));
		panel_3.setBounds(10, 443, 1520, 127);
		frameT.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(204, 204, 204));
		panel_4.setBounds(10, 580, 1520, 110);
		frameT.getContentPane().add(panel_4);

		frameT.setVisible(true);
	}
}
