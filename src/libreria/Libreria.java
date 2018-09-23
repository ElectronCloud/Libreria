/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;
import java.util.Scanner;
/**
 *
 * @author Hernan Quiroga
 */
public class Libreria {
    
    
    /**
     * @param args the command line arguments
     */
    
    private Libro[] libros;

    public Libreria(Libro[] libros) {
        this.libros = libros;
    }

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Libro cienAñosSoledad = new Libro("Cien anios de soledad", "Gabriel Garcia Marquez", "Planeta", 33000, "Literario", "Usado");
        Libro levedadDelSer = new Libro("La insoportable levedad del ser", "Milan Kundera", "Acantilado", 40000, "Literario", "Nuevo");
        Libro[] libros = new Libro[10];
        libros[0] = cienAñosSoledad;
        libros[1] = levedadDelSer;
        
        
        Libreria ruiz = new Libreria(libros);
        
        System.out.println("Bienevenido a la libreria Artes Graficas Ruiz");
        System.out.println("Cual es la accion que desea realizar:");
        System.out.println("1. Buscar por nombre");
        System.out.println("2. Buscar por autor");
        System.out.println("3. Buscar por estado");
        System.out.println("4. Buscar por tipo");
        System.out.println("5. Mostrar inventario");
        System.out.println("6. Anadir libro");
        System.out.println("7. Extraer libro");
        
        int opcion=scanner.nextInt();
        
        
        switch (opcion){
            case 1:
                System.out.println("Ingrese el nombre del libro: ");
                String nombre=scanner.nextLine();
                Libro[] resultados1 = ruiz.buscarPorNombre(scanner.nextLine());
        
        /*
          Ciclo for que recorre los libros generados por el metodo anterior y muestra la informacion de cada uno
        */
        
        
                ruiz.mostrarInfo(resultados1);
      
        break;
        
           case 2:
                System.out.println("Ingrese el nombre del autor");
                String autor=scanner.nextLine();
                Libro[] resultados2 = ruiz.buscarPorAutor(scanner.nextLine());
                
                ruiz.mostrarInfo(resultados2);
                
         break;
         
           case 3:
               System.out.println("Ingrese el estado");
               String estado=scanner.nextLine();
               Libro[] resultados3 = ruiz.buscarPorEstado(scanner.nextLine());
               ruiz.mostrarInfo(resultados3);
               
               break;
               
               
               case 4:
               System.out.println("Ingrese el tipo");
               String tipo=scanner.nextLine();
               Libro[] resultados4 = ruiz.buscarPorEstado(scanner.nextLine());
               ruiz.mostrarInfo(resultados4);
               
               break;
               
               case 5:
               Libro[] resultados5 = ruiz.mostrarInventario();
               ruiz.mostrarInfo(resultados5);
               break;
               
               case 6:
                   System.out.println("Ingrese nombre del libro: ");
                   String nomb=scanner.nextLine();
                   System.out.println("Ingrese nombre del autor: ");
                   String au=scanner.next();
                   System.out.println("Ingrese la editorial: ");
                   String editorial=scanner.next();
                   System.out.println("Ingrese el precio: ");
                   double precio=scanner.nextDouble();
                   System.out.println("Ingrese el tipo del libro: ");
                   String tip=scanner.next();
                   System.out.println("Ingrese el estado del libro: ");
                   String est=scanner.next();
                   Libro libro= new Libro(nomb,au,editorial,precio,tip,est);
                   ruiz.anadirLibro(libro);
                   
               Libro[] resultados6 = ruiz.mostrarInventario();
               ruiz.mostrarInfo(resultados6);
               break;
        }
       
        
      
    }
        
   public void mostrarInfo(Libro[] libros){
                /*
        Ciclo for que recorre los libros generados por el metodo anterior y muestra la informacion de cada uno
        */
        for(Libro libro:libros){
            if(libro != null){
                System.out.println("Nombre: "+libro.getNombre());
                System.out.println("Autor: "+libro.getAutor());
                System.out.println("Editorial: "+libro.getEditorial());
                System.out.println("Precio: "+libro.getPrecio());
                System.out.println("Tipo: "+libro.getTipo());
                System.out.println("Estado: "+libro.getEstado());
                System.out.println();
            }
            
        }
   }
   
    /**
     * 
     * @param busqueda el substring a comparar
     * @return Libros que tienen en su nombre, la palabra de busqueda
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
    
    /**
     * 
     * @param busqueda substring a comparar para el atributo autor del libro
     * @return Libro que tienen el mismo autor
     */
    public Libro[] buscarPorAutor(String busqueda){
        Libro[] librosBuscados = new Libro[10];
        int contadorLibrosBuscados = 0;
        for (Libro libro : libros) {
            if (libro != null) {
                if (libro.getAutor().toLowerCase().contains(busqueda.toLowerCase())) {
                    librosBuscados[contadorLibrosBuscados] = libro;
                    contadorLibrosBuscados++;
                }
            }
        }
        return librosBuscados;
    }
    
    public Libro[] buscarPorEstado(String busqueda){
        Libro[] librosBuscados = new Libro[10];
        int contadorLibrosBuscados = 0;
        for (Libro libro : libros) {
            if (libro != null) {
                if (libro.getEstado().toLowerCase().contains(busqueda.toLowerCase())) {
                    librosBuscados[contadorLibrosBuscados] = libro;
                    contadorLibrosBuscados++;
                }
            }
        }
        return librosBuscados;
    }
    
    public Libro[] buscarPorTipo(String busqueda){
        Libro[] librosBuscados = new Libro[10];
        int contadorLibrosBuscados = 0;
        for (Libro libro : libros) {
            if (libro != null) {
                if (libro.getTipo().toLowerCase().contains(busqueda.toLowerCase())) {
                    librosBuscados[contadorLibrosBuscados] = libro;
                    contadorLibrosBuscados++;
                }
            }
        }
        return librosBuscados;
    }
    
    public Libro[] mostrarInventario(){
        Libro[] librosBuscados = new Libro[10];
        int contadorLibrosBuscados = 0;
        for (Libro libro : libros) {
            if (libro != null) {
                
                    librosBuscados[contadorLibrosBuscados] = libro;
                    contadorLibrosBuscados++;
                
            }
        }
        return librosBuscados;
    }
    
    public boolean anadirLibro(Libro libro){
        
        for (int i=0; i<libros.length; i++) {
           if(libros[i]==null){
                libros[i]=libro;
                System.out.println("Adicion exitosa");
                return true;
            }
           
        }
        return false;
    
}
}
