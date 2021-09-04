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
public class Rubro_Evaluacion {
    private int num;
    private String nombre;
    private double porcentaje;
    private TEvaluacion tipo;

    public Rubro_Evaluacion() {
    }

    public Rubro_Evaluacion(int num, String nombre, double porcentaje, TEvaluacion tipo) {
        this.num = num;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.tipo = tipo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public TEvaluacion getTipo() {
        return tipo;
    }

    public void setTipo(TEvaluacion tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Rubro_Evaluacion:" + "num=" + num + ", nombre=" + nombre + 
               ", porcentaje=" + porcentaje + ", tipo=" + tipo + '\n';
    }
    
    
    
}
