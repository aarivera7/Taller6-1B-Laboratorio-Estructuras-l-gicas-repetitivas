/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajogrupal;
import java.util.Scanner;
/**
 *
 * @author adria
 */
public class SerieIndeterminada {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n = 0, suma = 0, i = 0; boolean b = false;
        do {
            System.out.println("Ingrese un numero para la serie: ");
            n = leer.nextInt();
            suma += n;
            i++;
            if(suma > 10000){
                b = true;
            }else{
                if(suma <= 10000){
                    System.out.println("La suma de numeros introducidos hasta el momento es de: " 
                            + suma + " de 10000 posibles.");
                }
            }
        } while (b == false);
    
    System.out.println("Ha introducido un total de: " + i + " números.");
    System.out.println("La suma total de la serie es: " + suma);
    System.out.println("La media de la serie es: " + suma / i);
    }
}
