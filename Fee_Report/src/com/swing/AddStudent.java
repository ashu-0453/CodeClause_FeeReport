package com.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddStudent extends JFrame {
	public static AddStudent frame;

	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textFieldRoll;
	private JTextField textFieldEmail;
	private JTextField textFieldDept;
	private JTextField textFieldYear;
	private JTextField textFieldDOB;
	private JTextField textFieldFees;
	private JTextField textFieldPaid;
	private JTextField textFieldDue;
	private JTextField textFieldCity;
	private JTextField textFieldContact;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AddStudent();
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
	public AddStudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 647);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add Student");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel.setBounds(281, 10, 123, 51);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name :");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_1.setBounds(64, 88, 99, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Roll Number :");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_2.setBounds(64, 126, 99, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("E-mail :");
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_3.setBounds(428, 88, 55, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Department :");
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_4.setBounds(64, 205, 99, 35);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Year :");
		lblNewLabel_5.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_5.setBounds(64, 257, 99, 19);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("D.O.B (DD/MM/YYYY) :");
		lblNewLabel_6.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_6.setBounds(64, 162, 161, 33);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Fees :");
		lblNewLabel_7.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_7.setBackground(new Color(0, 0, 0));
		lblNewLabel_7.setBounds(64, 286, 45, 32);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Paid :");
		lblNewLabel_8.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_8.setBounds(64, 328, 45, 13);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Due :");
		lblNewLabel_9.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_9.setBounds(64, 357, 45, 13);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Address :");
		lblNewLabel_10.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_10.setBounds(64, 392, 99, 13);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("City :");
		lblNewLabel_11.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_11.setBounds(64, 470, 45, 19);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Contact :");
		lblNewLabel_12.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_12.setBounds(425, 126, 66, 13);
		contentPane.add(lblNewLabel_12);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(234, 87, 111, 19);
		contentPane.add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldRoll = new JTextField();
		textFieldRoll.setBounds(234, 126, 111, 19);
		contentPane.add(textFieldRoll);
		textFieldRoll.setColumns(10);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(493, 87, 167, 19);
		contentPane.add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		textFieldDept = new JTextField();
		textFieldDept.setBounds(234, 214, 111, 19);
		contentPane.add(textFieldDept);
		textFieldDept.setColumns(10);
		
		textFieldYear = new JTextField();
		textFieldYear.setBounds(234, 259, 111, 19);
		contentPane.add(textFieldYear);
		textFieldYear.setColumns(10);
		
		textFieldDOB = new JTextField();
		textFieldDOB.setBounds(235, 171, 111, 19);
		contentPane.add(textFieldDOB);
		textFieldDOB.setColumns(10);
		
		textFieldFees = new JTextField();
		textFieldFees.setBounds(234, 295, 111, 19);
		contentPane.add(textFieldFees);
		textFieldFees.setColumns(10);
		
		textFieldPaid = new JTextField();
		textFieldPaid.setBounds(234, 327, 111, 19);
		contentPane.add(textFieldPaid);
		textFieldPaid.setColumns(10);
		
		textFieldDue = new JTextField();
		textFieldDue.setBounds(234, 356, 111, 19);
		contentPane.add(textFieldDue);
		textFieldDue.setColumns(10);
		
		JTextArea textAreaAddress = new JTextArea();
		textAreaAddress.setBounds(234, 388, 161, 51);
		contentPane.add(textAreaAddress);
		
		textFieldCity = new JTextField();
		textFieldCity.setBounds(230, 472, 115, 19);
		contentPane.add(textFieldCity);
		textFieldCity.setColumns(10);
		
		textFieldContact = new JTextField();
		textFieldContact.setBounds(493, 125, 167, 19);
		contentPane.add(textFieldContact);
		textFieldContact.setColumns(10);
		
		JButton btnNewButton = new JButton("Save Student");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int rollno=Integer.parseInt(textFieldRoll.getText());
				int fee=Integer.parseInt(textFieldFees.getText());
				int paid=Integer.parseInt(textFieldPaid.getText());
				int due=Integer.parseInt(textFieldDue.getText());
				
				String name=textFieldName.getText();
				String department=textFieldDept.getText();
				String year=textFieldYear.getText();
				String dob=textFieldDOB.getText();
				String address=textAreaAddress.getText();
				String city=textFieldCity.getText();
				String email=textFieldEmail.getText();
				String contact=textFieldContact.getText();
				
				Student s = new Student(rollno,name,email,department,fee,paid,due,address,city,year,dob,contact);
				int status=StudentDao.add(s);
				if(status>0){
					JOptionPane.showMessageDialog(AddStudent.this,"Student added successfully!");
					textFieldRoll.setText("");textFieldFees.setText("");textFieldPaid.setText("");
					textFieldDue.setText("");textFieldName.setText("");textFieldDept.setText("");
					textFieldYear.setText("");textFieldDOB.setText("");textAreaAddress.setText("");
					textFieldCity.setText("");textFieldEmail.setText("");textFieldContact.setText("");
				}else{
					JOptionPane.showMessageDialog(AddStudent.this,"Sorry, Unable to add student!");
				}
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		btnNewButton.setBounds(205, 518, 140, 51);
		contentPane.add(btnNewButton);
		
		
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccountantActivities.main(new String[] {});
				frame.dispose();
				
			}
		});
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		btnNewButton_1.setBounds(365, 518, 85, 51);
		contentPane.add(btnNewButton_1);
	}
}
