package net.code.java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JToolBar;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;

public class Buy_sell {

	private JFrame frmBuyOrSell;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buy_sell window = new Buy_sell();
					window.frmBuyOrSell.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Buy_sell() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBuyOrSell = new JFrame();
		frmBuyOrSell.setTitle("GET YOUR OWN ROOF");
		frmBuyOrSell.setBounds(100, 100, 768, 523);
		frmBuyOrSell.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBuyOrSell.getContentPane().setLayout(null);
		
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(new Color(204, 204, 204));
		panel_1.setBounds(10, 141, 734, 335);
		frmBuyOrSell.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Sell/Rent");
		btnNewButton_1.setBounds(145, 173, 154, 55);
		panel_1.add(btnNewButton_1);
		btnNewButton_1.setForeground(new Color(0, 102, 153));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				register_fbh rfbh = new register_fbh();
				frmBuyOrSell.dispose();
			}
		});
		
		JButton btnNewButton = new JButton("Buy/Lease");
		btnNewButton.setBounds(434, 173, 160, 55);
		panel_1.add(btnNewButton);
		btnNewButton.setForeground(new Color(0, 102, 153));
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		JButton btnNewButton_2 = new JButton("Logout");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_1 log = new Login_1();
				frmBuyOrSell.dispose();
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\Logout-icon.png"));
		btnNewButton_2.setForeground(new Color(51, 102, 153));
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btnNewButton_2.setBounds(283, 261, 178, 43);
		panel_1.add(btnNewButton_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setIcon(new ImageIcon("F:\\PCCOE\\Sem 4\\Project\\images\\handshake-3312.png"));
		lblNewLabel_2_2.setBounds(283, 10, 160, 160);
		panel_1.add(lblNewLabel_2_2);
				
				Panel panel = new Panel();
				panel.setBackground(new Color(51, 102, 153));
				panel.setBounds(10, 10, 734, 125);
				frmBuyOrSell.getContentPane().add(panel);
				panel.setLayout(null);
				
						
						JLabel lblNewLabel_1 = new JLabel("Want to Buy/Lease or Sell/Rent ?");
						lblNewLabel_1.setBounds(89, 37, 551, 47);
						panel.add(lblNewLabel_1);
						lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
						lblNewLabel_1.setForeground(new Color(255, 255, 204));
						lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flat_bung_room fbh = new flat_bung_room();
				frmBuyOrSell.dispose();
			}
		});
		
	frmBuyOrSell.setVisible(true);
	}
}
