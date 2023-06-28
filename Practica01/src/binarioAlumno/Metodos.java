/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarioAlumno;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Metodos {

    Scanner entrada;

    Nodo head;
    NodoArbol headA;
    NodoArbol raizM;
    NodoArbol raizH;

    public Metodos() {
        this.entrada = new Scanner(System.in);
        this.head = null;
        this.raizM = null;
        this.raizH = null;

    }

    public int menu() {
        System.out.println("1. Insertar");
        System.out.println("2. Recorrer Lista");
        System.out.println("3. Crear Lista");
        System.out.println("4. Presentar lista damas");
        System.out.println("5. Presentar lista hombres");
        System.out.println("6. Presentar reporte damas");
        System.out.println("7. Presentar reporte hombres");

        return entrada.nextInt();
    }

    public boolean listaVacia() {
        return (head == null);
    }

    public boolean arbolVacio() {
        return (headA == null);
    }

    public Nodo leerDatos() {
        int id;
        String nombre;
        char sexo;
        float[] calif = new float[3];
        System.out.println("Ingresar id");
        id = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingresar sus nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingresar Sexo");
        sexo = entrada.nextLine().charAt(0);
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la calificacion" + i + ": ");
            calif[i] = entrada.nextFloat();
        }
        Nodo nuevo = new Nodo(id, nombre, sexo, calif);
        return nuevo;

    }

    public void insertarLista() {
        Nodo nuevo = leerDatos();
        nuevo.sig = head;
        head = nuevo;
    }

    public void recorrerLista() {
        Nodo actual = head;
        while (actual != null) {
            System.out.println(actual.id + ": " + actual.nombre + "\n");
            actual = actual.sig;
        }

    }

    public NodoArbol insertar(NodoArbol actual, NodoArbol nuevo) {
        if (arbolVacio()) 
            return nuevo;
        else if (nuevo.id > actual.id)
            actual.der = insertar(actual.der, nuevo);
        else 
            actual.izq = insertar(actual.izq, nuevo);
        
        return actual;
    }

    public void crearArbol() {
        Nodo actual = head;
        NodoArbol nuevo;
        while (actual != null) {
            nuevo = new NodoArbol(actual.id, actual.nombre, actual.sexo, actual.id);

            if (actual.sexo == 'm') {
                raizM = insertar(raizM, nuevo);
                actual = actual.sig;
            } else {
                raizH = insertar(raizH, nuevo);
                actual = actual.sig;
            }
        }

    }

    public void inOrden(NodoArbol actual) {
        if (actual != null) {
            inOrden(actual.izq);
            System.out.println(actual.id + ": " + actual.nombre + "\n");
            inOrden(actual.der);
            System.out.println(actual.id + ": " + actual.nombre + "\n");

        } else {

        }
    }

    public void reporte(NodoArbol actual) {
        if (actual != null) {
            reporte(actual.izq);
        }
        if (actual.promedio >= 7) {
            System.out.println(actual.id + ": " + actual.nombre + "APROBADO\n");
        } else {
            System.out.println(actual.id + ": " + actual.nombre + "REPROBADO\n");
        }
        reporte(actual.der);

    }
}
