package com.swing;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditStudent extends JFrame {
	
	static EditStudent frame;

	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textFieldDob;
	private JTextField textFieldDept;
	private JTextField textFieldYear;
	private JTextField textFieldFees;
	private JTextField textFieldPaid;
	private JTextField textFieldDue;
	private JTextField textFieldCity;
	private JTextField textFieldEmail;
	private JTextField textFieldContact;
	private JTextField textFieldRoll;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new EditStudent();
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
	public EditStudent() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 647);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Edit Student");
		lblNewLabel.setBounds(281, 10, 140, 51);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name :");
		lblNewLabel_1.setBounds(64, 141, 99, 13);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Roll Number :");
		lblNewLabel_2.setBounds(64, 72, 161, 22);
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("E-mail :");
		lblNewLabel_3.setBounds(428, 182, 55, 13);
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Department :");
		lblNewLabel_4.setBounds(64, 215, 99, 35);
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Year :");
		lblNewLabel_5.setBounds(64, 260, 99, 24);
		lblNewLabel_5.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("D.O.B (DD/MM/YYYY) :");
		lblNewLabel_6.setBounds(64, 172, 161, 33);
		lblNewLabel_6.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Fees :");
		lblNewLabel_7.setBounds(64, 294, 45, 32);
		lblNewLabel_7.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_7.setBackground(new Color(0, 0, 0));
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Paid :");
		lblNewLabel_8.setBounds(64, 329, 45, 26);
		lblNewLabel_8.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Due :");
		lblNewLabel_9.setBounds(64, 365, 45, 20);
		lblNewLabel_9.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Address :");
		lblNewLabel_10.setBounds(64, 413, 99, 13);
		lblNewLabel_10.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("City :");
		lblNewLabel_11.setBounds(64, 487, 45, 19);
		lblNewLabel_11.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Contact :");
		lblNewLabel_12.setBounds(428, 225, 66, 13);
		lblNewLabel_12.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		contentPane.add(lblNewLabel_12);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 122, 701, 22);
		contentPane.add(separator);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(260, 140, 119, 19);
		contentPane.add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldDob = new JTextField();
		textFieldDob.setBounds(260, 181, 119, 19);
		contentPane.add(textFieldDob);
		textFieldDob.setColumns(10);
		
		textFieldDept = new JTextField();
		textFieldDept.setBounds(260, 225, 119, 19);
		contentPane.add(textFieldDept);
		textFieldDept.setColumns(10);
		
		textFieldYear = new JTextField();
		textFieldYear.setBounds(260, 262, 119, 19);
		contentPane.add(textFieldYear);
		textFieldYear.setColumns(10);
		
		textFieldFees = new JTextField();
		textFieldFees.setBounds(260, 303, 119, 19);
		contentPane.add(textFieldFees);
		textFieldFees.setColumns(10);
		
		textFieldPaid = new JTextField();
		textFieldPaid.setBounds(260, 335, 119, 19);
		contentPane.add(textFieldPaid);
		textFieldPaid.setColumns(10);
		
		textFieldDue = new JTextField();
		textFieldDue.setBounds(260, 370, 119, 22);
		contentPane.add(textFieldDue);
		textFieldDue.setColumns(10);
		
		textFieldCity = new JTextField();
		textFieldCity.setBounds(260, 489, 119, 19);
		contentPane.add(textFieldCity);
		textFieldCity.setColumns(10);
		
		JTextArea textAreaAddress = new JTextArea();
		textAreaAddress.setBounds(260, 409, 119, 59);
		contentPane.add(textAreaAddress);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(505, 181, 155, 19);
		contentPane.add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		textFieldContact = new JTextField();
		textFieldContact.setBounds(504, 220, 156, 19);
		contentPane.add(textFieldContact);
		textFieldContact.setColumns(10);
		
		textFieldRoll = new JTextField();
		textFieldRoll.setBounds(260, 71, 119, 30);
		contentPane.add(textFieldRoll);
		textFieldRoll.setColumns(10);
		
		JButton btnNewButton = new JButton("Fetch Details");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id1=textFieldRoll.getText();
				if(id1==null||id1.trim().equals("")){
					JOptionPane.showMessageDialog(EditStudent.this,"Please Enter Student ID First!");
				}else{
				int id=Integer.parseInt(id1);
				Student s=StudentDao.getStudentByRollno(id);
				textFieldName.setText(s.getName());
				textFieldDob.setText(s.getDob());
				textFieldDept.setText(s.getDepartment());
				textFieldYear.setText(s.getYear());
				textFieldFees.setText(String.valueOf(s.getFee()));
				textFieldPaid.setText(String.valueOf(s.getPaid()));
				textFieldDue.setText(String.valueOf(s.getDue()));
				textFieldCity.setText(s.getCity());
				textAreaAddress.setText(s.getAddress());
				textFieldEmail.setText(s.getEmail());
				textFieldContact.setText(s.getContact());			
				
				}
			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnNewButton.setBounds(397, 71, 140, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Update Details");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rollno=Integer.parseInt(textFieldRoll.getText());
				int fee=Integer.parseInt(textFieldFees.getText());
				int paid=Integer.parseInt(textFieldPaid.getText());
				int due=Integer.parseInt(textFieldDue.getText());
				
				String name=textFieldName.getText();
				String department=textFieldDept.getText();
				String year=textFieldYear.getText();
				String dob=textFieldDob.getText();
				String address=textAreaAddress.getText();
				String city=textFieldCity.getText();
				String email=textFieldEmail.getText();
				String contact=textFieldContact.getText();
				
				Student s = new Student(rollno,name,email,department,fee,paid,due,address,city,year,dob,contact);
				int status=StudentDao.edit(s);
				if(status>0){
					JOptionPane.showMessageDialog(EditStudent.this,"Student Details Updated successfully!");
					textFieldRoll.setText("");textFieldFees.setText("");textFieldPaid.setText("");
					textFieldDue.setText("");textFieldName.setText("");textFieldDept.setText("");
					textFieldYear.setText("");textFieldDob.setText("");textAreaAddress.setText("");
					textFieldCity.setText("");textFieldEmail.setText("");textFieldContact.setText("");
				}else{
					JOptionPane.showMessageDialog(EditStudent.this,"Sorry, Unable to Edit student Details!");
				}
			}
		});
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		btnNewButton_1.setBounds(276, 534, 194, 43);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccountantActivities.main(new String[] {});
				frame.dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_2.setBounds(505, 539, 85, 35);
		contentPane.add(btnNewButton_2);
		
		
	}
}
