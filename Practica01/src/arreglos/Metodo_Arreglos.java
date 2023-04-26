package arreglos;

import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class Metodo_Arreglos {

    Scanner entrada;

    public Metodo_Arreglos() {
        this.entrada = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("1. Insertar elementos ");
        System.out.println("2. Presentar arreglo");
        System.out.println("3. Llenar espacio vacio");
        System.out.println("4. Recorrer arreglo a la derecha");
        System.out.println("5. Llenar arreglo ordenado");
        System.out.println("6. Salir \n");

        return entrada.nextInt();
    }

    public int llenarArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingresar elemento" + i);
            a[i] = entrada.nextInt();
        }
        return a.length;
    }

    public void presentar(int[] a, int ev) {
        for (int i = 0; i < ev; i++) {
            System.out.println(a[i] + " \n");
        }
    }

    public int insertarUltimo(int[] a, int ev) {
        if (ev < a.length) {
            System.out.println("Ingresar un elemento");
            a[ev] = entrada.nextInt();
            ev++;
        } else {
            System.out.println("Arreglo lleno");
        }
        return ev;
    }

    public void recorrerDerecha(int[] a, int ev, int b) {
        for (int i = ev; i > b; i--) {
            a[i] = a[i - 1];

        }

    }

    public int insertarInicio(int[] a, int ev) {
        if (ev < a.length) {
            recorrerDerecha(a, ev, 0);
            System.out.println("Ingresar un elemento");
            a[0] = entrada.nextInt();
            ev++;
        } else {
            System.out.println("Arreglo lleno");
        }
        return ev;
    }

    public int ordenarArreglo(int[] a, int ev) {
        int pos = 0;
        int num = 0;
        if (ev < a.length) {

            System.out.println("Ingresar un elemento");
            num = entrada.nextInt();
            if (ev == 0) {
                a[pos] = num;
            } else {
                while (pos < ev && num > a[pos]) {
                    pos++;
                    recorrerDerecha(a, ev, pos);
                    a[pos] = num;
                    ev++;
                }

            }
        } else {
            System.out.println("Arreglo lleno");
        }

        return ev;
    }

}
