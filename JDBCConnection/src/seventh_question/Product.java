package seventh_question;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

import jdbccconnection.JDBCClassdao;


		public class Product {
			public static PreparedStatement pst;
			//private static Scanner scanner;
			int Product_id;
			String Product_Name;
			Date Manufactured_date;
			int Stock_Available;
			int Price;

			
			
			public void insert() throws SQLException
			{
				Scanner scanner=new Scanner(System.in);
				
				System.out.println("enter id, name,date,stock & price");
				pst.setInt(1,scanner.nextInt());
				pst.setString(2,scanner.next());
				pst.setString(3,scanner.next());
				pst.setInt(4,scanner.nextInt());
				pst.setInt(5,scanner.nextInt());
			}
			public static void main(String[] args) throws SQLException,ClassNotFoundException {
				// TODO Auto-generated method stub
				
				Class.forName("com.mysql.cj.jdbc.Driver");
		        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/productdata","root","root");
		        Statement st=con.createStatement();
		        Product product=new Product();
		        
		        int c;
		        System.out.println(" welcome");
				System.out.println("1.Find All Products");
				System.out.println("2.Add Product");
				
				Scanner scanner = new Scanner(System.in);
		        c=scanner.nextInt();
		       
		        switch(c)
		        {
		        case 1:
		        	break;
		        
		        	
		        case 2:
		        
		      
		        	
		        String query1="insert into producttable(empid,empname,empdept,empsalary) values(?,?,?,?)";
		        pst=con.prepareStatement(query1);
		        
		        product.insert();
		        int rows_affected_pst=pst.executeUpdate();
		        System.out.println("Query ok, "+rows_affected_pst+"row affected");
		        break;
		        
	}
		        ResultSet rs=st.executeQuery("select* from producttable");
		        while(rs.next()) {
					System.out.println(rs.getInt("Product_id")+" "+rs.getString("Product_Name")+"  "+rs.getString("Manufactured_date")+"  "+rs.getInt("Stock_Available")+"  "+rs.getInt("Price"));
				
		        }
		        st.close();
		        con.close();
			}

			}



