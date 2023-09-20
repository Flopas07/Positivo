/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package positivo;

import java.util.Scanner;

/**
 *
 * @author LCP
 */
public class Positivo{

    public void ejecprom(){

        float numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número real");
        numero = entrada.nextFloat();

        // comparar número con cero
        if (numero > 0) {
            System.out.println(numero + " es mayor que cero");
        }
    }
    public static void main(String[] args) {
        Positivo sseve = new Positivo();
        sseve.ejecprom();
    }

}
