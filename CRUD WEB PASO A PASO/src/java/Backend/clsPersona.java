
package Backend;

import DAO.clsQuerys;


public class clsPersona {
      public String CUI;
      public String Nombre;
      public String Puesto;
      public Double Salario;

    public clsPersona() {
    }
    
    public clsPersona(String CUI, String Nombre, String Puesto, Double Salario) {
        this.CUI = CUI;
        this.Nombre = Nombre;
        this.Puesto = Puesto;
        this.Salario = Salario;
    }

    public String getCUI() {
        return CUI;
    }

    public void setCUI(String CUI) {
        this.CUI = CUI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double Salario) {
        this.Salario = Salario;
    }
      
    public int fncRegistro(clsPersona pPersona) throws Exception{
        int Resp = 0;
        clsQuerys objConsulta = new clsQuerys();
        if (objConsulta.fncIngresoPersona(pPersona)==1){
            Resp = 1;
        }
        
        return Resp;
    }  
    
    public int fncModifica(clsPersona pPersona) throws Exception{
        int Resp = 0;
        clsQuerys objConsulta = new clsQuerys();
        if (objConsulta.fncModificaPersona(pPersona)==1){
            Resp = 1;
        }
        
        return Resp;
    } 
    
     public int fncElimina(String pCUI) throws Exception{
        int Resp = 0;
        clsQuerys objConsulta = new clsQuerys();
        if (objConsulta.fncEliminaPersona(pCUI)==1){
            Resp = 1;
        }
        
        return Resp;
    } 
       
}
