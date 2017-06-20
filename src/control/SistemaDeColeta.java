/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bean.Lixeira;

/**
 *
 * @author Leandro Max
 */
public class SistemaDeColeta {
    
    public void EsvaziaLixeira(Lixeira lixeira)
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        String sql = "update lixeiras set capacidade_utilizada = ? where id = ?";
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, 0);
            stmt.setInt(2, lixeira.getId());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SistemaDeColeta.class.getName()).log(Level.SEVERE, null, ex);
        } finally 
        {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
}
