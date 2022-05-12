/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.librerias;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.biblioteca.excepciones.LibroNoEncontradoException;
import org.biblioteca.interfaces.Buscar;
import org.biblioteca.interfaces.Libro;

/**
 *
 * @author i_a_a
 */
public class BuscarLibro implements Buscar{

    List<String> list = new ArrayList<>();
    
    boolean resultadoBusqueda;
    String palabraClave;
    
    public BuscarLibro(){
    this.list = new ArrayList<>();
    
    list.add(String.valueOf(152));
        list.add("El llano en llamas");
        list.add("Compilación de cuentos escritos por Juan Rulfo");
        list.add(String.valueOf(150));
        
        list.add(String.valueOf(153));
        list.add("Metamorfosis");
        list.add("Escrito por Frank Kafka");
        list.add(String.valueOf(50));
        
        list.add(String.valueOf(154));
        list.add("Cien años de soledad");
        list.add("Escrito por Gabriel García Márquez");
        list.add(String.valueOf(80));

    
}
    
    @Override
    public List<Libro> buscar(String... strings) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("¿Que titulo de libro desea buscar?");
        palabraClave = entradaTeclado.nextLine();
        
        if(list.toString().contains(palabraClave)){
            InformacionLibro il = new InformacionLibro();
            il.getInformacion();
            System.out.println("Libro Existe----->" + il.getInformacion());
            
        } 
        else{
            throw  new LibroNoEncontradoException();
            
        }
        return null;
        
    }
}
