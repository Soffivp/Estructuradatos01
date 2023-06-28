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
public class Ejecutor {

    public static void main(String[] args) {
        int opc;

        Metodos obj = new Metodos();

        do {
            opc = obj.menu();
            switch (opc) {
                case 1 -> obj.insertarLista();
                case 2 -> obj.recorrerLista();
                case 3 -> obj.crearArbol();
                case 4 -> obj.inOrden(obj.raizM);
                case 5 -> obj.inOrden(obj.raizH);
                case 6 -> obj.reporte(obj.raizM);
                case 7 -> obj.reporte(obj.raizH);

            }
        } while (opc != 0);
    }
}
