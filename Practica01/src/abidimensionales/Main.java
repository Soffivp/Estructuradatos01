/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abidimensionales;

/**
 *
 * @author SALA H
 */
public class Main {

    public static void main(String[] args) {
        Metodos obj = new Metodos();
        int[][] arreglo2;
        int[][] arreglo3;
        int[][] a = {{1, 0, 1}, {2, 1, 2}, {3, 1, 1}, {1, 0, 0}};
        int[][] b = {{2, 1}, {2, 2}, {1, 2}};
        double[][] notas = {{8, 7, 9, 3, 5}, {8, 7, 9, 3, 5}, {8, 7, 9, 3, 5}, {8, 7, 9, 3, 5}, {8, 7, 9, 3, 5},
        {8, 7, 9, 3, 5}, {8, 7, 9, 3, 5}, {8, 7, 9, 3, 5}, {8, 7, 9, 3, 5}, {8, 7, 9, 3, 5},
        {8, 7, 9, 3, 5}, {8, 7, 9, 3, 5}, {8, 7, 9, 3, 5}, {8, 7, 9, 3, 5}, {8, 7, 9, 3, 5},
        {8, 7, 9, 3, 5}, {8, 7, 9, 3, 5}, {8, 7, 9, 3, 5}, {8, 7, 9, 3, 5}, {8, 7, 9, 3, 5}};

        int[][] arreglo = {{1, 2, 3, 4}, //16 12 8 4
        {5, 6, 7, 8}, //15 11 7 3
        {9, 10, 11, 12}, // 14 10 6 2
        {13, 14, 15, 16}};// 13 9 5 1
        // arreglo2 = obj.transponerprincipal(arreglo);
        // arreglo3 = obj.transponersecundaria(arreglo);
        // r = obj.multiplicacion(a, b);

        /* for (int i = 0; i < arreglo2.length; i++) {
            for (int j = 0; j < arreglo2[i].length; j++) {
                //System.out.println("-" + arreglo2[i][j]);
                System.out.println("-" + r[i][j]);

            }
        }*/
        //obj.sumaVectores(a);
        //obj.sumarDiagonal(a);
        //obj.sumarpar(a);
        //obj.calificaciones(notas);
    }
}
