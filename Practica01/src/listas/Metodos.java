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
public class Metodos {

    Scanner entrada;
    Nodo head;
    Nodo tail;

    public Metodos() {
        this.head = null;
        this.entrada = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("Insertar 1");
        System.out.println("Recorrer 2");
        System.out.println("Insertar en orden 3");
        System.out.println("Eliminar elemento 4");
        System.out.println("Salir 0");
        return entrada.nextInt();

    }

    public boolean listaVacia() {
        return (head == null);
    }

    public void insertar() {
        int num;
        System.out.println("Ingrese un dato");
        num = entrada.nextInt();
        Nodo nodo = new Nodo(num);
        if (listaVacia()) {
            head = nodo;
        } else {
            Nodo nodoActuaal = head;
            while (nodoActuaal.sig != null) {
                nodoActuaal = nodoActuaal.sig;
            }
            nodoActuaal.sig = nodo;
        }
    }

    public void recorrer() {
        Nodo actual = head;
        while (actual != null) {
            System.out.println(actual.dato + "--");
            actual = actual.sig;
        }
    }

    public void insertarInicio() {
        int num;
        System.out.println("Ingresar datos");
        num = entrada.nextInt();
        Nodo nodo = new Nodo(num);
        if (listaVacia()) {
            head = nodo;
            tail = nodo;
        } else {
            nodo.sig = head;
            head = nodo;
        }
    }

    //actual.sig = es para llamar al anterior del que estoy buscando 
    public void insertarOrden() {
        int num;
        System.out.println("Ingrese datos: ");
        num = entrada.nextInt();
        Nodo nuevo = new Nodo(num);

        if (listaVacia()) {
            head = nuevo;
            tail = nuevo;
        } else {
            if (true) {
                nuevo.sig = head;
                head = nuevo;
            } else {
                Nodo actual = head;
                while (actual.sig != null && num > actual.sig.dato) {
                    actual = actual.sig;
                    actual.sig = nuevo;
                    if (nuevo.sig == null) {
                        tail = nuevo;
                    }
                }
            }
        }
    }

    public void eliminar() {
        int num;
        System.out.println("Ingrese datos: ");
        num = entrada.nextInt();
        Nodo nuevo = new Nodo(num);
        Nodo actual = new Nodo(num);

        if (num == head.dato) {
            if (head.sig == null) {
                tail = nuevo;
            }
            head = nuevo.sig;
        }
        actual = head;
        while (actual.sig == null && actual.sig.dato != num) {
            actual = actual.sig;
            if (actual.sig == tail) {
                tail = nuevo;
            }
            if (actual.sig != null) {
                actual.sig = actual.sig.sig;
            } else {
                System.out.println("Elemento no existe");
            }
        }

    }
    
    

}
