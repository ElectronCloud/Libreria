/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;
import java.util.Scanner;
/**
 *
 * @author Hernán Quiroga
 */
public class Libreria {
    
   // private Libro[] libros;
    
    /**
     * @param args the command line arguments
     */
    
    private Libro[] libros;

    public Libreria(Libro[] libros) {
        this.libros = libros;
    }

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Libro cienAñosSoledad = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", "Planeta", 33000, false, false);
        Libro levedadDelSer = new Libro("La insoportable levedad del ser", "Milan Kundera", "Acantilado", 40000, false, true);
        Libro[] libros = new Libro[10];
        libros[0] = cienAñosSoledad;
        libros[1] = levedadDelSer;
        
        
        Libreria ruiz = new Libreria(libros);
        
        Libro[] resultados = ruiz.buscarPorNombre(scanner.nextLine());
        
        for(Libro libro:resultados){
            if(libro != null)System.out.println(libro.getNombre());
        }
      
    }
        
    /**
     * 
     * @param busqueda el substring a comparar
     * @return 
     */
    public Libro[] buscarPorNombre(String busqueda){
        Libro[] librosBuscados = new Libro[10];
        int contadorLibrosBuscados = 0;
        for (Libro libro : libros) {
            if (libro != null) {
                if (libro.getNombre().toLowerCase().contains(busqueda.toLowerCase())) {
                    librosBuscados[contadorLibrosBuscados] = libro;
                    contadorLibrosBuscados++;
                }
            }
        }
        return librosBuscados;
    }
    
}
