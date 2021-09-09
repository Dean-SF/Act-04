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
public class Estudiante {
    private int carne;
    private String nombre;
    private String correo;
    private String celular;
    private double promedio;
    private TEstado estado;

    public Estudiante() {
    }

    public Estudiante(int carne, String nombre, String correo, String celular, 
                      double promedio, TEstado estado) {
        this.carne = carne;
        this.nombre = nombre;
        this.correo = correo;
        this.celular = celular;
        this.promedio = promedio;
        this.estado = TEstado.ACTIVO;
    }

    public int getCarne() {
        return carne;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public TEstado getEstado() {
        return estado;
    }

    public void setEstado(TEstado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  "\nEstudiante:" + "carne=" + carne + ", nombre=" + nombre + 
                ", correo=" + correo + ", celular=" + celular + 
                ", promedio=" + promedio + ", estado=" + estado;
    }
    
    
    
    
    
    
}
