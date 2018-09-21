/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

/**
 *
 * @author Hernán Quiroga
 */
public class Libro {
    private String nombre;
    private String autor;
    private String editorial;
    private double precio;
    private boolean tipo;//si es verdadero el tipo es universitario, si no es literario
    private boolean estado;//si es verdadero el tipo es nuevo, si no es de segunda mano
    private double descuento;

    public Libro(String nombre, String autor, String editorial, double precio, boolean tipo, boolean estado, double descuento) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.precio = precio;
        this.tipo = tipo;
        this.estado = estado;
        this.descuento = descuento;
    }

    public Libro(String nombre, String autor, String editorial, double precio, boolean tipo, boolean estado) {
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

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    
}
