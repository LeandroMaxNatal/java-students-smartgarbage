package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Lixeira;

public class LixeiraDAO 
{
    public boolean create(Lixeira lixeira)
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        boolean check = false;
        try {
            stmt = con.prepareStatement("INSERT INTO lixeiras (capacidade_total,capacidade_utilizada,latitude,longitude) VALUES (?,?,?,?)");
            stmt.setInt(1, lixeira.getCapacidadeTotal());
            stmt.setInt(2, lixeira.getCapacidadeUtilizada());
            stmt.setString(3, lixeira.getLatitude());
            stmt.setString(4, lixeira.getLongitude());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Lixeira Cadastrada com com sucesso");
            check = true;
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(LixeiraDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        finally
        {
            ConnectionFactory.closeConnection(con, stmt);
        }
        return check;
    }
    
    public List<Lixeira> read()
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Lixeira> lixeiras = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM lixeiras");
            rs = stmt.executeQuery();
        
            while(rs.next())
            {
                Lixeira lixeira = new Lixeira();
                
                lixeira.setId(rs.getInt("id"));
                lixeira.setCapacidadeTotal(rs.getInt("capacidade_total"));
                lixeira.setCapacidadeUtilizada(rs.getInt("capacidade_utilizada"));
                lixeira.setLatitude(rs.getString("latitude"));
                lixeira.setLongitude(rs.getString("longitude"));
                
                lixeiras.add(lixeira);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(LixeiraDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        finally
        {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lixeiras;
    }
    
}
