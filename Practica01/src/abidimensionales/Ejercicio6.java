/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abidimensionales;

import java.util.Scanner;

/**
 *
 * @author sofiv
 */
public class Ejercicio6 {

    Scanner entrada = new Scanner(System.in);

    public int menu6() {
        System.out.println("1. Multiplicar dos matrices bidimensionales");
        System.out.println("2. Suma de matrices");
        System.out.println("3. Resta de matrices");
        System.out.println("4. Multiplicación por un escalar");
        System.out.println("5. Traspuesta de una matriz");

        return entrada.nextInt();
    }

    public void multiplicar(int[][] a, int[][] b) {

        int suma = 0;

        int[][] r = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            
            for (int j = 0; j < a[i].length; j++) {
                suma = 0;
                
                for (int k = 0; k < b.length; k++) {
                    
                    suma += a[j][k] * b[k][i];
                }

                r[j][i] = suma;
            }
        }
        suma = 0;
        System.out.print("Resultado del producto de matrices\n");

        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r[i].length; j++) {
                System.out.printf("%d ", r[i][j]);
            }
            System.out.print("\n");
        }

    }

    public void sumaMatriz(int[][] a, int[][] b) {
        int suma = 0;
        int[][] r = new int[3][3];

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                suma = a[i][j] + b[i][j];
                r[i][j] = suma;

            }
        }
        System.out.print("Resultado de la suma de matrices\n");

        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r[i].length; j++) {
                System.out.printf("%d ", r[i][j]);
            }
            System.out.print("\n");
        }
    }

    public void restaMatriz(int[][] a, int[][] b) {
        int suma = 0;
        int[][] r = new int[3][3];

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                suma = a[i][j] - b[i][j];
                r[i][j] = suma;

            }
        }
        System.out.print("Resultado de la resta de matrices\n");

        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r[i].length; j++) {
                System.out.printf("%d ", r[i][j]);
            }
            System.out.print("\n");
        }
    }
    public void escalar(int[][] a, int num){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = num * a[i][j];
            }
        }
         System.out.print("Resultado matriz escalar\n");

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {

                System.out.printf("%d ", a[i][j]);
            }
            System.out.print("\n");
        }
    
    }
    public void transpuesta(int[][] a) {
        int[][] t = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                t[j][i] = a[i][j];

            }
        }
        System.out.print("Matriz Transpuesta\n");

        for (int i = 0; i < t.length; i++) {

            for (int j = 0; j < t[i].length; j++) {

                System.out.printf("%d ", t[i][j]);
            }
            System.out.print("\n");
        }

    }
}
