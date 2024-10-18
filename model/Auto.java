/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author marce
 */
public class Auto {

    // atributos (estado)
    private String nombre;
    private int año;
    private String patente;
    private double velocidad;

// constructor
    public Auto(String nombre, int año, String patente) {
        this.nombre = nombre;
        this.año = año;
        this.patente = patente;
        this.velocidad = 0.0;

    }
    //metodos (comportamiento)

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String newNombre) {
        this.nombre = newNombre;

    }

    public void acelerar(double incremento) {
        this.velocidad += incremento;

    }

    public void frenar(double decremento) {
        this.velocidad -= decremento;
        if (this.velocidad < 0) {
            this.velocidad = 0;
        }
    }

    public double getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(int newVelocidad) {
        this.velocidad = newVelocidad;
    }

}
