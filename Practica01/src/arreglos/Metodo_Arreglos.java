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
        System.out.println("6. binaria");
        System.out.println("7. Salir \n");

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
        // metodo borbuja
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

    public int encontrarbinaria(int[] arr, int inicio, int fin, int num) {
        int medio = 0;
        ordenarArreglo(arr, num);
        if (inicio <= fin) {
            medio = (inicio + fin) / 2;
            if (arr[medio] == num) {
                return medio;
            } else if (num > arr[medio]) {
                return encontrarbinaria(arr, inicio, fin, num);
            } else {
                return encontrarbinaria(arr, inicio, fin, num);
            }
        } else {
            return -1;
        }
    }

    public void ordenarreglo(int[] arr, int inicio, int fin) {
        int a = 0;
        int b = 0;
        a = inicio;
        b = fin;
        int pv = arr[(inicio + fin) / 2];

        while (arr[b] < pv) {
            b--;
            if (a < b) {
                a = b;
                b = pv;
            }
            a++;
            b--;
        }
        while (a < b) {
            if (a < b) {

            }
        }
    }

    public void recorrerIzquierda(int[] a, int ev, int b) {
        for (int i = ev; i > b; i++) {
            a[i] = a[i + 1];

        }

    }
    public int secuencial(int[] arr, int num,int ev){
        for (int i = 0; i < ev; i++) {
            if(arr[i] == num){
            return i;
            }
        }
    return -1;
    
    }

    public int eliminar(int[] arr, int num, int ev) {

        int pos = secuencial(arr, num, ev);
        if (pos != -1) {
            recorrerIzquierda(arr, pos, ev);
            ev--;

        }
        return ev;
    }

}
