/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica01;

/**
 *
 * @author SALA H
 */
import java.util.Scanner;

public class Cadenas {

    Scanner entrada;

    public Cadenas() {
        this.entrada = new Scanner(System.in);
    }

    public int menu() {

        System.out.println("1. Presentar caracter por caracter");
        System.out.println("2. Conocer las veces que se repite un caracter");
        System.out.println("3. Saber si una cadena es palindroma");
        System.out.println("4. Contar vocales y consonantes");
        System.out.println("Salir\n");
        return entrada.nextInt();

    }

    public void caracterxcaracter() {
        String cadena = "";
        entrada.nextLine();
        System.out.println("Digite una cadena: ");
        cadena = entrada.nextLine();
        System.out.println(cadena);

        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i));
        }

    }

    public void contari() {
        String cadena = "";
        char letra;
        int contador = 0;
        entrada.nextLine();
        System.out.println("Digite una cadena");
        cadena = entrada.nextLine();
        System.out.println("Digite un caracter");
        letra = entrada.next().charAt(0);
        for (int i = 0; i < cadena.length(); i++) {

            if (cadena.charAt(i) == letra) {
                contador++;

            }
        }
        System.out.println("El caracter se repite: " + contador + "veces");

    }

    public String quitarespacios(String cadena) {
        return cadena.replace(" ", "");
    }

    public void palindromo() {
        boolean noes = false;
        String cadena = "";
        String cadena2 = quitarespacios(cadena);
        int j = 0;
        entrada.nextLine();
        System.out.println("Digite una cadena: ");
        cadena = entrada.nextLine();
        j = cadena2.length() - 1;
        for (int i = 0; i < cadena2.length(); i++) {
            if (cadena2.charAt(i) != cadena2.charAt(j)) {
                noes = true;
                System.out.println("No es palindromo");
            }
            j--;
        }
        if (noes == false) {
            System.out.println("Si es palindromo");
        }

    }

    public void contarvl() {
        String cadena = "";
        int vocales = 0;
        int consonantes = 0;
        entrada.nextLine();
        System.out.println("Digite una cadena");
        cadena = entrada.nextLine();
        String cadena2 = quitarespacios(cadena);
        cadena2 = cadena2.toLowerCase();
        for (int i = 0; i < cadena2.length(); i++) {
            if (cadena2.charAt(i) == 'a' || cadena2.charAt(i) == 'e' || cadena2.charAt(i) == 'i' || cadena2.charAt(i) == 'o' || cadena2.charAt(i) == 'u') {
                vocales++;
            } else {
                consonantes++;
            }
        }
        System.out.println("El numero de vocales es: " + vocales + ". El numero de consonantes es: " + consonantes+"\n");

    }

}
