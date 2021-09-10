package miprimerobjetog03;


import java.lang.ProcessHandle.Info;
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ersolano
 */
public class Grupo {
    private int numero;
    private String horario;
    private int cupo;
    private String aula;
    private String sede;
    private Profesor elProfesor;    // declaracion que representa la asociacion con Profesor
    private Curso elCurso;          // declaracion que representa la asociacion con Curso
    private ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
    private ArrayList<Calificacion> resultados = new ArrayList<Calificacion>();
    
    

    public Grupo() {
    }

    public Grupo(int numero, int cupo, Profesor elProfesor, Curso elCurso) {
        this.numero = numero;
        this.cupo = cupo;
        this.elProfesor = elProfesor;
        this.elCurso = elCurso;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public Profesor getElProfesor() {
        return elProfesor;
    }

    public void setElProfesor(Profesor elProfesor) {
        this.elProfesor = elProfesor;
    }

    public Curso getElCurso() {
        return elCurso;
    }

    public void setElCurso(Curso elCurso) {
        this.elCurso = elCurso;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "Grupo:" + "numero=" + numero + ", horario=" + horario + 
                ", cupo=" + cupo + ", aula=" + aula + ", sede=" + sede + 
                ", elProfesor=" + elProfesor + ", elCurso=\n" + elCurso + 
                "estudiantes=\n" + estudiantes + '\n';
    }
    
    public boolean agregarEstudiante(Estudiante unEstudiante){
        
        for (int i = 0; i < estudiantes.size(); i++) {          // forl + TAB
            Estudiante actual = estudiantes.get(i);
            if (actual.getCarne() == unEstudiante.getCarne()){
                return false;
            }            
        }
        estudiantes.add(unEstudiante);
        return true;
    }
       
    public Estudiante consultarEstudiante(int carne){
        for (Estudiante actual : estudiantes) {
            if (actual.getCarne() == carne){
                return actual;
            }
        }
        return null;  // null es para decir que no fue hallado
    }
    
    public boolean modificarEstudiante(int carne, double nuevoPromedio){
        for (Estudiante actual : estudiantes) {
            if (actual.getCarne() == carne){
                actual.setPromedio(nuevoPromedio);
                return true;
            }            
        }
        return false;
    }
    
    public boolean eliminarEstudiante(int carne){
        for (Estudiante actual : estudiantes) {
            if (actual.getCarne() == carne){
                estudiantes.remove(actual);
                return true;
            }            
        }
        return false;
    }

    /*
    Metodo del punto 5 agregarEvaluacion:
    Agrega a la lista de resultados una evaluacion con parametros especificos.
    */
    public boolean agregarEvaluacion(int carne, String nombreRubro, TEvaluacion tipo, double nota) {
        Estudiante estudiante = consultarEstudiante(carne);                     // Se obtienen objetos ya creados
        Rubro_Evaluacion rubro = elCurso.consultarRubro(tipo, nombreRubro);     // para el objeto Calificacion
        if(estudiante == null || rubro == null || nota > 100 || nota < 0 ){     // Se revisa si estos objetos se
            return false;                                                       // encontraron o no existe alguno
        }
        for(Calificacion actual : resultados) {
            if(actual.getUnEstudiante() == estudiante && actual.getUnaEvaluacion() == rubro) {  // Se revisa que no
                return false;                                                           // exista un duplicado en las 
            }                                                                           // calificaciones
        }
        Calificacion calificacion = new Calificacion(rubro, estudiante, nota);  // Se crea la calificacion
        this.resultados.add(calificacion);                                      // se agrega a la lista
        return true;
    }

    /*
    Metodo del punto 6 obtenerPromedio:
    Obtiene el promedio actual del estudiante
    */
    public double obtenerPromedio(int carne) {
        double resultado = 0;                   // variable para ir guardando el promedio
        double porcentaje;                      // variables donde se almacenaran temporalmente
        double nota;                            // numeros para obtener el promedio
        for (Calificacion actual : resultados) {
            if (actual.getUnEstudiante().getCarne() == carne){      // se recorre la lista de resultados en busca
                porcentaje = (actual.getUnaEvaluacion().getPorcentaje());   // de todas las evaluaciones con el carne
                nota = actual.getNota() / 100;                              // de la persona solicitada
                resultado += (porcentaje * nota);                           // luego se obtiene el procentaje que
            }                                                               // vale el rubro y la nota que obtuvo
        }                                                                   // se multiplican y se suman los otros
        return resultado;                                                   // para obtener el promedio y retornarlo
    }
    /*
    Metodo #7 Desglosar promedio
    Obtiene el desglose completo de un estudiante
    */
    public String desglosePromedio(int carnet){
        String desglose = "";                   //variables donde se guardaran los datos de notas y evaluaciones
        String evaluaciones = "";
        double promedioFinal = 0;
        double porcentaje;
        double nota;
        for (Calificacion actual : resultados) {
            if (actual.getUnEstudiante().getCarne() == carnet){      //Recorre la lista de resultados buscando coincidencias con el carné
                String nombre = (actual.getUnEstudiante().getNombre());
                int carne = actual.getUnEstudiante().getCarne();
                porcentaje = actual.getUnaEvaluacion().getPorcentaje();
                nota = actual.getNota() / 100;
                promedioFinal += porcentaje * nota;

                desglose = "\n-----Promedio desglosado del estudiante consultado-----"+'\n'+ 
                "Nombre: " + nombre + ", Carné: " + carne + ", Promedio Final: " + promedioFinal;
                evaluaciones += "Evaluacion: " + actual.getUnaEvaluacion().getNombre() + ", Tipo: " + //crea el desglose de evaluaciones del estudiante
                actual.getUnaEvaluacion().getTipo() + ", Porcentaje: " + actual.getUnaEvaluacion().getPorcentaje() + 
                ", Nota Obtenida: " + actual.getNota() + ", Porcentaje obtenido: " + (actual.getUnaEvaluacion().getPorcentaje() * actual.getNota()) / 100 +'\n';             
            }   
        }
        return desglose + '\n' + evaluaciones ;
    }
}
