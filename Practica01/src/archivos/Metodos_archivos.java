/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Metodos_archivos {

    Scanner entrada;
    File archivo = new File("miArchivo.txt");
    int contador;

    public Metodos_archivos(int contador) {
        this.entrada = new Scanner(System.in);
        //ttraer una variable desde otra clase
        this.contador = contador;

    }

    Metodos_archivos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int menu() {
        System.out.println("1. Escribir archivo ");
        System.out.println("2. Leer desde archivo ");
        System.out.println("3. Salir");

        return entrada.nextInt();
    }

    public void ingresar() {
        FileWriter escribir;
        PrintWriter linea;
        String cadena = "", correo = "", direccion = "";
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();

            } catch (Exception e) {

            }
            try {
                entrada.nextLine();
                System.out.println("Digite el nombre: ");
                cadena = entrada.nextLine();
                System.out.println("Digite el correo: ");
                correo = entrada.nextLine();
                System.out.println("Digite direccion: ");
                direccion = entrada.nextLine();
                //seguir agregando lineas abajo
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
                linea.println(cadena + "\n" + correo + "\n" + direccion + "\n");
                linea.close();

            } catch (Exception e) {

            }

        }
    }

    public void presentar() {
        FileReader leer = null;
        BufferedReader almacenamiento = null;
        String cadena = "", nombre = "", correo = "", direccion = "";
        try {
            leer = new FileReader(archivo);
            almacenamiento = new BufferedReader(leer);
        } catch (Exception e) {
        }
        while (cadena != null) {
            try {
                cadena = almacenamiento.readLine();
                nombre = cadena;
                cadena = almacenamiento.readLine();
                correo = cadena;
                cadena = almacenamiento.readLine();
                direccion = cadena;
                if (cadena != null) {
                    System.out.println("Nombre: " + nombre + "\n Correo"
                            + correo + "\nDireccion: " + direccion);
                }
                almacenamiento.close();
                leer.close();
            } catch (Exception e) {
            }

        }

    }
}
