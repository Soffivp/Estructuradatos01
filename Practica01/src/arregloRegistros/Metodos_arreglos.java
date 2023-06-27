/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arregloRegistros;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Metodos_arreglos {

    Scanner entrada;
    Persona[] aula;
    int ev = 0;

    public Metodos_arreglos(int lim) {
        this.entrada = new Scanner(System.in);
        this.aula = new Persona[lim];
    }

    public int menu() {
        System.out.println("1. Ingresar persona ");
        System.out.println("2. Presentar ");
        System.out.println("3. Salir");

        return entrada.nextInt();
    }

    public Persona leerPersona() {
        int id;
        String nom, dir;
        Persona nuevo;
        System.out.println("Ingresar id");
        id = entrada.nextInt();
        System.out.println("Ingresar nombre");
        nom = entrada.nextLine();
        entrada.nextLine();
        System.out.println("Ingresar direccion");
        dir = entrada.nextLine();
        nuevo = new Persona(id, nom, dir);

        return nuevo;
    }

    public void insertar() {
        if (ev < aula.length) {
            aula[ev] = leerPersona();
            ev++;
        }
        System.out.println("No se puede agregar mas datos");
    }
    public void presentarPersona(int pos){
        System.out.println("ID:  "+aula[pos].id);
        System.out.println("NOMBRE:  "+ aula[pos].nombre);
        System.out.println("DIRECCION: "+ aula[pos].dir);
    
    }
    public void presentar(){
        for (int i = 0; i < ev; i++) {
            presentarPersona(i);
        }
    }
    

}
