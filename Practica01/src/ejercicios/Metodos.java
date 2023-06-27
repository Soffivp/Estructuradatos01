package ejercicios;

/**
 *
 * @author SALA H
 */
public class Metodos {

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

    public int factorial(int a) {
        if (a == 1) {
          return 1;
        } else {
        return  a * factorial(a - 1);
        }
    }

    public int fibonaci(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return fibonaci(num - 1) + fibonaci(num - 2);
        }
    }

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
