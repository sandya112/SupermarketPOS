package javaGUI;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.SwingConstants;

public class Start_main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start_main frame = new Start_main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Start_main() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/javaGUI/shopping-cart.png")));
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 2000, 1200);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 255, 0));
		panel.setBounds(-13, 102, 966, 908);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home second= new Home();
				second.setVisible(true);
				
			}
		});
		btnNewButton.setBackground(new Color(255, 250, 250));
		btnNewButton.setIcon(new ImageIcon(Start_main.class.getResource("/javaGUI/manager (1).png")));
		btnNewButton.setBounds(296, 259, 387, 280);
		panel.add(btnNewButton);
		
		JLabel lblAdministrator = new JLabel("LOGIN AS ADMIN");
		lblAdministrator.setForeground(new Color(255, 250, 250));
		lblAdministrator.setFont(new Font("Tempus Sans ITC", Font.BOLD, 35));
		lblAdministrator.setBounds(331, 563, 315, 52);
		panel.add(lblAdministrator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 127, 80));
		panel_1.setBounds(965, 102, 959, 908);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCustomerPos = new JLabel("OPEN CUSTOMER POS");
		lblCustomerPos.setForeground(new Color(255, 250, 250));
		lblCustomerPos.setBounds(287, 558, 387, 70);
		panel_1.add(lblCustomerPos);
		lblCustomerPos.setFont(new Font("Tempus Sans ITC", Font.BOLD, 35));
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame frame= new JFrame("EXIT");
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","chicken Dinner supermarket system",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					    System.exit(0);
				}
			}
		});
		btnNewButton_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton_1.setBackground(new Color(255, 127, 80));
		btnNewButton_1.setIcon(new ImageIcon(Start_main.class.getResource("/javaGUI/switch.png")));
		btnNewButton_1.setBounds(874, 13, 61, 49);
		panel_1.add(btnNewButton_1);
		
		JButton button = new JButton("");
		button.setBounds(287, 264, 387, 281);
		panel_1.add(button);
		button.setBorder(new EmptyBorder(0, 0, 0, 0));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mainscreen second= new mainscreen();
				second.setVisible(true);
			}
		});
		button.setBackground(new Color(255, 250, 250));
		button.setIcon(new ImageIcon(Start_main.class.getResource("/javaGUI/group (1).png")));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 206, 209));
		panel_2.setBounds(0, 0, 1924, 101);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblChickenDinnerSupermarket = new JLabel("CHICKEN DINNER SUPERMARKET SYSTEM");
		lblChickenDinnerSupermarket.setForeground(new Color(255, 250, 250));
		lblChickenDinnerSupermarket.setFont(new Font("Verdana Pro", Font.BOLD, 40));
		lblChickenDinnerSupermarket.setBounds(551, 13, 976, 75);
		panel_2.add(lblChickenDinnerSupermarket);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Start_main.class.getResource("/javaGUI/market.png")));
		label.setBounds(468, 13, 71, 75);
		panel_2.add(label);
	}
}
