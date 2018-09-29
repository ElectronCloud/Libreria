package libreria;

/**
 *
 * @author Juan Carrero
 */

public class Libro {
    /**
     * Clase que permite crear objetos tipo Libro, los cuales tienen ciertas caracteristicas, que a su vez
     * son suministradas por el enecargado de la libreria
     */
    private String nombre;
    private String autor;
    private String editorial;
    private double precio;
    private String tipo;//si es verdadero el tipo es universitario, si no es literario
    private String estado;//si es verdadero el tipo es nuevo, si no es usado
    private double descuento;

    public Libro(String nombre, String autor, String editorial, double precio, String tipo, String estado, double descuento) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.precio = precio;
        this.tipo = tipo;
        this.estado = estado;
        this.descuento = descuento;
    }

    public Libro(String nombre, String autor, String editorial, double precio, String tipo, String estado) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.precio = precio;
        this.tipo = tipo;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    
}
