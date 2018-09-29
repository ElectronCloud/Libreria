package libreria;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Juan Carrero
 */
public class Libreria {
    
    
    /**
     * @param args the command line arguments
     */
    
    private ArrayList<Libro>libros;
    private ArrayList<Libro> pedidos;

    public Libreria(ArrayList<Libro> libros, ArrayList<Libro> pedidos) {
        this.libros = libros;
        this.pedidos = pedidos;
    }
    
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        /*
        Creacion de libros en el inventario y su almaceniamiento en el arraylist
        */
        ArrayList<Libro>libros=new ArrayList<Libro>();
        Libro cienAñosSoledad = new Libro("Cien anios de soledad", "Gabriel Garcia Marquez", "Planeta", 33000, "Literario", "Usado", 12);
        Libro levedadDelSer = new Libro("La insoportable levedad del ser", "Milan Kundera", "Acantilado", 40000, "Literario", "Nuevo");
        Libro manPsiClinica = new Libro("Manual de Psiquiatría Clinica", "Benjamin James", "Barcelona Wolters Kluwer", 55000, "Universitario", "Usado", 10);
        Libro prograC = new Libro("Programacion imperativa con lenguaje C", "Omar Ivan", "Buritica", 28000, "Universitario", "Nuevo");
        Libro algLineal = new Libro("Algebra Lineal", "Monsalve Gomez", "Rustica", 72000, "Universitario", "Usado", 15);
        Libro opioNubes = new Libro("Opio en las Nubes", "Chaparro Madiedo", "Icono", 17000, "Literario", "Usado");
        Libro probsContPsi = new Libro("Problemas contemporaneos en psicología educativa", "Arias Cardona", "La Sabana", 120000, "Universitario", "Nuevo", 8);
        Libro hamlet = new Libro("Hamlet", "William Shakespeare", "Cono sur", 46000, "Literario", "Usado");
        Libro balanceCampDisc = new Libro("Balance en un campo discursivo", "Marin Diaz", "Un Pedagogica", 13000, "Universitario", "Usado", 13.7);
        Libro sobPoder = new Libro("Sobre el Poder", "William Shakespeare", "Taurus", 63000, "Literario", "Nuevo");
        libros.add(cienAñosSoledad);
        libros.add(levedadDelSer);
        libros.add(manPsiClinica);
        libros.add(prograC);
        libros.add(algLineal);
        libros.add(opioNubes);
        libros.add(probsContPsi);
        libros.add(hamlet);
        libros.add(balanceCampDisc);
        libros.add(sobPoder);
        
        /*
        Creacion de libros en la lista de pedidos y su almacenamiento en el arraylist
        */
        
        ArrayList<Libro>pedidos=new ArrayList<Libro>();
        
        Libro calculoUnaVar = new Libro("Calculo de una variable", "James Stewart", "Cengage Learning", 35000, "Universitario", "Nuevo");
        Libro divinaComedia = new Libro("La divina comedia", "Dante Alighieri", "Porrua", 15000, "Literario", "Usado");
        Libro decameron = new Libro("Decameron", "Giovanni Boccaccio", "Catedra", 26000, "Literario", "Nuevo");
        Libro cirElec = new Libro("Circuitos electricos", "Jesus Fraile Mora", "Prentice Hall", 65000, "Universitario", "Nuevo");
        Libro meta = new Libro("La metamorfosis", "Franz Kafka", "Alianza Editorial", 20000, "Literario", "Usado");
        
        pedidos.add(calculoUnaVar);
        pedidos.add(divinaComedia);
        pedidos.add(decameron);
        pedidos.add(cirElec);
        pedidos.add(meta);
        
        Libreria ruiz = new Libreria(libros, pedidos);
        
        /*
        Menu de acciones que se pueden realizar en la libreria
        */
        
        System.out.println("Bienevenido a la libreria Artes Graficas Ruiz");
        System.out.println("Cual es la accion que desea realizar:");
        System.out.println("1. Buscar por nombre");
        System.out.println("2. Buscar por autor");
        System.out.println("3. Buscar por estado");
        System.out.println("4. Buscar por tipo");
        System.out.println("5. Mostrar inventario");
        System.out.println("6. Anadir libro");
        System.out.println("7. Extraer libro");
        System.out.print("Opcion: ");
        
