package com.swing;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class AdminLogin extends JFrame {
	static AdminLogin frame;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AdminLogin();
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
	public AdminLogin() {
		setTitle("Admin Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Name :");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel.setBounds(73, 73, 115, 48);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(243, 82, 170, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password :");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 21));
		lblNewLabel_1.setBounds(73, 148, 115, 52);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Login");
		
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnNewButton.setBounds(197, 235, 97, 48);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String name=textField.getText();
			char ch[]=passwordField.getPassword();
			String password=String.valueOf(ch);
			if(name.equals("admin")&&password.equals("admin123")){
				String s[]={};
				
				
				AdminActivities.main(s);
				frame.dispose();
				
				
			}else{
				JOptionPane.showMessageDialog(AdminLogin.this,"Sorry, username or password error!");
				textField.setText("");passwordField.setText("");
			}
			}
		});
		
		JLabel lblNewLabel_2 = new JLabel("Admin Login");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		lblNewLabel_2.setBounds(168, 10, 245, 25);
		contentPane.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(243, 160, 170, 38);
		contentPane.add(passwordField);
	}
}
