/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivos;

/**
 *
 * @author UTPL
 */
public class Archivos {
    
    public static void main(String[] args) {
        Metodos_archivos obj = new Metodos_archivos();
        int opc;
        do {            
            opc = obj.menu();
            switch (opc) {
                case 1: obj.ingresar();
                case 2: obj.presentar();
                
 
                    break;
                default:
                    throw new AssertionError();
            }
        } while (opc!=0);
    }
}
