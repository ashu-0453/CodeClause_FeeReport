package com.swing;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class StudentDao {

	

	public static int add(Student s) {
		String sql="insert into student(rollno,name,email,department,fee,paid,due,address,city,year,dob,contact) values(?,?,?,?,?,?,?,?,?,?,?,?)";
		int ch=0;
		try {
			Connection con=AccountantDao.getCon();
			PreparedStatement ps =con.prepareStatement(sql);
			
			ps.setInt(1,s.getRollno());
			ps.setString(2,s.getName());
			ps.setString(3,s.getEmail());
			ps.setString(4,s.getDepartment());
			
			ps.setInt(5,s.getFee());
			ps.setInt(6,s.getPaid());
			ps.setInt(7,s.getDue());
			ps.setString(8,s.getAddress());
			
			ps.setString(9,s.getCity());
			ps.setString(10,s.getYear());
			ps.setString(11,s.getDob());
			ps.setString(12,s.getContact());
			ch=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return ch;
	}

	public static List<Student> view() {
		String sql="select * from student";
		List<Student> list=new ArrayList<Student>();
		
		try{
			Connection con=AccountantDao.getCon();
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Student s=new Student();
				s.setRollno(rs.getInt("rollno"));
				s.setName(rs.getString("name"));
				s.setEmail(rs.getString("email"));
				s.setDepartment(rs.getString("department"));
				s.setFee(rs.getInt("fee"));
				s.setPaid(rs.getInt("paid"));
				s.setDue(rs.getInt("due"));
				s.setAddress(rs.getString("address"));
				s.setCity(rs.getString("city"));
				s.setYear(rs.getString("year"));
				s.setDob(rs.getString("dob"));
				s.setContact(rs.getString("contact"));
				list.add(s);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}

	public static List<Student> due() {
		List<Student> list=new ArrayList<Student>();
		String sql="select * from student where due > 0";
		try{
			Connection con=AccountantDao.getCon();
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Student s=new Student();
				s.setRollno(rs.getInt("rollno"));
				s.setName(rs.getString("name"));
				s.setEmail(rs.getString("email"));
				s.setDepartment(rs.getString("department"));
				s.setFee(rs.getInt("fee"));
				s.setPaid(rs.getInt("paid"));
				s.setDue(rs.getInt("due"));
				s.setAddress(rs.getString("address"));
				s.setCity(rs.getString("city"));
				s.setYear(rs.getString("year"));
				s.setDob(rs.getString("dob"));
				s.setContact(rs.getString("contact"));
				list.add(s);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}


	public static Student getStudentByRollno(int rollno) {
		String sql="select * from student where rollno=?";
		Student s=new Student();
		try{
			Connection con=AccountantDao.getCon();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,rollno);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				s.setRollno(rs.getInt("rollno"));
				s.setName(rs.getString("name"));
				s.setEmail(rs.getString("email"));
				s.setDepartment(rs.getString("department"));
				s.setFee(rs.getInt("fee"));
				s.setPaid(rs.getInt("paid"));
				s.setDue(rs.getInt("due"));
				s.setAddress(rs.getString("address"));
				s.setCity(rs.getString("city"));
				s.setDob(rs.getString("dob"));
				s.setYear(rs.getString("year"));
				s.setContact(rs.getString("contact"));
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return s;
		
	}
	
	public static int edit(Student s) {
		String sql="update student set name=?,email=?,department=?,fee=?,paid=?,due=?,address=?,city=?,year=?,dob=?,contact=? where rollno=?";
		int ch=0;
		try{
			Connection con=AccountantDao.getCon();
			PreparedStatement ps=con.prepareStatement(sql);
			
			
			ps.setString(1,s.getName());
			ps.setString(2,s.getEmail());
			ps.setString(3,s.getDepartment());
			ps.setInt(4,s.getFee());
			ps.setInt(5,s.getPaid());
			ps.setInt(6,s.getDue());
			ps.setString(7,s.getAddress());
			ps.setString(8,s.getCity());
			ps.setString(9,s.getYear());
			ps.setString(10,s.getDob());
			ps.setString(11,s.getContact());
			ps.setInt(12,s.getRollno());
			ch=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return ch;
	}



	public static int delete(Student s) {
		String sql="delete from student where rollno=?";
		int ch=0;
		
		try{
			Connection con=AccountantDao.getCon();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,s.getRollno());
			ch=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return ch;
	}

}
