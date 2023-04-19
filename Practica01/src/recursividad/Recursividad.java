/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class Recursividad {

    Scanner entrada;

    public Recursividad() {
        this.entrada = new Scanner(System.in);

    }

    public int menu() {
        System.out.println("1. Factorial");
        System.out.println("2. Fibonacci");
        System.out.println("3. Potencia");
        System.out.println("4. MCD");
        System.out.println("Salir");
        return entrada.nextInt();
    }

    public int factorial(int num) {
        if (num == 1) {
            return num;
        } else {
            return num * factorial(num - 1);
        }

    }

    public int fibonaci(int num) {
        if (num == 0) 
            return 0;
        else if (num == 1) 
            return 1;
        else 
            return fibonaci(num-1) + fibonaci(num-2);
    }
     public int potencia (int num, int exp){
     
     if (exp == 0)
         return 1;
     else if(exp == 1)
         return num;
     else
        return num * potencia(num,exp-1);
     }
     
     public int mcd (int a, int b){
     if ( b == 0)
         return a;
     else 
         return  mcd (b,a % b);
     }
     
    public int invertir (int a){
   
    
return (a%10+invertir(a/10));
        } 
}
