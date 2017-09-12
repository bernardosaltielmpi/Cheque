package controll;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Database {
	
	public static Connection getConnection() throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://mysql.mpiinformatica.com/mpiinformatica20?useSSL=false", "mpiinformatica20","mpi0055");
		if (connection.isValid(1)) {
			JOptionPane.showMessageDialog(null, "Conectado ao banco");
			
		}
		return connection;
	}
	
//	static Connection getConnection() throws SQLException {
//		Connection connection = DriverManager.getConnection("jdbc:mysql://mysql.mpiinformatica.com/mpiinformatica19?useSSL=false", "mpiinformatica19","abcd102030");
//		return connection;
//	}

}
