package net.code.java;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Variables{
	String id;
	String pass;
	String contact;
	String name;
	String mail;
	

    
    public void details_access() {
		String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
	    String username = "system";
	    String password = "sarang"; 
	    
	    Connection connection10 =null;
	    Statement stat10 = null;
	    ResultSet rs10 = null;
    	try {

    		connection10 = DriverManager.getConnection(dbURL, username, password);
    		System.out.println("Connected");
    	
    		String sql10 = "select id from user_id";
    	
    		stat10 = connection10.createStatement();
    		stat10.executeUpdate(sql10);
    		rs10 = stat10.executeQuery(sql10);
    		if(rs10.next()) {
    			id = rs10.getString(0);
    			System.out.println(id);
    		}
    	}
    	catch (SQLException e1) {
	    	//TODO Auto-generated catch block
	    	System.out.println("Not yet");
	    	e1.printStackTrace();
	   	}
    }
    
//	public void SactionPerformed(ActionEvent e) {
//
//		 
//		String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
//	    String username = "system";
//	    String password = "sarang"; 
//	    String id = null;
//	    String number = null;
//	    String pass = null;
//	    String mail_Sql= null;
//	    String name= null;
//    try {
//    	Connection connection = DriverManager.getConnection(dbURL, username, password);
//	    	System.out.println("Connected");
//	    	String sql="INSERT INTO Seller(seller_ID,password,name,contact,mail) VALUES"+"'"+id+"','"+pass+"','"+name+"','"+number+"','"+mail_Sql+"'";
//    	Statement stat = connection.createStatement();
//		stat.executeUpdate(sql);
//	    }
//			catch (SQLException e1) {
//		    	//TODO Auto-generated catch block
//	    	System.out.println("Not yet");
//		    	e1.printStackTrace();
//		   	}
//	}
//	
//	public void BactionPerformed(ActionEvent e) {
//	
//		
//		String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
//	    String username = "system";
//	    String password = "sarang"; 
//	    String id= null;
//	    String number= null;
//	    String pass= null;
//	    String mail_Sql= null;
//	    String name= null;
//	    try {
//	    	Connection connection = DriverManager.getConnection(dbURL, username, password);
//	    	System.out.println("Connected");
//	    	String sql="INSERT INTO Buyer(buyer_ID,password,name,contact,mail) VALUES'"+id+"','"+pass+"','"+name+"','"+number+"','"+mail_Sql+"'";
//	    	Statement stat = connection.createStatement();
//			stat.executeUpdate(sql);
//	    }
//			catch (SQLException e1) {
//		    	//TODO Auto-generated catch block
//		    	System.out.println("Not yet");
//		    	e1.printStackTrace();
//		   	}
//	}
//    
	Variables(){
		
	}
}
