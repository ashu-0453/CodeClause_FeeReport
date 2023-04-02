package com.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteAccountant extends JFrame {
	static DeleteAccountant frame;

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new DeleteAccountant();
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
	public DeleteAccountant() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 607, 584);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Delete Accountant");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(226, 10, 215, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter ID :");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_1.setBounds(94, 71, 96, 27);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(179, 73, 181, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Name :");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_2.setBounds(179, 127, 96, 24);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(311, 127, 181, 25);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Email :");
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_3.setBounds(179, 174, 96, 37);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(311, 182, 181, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Password :");
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_4.setBounds(179, 236, 96, 24);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(311, 237, 181, 27);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Contact :");
		lblNewLabel_5.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_5.setBounds(179, 293, 96, 24);
		contentPane.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(311, 294, 181, 23);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("Delete Accountant");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id=Integer.parseInt(textField.getText());
				String name=textField_1.getText();
				String email=textField_2.getText();
				String password=textField_3.getText();
				String contact=textField_4.getText();
				
				Accountant a=new Accountant(id,name,email,password,contact);
				int status=AccountantDao.delete(id);
				if(status>0){
					JOptionPane.showMessageDialog(DeleteAccountant.this,"Accountant Deleted successfully!");
					AdminActivities.main(new String[]{});
					frame.dispose();
				}else{
					JOptionPane.showMessageDialog(DeleteAccountant.this,"Sorry, Unable to Delete Accountant!");
				}
				
			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnNewButton.setBounds(208, 404, 215, 37);
		contentPane.add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 108, 732, 12);
		contentPane.add(separator);
		
		JButton btnNewButton_1 = new JButton("Load Record");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id1=textField.getText();
				if(id1==null||id1.trim().equals("")){
					JOptionPane.showMessageDialog(DeleteAccountant.this,"Please enter Accountant ID first!");
				}else{
				int id=Integer.parseInt(id1);
				Accountant a=AccountantDao.getAccountantById(id);
				textField_1.setText(a.getName());
				textField_2.setText(a.getEmail());
				textField_3.setText(a.getPassword());
				textField_4.setText(a.getContact());
				}
			}
		});
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		btnNewButton_1.setBounds(385, 71, 107, 27);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminActivities.main(new String[] {});
				frame.dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnNewButton_2.setBounds(444, 407, 85, 32);
		contentPane.add(btnNewButton_2);
	}
}
