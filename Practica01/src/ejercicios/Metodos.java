package ejercicios;

/**
 *
 * @author SALA H
 */
public class Metodos {

//ejercicio 1 Calcular el número de elementos negativos, cero y positivos de un vector dado de n
//elementos    
    public void contarnumeros(int[] a) {
        int positivos = 0, negativos = 0, cero = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                cero++;
            } else if (a[i] % 2 == 0) {
                positivos++;
            } else if (a[i] % 2 != 0) {
                negativos++;
            }
        }
        System.out.printf("Existen %d números positivos, %d numeros negativos y %d ceros.", positivos, negativos, cero);

    }

    //ejercicio2   Escriba un programa que me permita almacenar en un arreglo B, el factorial de 10
//números almacenados previamente en un arreglo A.
    // este arreglo se va a llevar en el main al enviarle cada uno de los numeros
    public int factorial(int[] a) {
        int b = 0;

        for (int i = 0; i < a.length; i++) {
            b = a[i];

            if (b == 1) {
                return b;
            } else {
                return b * factorial(b - 1);
            }
        }

        return b;
    }
// ejercicio 3 

    public int fibonaci(int num) {
  /*    //  int num = 0;

            if (num == 0) {
                return 0;
            } else if (num == 1) {
                return 1;
            } else {
                return fibonaci(num - 1) + fibonaci(num - 2);
            }
            
        
       // num++;*/
    return num;
    }
// ejercicio 6

    public void llenarArreglo(int[] a, int num) {
        double b;
        for (int i = 0; i < num; i++) {
            a[i] = (int) Math.random() * 50 + 1;

        }
    }

    public void arregloDividido(int[] a, int num) {
        int[] b = null;
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] / num;

        }

    }

    public void presentar(int[] b) {
        for (int i = 0; i < b.length; i++) {
            System.out.println("- " + b[i]);
        }
    }
// ejercicios 7    

}
