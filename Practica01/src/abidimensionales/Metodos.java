package abidimensionales;

import java.util.Random;
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

    public void sumaVectores(int[][] arr) {
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

    public void sumarDiagonal(int[][] arr) {
        /* {{7,6,1}
            {3,8,9}
            {2,4,1}*/
        int suma = 0;

        suma = arr[0][2] + arr[1][1] + arr[2][0];
        System.out.printf("La suma de la diagonal invertida es: %s", suma);

    }

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
                    faltas++;
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
                asig3, asig4, asig5, faltas);
    }

    public void ventas(double[][] arr) {
        double[][] media = new double[10][1];
        double mediaGeneral = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                media[i][0] += arr[i][j];
            }
            media[i][0] = media[i][0] / 4;
            mediaGeneral += media[i][0];
            System.out.printf("Media de las ventas del local %d: %.2f\n", i + 1, media[i][0]);
        }
        mediaGeneral = mediaGeneral / 10;
        for (int i = 0; i < media.length; i++) {
            if (media[i][0] > mediaGeneral) {
                System.out.printf("Local por enciam de la media : %d\n\n", i + 1);
            }
        }
        for (int i = 0; i < arr.length; i++) {

            if (arr[i][0] > arr[i][1] && arr[i][0] > arr[i][2] && arr[i][0] > arr[i][3]) {
                System.out.println("Trimestre más productivo del local es el primero");
            }
            if (arr[i][1] > arr[i][0] && arr[i][1] > arr[i][2] && arr[i][1] > arr[i][3]) {
                System.out.println("Trimestre más productivo del local es el segundo");
            }
            if (arr[i][2] > arr[i][1] && arr[i][2] > arr[i][0] && arr[i][2] > arr[i][3]) {
                System.out.println("Trimestre más productivo del local es el tercero");
            }
            if (arr[i][3] > arr[i][0] && arr[i][3] > arr[i][2] && arr[i][3] > arr[i][1]) {
                System.out.println("Trimestre más productivo del local es el cuarto");
            }

        }
    }


    /*
7. Realice un programa que me permita realizar el ordenamiento de una matriz bidireccional (el
ordenamiento debe ser realizado en la misma matriz)
     */
    public void ordenar(int[][] a) {
        int aux;
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int x = 0; x < a.length; x++) {
                    for (int y = 0; y < a[i].length; y++) {
                        if (a[i][j] < a[x][y]) {
                            aux = a[i][j];
                            a[i][j] = a[x][y];
                            a[x][y] = aux;
                        }
                    }
                }
            }
        }

        System.out.print("Matriz ordenada\n");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.print("\n");
        }

    }

    /*8. Diseñe un programa que me permita implementar el algoritmo del “cuadrado mágico” de un
número de filas y columnas N ingresado por teclado. Ej:
8 1 6 15
3 5 7 15
4 9 2 15
15 15 15 15*/
    public void cuadroMagico(int num) {

        int i_ant = 0;
        int j_ant = 0;

        int punto_ini = num / 2;

        int[][] matriz_magica = new int[num][num];

        int temp = 1;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                matriz_magica[i][j] = 0;
            }
        }
        int i = 0;
        int j = punto_ini;

        while (temp != (num * num) + 1) {
            if (matriz_magica[i][j] == 0) {
                matriz_magica[i][j] = temp;
            } else {
                i = i_ant + 1;
                j = j_ant;
                matriz_magica[i][j] = temp;
            }

            i_ant = i;
            j_ant = j;

            temp++;
            j++;
            i--;
            if (i < 0 && j == num) {
                i = num - 1;
                j = 0;
            } else if (i < 0) {
                i = i + num;
            } else if (j == num) {
                j = 0;
            }
        }
        System.out.print("Matriz ordenada\n");

        for (int l = 0; l < matriz_magica.length; l++) {
            for (int k = 0; k < matriz_magica[l].length; k++) {
                System.out.printf("%d ", matriz_magica[l][k]);
            }
            System.out.print("\n");
        }

    }

    /*
9. Diseñe un programa que permita encontrar el determinante de una matriz.
     */
    public void determinante(int[][] arr) {
        /*+{{1,2,0,3}{1,2,1,1}{2,1,3,2}{2,1,2,1}}*/
        int j, k, m = 0, suma = 0, suma2 = 0, mult = 1, mult2 = 1;

        mult = arr[0][0] * arr[1][1] * arr[2][2];
        suma += mult;
        mult = arr[0][1] * arr[1][2] * arr[2][0];
        suma += mult;
        mult = arr[1][0] * arr[2][1] * arr[0][2];
        suma += mult;
        mult2 = arr[0][2] * arr[1][1] * arr[2][0];
        suma2 += mult2;
        mult2 = arr[0][1] * arr[1][0] * arr[2][2];
        suma2 += mult2;
        mult2 = arr[1][2] * arr[2][1] * arr[0][0];
        suma2 += mult2;
        m = suma - suma2;
        System.out.println("El determinante es: " + m);

    }

    /*
10. Realice un programa que realice la trasposición de una matriz de NxN sobre la diagonal
secundaria.*/
    public void random(int n) {
        Random random = new Random();
        int[][] a = new int[n][n];
        int contador = 0;

        //--ASIGNAR LOS NUMERO ALEATORIOS
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {

                a[i][j] = random.nextInt(99 - 10 + 1) + 10;

            }
        }

        System.out.print("Matriz generada\n");

        for (int l = 0; l < a.length; l++) {
            for (int k = 0; k < a[l].length; k++) {
                System.out.printf("%d ", a[l][k]);
            }
            System.out.print("\n");
        }

    }

    public void cuadros() {
        int n = 9;
        String[][] a = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = "-";
            }
        }
        for (int i = 0; i < n; i++) {
            a[i][0] = "*";
            a[i][n - 1] = "*";
            a[0][i] = "*";
            a[n - 1][i] = "*";
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void piramide() {
        int n = 5;
        int centro = n / 2;
        String[][] a = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = "-";
            }
        }

        for (int i = 0; i <= centro; i++) {
            int asteriscos = 2 * i + 1;
            int inicio = centro - i;

            for (int j = 0; j < asteriscos; j++) {
                a[i][inicio + j] = "*";
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void invertida() {

        int n = 5;
        String[][] matriz = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = "-";
            }
        }

        for (int i = 0; i < n; i++) {
            int asteriscos = n - 2 * i;
            int inicio = i;

            for (int j = 0; j < asteriscos; j++) {
                matriz[n - 1 - i][inicio + j] = "*";
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void cruz(){
             int n = 5;
         int centro = n/2;
        String[][] a = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = "-";
            }
        }

        for (int i = 0; i < n; i++) {
            a[i][centro] = "*";        
            a[centro][i] = "*";        
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    
    



}
