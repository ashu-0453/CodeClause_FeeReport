package com.swing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;


public class AccountantDao {
	int ch=0;
	

	public static Connection getCon() {
		Connection connection=null;
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/test";
            String username="root";
            String password="ashu0453";
            connection= DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
		return connection;
		
	}
	
	public static boolean validate(String name,String password){
		boolean status=false;
		String sql="select * from accountant where name=? and password=?";
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,name);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
		}catch(Exception e){System.out.println(e);}
		
		return status;
	}
	
	public static int add(Accountant a) {
		int ch=0;
		String sql="insert into accountant(id,name,email,password,contact) values(?,?,?,?,?)";
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,a.getId());
			ps.setString(2,a.getName());
			ps.setString(3,a.getEmail());
			ps.setString(4,a.getPassword());
			ps.setString(5,a.getContact());
			ch=ps.executeUpdate();
			con.close();
		}catch(Exception e){
			System.out.println(e);
		}
		return ch;
	}


	public static int delete(Integer id) {
		int ch=0;
        String sql="DELETE FROM accountant WHERE id=?";
        try {
        	Connection con=getCon();
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,id);
            ch=ps.executeUpdate();
           
        } catch (SQLException e) {
            e.printStackTrace();
        }
		return ch;
	}

	
	public static List<Accountant> view(){
		
		List<Accountant> list=new ArrayList<>();
		String sql="select * from accountant";
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery(sql);
			while(rs.next()){
				Accountant a=new Accountant();
				a.setId(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setPassword(rs.getString(3));
				a.setEmail(rs.getString(4));
				a.setContact(rs.getString(5));
				list.add(a);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
		
	}
	
	public static Accountant getAccountantById(int id) {
		String sql="select * from accountant where id=?";
		Accountant a=new Accountant();
		try{
			Connection con=AccountantDao.getCon();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				a.setId(rs.getInt("id"));
				a.setName(rs.getString("name"));
				a.setEmail(rs.getString("email"));
				a.setPassword(rs.getString("password"));
				a.setContact(rs.getString("contact"));
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return a;
		
	}
}
