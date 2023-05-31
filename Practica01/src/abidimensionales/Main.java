/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abidimensionales;

import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Metodos obj = new Metodos();
        int numero;
        int[][] arreglo2;
        int[][] arreglo3;
        int[][] a = {{7, 6, 1}, {3, 8, 9}, {2, 4, 1}};
        int[][] b = {{2, 1}, {2, 2}, {1, 2}};
        double[][] notas = {{8.2, 7.9, 9.3, 3.8, 5.14}, {6.5, 7.1, 4.12, 9.47, 10}, {4.8, 8.32, 10, 7.6, 5.2}, {8.14, 8.79, 9.32, 10, 5.48},
        {8.2, 7.9, 9.3, 3.8, 5.14}, {6.58, 9.78, 2.3, 0, 6.9}, {10, 0, 9.36, 7.8, 10}, {5.23, 7.89, 0, 0, 5.12},
        {8.98, 7.47, 0, 1.3, 10}, {7.45, 5.14, 9.98, 8.47, 7.03},
        {9.48, 8.3, 9, 10, 9.5}, {8, 6.2, 0, 3.8, 4.12}, {9.78, 7.3, 9.1, 7.6, 8.9}, {4.6, 7.47, 9.9, 6.98, 5.74}, {7.8, 7 - 8.97, 9.23, 7.65, 9.1},
        {6.12, 8.3, 9.9, 0, 0}, {8.7, 9.7, 9, 10, 9.2}, {7.6, 7.8, 9.6, 3.10, 7.8}, {9.10, 10, 9, 9.8, 9.14}, {6.3, 7.5, 9.10, 8.14, 6.7}};

        int[][] arreglo = {{1, 2, 3, 4}, //16 12 8 4
        {5, 6, 7, 8}, //15 11 7 3
        {9, 10, 11, 12}, // 14 10 6 2
        {13, 14, 15, 16}};// 13 9 5 1
        double[][] ventas = {{890.654, 3694, 526.78, 1493.03},
        {890.654, 2361.5, 7855.45, 6540.14}, {745.23, 3694.5, 366.45, 981.14},
        {1087.654, 8456.5, 936.45, 347.14}, {745.23, 1078.95, 827.45, 654.14},
        {258.23, 125.5, 366.45, 416.14}, {697.23, 987.5, 664.45, 799.14},
        {745.23, 877.5, 901.45, 981.14}, {360.23, 666.5, 554.45, 798.14},
        {1058.23, 877.5, 901.45, 2047.14}};
        // arreglo2 = obj.transponerprincipal(arreglo);
        // arreglo3 = obj.transponersecundaria(arreglo);
        // r = obj.multiplicacion(a, b);

        /* for (int i = 0; i < arreglo2.length; i++) {
            for (int j = 0; j < arreglo2[i].length; j++) {
                //System.out.println("-" + arreglo2[i][j]);
                System.out.println("-" + r[i][j]);

            }
        }*/
        // obj.sumaVectores(a);
        //obj.sumarDiagonal(a);
        //obj.sumarpar(a);
        //obj.calificaciones(notas);
        // obj.ventas(ventas);
        //obj.ordenar(a);
        /* System.out.println("Ingrese el numero impor del cuadrado magico ");
        numero = entrada.nextInt();
        if (numero%2 == 0) {
        System.out.println("Ingrese el numero impor del cuadrado magico ");
        numero = entrada.nextInt();           
        }else
        obj.cuadroMagico(numero);*/
        //obj.determinante(a);
       // System.out.print("Ingrese el tamaño de la matriz ");
       // numero = entrada.nextInt();
        //obj.random(numero);
        //obj.diagonalsec(a);
        //obj.cuadros();
        //obj.piramide();
        //obj.invertida();
        obj.ordenar(a);
    }
}
