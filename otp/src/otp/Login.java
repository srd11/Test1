package otp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField tx1;
	private JTextField tx2;
	private JTextField tx3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tx1 = new JTextField();
		tx1.setToolTipText("Enter mobile number");
		tx1.setBounds(231, 57, 86, 20);
		contentPane.add(tx1);
		tx1.setColumns(10);
		
		tx2 = new JTextField();
		tx2.setBounds(248, 160, 86, 20);
		contentPane.add(tx2);
		tx2.setColumns(10);
		
		tx3 = new JTextField();
		tx3.setBounds(270, 213, 86, 20);
		contentPane.add(tx3);
		tx3.setColumns(10);
		
		JButton b1 = new JButton("Send OTP");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		b1.setBounds(132, 104, 89, 23);
		contentPane.add(b1);
		
		JLabel lblNewLabel = new JLabel("Enter Mobile Number");
		lblNewLabel.setBounds(53, 60, 114, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter OTP");
		lblNewLabel_1.setBounds(49, 163, 61, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton b2 = new JButton("New button");
		b2.setBounds(143, 227, 89, 23);
		contentPane.add(b2);
	}
}
