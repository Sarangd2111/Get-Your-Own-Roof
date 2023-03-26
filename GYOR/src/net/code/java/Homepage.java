package net.code.java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Homepage {

	private JFrame frmHomepage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage window = new Homepage();
					window.frmHomepage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Homepage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHomepage = new JFrame();
		frmHomepage.setTitle("GET YOUR OWN ROOF");
//		frame.setBounds(100, 100, 1352, 824);
		frmHomepage.setSize(1650,1080);
		frmHomepage.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frmHomepage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHomepage.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1586, 814);
		frmHomepage.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		btnNewButton.setForeground(new Color(51, 102, 153));
		btnNewButton.setBackground(UIManager.getColor("Button.background"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_Signup ls = new Login_Signup();
				frmHomepage.dispose();
			}
		});
		btnNewButton.setBounds(676, 528, 130, 50);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Get Your Own Roof");
		lblNewLabel_1.setForeground(new Color(51, 102, 153));
		lblNewLabel_1.setBackground(new Color(255, 255, 204));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 80));
		lblNewLabel_1.setBounds(431, 320, 674, 129);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("Welcome to");
		lblNewLabel_4.setForeground(new Color(51, 102, 153));
		lblNewLabel_4.setBackground(new Color(255, 255, 153));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 50));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(-26, -26, 349, 121);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("Where you find your peace of living.......");
		lblNewLabel_6.setForeground(new Color(51, 102, 153));
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel_6.setBounds(478, 408, 564, 110);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setForeground(new Color(51, 102, 153));
		lblNewLabel_3.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\4273977.jpg"));
		lblNewLabel_3.setBounds(-58, 0, 1644, 814);
		panel.add(lblNewLabel_3);

	}
}
