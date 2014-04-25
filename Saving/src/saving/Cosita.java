package saving;

/**
 *
 * @author Estefanía Neitzky
 */
public class Cosita {
    private String nombre;
    private String utilidad;
    private Integer cantidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(String utilidad) {
        this.utilidad = utilidad;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Cosita() {
    }

    public Cosita(String nombre, String utilidad, Integer cantidad) {
        this.nombre = nombre;
        this.utilidad = utilidad;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "nombre= " + nombre + ", cantidad=" + cantidad ;
    }
    
    
}
