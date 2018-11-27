package testeBancoDeDados;

import java.sql.*;
import javax.swing.*;

public class Conecta {
	public static void main(String args[]){
		final String DRIVER = "com.mysql.jdbc.Driver";
		final String URL = "jdbc:mysql://ESN509vmysql:3306/luann_formativa_2infab";
		Connection connection = null;
		
		
		PreparedStatement statement = null;
		ResultSet resultset = null;
		
		
		try{
			Class.forName(DRIVER);
			connection =DriverManager.getConnection(URL, "aluno","Senai1234");
			JOptionPane.showMessageDialog(null, "Conexao com Sucesso");
			
			
			
			try{
					String cpf="48357670806";
					statement = connection.prepareStatement("select * from cliente where CPF = "+cpf);
					//statement = connection.prepareStatement("insert into cliente values (nome,cpf)");
					//statement.setString(1, "48357670806");
					resultset = statement.executeQuery();
					resultset.next();
					JOptionPane.showMessageDialog(null, "Cpf: "+resultset.getString("CPF")+"\nNome: "+resultset.getString("nome"));
			}
			catch(SQLException erro){
				JOptionPane.showMessageDialog(null, erro.toString());
			}
			
			resultset.close();
			statement.close();
		}
		catch(ClassNotFoundException erro){
			JOptionPane.showMessageDialog(null, "Driver não encontrado \n"+erro.toString());
		}
		catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "Problemas na conexão \n"+ erro.toString());
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}
}
