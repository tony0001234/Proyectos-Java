
package BACKEND;

public class clsEstudiante extends clsPersona{

    public clsEstudiante() {
    }

    public clsEstudiante(String Carnet, String Nombre, String Apellido, String CUI) {
        super(Nombre, Apellido, CUI);
        this.Carnet = Carnet;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getCarnet() {
        return Carnet;
    }

    public void setCarnet(String Carnet) {
        this.Carnet = Carnet;
    }

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
    
    
    
    public String Carrera;
    public String Carnet;
    
}
