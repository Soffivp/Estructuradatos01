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

    public void metodo(int[][] arr) {
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

    /*Leer una matriz de n X m elementos y calcular la suma de cada una de sus filas y columnas,
dejando dichos resultados en dos vectores, uno de la suma de filas y otro de columnas.*/
    public void sumaVectores(int[][] arr) {
        /*+{{1,2,0,3}
                {1,2,1,1}
                {2,1,3,2}
                {2,1,2,1}}*/

        int filas = 0;
        int comunnas = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                filas += arr[i][j];
                comunnas += arr[j][i];
            }

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                filas += arr[i][j];
                comunnas += arr[j][i];
            }

        }
        System.out.printf("La suma total de filas es: %s,la suma total de columnas es: %s", filas, comunnas);

    }

    /*
2. Dado un arreglo de dos dimensiones de m x n elementos numéricos de tipo entero, desarrollar
un programa para sumar los elementos de la diagonal invertida.*/
    public void sumarDiagonal(int[][] arr) {
        /*+{{1,2,0,3}
            {1,2,1,1}
            {2,1,3,2}
            {2,1,2,1}}*/
        int suma = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    suma += arr[i][j];
                }
            }

        }
        System.out.printf("La suma de la diagonal principal es: %s", suma);

    }

    /*  
3. Dada una matriz L de n X m elementos, diseñar un programa que calcule la suma de números
pares e impares contenidos en ella.*/
    public void sumarpar(int[][] arr) {
        int par = 0;
        int impar = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    par += arr[i][j];
                } else {
                    impar += arr[i][j];
                }

            }

        }
        System.out.printf("La suma de los numeros pares es: %s, y la suma "
                + "de los impares es: %s", par, impar);
    }

    /*
4. Cada alumno de una clase de 20 estudiantes tiene notas correspondientes a 5 asignaturas
diferentes, pudiendo no tener calificación en alguna asignatura. A cada asignatura le
corresponde un determinado coeficiente. Escribir un programa que permita:
a. Calcular la media de cada alumno
b. Media general de la clase
c. Media de la clase en cada asignatura
d. Porcentaje de faltas (no presentado a examen)*/
    public void calificaciones(double[][] arr) {
        /*{{8,7,9,3,5}
       {9,5,7,3,7}
       {9,5,7,3,7}
       {7,10,6,8,2}}
         */
        double suma = 0;
        double promedioAlumno = 0;
        double promedioGemeral = 0;
        double asig1 = 0;
        double asig2 = 0;
        double asig3 = 0;
        double asig4 = 0;
        double asig5 = 0;
        double faltas = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                promedioAlumno += arr[i][j];

                promedioGemeral += arr[i][j];
                if (j == 0) {
                    asig1 += arr[i][j];
                } else if (j == 1) {
                    asig2 += arr[i][j];
                } else if (j == 2) {
                    asig3 += arr[i][j];
                } else if (j == 3) {
                    asig4 += arr[i][j];
                } else if (j == 4) {
                    asig5 += arr[i][j];
                }
                if (arr[i][j] == 0) {
                    faltas += 0;
                }
            }
            promedioAlumno = promedioAlumno / 5;

            System.out.printf("Promedio del alumno %d: %.2f\n", i + 1, promedioAlumno);
            promedioAlumno = 0;

        }
        asig1 = asig1 / 20;
        asig2 = asig2 / 20;
        asig3 = asig3 / 20;
        asig4 = asig4 / 20;
        asig5 = asig5 / 20;
        promedioGemeral = promedioGemeral / 100;

        System.out.printf("El promedio de clase es: %.2f\n"
                + "La media de la asignatura 1 es: %.2f\n"
                + "La media de la asignatura 2 es: %.2f\n"
                + "La media de la asignatura 3 es: %.2f\n"
                + "La media de la asignatura 4 es: %.2f\n"
                + "La media de la asignatura 5 es: %.2f\n"
                + "Porcentaje de faltas es: %.2f\n",
                promedioGemeral, asig1, asig2,
                asig3, asig4, asig5,faltas);

    }

    /*    
5. Una empresa tiene diez almacenes y desea un programa que lea sus ventas trimestrales y
calcule:
a. La media de las ventas mensuales para cada uno de sus almacenes
b. Obtener un listado de los almacenes cuyas ventas mensuales son superiores a la media
total (índice del almacén)
c. Muestre cuál de los meses ha sido el más productivo y cuál el menos productivo.
6. Realice un programa que me permita realizar (según un menú presentado al usuario):
a. La multiplicación de dos matrices bidimensionales.
b. Suma de matrices.
c. Resta de matrices.
d. Multiplicación por un escalar.
e. Traspuesta de una matriz.
(Considérese las restricciones necesarias para cada operación).*/
    
    
    /*
7. Realice un programa que me permita realizar el ordenamiento de una matriz bidireccional (el
ordenamiento debe ser realizado en la misma matriz)
8. Diseñe un programa que me permita implementar el algoritmo del “cuadrado mágico” de un
número de filas y columnas N ingresado por teclado. Ej:
8 1 6 15
3 5 7 15
4 9 2 15
15 15 15 15
9. Diseñe un programa que permita encontrar el determinante de una matriz.
10. Realice un programa que realice la trasposición de una matriz de NxN sobre la diagonal
secundaria.
11. Generar una matriz de N×N con números aleatorios sin repetirse.
12. Dada una matriz de tamaño NxN (impar), realice un método que me permita mostrar un cuadro
de asteriscos (solo bordes), ej:
* * * * *
* - - - *
* - - - *
* - - - *
* * * * *
13. Dada una matriz de tamaño NxN (impar), realice un método que me permita mostrar una
pirámide de asteriscos, ej:
- - - - -
- - - - -
- - * - -
- * * * -
* * * * *
14. Dada una matriz de tamaño NxN (impar), realice un método que me permita mostrar una
pirámide invertida de asteriscos, ej:
* * * * *
- * * * -
- - * - -
- - - - -
- - - - -
15. Dada una matriz de tamaño NxN (impar), realice un método que me permita mostrar una cruz
de asteriscos, ej:
- - * - -
- - * - -
* * * * *
- - * - -*/
}
