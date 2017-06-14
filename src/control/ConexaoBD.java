/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Leandro Max
 */
public class ConexaoBD {
    public Statement stm;
    public ResultSet rs;
    public Connection con;
    private String driver;
    private String caminho;
    private String usuario;
    private String senha;
}
