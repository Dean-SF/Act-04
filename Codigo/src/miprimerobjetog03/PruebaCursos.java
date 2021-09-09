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
        
        Curso cursoED = new Curso();   // declaracion e instanciacion del objeto Curso
        cursoED.setCodigo("IC2001");
        cursoED.setNombre("Estructuras de Datos");
        cursoED.setCreditos(4);
        cursoED.setHoras(4);
        cursoED.setAsistenciaObligatoria(true);
        
        cursoED.agregarRubro(01, "Tarea 1", 10, TEvaluacion.TAREA);
        cursoED.agregarRubro(02, "Tarea 2", 5, TEvaluacion.TAREA);
        cursoED.agregarRubro(03, "Quiz 1", 2, TEvaluacion.QUIZ);
        cursoED.agregarRubro(04, "Quiz 2", 2, TEvaluacion.QUIZ);
        cursoED.agregarRubro(05, "Quiz 3", 2, TEvaluacion.QUIZ);
        System.out.println(cursoED);
        System.out.println("------ Prueba de los metodos de ACT04 ------"+'\n'+" ");
        System.out.println(cursoED.validarRubros());
        System.out.println("La suma de rubros tipo quiz es: "+cursoED.sumarRubro(TEvaluacion.TAREA));
        System.out.println(cursoED.verRubro(TEvaluacion.TAREA));
        System.out.println("Se consulta el siguiente rubro: Tarea 1, tipo TEvaluacion.TAREA \n");
        Rubro_Evaluacion rubro2 = cursoED.consultarRubro(TEvaluacion.TAREA, "Tarea 1");
        if (rubro2 != null){
            System.out.println("Los detalles del rubro encontrado son " + rubro2.toString());
        }
        else{
            System.out.println("El rubro solicitado no se encuentra registrado");
        }
        
        
    }
    
}
