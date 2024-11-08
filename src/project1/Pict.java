package project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Pict {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	          String str=("insert into table hospital values(?,?,?,?,?,? ");
	          Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","amosvignesh11230VA@");
	          PreparedStatement ps=cn.prepareStatement(str);
              Scanner sc=new Scanner(System.in);
              System.out.print("enter the patient name");
              System.out.print("enter hospital name");
              System.out.print("enter age");
              ps.setString(1,sc.next());
              ps.setInt(2,sc.nextInt());
              ps.setString(3,sc.next());      
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
