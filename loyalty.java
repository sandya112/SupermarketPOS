package javaGUI;

import java.util.Date;
import java.util.regex.*;
import java.awt.BorderLayout;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ImageIcon;
import java.awt.ComponentOrientation;
import javax.swing.border.LineBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.SpringLayout;
import java.awt.Cursor;

public class loyalty extends JFrame {

	private JPanel contentPane;
	private JTextField fnametxt;
	private JTextField lnametxt;
	private JTextField nictxt;
	private JTextField phonenumbertxt;
	private JTextField emailaddresstxt;
	private JTextField textField_5;
	private JTextField txtDate;
	private JTextField textField_5_1;
	private JTextField order1txt;

	/**
	 * Launch the application.
	 */
	
	public void showDate() {
		Date d =new Date();
		SimpleDateFormat s=new SimpleDateFormat("dd-MM-yyyy");
	    textField_5_1.setText(s.format(d));
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loyalty frame = new loyalty();
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
	public loyalty() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/javaGUI/shopping-cart.png")));
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 2000, 1200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(0, 0, 2, 0));
		panel.setBackground(new Color(0, 206, 209));
		panel.setBounds(0, 0, 1924, 1014);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JLabel lblApplicationForLoyalty = new JLabel("Application For Loyalty Card");
		lblApplicationForLoyalty.setBounds(649, 13, 854, 83);
		lblApplicationForLoyalty.setFont(new Font("Dubai", Font.BOLD, 70));
		lblApplicationForLoyalty.setForeground(new Color(255, 250, 250));
		lblApplicationForLoyalty.setBackground(new Color(255, 255, 255));
		panel.add(lblApplicationForLoyalty);
		
		
        txtDate = new JTextField();
        txtDate.setBounds(1660, 16, 87, 25);
        txtDate.setText("Date :");
        txtDate.setBorder(new EmptyBorder(0, 0, 0, 0));
        txtDate.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDate.setForeground(new Color(0, 0, 0));
        txtDate.setBackground(new Color(0, 206, 209));
		panel.add(txtDate);
		txtDate.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtDate.setColumns(10);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(1703, 13, 56, 16);
		panel.add(lblDate);
		
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(1431, 278, 387, 61);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_1.setForeground(new Color(255, 0, 0));
		panel.add(label_1);
		
