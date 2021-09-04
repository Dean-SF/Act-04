/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerobjetog03;

/**
 *
 * @author ersolano
 */
public class PruebaUsuarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
       Usuario misDatos;            // declaracion de una instancia - variable de tipo Usuario
       misDatos = new Usuario();    // instanciación del objeto con un constructor default.
       
       // inicialización de estado del objeto a través de setters
       misDatos.setNombre("Bianka");
       misDatos.setLogin("BMora");
       misDatos.setPassword("abcde");
       misDatos.setEdad(18);
       System.out.println( misDatos.toString()) ;
       
       if (misDatos.getEstado() == TEstado.BLOQUEADO){
           System.out.println("El usuario " +misDatos.getNombre() + " está bloqueado");
       }
       
       //creación de una instancia utilizando un constructor sobrecargado
       Usuario usuario2 = new Usuario("Luis", "LPerez", "1234");
       usuario2.setNombre("Luis Andrés");
       usuario2.setEstado(TEstado.BLOQUEADO);
       System.out.println(usuario2);
        
        
       Usuario usuario3=new Usuario() ;
       usuario3.setNombre("Karla");
       System.out.println(usuario3);
       
       // redefinición del valor de un atributo de clase que controla la 
       // máxima cantidad de intentos de acceso a un usuario.
       Usuario.setMaximoIntentos(1);
       
       
       //Visualización de contenido de las instancias creadas
       System.out.println(misDatos + "\n" + usuario2 + "\n" + usuario3);
       
    }
    
    
    
}
