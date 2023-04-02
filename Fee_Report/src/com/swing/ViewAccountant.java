package com.swing;

import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewAccountant extends JFrame {
	static ViewAccountant frame;

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new ViewAccountant();
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
	public ViewAccountant() {
		List<Accountant> list=AccountantDao.view();
		int size=list.size();
		
		String data[][]=new String[size][5];
		int row=0;
		for(Accountant a:list){
			data[row][0]=String.valueOf(a.getId());
			data[row][1]=a.getName();
			data[row][2]=a.getPassword();
			data[row][3]=a.getEmail();
			data[row][4]=a.getContact();
			row++;
		}
		String columnNames[]={"Id","Name","Email","Password","Contact"};
		getContentPane().setLayout(null);
		
		JTable jt=new JTable(data,columnNames);
		JScrollPane sp=new JScrollPane(jt);
		sp.setBounds(0, 0, 786, 387);
		getContentPane().add(sp);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminActivities.main(new String[] {});
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnNewButton.setBounds(327, 397, 95, 39);
		getContentPane().add(btnNewButton);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 483);
	}
}