		fnametxt = new JTextField();
		fnametxt.setBounds(897, 283, 512, 56);
		fnametxt.setHorizontalAlignment(SwingConstants.CENTER);
		fnametxt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		fnametxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				String PATTERN="^[a-zA-Z]+$";
				Pattern patt=Pattern.compile(PATTERN);
				Matcher match=patt.matcher(fnametxt.getText());
				if(match.matches()) {
					label_1.setText(null);
					
					
				}
				else {
					label_1.setText("Firstname format is incorrect");
				}
			}
		});
		fnametxt.setForeground(new Color(0, 0, 0));
		fnametxt.setBackground(new Color(255, 250, 250));
		fnametxt.setBorder(new EmptyBorder(0, 0, 0, 0));
		fnametxt.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panel.add(fnametxt);
		fnametxt.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("First name :");
		lblNewLabel.setBounds(613, 283, 255, 56);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		
		JLabel lblOtherName = new JLabel("Last name :");
		lblOtherName.setBounds(613, 400, 242, 61);
		lblOtherName.setForeground(new Color(0, 0, 0));
		panel.add(lblOtherName);
		lblOtherName.setFont(new Font("Tahoma", Font.BOLD, 40));
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(1431, 400, 435, 61);
		label_2.setForeground(new Color(255, 0, 0));
		label_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(label_2);
		
		lnametxt = new JTextField();
		lnametxt.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		lnametxt.setSelectedTextColor(new Color(255, 255, 255));
		lnametxt.setToolTipText("");
		lnametxt.setBounds(897, 400, 512, 61);
		lnametxt.setBorder(new EmptyBorder(0, 0, 0, 0));
		lnametxt.setHorizontalAlignment(SwingConstants.CENTER);
		lnametxt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lnametxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
					String PATT="^[a-zA-Z]+$";
					Pattern patt=Pattern.compile(PATT);
					Matcher mat=patt.matcher(lnametxt.getText());
					if(mat.matches()) {
						label_2.setText(null);
						
					}
					else {
						label_2.setText("Lastname format is incorrect");
					}
				}
			
		});
		panel.add(lnametxt);
		lnametxt.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("NIC :");
		lblNewLabel_1.setBounds(746, 535, 114, 45);
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		
		JLabel label_7 = new JLabel("");
		label_7.setBounds(1431, 524, 446, 56);
		label_7.setHorizontalAlignment(SwingConstants.LEFT);
		label_7.setForeground(new Color(255, 0, 0));
		label_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(label_7);
		
		nictxt = new JTextField();
		nictxt.setHorizontalAlignment(SwingConstants.CENTER);
		nictxt.setBounds(897, 524, 512, 56);
		nictxt.setBorder(new EmptyBorder(0, 0, 0, 0));
		nictxt.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					String PATTERN="^[A-Z]([0-9]{2})([0-9]{2})([0-9]{2})[0-9]{6}[A-Z]$";
				    Pattern patt=Pattern.compile(PATTERN);
				    Matcher match=patt.matcher(nictxt.getText());
				    if(!match.matches()) {
				    	label_7.setText("NIC format is incorrect e.g : D160289784495A");
				    }
				    else {
				    	label_7.setText(null);
				    }
			}
		});
		nictxt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(nictxt);
		nictxt.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Phone Number :");
		lblNewLabel_2.setBounds(538, 641, 347, 56);
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 40));
		
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(1416, 641, 481, 56);
		label_5.setForeground(new Color(255, 0, 0));
		label_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel.add(label_5);
		
		phonenumbertxt = new JTextField();
		phonenumbertxt.setHorizontalAlignment(SwingConstants.CENTER);
		phonenumbertxt.setBounds(897, 641, 512, 56);
		phonenumbertxt.setBorder(new EmptyBorder(0, 0, 0, 0));
		phonenumbertxt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		phonenumbertxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String PATTERN="[0-9]{7,8}";
			    Pattern patt=Pattern.compile(PATTERN);
			    Matcher match=patt.matcher(phonenumbertxt.getText());
			    if(!match.matches()) {
			    	label_5.setText("Phone number is incorrect e.g : 577 12345 or 444 1234");
			    }
			    else {
			    	label_5.setText(null);
			    }
			}
		});
		panel.add(phonenumbertxt);
		phonenumbertxt.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Email address :");
		lblNewLabel_3.setBounds(552, 768, 310, 45);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 40));
		
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(1431, 757, 446, 51);
		label_4.setForeground(new Color(255, 0, 0));
		label_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(label_4);
		
		
		emailaddresstxt = new JTextField();
		emailaddresstxt.setHorizontalAlignment(SwingConstants.CENTER);
		emailaddresstxt.setBounds(897, 757, 512, 56);
		emailaddresstxt.setBorder(new EmptyBorder(0, 0, 0, 0));
		emailaddresstxt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		emailaddresstxt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		emailaddresstxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String PATTERN="^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
			    Pattern patt=Pattern.compile(PATTERN);
			    Matcher match=patt.matcher(emailaddresstxt.getText());
			    if(!match.matches()) {
			    	label_4.setText("Email format is incorrect e.g : Admin@gmail.com");
			    }
			    else {
			    	label_4.setText(null);
			    }
			}
		});
		panel.add(emailaddresstxt);
		emailaddresstxt.setColumns(10);
		JButton btnClear = new JButton("CLEAR");
		btnClear.setBounds(897, 858, 233, 61);
		btnClear.setBackground(new Color(255, 127, 80));
		btnClear.setForeground(new Color(255, 250, 250));
		panel.add(btnClear);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 45));
		
		JButton btnSubmit = new JButton("APPLY");
		btnSubmit.setBounds(1191, 858, 223, 61);
		btnSubmit.setBackground(new Color(255, 127, 80));
		btnSubmit.setForeground(new Color(255, 250, 250));
		panel.add(btnSubmit);
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 45));
		
		JButton btnBack_1 = new JButton("");
		btnBack_1.setForeground(new Color(0, 0, 0));
		btnBack_1.setBounds(0, 0, 64, 41);
		btnBack_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnBack_1.setBackground(new Color(0, 206, 209));
		btnBack_1.setIcon(new ImageIcon(loyalty.class.getResource("/javaGUI/left-arrow (1).png")));
		panel.add(btnBack_1);
		btnBack_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel label = new JLabel("");
		label.setBounds(0, 102, 526, 567);
		label.setIcon(new ImageIcon(loyalty.class.getResource("/javaGUI/ad.png")));
		panel.add(label);
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(1467, 409, 248, 52);
		label_6.setForeground(new Color(255, 0, 0));
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(label_6);
		
		
		
		textField_5_1 = new JTextField();
		textField_5_1.setForeground(new Color(0, 0, 0));
		textField_5_1.setBounds(1759, 13, 153, 31);
		textField_5_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		textField_5_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		textField_5_1.setCaretColor(new Color(0, 0, 0));
		textField_5_1.setBackground(new Color(0, 206, 209));
		panel.add(textField_5_1);
		textField_5_1.setColumns(10);
		
		JLabel lblId = new JLabel("OrderId  :");
		lblId.setBounds(661, 168, 198, 57);
		lblId.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblId.setForeground(new Color(0, 0, 0));
		panel.add(lblId);
		
		order1txt =new JTextField();
		order1txt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
			}
		});
		order1txt.setBounds(897, 168, 512, 56);
		order1txt.setBorder(new EmptyBorder(0, 0, 0, 0));
		order1txt.setHorizontalAlignment(SwingConstants.CENTER);
		order1txt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(order1txt);
		order1txt.setColumns(10);
		
		JLabel lblOnlyEligibleFor = new JLabel("Only eligible for purchases of more than RS 15000 on a single order receipt");
		lblOnlyEligibleFor.setBounds(697, 104, 771, 25);
		lblOnlyEligibleFor.setHorizontalAlignment(SwingConstants.CENTER);
		lblOnlyEligibleFor.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblOnlyEligibleFor.setForeground(new Color(148, 0, 211));
		panel.add(lblOnlyEligibleFor);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(1431, 163, 351, 61);
		lblNewLabel_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			}
		});
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		panel.add(lblNewLabel_4);
		
		JLabel lblBack = new JLabel("BACK");
		lblBack.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBack.setHorizontalAlignment(SwingConstants.CENTER);
		lblBack.setBounds(0, 41, 64, 16);
		panel.add(lblBack);
		
		
		
		btnClear.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				fnametxt.setText(null);
				lnametxt.setText(null);
				nictxt.setText(null);
				phonenumbertxt.setText(null);
				emailaddresstxt.setText(null);
			}
		});
		showDate();
		
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainscreen second= new mainscreen();
				second.setVisible(true);
			}
		});
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(order1txt.getText().trim().isEmpty() || fnametxt.getText().trim().isEmpty() || lnametxt.getText().trim().isEmpty() || nictxt.getText().trim().isEmpty()  || phonenumbertxt.getText().trim().isEmpty()  || emailaddresstxt.getText().trim().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"Please fill in all the fields!","Error",JOptionPane.ERROR_MESSAGE);
				}
				
				String orderid1 = order1txt.getText();
			
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/winnerchickendinner?serverTimezone=UTC","root",""); 
					PreparedStatement pst = con.prepareStatement("SELECT amount from ordertable WHERE orderId=?");
					pst.setString(1, orderid1);
					ResultSet rs= pst.executeQuery();
			    
					if(rs.next()==false)
					{
						JOptionPane.showMessageDialog(loyalty.this,"ORDERID not found! Please verify the ORDERID you have entered ");
						order1txt.setText(null);
						fnametxt.setText(null);
						lnametxt.setText(null);
						nictxt.setText(null);
						phonenumbertxt.setText(null);
						emailaddresstxt.setText(null);
						
						
					}		
					else {
				
					String Samount =rs.getString("amount");
					float amount = Float.parseFloat(Samount);
					
    
							if(amount>15000.0) {
                	 
					String orderID = order1txt.getText().toString();
					String Fname = fnametxt.getText().toString();
					String Lname = lnametxt.getText().toString();
					String nic = nictxt.getText().toString();
					String sPhonenumber   = phonenumbertxt.getText().toString();
					int Phonenumber=Integer.parseInt(sPhonenumber);
					String Email = emailaddresstxt.getText().toString();
					Database_access.loyalitydb.save(orderID,Fname,Lname,nic,Phonenumber,Email);

						UIManager.put("OptionPane.background",Color.decode("#FFE4B5"));
						UIManager.getLookAndFeelDefaults().put("Panel.background", Color.decode("#FFE4B5"));
						JOptionPane.showMessageDialog(loyalty.this,"Your loyalty request has been sent, we will try our best to contact you within 24 hours. ");
					
						order1txt.setText(null);
						fnametxt.setText(null);
						lnametxt.setText(null);
						nictxt.setText(null);
						phonenumbertxt.setText(null);
						emailaddresstxt.setText(null);
							}
					   
					   else
					   {
						   JOptionPane.showMessageDialog(loyalty.this,"Sorry your order is not more than RS 15000");
							order1txt.setText(null);
							fnametxt.setText(null);
							lnametxt.setText(null);
							nictxt.setText(null);
							phonenumbertxt.setText(null);
							emailaddresstxt.setText(null);
					   }
				}
				}
					catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				
			}	
			
);
}
	}