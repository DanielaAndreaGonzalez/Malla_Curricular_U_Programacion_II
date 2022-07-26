/**
 * 
 */
package Practicas;

import java.util.Scanner;

/**
 * @author DanielaAGonzalezH
 *
 */
public class PracticasEjercicios {
	
	public static void main(String arg[]) {
		
		
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese el número de filas");
		int numFilas = dato.nextInt();
		
		for(int numBlancos = numFilas-1,numAsteriscos=1; numBlancos>=0; numBlancos--, numAsteriscos += 2){
            //Espacios en blanco
            for(int i=1;i<=numBlancos;i++){
                System.out.print(" ");
            }
              
            //Asteriscos
            for(int j=1;j<=numAsteriscos;j++){
                System.out.print("*");
            }
            System.out.println();
        }
		
		
		System.out.println();
	}

}
