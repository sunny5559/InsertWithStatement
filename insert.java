package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/student","root","");
		Statement st = conn.createStatement();
		int rs = st.executeUpdate("insert into stu values(46574,'ankur','male','21/23 west delhi')");
		 if(rs==1)
		 {
			 System.out.println("data insderted sucesssfully....");
		 }
		 else
		 {
			 System.out.println("somthing went wronng.........");
		 }
	    
	}

}

