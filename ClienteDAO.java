/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaarquitetura;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



	
public class ClienteDAO {
   
    public void SalvarCliente (Cliente c) throws SQLException{
        Connection con = Conexao.open();
        PreparedStatement stmt = null;
        
        
        
        
        try {
//
			stmt = con.prepareStatement("INSERT INTO cliente (Codigo,Nome,Sexo,Idade)VALUES(?,?,?,?);");

			stmt.setInt(1, c.getCodigo());
			stmt.setString(2, c.getNome());
                        stmt.setString(3, c.getSexo());
			stmt.setInt(4, c.getIdade());

			stmt.executeUpdate();


		}catch(Exception e) {

			e.printStackTrace();
		}
    }
    
    public void RemoverCliente(Cliente c) throws SQLException {
         Connection con = Conexao.open();
          PreparedStatement stmt = null;
        
		try {

			stmt = con.prepareStatement("DELETE FROM cliente where Codigo = ? ;");
			stmt.setInt(1, c.getCodigo());
		        stmt.executeUpdate();

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
    
    
}
