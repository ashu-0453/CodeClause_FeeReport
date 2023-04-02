package com.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class AddAccountant extends JFrame {
	public static AddAccountant frame;

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AddAccountant();
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
	public AddAccountant() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add Accountant");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel.setBounds(217, 10, 177, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Accountant ID :");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_1.setBounds(94, 62, 146, 24);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(250, 60, 190, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Accountant Name :");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_2.setBounds(72, 120, 146, 24);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(250, 118, 190, 33);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("E-mail :");
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_3.setBounds(94, 176, 105, 33);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(250, 178, 190, 33);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Password :");
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_4.setBounds(94, 243, 105, 13);
		contentPane.add(lblNewLabel_4);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(250, 235, 190, 33);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_5 = new JLabel("Contact :");
		lblNewLabel_5.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_5.setBounds(94, 287, 79, 33);
		contentPane.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(250, 289, 190, 33);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int id=Integer.parseInt(textField.getText());
			
				String name=textField_1.getText();
				char ch[]=passwordField.getPassword();
				String password=String.valueOf(ch);
				
				String email=textField_2.getText();
				String contact=textField_3.getText();
			    
				Accountant a=new Accountant(id,name,email,password,contact);
				int status=AccountantDao.add(a);
				
				if(status>0){
					JOptionPane.showMessageDialog(AddAccountant.this,"Accountant added successfully!");
					textField.setText("");textField_1.setText("");textField_2.setText("");
					textField_3.setText("");passwordField.setText("");
				}else{
					JOptionPane.showMessageDialog(AddAccountant.this,"Sorry, Unable to add Accountant!");
				}
				
			}
		});
		btnNewButton.setBounds(217, 372, 85, 33);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminActivities.main(new String[] {});
				frame.dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnNewButton_1.setBounds(355, 372, 85, 33);
		contentPane.add(btnNewButton_1);
	}
}
