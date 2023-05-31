/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abidimensionales;

import arregloRegistros.Metodos_arreglos;
import java.util.Scanner;

/**
 *
 * @author sofiv
 */
public class Ejecutor {

    public static void main(String[] args) {
        Ejercicio6 eje1 = new Ejercicio6();
        Scanner entrada = new Scanner(System.in);
        int[][] a = {{1, 7, 8}, {3, 8, 9}, {9, 4, 1}};
        int[][] b = {{5, 3, 9}, {4, 2, 7}, {1, 6, 8}};

        int opc;

        do {
            opc = eje1.menu6();
            switch (opc) {
                case 1:
                    eje1.multiplicar(a, b);
                    break;
                case 2:
                    eje1.sumaMatriz(a, b);
                    break;
                case 3:
                    eje1.restaMatriz(a, b);
                    break;
                case 4:
                    eje1.escalar(a, 3);
                    break;
                case 5:
                    eje1.transpuesta(a);
                    break;
                case 6:

                    break;
                default:
                    break;
            }
        } while (opc != 0);


    }
}
