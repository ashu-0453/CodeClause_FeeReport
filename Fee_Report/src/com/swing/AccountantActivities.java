package com.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AccountantActivities extends JFrame {
	static AccountantActivities frame;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AccountantActivities();
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
	public AccountantActivities() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Accountant Section");
		lblNewLabel.setBounds(146, 23, 200, 29);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Add Student");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddStudent.main(new String[] {});
				frame.dispose();
			}
		});
		btnNewButton.setBounds(92, 73, 145, 43);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("View Students");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewStudent.main(new String[] {});
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(247, 74, 163, 44);
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Edit Student");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditStudent.main(new String[] {});
				frame.dispose();
			}
		});
		btnNewButton_2.setBounds(92, 166, 145, 43);
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Due of Students");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DueStudent.main(new String[] {});
				frame.dispose();
			}
		});
		btnNewButton_3.setBounds(248, 166, 162, 43);
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Logout");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstPage.main(new String[] {});
				frame.dispose();
			}
		});
		btnNewButton_4.setBounds(198, 336, 95, 36);
		btnNewButton_4.setBackground(new Color(255, 255, 255));
		btnNewButton_4.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		contentPane.add(btnNewButton_4);
		
		JButton btnDelete = new JButton("Delete Student");
		btnDelete.setBounds(167, 239, 162, 43);
		btnDelete.setBackground(new Color(255,255,255));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteStudent.main(new String[] {});
				frame.dispose();
				
			}
		});
		btnDelete.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		contentPane.add(btnDelete);
	}
}