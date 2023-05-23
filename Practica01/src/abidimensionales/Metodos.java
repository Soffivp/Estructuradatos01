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
public class Metodos {

    // transponer, multiplicar, 
    Scanner entrada;

    public Metodos() {
        this.entrada = new Scanner(System.in);

    }
    // 1,2,3,4 5,6,7,8 9,10,11,12 13,14,15,16

    public int menu() {
        System.out.println("1. Transponer la matriz en la diagonal principal");
        System.out.println("2. Transponer la matriz en la diagonal secundaria");
        System.out.println("3. Mulpiplicar matriz a * b");
        System.out.println("4. MCD");
        System.out.println("Salir");
        return entrada.nextInt();
    }

    public int[][] transponerprincipal(int[][] a) {
        int[][] b = new int[4][4];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[i][j] = a[j][i];

            }
        }
        return b;
    }

    public int[][] transponersecundaria(int[][] a) {
        int[][] b = new int[4][4];
        int k = 0;
        int l = 0;
        int aux;
        for (int i = 0; i < a.length; i++) {
            k = a[i].length - 1;
            for (int j = 0; j < a[i].length; j++) {
                aux = a[i][j];
                a[i][j] = a[k][l];
                a[k][l] = aux;
                k--;
            }
            l--;
        }
        return a;
    }

    public int[][] multiplicacion(int[][] a, int[][] b) {
        int[][] resultado = new int[4][4];
        int k = 0;
        int suma = 0;
        for (int i = 0; i < a.length - 1; i++) {
            k = a[i].length - 1;

            suma = 0;
            for (int l = 0; l < b[i].length; l++) {
                for (int j = 0; j < b.length; j++) {
                    suma = a[i][j] * b[j][l];

                }
                resultado[i][l] = suma;
            }

        }
        return a;
    }

    public void determinantes(int[][] arr) {
        /*+{{1,2,0,3}{1,2,1,1}{2,1,3,2}{2,1,2,1}}*/
        int j, k, m, suma = 0, suma2 = 0, mult = 1, mult2 = 1;

        for (int l = 0; l < arr.length; l++) {
            j = l;
            k = arr.length - 1 - l;

            for (int i = 0; i < 10; i++) {
                mult = arr[i][j];
                mult2 = arr[i][k];

                if (j == arr.length - 1) {
                    j = 0;
                    k = 0;

                } else {
                    j++;
                    k--;
                }
                suma = mult;
                suma2 = mult;

            }

        }
    }
    public void metodo(int[][] arr){
      //{{1,9,2}{7,8,6}{6,5,3}}       
      int[] b = new int[9];
      int indice = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                b[indice] = arr[i][j];
                indice++;
            }
            
        }
    }
}
