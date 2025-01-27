
package BACKEND;


public class clsPersona {

    public clsPersona() {
    }

    public clsPersona(String Nombre, String Apellido, String CUI) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.CUI = CUI;
    }
    
    
    /* ATRIBUTOS */
    public String Nombre;
    public String Apellido;
    public String CUI;
    /*METODOS*/
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCUI() {
        return CUI;
    }

    public void setCUI(String CUI) {
        this.CUI = CUI;
    }
    
    
    
}
