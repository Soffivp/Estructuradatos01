/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binarioAlumno;

/**
 *
 * @author SALA H
 */
public class Nodo extends Persona{
   float[] notas;
   Nodo sig;

    public Nodo(int id, String nom, char s, float[] nt) {
        super(id, nom, s);
        notas = nt;
        sig = null;
    }
    
    public float gerPromedio(){
    float suma = 0;
        for (float i: notas) {
            suma+= i;
        }
        return suma/notas.length;
                
    }
   
   
}
