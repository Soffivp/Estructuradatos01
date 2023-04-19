/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

/**
 *
 * @author SALA H
 */
public class Main {

    public static void main(String[] args) {
        Recursividad obj = new Recursividad();

        int opc, num, exp;
        do {

            opc = obj.menu();
            switch (opc) {
                case 1:
                    System.out.println("Ingrese el numero");
                    num = obj.entrada.nextInt();
                    System.out.println("El factorial de " + num + " es " + obj.factorial(num));
                    break;
                case 2:
                    System.out.println("Ingrese el numero");
                    num = obj.entrada.nextInt();
                    System.out.println("El fibonacci de " + num + " es " + obj.fibonaci(num));
                case 3:
                    System.out.println("Ingrese la base");
                    num = obj.entrada.nextInt();
                    System.out.println("Ingrese el exponente");
                    exp = obj.entrada.nextInt();
                    System.out.println(num + " Elevado a la potencia " + exp + " es " + obj.potencia(num, exp));
                case 4:
                    System.out.println("Ingrese el primero numero");
                    num = obj.entrada.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    exp = obj.entrada.nextInt();
                    System.out.println(" El minimo comun divisir entre " + num + " y " + exp + " es " + obj.mcd(num, exp));

                case 5:
                    System.out.println("Ingrese el primero numero");
                    num = obj.entrada.nextInt();
                    System.out.println("Ingrese el segundo numero");
                    exp = obj.entrada.nextInt();
                    System.out.println(num + exp);
                default:

            }

        } while (opc != 0);
    }
}
