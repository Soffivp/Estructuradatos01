/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;



/**
 *
 * @author UTPL
 */
public class Ejecutar {

    public static void main(String[] args) {
        Metodos obj = new Metodos();
        int op;
        do {
            op = obj.menu();
            switch (op) {
                case 1 -> obj.insertar();
                case 2 -> obj.eliminar();
                case 3 -> obj.reporte('h');
                case 4 -> obj.reporte('m');
                case 5 -> obj.listar();
              

            }
        } while (op != 0);
    }
}
