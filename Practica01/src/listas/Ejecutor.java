/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas;

/**
 *
 * @author SALA H
 */
public class Ejecutor {
    public static void main(String[] args) {
        int op;
        Metodos obj = new Metodos();
        
        do {            
            op = obj.menu();
            switch (op) {
                case 1:
                    obj.insertar();
                    
                   // break;
                case 2:
                    obj.recorrer();
                  //  break;
                case 3:
                    obj.insertarOrden();
                    break;
                default:
          
            }
        } while (op != 0);
    }
}
