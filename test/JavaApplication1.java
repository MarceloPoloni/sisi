/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

//import model.Auto;

import model.Ejercicio1;
import model.Estudiante;


/**
 *
 * @author marce
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // auto
        //Auto miAuto = new Auto("Fiat Cronos ", 2023, "AHAH");
        //System.out.println(miAuto.getNombre());
        //miAuto.setNombre("Fiat Palio");
        //System.out.println(miAuto.getNombre());
        //miAuto.acelerar(60.0);
        //System.out.println("El auto acelero a : " + miAuto.getVelocidad() + "Km/h");
        //miAuto.setVelocidad(75);
        //System.out.println("El auto acelero a : " + miAuto.getVelocidad() + "Km/h");
        
        
        // estudiante
        //Estudiante estudiante1 = new Estudiante("marcelo","poloni",21,"2 anio",10);
        //System.out.println(estudiante1);
        
        // yo 
        
        Ejercicio1 misDatos = new Ejercicio1 ("Marcelo", " Poloni" , 21);
        System.out.println("mi nombre es " + misDatos.getNombre()+ ", mi apellido es " + misDatos.getApellido() + " y mi edad es " + misDatos.getEdad() );
        System.out.println("hola mundo");
    }

}
