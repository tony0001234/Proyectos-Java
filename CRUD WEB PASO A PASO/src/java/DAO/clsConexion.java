
package DAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
public class clsConexion {
    private String cadenaConexion = "jdbc:sqlserver://localhost;" +
			"databaseName=BD_RRHHA;user=sa;password=Herrera2830;";
    public Connection conectar() throws Exception{
        Connection cn=null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection(cadenaConexion);
        }catch (SQLException e){
            throw e;
        }finally{            
        }
        return cn;
    } 
  }
