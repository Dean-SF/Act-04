package miprimerobjetog03;


import java.util.ArrayList;
import miprimerobjetog03.Curso;
import miprimerobjetog03.Estudiante;
import miprimerobjetog03.Profesor;

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
    private ArrayList<Estudiante> estudiantes = new ArrayList();
    private ArrayList<Calificacion> resultados = new ArrayList();
    
    

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
                ", elProfesor=" + elProfesor + ", elCurso=" + elCurso + 
                ", estudiantes=" + estudiantes + '\n';
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
       
    public Estudiante consultar(int carne){
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
    
}
