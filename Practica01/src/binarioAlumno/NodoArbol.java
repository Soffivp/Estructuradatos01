/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binarioAlumno;

/**
 *
 * @author SALA H
 */
public class NodoArbol extends Persona{
   float promedio;
   NodoArbol izq;
   NodoArbol der;

    public NodoArbol(int id, String nom, char s, float prom) {
        super(id, nom, s);
        this.promedio = prom;
        this.izq = null;
        this.der = null;
        
    }
   
   
}
