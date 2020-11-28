/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajogrupal;

/**
 *
 * @author adria
 */
public class numerosAtras {
    public static void main(String[] args) {
        System.out.println("Programa que muestra una serie de 320 hasta 160, descontando en 20 en 20");
        int n = 320;
        while(n >= 160){
            System.out.println(n);
            n = n - 20;
        }
    }
}
