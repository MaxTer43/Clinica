package conexion;



import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;


public class conexion {
	
	//public static String driver;
	//public static final String SQL="jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=clinica;user=sa;password=SQL2014";
	public static final String SQL="jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=clinica;user=sa;password=SQL2014";
	
		
	//Api de la conexión a base de datos de JAVA - JDBC
	
		
			static{
				try {
					Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				public static Connection getConnection(String urlConnection){
					Connection conex=null;
					try {
						conex=DriverManager.getConnection(urlConnection);
					} catch (SQLException e) {
					
						e.printStackTrace();
					}
					return conex;
				}
			public static void closeConnection(Connection conex){
				try {
					conex.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
			public static void closeStatement(Statement stm){
				try {
					stm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
}
















