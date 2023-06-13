/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Metodos {

    Estudiante head;
    Scanner entrada;

    public Metodos() {
        this.head = null;
        this.entrada = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("1. Insertar");
        System.out.println("2. Eliminar");
        System.out.println("3. Reporte varones");
        System.out.println("4. Reporte damas");
        System.out.println("5. Listar");
        System.out.println("6. Salir");

        return entrada.nextInt();

    }

    public boolean listaVacia() {

        return (head == null);
    }

    public Estudiante leerDatos() {
        int id;
        String nombre;
        char sexo;
        float[] calif = new float[3];
        System.out.println("Ingresar id");
        id = entrada.nextInt();
        System.out.println("Ingresar sus nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingresar Sexo");
        sexo = entrada.nextLine().charAt(id);
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la calificacion" + i + ": ");
            calif[i] = entrada.nextFloat();
        }
        Estudiante nuevo = new Estudiante(id, nombre, sexo, calif, head);

        return nuevo;

    }

    public void insertar() {
        Estudiante nuevo = leerDatos();

        if (listaVacia()) {
            head = nuevo;
        } else if (nuevo.id < head.id) {
            nuevo.sig = head;
            head = nuevo;
        } else {

            Estudiante actual = head;
            while ((actual.sig != null) && (nuevo.id > actual.sig.id)) 
                actual = actual.sig;
            nuevo.sig = actual.sig;
            actual.sig = nuevo;

            

        }

    }

}
