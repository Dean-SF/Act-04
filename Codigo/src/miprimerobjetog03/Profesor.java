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
public class Profesor {
    private int id;
    private String nombre;
    private String especialidad;
    private TGrado gradoAcademico; 

    public Profesor() {}

    public Profesor(int id, String nombre, String especialidad, TGrado gradoAcademico) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.gradoAcademico = gradoAcademico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public TGrado getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(TGrado gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    @Override
    public String toString() {
        return "Profesor:" + "id=" + id + ", nombre=" + nombre + 
                ", especialidad=" + especialidad + 
                ", gradoAcademico=" + gradoAcademico + '\n';
    }


    
    
}
