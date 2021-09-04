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
public class Calificacion {
    private Rubro_Evaluacion unaEvaluacion;
    private Estudiante unEstudiante;
    private double nota;

    public Calificacion(Rubro_Evaluacion unaEvaluacion, Estudiante unEstudiante, double nota) {
        this.unaEvaluacion = unaEvaluacion;
        this.unEstudiante = unEstudiante;
        this.nota = nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public Estudiante getUnEstudiante() {
        return unEstudiante;
    }

    public Rubro_Evaluacion getUnaEvaluacion() {
        return unaEvaluacion;
    }

    @Override
    public String toString() {
        return "Calificacion{" + "unaEvaluacion=" + unaEvaluacion + 
                ", unEstudiante=" + unEstudiante + 
                ", nota=" + nota + '}';
    }
    
    
    
            
    
}