        int opcion=scanner.nextInt();
        
        switch (opcion){
            case 1:
                System.out.println("Ingrese el nombre del libro: ");
                String nombre=scanner.nextLine();
                ArrayList<Libro>resultados1= ruiz.buscarPorNombre(scanner.nextLine());
                ruiz.mostrarInfo(resultados1);
      
        break;
        
           case 2:
                System.out.println("Ingrese el nombre del autor");
                String autor=scanner.nextLine();
                ArrayList<Libro> resultados2 = ruiz.buscarPorAutor(scanner.nextLine());
                ruiz.mostrarInfo(resultados2);
                
         break;
         
           case 3:
               System.out.println("Ingrese el estado");
               String estado=scanner.nextLine();
               ArrayList<Libro> resultados3 = ruiz.buscarPorEstado(scanner.nextLine());
               ruiz.mostrarInfo(resultados3);
               
               break;
               
               case 4:
               System.out.println("Ingrese el tipo");
               String tipo=scanner.nextLine();
               ArrayList<Libro> resultados4 = ruiz.buscarPorTipo(scanner.nextLine());
               ruiz.mostrarInfo(resultados4);
               
               break;
               
               case 5:
               ArrayList<Libro> resultados5 = ruiz.mostrarInventario();
               ruiz.mostrarInfo(resultados5);
               break;
               
               case 6:
                   System.out.println("Anadir a inventario o pedido");
                   scanner.skip("\n");
                   String elecc=scanner.nextLine();
                   System.out.println("Ingrese nombre del libro: ");
                   String nomb=scanner.nextLine();
                   System.out.println("Ingrese nombre del autor: ");
                   String au=scanner.nextLine();
                   System.out.println("Ingrese la editorial: ");
                   String editorial=scanner.nextLine();
                   System.out.println("Ingrese el precio: ");
                   double precio=scanner.nextDouble();
                   System.out.println("Ingrese el tipo del libro: ");
                   String tip=scanner.next();
                   System.out.println("Ingrese el estado del libro: ");
                   String est=scanner.next();
                   Libro libro= new Libro(nomb,au,editorial,precio,tip,est);
                   
                   if("inventario".equals(elecc) || "Inventario".equals(elecc)){
                       boolean pol=true;
                   ruiz.anadirLibro(libro, pol);
                   }
                   if("pedido".equals(elecc) || "Pedido".equals(elecc)){
                       boolean pol=false;
                   ruiz.anadirLibro(libro, pol);
                   }
                   
                   
               break;
               
               case 7:
                   System.out.println("Extraer de inventario o pedido");
                   scanner.skip("\n");
                   String sel=scanner.nextLine();
                   System.out.println("Ingrese el nombre del libro:");
                   String titulo=scanner.nextLine();
                   System.out.println("Ingrese el autor:");
                   String aut=scanner.nextLine();
                   
                   if("inventario".equals(sel) || "Inventario".equals(sel)){
                       boolean pol=true;
                   ruiz.extraerLibro(titulo, aut, pol);
                   }
                   if("pedido".equals(sel) || "Pedido".equals(sel)){
                       boolean pol=false;
                   ruiz.extraerLibro(titulo, aut, pol);
                   }
                   
               break;
               
               default:
                    System.out.println("Opcion Invalida");
        }
       
    }
        
    /**
     * 
     * @param lib Recibe como parametro un arraylist de libros para asi poder mostrar la informacion de cada uno
     */
    
   public void mostrarInfo(ArrayList<Libro> lib){
        for(Libro libro:lib){
            if(libro != null){
                System.out.println("Nombre: "+libro.getNombre());
                System.out.println("Autor: "+libro.getAutor());
                System.out.println("Editorial: "+libro.getEditorial());
                System.out.println("Precio: "+libro.getPrecio());
                System.out.println("Tipo: "+libro.getTipo());
                System.out.println("Estado: "+libro.getEstado());
                System.out.println("Descuento: "+libro.getDescuento()+"%");
                System.out.println();
            }
        }
   }
    /**
     * 
     * @param busqueda el substring a comparar
     * @return Libros que tienen en su nombre, la palabra de busqueda
     */
   
    public ArrayList<Libro> buscarPorNombre(String busqueda){
        ArrayList<Libro>librosBuscados=new ArrayList();
        for (Libro libro : libros) {
            if (libro != null) {
                if (libro.getNombre().toLowerCase().contains(busqueda.toLowerCase())) {
                    librosBuscados.add(libro);
                }
            }
        }
        return librosBuscados;
    }
    /**
     * 
     * @param busqueda substring a comparar para el atributo autor del libro
     * @return Libros que tienen el mismo autor
     */
    public ArrayList<Libro> buscarPorAutor(String busqueda){
        ArrayList<Libro> librosBuscados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro != null) {
                if (libro.getAutor().toLowerCase().contains(busqueda.toLowerCase())) {
                    librosBuscados.add(libro);
                }
            }
        }
        return librosBuscados;
    }
    
    /**
     * 
     * @param busqueda substring a comparar para el atributo estado del libro
     * @return Libros que tienen el mismo estado
     */
    
    public ArrayList<Libro> buscarPorEstado(String busqueda){
        ArrayList<Libro> librosBuscados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro != null) {
                if (libro.getEstado().toLowerCase().contains(busqueda.toLowerCase())) {
                    librosBuscados.add(libro);
                }
            }
        }
        return librosBuscados;
    }
    
    /**
     * 
     * @param busqueda substring a comparar para el atributo tipo del libro
     * @return Libros que tienen el mismo tipo
     */
    
    public ArrayList<Libro> buscarPorTipo(String busqueda){
        ArrayList<Libro> librosBuscados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro != null) {
                if (libro.getTipo().toLowerCase().contains(busqueda.toLowerCase())) {
                    librosBuscados.add(libro);
                }
            }
        }
        return librosBuscados;
    }
    
    /**
     * 
     * @return Conjunto de libros que se encuentran actualmente en el inventario de la libreria
     */
    
    public ArrayList<Libro> mostrarInventario(){
        ArrayList<Libro> librosBuscados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro != null) {
                    librosBuscados.add(libro);
                
            }
        }
        return librosBuscados;
    }
    
    /**
     * 
     * @return Libros que estan en la lista de pedidos por parte de la libreria
     */
    
    public ArrayList<Libro> mostrarPedidos(){
        ArrayList<Libro> librosBuscados = new ArrayList<>();
        for (Libro libro : pedidos) {
            if (libro != null) {
                    librosBuscados.add(libro);
            }
        }
        return librosBuscados;
    }
    
    /**
     * 
     * @param libro libro que sera anadido a la coleccion de libros del inventario o de pedidos
     * @param grup Identifica a que coleccion se va a anadir el libro
     */
    
    public void anadirLibro(Libro libro, boolean grup){
        if(grup==true){
                libros.add(libro);
                System.out.println("Adicion exitosa");
           
        }
        if(grup==false){
                pedidos.add(libro);
                System.out.println("Adicion exitosa");
            
        }
    }

    
    /**
     * 
     * @param titulo Identidica el nombre del libro a extraer
     * @param autor Identifica el autor del libro a extraer, informacion necesario por si existe mas de un libro
     * con el mismo nombre
     * @param grop Identifica la coleccion de libros a la cual se va a extraer un libro
     */
    public void extraerLibro(String titulo, String autor, boolean grop){
          if(grop==true){
            for (int i=0; i<libros.size(); i++){
                Libro libro = libros.get(i);
                if(libro!= null && libro.getNombre().toLowerCase().contains(titulo.toLowerCase())&& libro.getAutor().toLowerCase().contains(autor.toLowerCase())){
                libros.remove(libro);
                
            }
        }
        }
        
        if(grop==false){
            for (int i=0; i<pedidos.size(); i++){
                Libro libro = pedidos.get(i);
                if(libro!= null && libro.getNombre().toLowerCase().contains(titulo.toLowerCase())&& libro.getAutor().toLowerCase().contains(autor.toLowerCase())){
                pedidos.remove(libro);
                
            }
        }
        }
    }

}