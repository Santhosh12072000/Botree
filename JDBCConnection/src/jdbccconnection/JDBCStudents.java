package jdbccconnection;

import java.sql.PreparedStatement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.util.Scanner;

public class JDBCStudents {
	public static PreparedStatement pst;
	int id;
	String name;
	int attendence;
	int marks;

	
	
	public JDBCStudents() {
		// TODO Auto-generated constructor stub
	}
	
	public JDBCStudents(int id, String name, int attendence, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.attendence = attendence;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAttendence() {
		return attendence;
	}
	public void setAttendence(int attendence) {
		this.attendence = attendence;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public  void insert() throws SQLException
	{
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("enter the id,name,attendence and marks");
	pst.setInt(1,scanner.nextInt());
	pst.setString(2,scanner.next());
	pst.setInt(3,scanner.nextInt());
	pst.setInt(4,scanner.nextInt());
	
	
	}
	public static void main(String[] args) throws SQLException,ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		Statement st=con.createStatement();
		JDBCStudents jdbcstudents=new JDBCStudents();
		
		int c;
		System.out.println("WELCOME");
		System.out.println("1.Show Student Reports");
		System.out.println("2.Add New Student Reports");
		System.out.println("3.Update Student Reports");
		System.out.println("4.Delete Student Reports");
		
		Scanner scanner=new Scanner(System.in);
		c=scanner.nextInt();
		
		switch(c)
		{
			case 1:
				break;
				
			case 2:
				String query1="insert into stdreport (std_id,std_name,std_att,std_marks) values(?,?,?,?)";
				pst=con.prepareStatement(query1);
				jdbcstudents.insert();
				int rows_affected_pst=pst.executeUpdate();
				break;
				
			case 3:
				String query2="Update stdreport set std_marks=? where std_id=?";
				pst=con.prepareStatement(query2);
				System.out.println("enter the student marks");
				pst.setInt(1,scanner.nextInt());
				System.out.println("enter the student id");
				pst.setInt(2,scanner.nextInt());
				int rows_updated_pst=pst.executeUpdate();
				break;
				
			case 4:
				String query3="Delete from stdreport where std_id=?";
				pst=con.prepareStatement(query3);
				System.out.println("enter the Student id to be deleted");
				pst.setInt(1, scanner.nextInt());
				int rows_deleted_pst=pst.executeUpdate();
				break;
				
		}
		
		ResultSet rs=st.executeQuery("select*from stdreport");
		while(rs.next()) {
		System.out.println(rs.getInt("std_id")+"\t"+rs.getString("std_name")+"\t"+rs.getInt("std_att")+"\t"+rs.getInt("std_marks"));
		
		}
		
		
		scanner.close();
		con.close();
	
		
	


		
		
		

	}
}


