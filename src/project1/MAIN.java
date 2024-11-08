package project1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
public class MAIN {
      
	static Connection con;
      static PreparedStatement ps;
       ResultSet rs;
       String url=("jdbc:mysql://localhost:3306/vsb");
       String username ="root";
       String password="amosvignesh11230VA@";
       MAIN(){
    	   try {
    	   con=DriverManager.getConnection(url,username,password);
    	   }catch(SQLException e) {
    		   e.printStackTrace();
    	   }
    	   
       }public static void insert(Employee Data) {
    	   String str="insert into Employee values(?,?,?,?,?,?)";
    	  try {
    		  ps=con.prepareStatement(str);
    		  ps.setInt(1,Data.getId());
    		  ps.setString(2,Data.getName());
    		  ps.setInt(3,Data.getSalary());
    		  ps.setInt(4,Data.getAge());
    		  ps.setString(5,Data.getGender());
    		  ps.setString(6,Data.getDoj());
    		  ps.execute();
    		  System.out.print("data was executed");
    	  }catch(SQLException e) {
    		  e.printStackTrace();}
    	  }
//    	  public static void delete(Employee Data) {
//    		  String str="delete *from Employee values(?,?,?,?,?,?)";
//    	  try {
//    		  con.prepareStatement(str);
//    		  ps.setInt(1,Data.getId());
//    		  ps.setString(2,Data.getName());
//    		  ps.setInt(3,Data.getSalary());
//    		  ps.setString(4,Data.getGender());
//    		  ps.setInt(5,Data.getAge());
//    		  ps.setString(6,Data.getDoj());
//    	  }catch (SQLException e) {
//    		  e.printStackTrace();
//    	  }
//    	  }public static void view_table(Employee Data) {
//    		  String str=" select*from employee values(?,?,?,?,?,?)";
//    	  try {
//    		  con.prepareStatement(str);
//    		  ps.setInt(1,Data.getId());
//    		  ps.setString(2,Data.getName());
//    		  ps.setInt(3,Data.getSalary());
//    		  ps.setString(4,Data.getGender());
//    		  ps.setInt(5,Data.getAge());
//    		  ps.setString(6,Data.getDoj());
//    	  }catch (SQLException e) {
//    		  e.printStackTrace();
//    	  }
//       }
  }
