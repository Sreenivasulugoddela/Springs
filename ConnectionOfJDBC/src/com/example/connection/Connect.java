package com.example.connection;

import java.security.DomainCombiner;
import java.sql.*;
public class Connect 
{
   public static void main(String[] args) 
   {
	  String url="jdbc:mysql://localhost:3306/techouts";
	  String username="root";
	  String password="sreenivas62@";
	  
	  try
	  {
	   Connection conn= DriverManager.getConnection(url,username,password);	  
  	   System.out.println("Connection Established");
	  
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
   }
}
