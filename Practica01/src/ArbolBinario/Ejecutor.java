/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArbolBinario;



/**
 *
 * @author SALA H
 */
public class Ejecutor {
    public static void main(String[] args) {
        int op,num = 0;
        Met_ABB met = new Met_ABB();
     //   Nodo raizz = new Nodo(num);
        
        
        do {            
            op = met.menu();
            switch (op) {
                case 1 -> {
                    System.out.println("Valor a interar");
                    num = met.entrada.nextInt();
                    met.raiz = met.insertar(num, met.raiz);
                }
                case 2 -> {
                    met.preOrden(met.raiz);
                    met.inOrden(met.raiz);
                    met.posOrden(met.raiz);
                }
                 case 3 -> {
                    System.out.println("Valor a eliminar");
                    num = met.entrada.nextInt();
                    met.raiz = met.eliminar(num, met.raiz);
                                                                                                                                                                                                                                                     }
 
                default -> {}
            }
        } while (op != 0);
    }
}
