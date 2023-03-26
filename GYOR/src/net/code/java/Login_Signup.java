package net.code.java;

import java.awt.*;



import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
//import javax.swing.JSeparator;
//import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
//import java.awt.SystemColor;
//import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
//import javax.swing.JLayeredPane;

public class Login_Signup {

	private JFrame frmLoginsignup;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)  {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Signup window = new Login_Signup();
					window.frmLoginsignup.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login_Signup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLoginsignup = new JFrame();
		frmLoginsignup.setTitle("GET YOUR OWN ROOF");
		frmLoginsignup.getContentPane().setBackground(new Color(255, 255, 255));
//		frame.setBounds(100, 100, 1357, 785);
		frmLoginsignup.setSize(1650,1080);
		frmLoginsignup.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frmLoginsignup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLoginsignup.getContentPane().setLayout(null);
		

		
		JLabel alredy_login = new JLabel("Already Have An Account... ");
		alredy_login.setBounds(165, 172, 586, 57);
		alredy_login.setForeground(new Color(51, 102, 153));
		alredy_login.setFont(new Font("Times New Roman", Font.PLAIN, 45));
		frmLoginsignup.getContentPane().add(alredy_login);
		
		JButton Login_button = new JButton("Login");
		Login_button.setHorizontalAlignment(SwingConstants.LEADING);
		Login_button.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\Login-icon.png"));
		Login_button.setBounds(325, 259, 140, 43);
		Login_button.setForeground(new Color(51, 102, 153));
//		Login_button.setBackground(new Color(255, 255, 255));
		Login_button.setFont(new Font("Times New Roman", Font.BOLD, 25));
		Login_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_1 login = new Login_1();
				frmLoginsignup.dispose();
//				login.setVisible(true);
			}
		});
		frmLoginsignup.getContentPane().add(Login_button);
		
		JLabel Signup_label = new JLabel("Dont Have An Account?");
		Signup_label.setBounds(923, 172, 480, 57);
		Signup_label.setForeground(new Color(51, 102, 153));
		Signup_label.setFont(new Font("Times New Roman", Font.PLAIN, 45));
		Signup_label.setBackground(Color.WHITE);
		frmLoginsignup.getContentPane().add(Signup_label);
		
		JButton Signup_button = new JButton("Signup");
		Signup_button.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\signup-icon.png"));
		Signup_button.setHorizontalAlignment(SwingConstants.LEADING);
		Signup_button.setBounds(1065, 259, 149, 41);
//		Signup_button.setBackground(new Color(255, 255, 255));
		Signup_button.setForeground(new Color(51, 102, 153));
		Signup_button.setFont(new Font("Times New Roman", Font.BOLD, 26));
		Signup_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Signup sign = new Signup();
				frmLoginsignup.dispose();
				//				signup.setVisible(true);
			}
		});
		frmLoginsignup.getContentPane().add(Signup_button);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 102, 153));
		panel.setBounds(10, 10, 1520, 129);
		frmLoginsignup.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel Head = new JLabel("Get Your Own Roof");
		Head.setBounds(543, 23, 558, 75);
		panel.add(Head);
		Head.setBackground(new Color(0, 102, 51));
		Head.setForeground(new Color(255, 255, 102));
		Head.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 65));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 204, 204));
		panel_1.setBounds(10, 149, 1520, 654);
		frmLoginsignup.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(358, 92, 812, 646);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\106a8bdbace0bdc5f17da04932387da8.png"));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(1069, 328, 0, 0);
		panel_1.add(lblNewLabel_1);
			frmLoginsignup.setVisible(true);
	
	}
}
