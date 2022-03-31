package view;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


import controller.JDBCConnection;

public class ProjectView {

	
		//ProductController productController=null;
		
		public void display() throws ClassNotFoundException , SQLException {
			Label:
				while(true) {
					
			
			System.out.println(" welcome");
			System.out.println("1.Find All Product");
			System.out.println("2.Add Product");
			System.out.println("3.Exit");
			System.out.println("Enter your choice");
			Scanner scanner = new Scanner(System.in);
			
			int choice=scanner.nextInt();
			switch(choice)
			{
			case 1:
				break;
				
			case 2:
				//productController.save();
				break;
			case 3:
			   // productController).modify();
				break;
			case 4:
				break Label;
				default:
					System.out.println("invalid option");
			
			Connection connection=JDBCConnection.getConnection();
			ProjectView projectView = new ProjectView();
			projectView.display();
			
			Statement st=connection.createStatement();
			
			ResultSet rs=st.executeQuery("select*from stdreport");
			while(rs.next()) {
			System.out.println(rs.getInt("std_id")+"\t"+rs.getString("std_name")+"\t"+rs.getInt("std_att")+"\t"+rs.getInt("std_marks"));
			
			}
			}
		
			
			
				}
		}
		public static void main(String[] args) throws ClassNotFoundException, SQLException{
			//Connection connection=JDBCConnection.getConnection();
			ProjectView projectView = new ProjectView();
			projectView.display();
			
			/*Statement st=connection.createStatement();
			
			ResultSet rs=st.executeQuery("select*from stdreport");
			while(rs.next()) {
			System.out.println(rs.getInt("std_id")+"\t"+rs.getString("std_name")+"\t"+rs.getInt("std_att")+"\t"+rs.getInt("std_marks"));
			
			}*/
		
		}
}
