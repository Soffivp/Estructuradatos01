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
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opc, num = 0, lim = 0, encontrado = 0;
        int ev = 0;

        System.out.println("Tamaño del aula ");
        lim = entrada.nextInt();
        Metodos_arreglos aula = new Metodos_arreglos(lim);

        do {
            opc = aula.menu();
            switch (opc) {
                case 1:
                    aula.insertar();
                    break;
                case 2:
                    aula.presentar();
                    break;
                default:
                    break;
            }
        } while (opc != 0);
    }
}
