package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Usuario;
public class UsuarioDAO 
{
    public void create(Usuario user)
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO usuarios (nome,email,senha,telefone,pontuacao) VALUES(?,?,?,?,?)");
            stmt.setString(1, user.getNome());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getSenha());
            stmt.setString(4, user.getCelular());
            stmt.setInt(5, user.getPontuacao());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog( null, "Erro ao salvar: " + ex );
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public boolean checkLogin(String login, String senha)
    {
        Connection con = ConnectionFactory.getConnection(); // Faz a conexão com o banco de dados
        PreparedStatement stmt = null;                      // Armazena a pesquisa
        ResultSet rs = null;                                // Armazena o resultado da pesquisa
        boolean check = false;                              // Sera usado para retorno da função
        
        try {
            stmt = con.prepareStatement("SELECT * FROM usuarios WHERE email = ? AND SENHA = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();
            
            if( rs.next() )
            {
                check = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return check;
    }
    
   // public Usuario getUserByTelephone()
    //{
      //  Usuario user = new Usuario();
      //  user.setNome("Leandro");
      //  return user;
    //}
    /**
    public Usuario getUserByTelephone(String telephone)
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        Usuario usuario = new Usuario();
        
        try {
            stmt = con.prepareStatement("select * from usuarios where telefone = \'84988313233\'");
            //stmt.setString(1, telephone);
            rs = stmt.executeQuery();
            
            usuario.setNome(rs.getString(telephone));
            //user.setNome(rs.getString("nome"));
            //user.setPontuacao(rs.getInt("pontuacao"));
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return usuario;
    }  
    * 
    **/
    public Usuario getUserByTel(String tel)
    {
        Usuario user = new Usuario();
        Connection con = ConnectionFactory.getConnection(); // Faz a conexão com o banco de dados
        PreparedStatement stmt = null;                      // Armazena a pesquisa
        ResultSet rs = null;                                // Armazena o resultado da pesquisa
        
        try {
            stmt = con.prepareStatement("SELECT * FROM usuarios WHERE telefone = ?");
            stmt.setString(1, tel);
            rs = stmt.executeQuery();
            if(rs.next())
            {
                user.setId(rs.getInt("id"));
                user.setNome(rs.getString("nome"));
                user.setEmail(rs.getString("email"));
                user.setSenha(rs.getString("senha"));
                user.setCelular(rs.getString("telefone"));
                user.setPontuacao(rs.getInt("pontuacao"));
            }   
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        finally
        {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return user;
    }
    
    public Usuario getUser(String login, String senha)
    {
        Connection con = ConnectionFactory.getConnection(); // Faz a conexão com o banco de dados
        PreparedStatement stmt = null;                      // Armazena a pesquisa
        ResultSet rs = null;                                // Armazena o resultado da pesquisa
        boolean check = false;                              // Sera usado para retorno da função
        Usuario tempUser = new Usuario();
        
        try 
        {
            stmt = con.prepareStatement("SELECT * FROM usuarios WHERE email = ? AND SENHA = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();
            
            if( rs.next() )
            {
                tempUser.setId(rs.getInt("id"));
                tempUser.setNome(rs.getString("nome"));
                tempUser.setEmail(rs.getString("email"));
                tempUser.setCelular(rs.getString("telefone"));
                tempUser.setPontuacao(rs.getInt("pontuacao"));
            }
        } 
        catch(SQLException ex) 
        {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return tempUser;
    }
    
    public void updateScore(int id, int score)
    {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        // Calcula a nova pontuação do usuario
        int newScore = score + 10;
        
        try {
            stmt = con.prepareStatement("UPDATE usuarios SET pontuacao = " + newScore + " WHERE id = " + id);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        finally
        {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    // End of class UsuarioDao
}
