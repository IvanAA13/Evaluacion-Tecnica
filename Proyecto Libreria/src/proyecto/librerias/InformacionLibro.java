/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.librerias; 
/**
 *
 * @author i_a_a
 */
import java.util.ArrayList;
import org.biblioteca.interfaces.Libro;
import java.util.List;
public class InformacionLibro implements Libro{
    
    int id, unidadesDisponibles;
    String titulo, descripcion, nombreLibro;

    
    List<List<String>> libro1= new ArrayList<>();
    List<List<String>> libro2= new ArrayList<>();
   // List<List<String>> libro3= new ArrayList<>();
    

    public InformacionLibro(){
        this.libro1 = new ArrayList<>();
        this.libro2 = new ArrayList<>();
    
        for(int i =0; i<= 3; i++){
            libro1.add(new ArrayList<>());
            libro2.add(new ArrayList<>());
          
        }
        
        libro1.get(0).add("152");
        libro2.get(0).add("153");
        
        
        libro1.get(1).add("El llano en llamas");
        libro2.get(1).add("La metamorfosis");
        
        
        libro1.get(2).add("(Compilación de cuentos escritos por Juan Rulfo)");
        libro2.get(2).add("Escrito por Frank Kafka");
      
        
        libro1.get(3).add("150");
        libro2.get(3).add("30");
        
        
    }
    
    

    @Override
    public String getInformacion() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       // nombreLibro = titulo+ " " +descripcion + "-" + unidadesDisponibles +" " + "unidades disponibles" + " " + "("+id+")";
       for (int i = 0; i <= libro1.get(0).size()-1; i++) {
           nombreLibro = libro1.get(0).get(i) + " " + libro1.get(1).get(i)+ 
                    libro1.get(2).get(i) + " " + libro1.get(3).get(i);
            System.out.println(nombreLibro);
        } 
       for (int i = 0; i <= libro2.get(0).size()-1; i++) {
           nombreLibro = libro2.get(0).get(i) + " " + libro2.get(1).get(i)+ 
                    libro2.get(2).get(i) + " " + libro2.get(3).get(i);
            //System.out.println(nombreLibro);
        } 
       return nombreLibro;
    }
    
    
}
