package jdbccconnection;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCClassdao {
	public static PreparedStatement pst;
	//private static Scanner scanner;
	int id;
	String name;
	String dept;
	float salary;

	
	
	public void insert() throws SQLException
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter id, name,dept & salary");
		pst.setInt(1,scanner.nextInt());
		pst.setString(2,scanner.next());
		pst.setString(3,scanner.next());
		pst.setFloat(4,scanner.nextFloat());
	}
	public static void main(String[] args) throws SQLException,ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
        Statement st=con.createStatement();
        JDBCClassdao jdbcclassdao=new JDBCClassdao();
        
        int c;
        System.out.println(" welcome");
		System.out.println("1.Find All employees");
		System.out.println("2.Add Product");
		System.out.println("3.Update details");
		System.out.println("4.Delete details");
		Scanner scanner = new Scanner(System.in);
        c=scanner.nextInt();
       
        switch(c)
        {
        case 1:
        	break;
        
        	
        case 2:
        
      //insert statement
        	
        String query1="insert into empdetail(empid,empname,empdept,empsalary) values(?,?,?,?)";
        pst=con.prepareStatement(query1);
        /*System.out.println("enter id, name,dept & salary");
		pst.setInt(1,scanner.nextInt());
		pst.setString(2,scanner.next());
		pst.setString(3,scanner.next());
		pst.setFloat(4,scanner.nextFloat());
        JDBCClassdao jdbcclassdao=new JDBCClassdao();
        jdbcclassdao.add(new(1,2,3,4));*/
        jdbcclassdao.insert();
        int rows_affected_pst=pst.executeUpdate();
        System.out.println("Query ok, "+rows_affected_pst+"row affected");
        break;
        
        case 3:
         //update Statement
        
         String query2="update empdetail set empsalary=? where empid=?";
         pst=con.prepareStatement(query2);
         System.out.println("enter the empsalary of the employee to be updated:");
         pst.setFloat(1, scanner.nextFloat());
         System.out.println("enter the empid of an employee to be updated:");
         pst.setInt(2, scanner.nextInt());
         int rows_updated=pst.executeUpdate();
         System.out.println("Query ok, "+rows_updated+"row updated by pst");
         break;
	
         
        case 4:
	   //delete Statement
        
        String query3="delete from empdetail where empid=?";
        pst=con.prepareStatement(query3);
        //pst=con.prepareStatement(query3);
        System.out.println("enter the empid of an employee to be removed:");
        pst.setInt(1,scanner.nextInt());
        int rows_deleted=pst.executeUpdate();
        System.out.println("Query ok, "+rows_deleted+"row deleted by pst");
        break;
        }
        
       
		ResultSet rs=st.executeQuery("select* from empdetail");
        while(rs.next()) {
			System.out.println(rs.getInt("empid")+" "+rs.getString("empname")+"  "+rs.getString("empdept")+"  "+rs.getFloat("empsalary"));
		
        }
        st.close();
        con.close();
	}

	}

