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
public class PruebaCursos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo soy nuevo en Java");
        System.out.println("Me llamo Ericka");
        
        int cantidad = 0;
        boolean seguir = false;
        double precio = 0;

        String nombre = null;
        Curso miCurso = null;   // declaración de una instancia, variable de tipo Curso
        miCurso = new Curso("Programacion Orientada a Objetos", "IC2101", 3);   //  instanciación del objeto
        System.out.println(Curso.getNOTA_APROBACION());        
        System.out.println(miCurso.getCodigo() + "-" + miCurso.getNombre() + "-" + miCurso.getCreditos());
        
        
        
        Curso cursoED = new Curso();   // declaracion e instanciacion del objeto Curso
        cursoED.setCodigo("IC2001");
        cursoED.setNombre("Estructuras de Datos");
        cursoED.setCreditos(4);
        cursoED.setHoras(4);
        cursoED.setAsistenciaObligatoria(true);
        
        cursoED.agregarRubro(01, "Tarea 1", 5, TEvaluacion.TAREA);
        cursoED.agregarRubro(02, "Tarea 2", 5, TEvaluacion.TAREA);
        cursoED.agregarRubro(03, "Quiz 1", 2, TEvaluacion.QUIZ);
        cursoED.agregarRubro(04, "Quiz 2", 2, TEvaluacion.QUIZ);
        cursoED.agregarRubro(05, "Quiz 3", 2, TEvaluacion.QUIZ);
        System.out.println(cursoED);
        
        Rubro_Evaluacion rubro = cursoED.consultarRubro(05, "Quiz 2");
        if (rubro != null){
            System.out.println("los detalles del rubro encontrado son " + rubro.toString());
        }
        else{
            System.out.println("El rubro solicitado no se encuentra registrado");
        }
        
        cursoED.modificarRubro(05, "Quiz 3", 5);
        
        cursoED.eliminarRubro(03, "Quiz 1");
        
        System.out.println(cursoED);
        
        
    }
    
}
