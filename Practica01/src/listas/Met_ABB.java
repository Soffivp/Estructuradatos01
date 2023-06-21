/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas;

import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class Met_ABB {

    /*METODOS ARBOLES BINARIOS DE BUSQUEDA*/
    Scanner entrada;
    NodoABB raiz;

    public Met_ABB() {
        this.entrada = new Scanner(System.in);
        this.raiz = null;
    }

    public int menu() {
        System.out.println("OPERACIONES CON ARBOLES BINARIOS");
        System.out.println("Insertar 1.");
        System.out.println("Recorrer 2.");
        System.out.println("Eliminar 3.");
        System.out.println("salir    4.");
        return entrada.nextInt();
    }

    public boolean arbolVacio(NodoABB raiz) {

        return (raiz == null);
    }

    public NodoABB insertar(int num, NodoABB actual) {
        if (arbolVacio(actual)) {
            NodoABB nuevo = new NodoABB(num);
            return nuevo;
        } else if (num > actual.dato) {
            actual.der = insertar(num, actual.der);
        } else {
            actual.izq = insertar(num, actual.izq);
        }
        return actual;

    }

    public void preOrden(NodoABB actual) {
        if (actual != null) {
            System.out.print(actual.dato + " ");
            preOrden(actual.izq);
            preOrden(actual.der);
        }

    }

    public void inOrden(NodoABB actual) {
        if (actual != null) {
            inOrden(actual.izq);
            System.out.print(actual.dato + " ");
            inOrden(actual.der);
        }

    }

    public void posOrden(NodoABB actual) {
        if (actual != null) {
            posOrden(actual.izq);
            posOrden(actual.der);
            System.out.print(actual.dato + " ");
        }

    }
}
