/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArbolBinario;


/**
 *
 * @author SALA H
 */
public class NodoABB {
    int dato;
    NodoABB izq;
    NodoABB der;

    public NodoABB(int dato) {
        this.dato = dato;
        this.izq = null;
        this.der = null;
    }
    
    
    public void establecerDato(int dato) {
        this.dato = dato;
    }

    public void establecerIzq(NodoABB izq) {
        izq = null;
    }

    public void establecerDer(NodoABB der) {
        der = null;
    }

    public int obtenerDato() {
        return dato;
    }

    public NodoABB obtenerIzq() {
        return izq;
    }
    public NodoABB obtenerDer() {
        return der;
    }
    
}
