package aulaarquitetura;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {
	
	private static Connection connect = null;
	private static Statement statement = null;
	private static PreparedStatement preparedStatement = null;
	private static ResultSet resultSet = null;

	@SuppressWarnings("finally")
	public static Connection open() throws SQLException {
		try {
			if(connect == null) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connect = DriverManager.getConnection("jdbc:mysql://localhost/Cliente", "root", "");
			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		}finally{	

			return connect;
		}
	}
	
	public void close() throws SQLException {

		try {

			if (resultSet != null) {
				resultSet.close();
			}

			if (statement != null) {
				statement.close();
			}

			if (connect != null) {
				connect.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}