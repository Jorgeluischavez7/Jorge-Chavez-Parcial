
package com.unitec.jorgechavezparcial;

/**
 *
 * @author T-107
 */
public class Evaluacion {
    String nombre;
    float calificaion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCalificaion() {
        return calificaion;
    }

    public void setCalificaion(float calificaion) {
        this.calificaion = calificaion;
    }

    public Evaluacion(String nombre, float calificaion) {
        this.nombre = nombre;
        this.calificaion = calificaion;
    }

    public Evaluacion() {
    }
    
    
}
