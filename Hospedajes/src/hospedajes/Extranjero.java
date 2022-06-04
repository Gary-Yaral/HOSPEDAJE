
package hospedajes;


public class Extranjero {
    private String DNI, nombre, pais, sexo, enfermedades;
    private int edad, cantidadDias;
    private double aporteEconomico;
   
    public Extranjero(){
        
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String idExtranjero) {
        this.DNI = idExtranjero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public double getAporteEconomico() {
        return aporteEconomico;
    }

    public void setAporteEconomico(double aporteEconomico) {
        this.aporteEconomico = aporteEconomico;
    }
    
}
