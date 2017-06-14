package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Lixeira;

public class LixeiraDAO 
{
    public void create(Lixeira lixeira)
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO lixeiras (capacidade_total,capacidade_utilizada,latitude,longitude) VALUES (?,?,?,?)");
            stmt.setInt(1, lixeira.getCapacidadeTotal());
            stmt.setInt(2, lixeira.getCapacidadeUtilizada());
            stmt.setString(3, lixeira.getLatitude());
            stmt.setString(4, lixeira.getLongitude());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Lixeira Cadastrada com com sucesso");
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(LixeiraDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        finally
        {
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
}
