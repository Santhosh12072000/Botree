package jdbccconnection;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.stream.Collectors;


public class JDBCClass {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/employee";
		String username="root";
		String password="root";
		String query="select * from empdetail ";
		
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection con=DriverManager.getConnection(url,username,password);
        
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery (query );
		
		//single element
		//rs.next();
		//System.out.println(rs.getString("empname"));
				
		
		//rs.next();
		//System.out.println(rs.getString("empname"));
				
		String name;
		int id;
		String dept;
		int salary;
		
		while(rs.next()) {
			name=rs.getString("empname");
			id=rs.getInt("empid");
			dept=rs.getString("empdept");
			salary=rs.getInt("empsalary");
			System.out.println(name+" "+id);
			System.out.println(id+ name +salary);
			}
			//empdetail.stream().filter(i->i.getempid().i.getempsalary()>30000).map(i->i.getempsalary()*1.02).collect(Collectors.toList());
           // forEach(System.out::println);
		
		
		
		st.close();
		con.close();	}

	
}
