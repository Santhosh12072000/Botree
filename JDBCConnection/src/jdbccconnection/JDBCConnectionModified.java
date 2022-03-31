package jdbccconnection;

import java.sql.*;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class JDBCConnectionModified {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
        Statement st=con.createStatement();
        
        String query1="insert into empdetail(empid,empname,empdept,empsalary) values(?,?,?,?)";
        
        
        PreparedStatement pst=con.prepareStatement(query1);      
        Scanner scanner=new Scanner(System.in);
        //statement st=con.createStatement();
        
        
        
        System.out.println("enter the id:");
        int id=scanner.nextInt();
        System.out.println("enter the name:");
        String name=scanner.next();
        System.out.println("enter the dept:");
        String dept=scanner.next();
        System.out.println("enter the salary:");
        float salary=scanner.nextFloat();
      
        pst.setInt(1,id);
        pst.setString(2,name);
        pst.setString(3,dept);
        pst.setFloat(4,salary);
        
        int rows_affected_pst=pst.executeUpdate();
        
        System.out.println("Query ok, "+rows_affected_pst+"row affected");
        
        //int rows_affected=st.executeUpdate("insert into empdetail(empid,empname,empdept,empsalary)");
       // System.out.println("Query ok, "+rows_affected+"row affected");
        
        
		//Statement st=con.createStatement();
		//ResultSet rs=st.executeQuery ("select * from empdetail" );
		//System.out.println("empid"+"\t"+"empname"+"\t"+"\t"+"empsalary");
		//System.out.println("-------------------------------------------------");
        //while(rs.next()) {
        	//System.out.println(rs.getInt("empid")+"\t "+rs.getString("empname")+"\t "+"\t"+rs.getInt("empsalary"));
        
		ResultSet rs=st.executeQuery("select* from empdetail");
		while(rs.next()) {
			System.out.println(rs.getInt("empid")+" "+rs.getString("empname")+"  "+rs.getString("empdept")+"  "+rs.getFloat("empsalary"));
		
		
        }
        System.out.println("-------------------------------------------------");
        st.close();
        con.close();
        
	}

}
