/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;

/**
 *
 * @author SALA H
 */
public class Arreglos {

    public static void main(String[] args) {
        int opc, num, lim;
        int ev = 0;

        Metodo_Arreglos obj = new Metodo_Arreglos();
        System.out.println("Ingrese el limite del arreglo ");
        lim = obj.entrada.nextInt();
        int[] arreglo = new int[lim];
        //elementos validos
        do {
            opc = obj.menu();
            switch (opc) {
                case 1:
                    ev = obj.llenarArray(arreglo);

                    break;
                case 2:
                    obj.presentar(arreglo,ev);
                case 3:
                    ev =obj.insertarUltimo(arreglo,ev);
                case 4:
                    obj.insertarInicio(arreglo, ev);
                case 5:
                    ev = obj.insertarInicio(arreglo, ev);
                case 6:
                    ev = obj.ordenarArreglo(arreglo, ev);
                    break;
                default:
                    throw new AssertionError();
            }
        } while (opc != 0);
    }
}
