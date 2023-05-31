/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author SALA H
 */
public class Main {

    public static void main(String[] args) {
        Metodos obj = new Metodos();
        int[] arr = {2,3,4,6,9,1,10,6,7,8};
        int[] f = new int[10];
        int num = 0;
        
        for (int i = 0; i < arr.length; i++) {
           num = obj.factorial(arr[i]);
           f[i] = num;
           // System.out.printf("El factorial de %d es: %d\n", arr[i],f[i]);
 
        }
        obj.presentar(arr);
        
        
    }
}
