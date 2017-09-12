package controll;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import controll.Database;

public class MySql_Pessoas {
	

	public static void getInserePessoa(String nome, String telefone, String endereco) throws SQLException {
		
		Connection connection = Database.getConnection();
		Statement statement = connection.createStatement();
		boolean resultado = statement.execute("insert into pessoa (nome,telefone,endereco) values ('"+nome+"','"+telefone+"','"+endereco+"')");
		System.out.println("Teve algum erro? "+resultado);
		statement.close();
		connection.close();
	}
	
}
