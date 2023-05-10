package ejercicios;

/**
 *
 * @author SALA H
 */
public class Metodos {
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
