package DAO;
import Backend.clsPersona;
import java.sql.SQLException;

import java.sql.PreparedStatement;

import java.sql.Connection;

public class clsQuerys {
    public clsQuerys() {
    }
    
    
    public int fncIngresoPersona( clsPersona pPersona) throws Exception{
       int Resp=0; // 0 no se ingreso.
       clsConexion Con = new clsConexion(); 
            Connection cn = Con.conectar();
        try{
           
            // Con = clsConexion.getConexion().createStatement();
            String consulta = "INSERT INTO dbo.TB_PERSONA (CUI, NOMBRE, PUESTO,SUELDO) "
                    + "VALUES (?,?,?,?)";
            System.out.println(consulta);
            PreparedStatement ps = cn.prepareStatement(consulta);
            ps.setString(1, pPersona.getCUI());
            ps.setString(2, pPersona.getNombre());
            ps.setString(3, pPersona.getPuesto());
            ps.setDouble(4, pPersona.getSalario());
            ps.executeUpdate();
            Resp = 1;
            
        }catch(SQLException Ex){
            System.out.println(Ex.getMessage());
        }
        
        
        return Resp;
    }
    
    
 public int fncModificaPersona( clsPersona objPersona) throws Exception{
        int Resp=0; // 0 no se ingreso.
        try{
           clsConexion Con = new clsConexion(); 
           Connection cn = Con.conectar();
            String consulta = "UPDATE TB_PERSONA "
                    + "SET CUI=?, NOMBRE = ?, PUESTO = ?, SUELDO = ? "
                    + "WHERE CUI = ?";
            PreparedStatement ps = cn.prepareStatement(consulta);
            ps.setString(1, objPersona.getCUI());
            ps.setString(2, objPersona.getNombre());
            ps.setString(3, objPersona.getPuesto());
            ps.setDouble(4, objPersona.getSalario());
            ps.setString(5, objPersona.getCUI());
            ps.executeUpdate(); //EJECUTA LA SENTENCIA EN LA BASE DE DATOS
            Resp = 1;
            System.out.println("CORRECTO");
        }catch(SQLException Ex){
            System.out.println(Ex.getMessage());
        }
        return Resp;
    }
 
  public int fncEliminaPersona(String pCUI) throws Exception{
        int Resp=0;
        try{
           clsConexion Con = new clsConexion(); 
           Connection cn = Con.conectar();
            String consulta = "DELETE FROM TB_PERSONA WHERE CUI = ?";   
            PreparedStatement ps = cn.prepareStatement(consulta);  
            ps.setString(1, pCUI);
            ps.executeQuery();
            Resp = 1;
            
        }catch(SQLException Ex){
            System.out.println(Ex.getMessage());
        } 
        return Resp;
 }
    
   
}
