/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Jose
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Integer contador = 0;
        Integer numeroPrimo = 2;
        String resultado = "";
        while (contador < 100) {
            Boolean esPrimo = true;
            for(int i = 2; i < numeroPrimo; i++) {
                if (numeroPrimo % i == 0){
                    esPrimo = false;
                    break;
                }
            }
            if(esPrimo){
                resultado += numeroPrimo + "\n";
                contador++;
            }
            numeroPrimo++;
        }
        System.out.println("Los primeros 100 números primos son: \n" + resultado);
    }
}
