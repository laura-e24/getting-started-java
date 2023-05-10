package src.tp1.ejercicios;

import java.util.Scanner;

/*
 * Realizá un programa que resuelva el siguiente problema: Tres personas aportan diferente 
 * capital a una sociedad. Se desea saber qué porcentaje del total aportó cada una 
 * (indicando nombre y porcentaje) y cuál es el monto del total aportado por las tres. 
 * Pedir por pantalla el ingreso del capital aportado por cada una de las personas y luego mostrar 
 * lo pedido en el siguiente formato: 
 *  Nombre:  ...,
 *  Capital aportado: $ ... , 
 *  Porcentaje del capital: %.... , 
 *  Monto total aportado: $ ....
 */

public class Ej9 {
  final static Scanner input = new Scanner(System.in);
  final static String REQUEST_MESSAGE = "Ingrese ";
  final static String SEPARATOR_LINE = "************************************************";
  public static void main(String[] args) {
    String name1;
		String name2;
		String name3;
		
		double capital1;
		double capital2;
		double capital3;
		
		double percentage1;
		double percentage2;
		double percentage3;
		
		double totalCapital;

    System.out.println(REQUEST_MESSAGE + "nombre: ");
    name1 = input.next();

    System.out.println(REQUEST_MESSAGE + "capital aportado: ");
    capital1 = input.nextDouble();

    System.out.println(REQUEST_MESSAGE + "nombre: ");
    name2 = input.next();

    System.out.println(REQUEST_MESSAGE + "capital aportado: ");
    capital2 = input.nextDouble();

    System.out.println(REQUEST_MESSAGE + "nombre: ");
    name3 = input.next();

    System.out.println(REQUEST_MESSAGE + "capital aportado: ");
    capital3 = input.nextDouble();

    totalCapital = capital1 + capital2 + capital3;
		
		percentage1 = (capital1 * 100) / totalCapital;
		percentage2 = (capital2 * 100) / totalCapital;
		percentage3 = (capital3 * 100) / totalCapital;


    System.out.println(" ** Nombre: " + name1);
		System.out.println(" ** Capital aportado: " + "$" + capital1);
		System.out.println(" ** Porcentaje del capital: " + percentage1 + "%");
		System.out.println(SEPARATOR_LINE);
		
    System.out.println(" ** Nombre: " + name2);
		System.out.println(" ** Capital aportado: " + "$" + capital2);
		System.out.println(" ** Porcentaje del capital: " + percentage2 + "%");
		System.out.println(SEPARATOR_LINE);
		
    System.out.println(" ** Nombre: " + name3);
		System.out.println(" ** Capital aportado: " + "$" + capital3);
		System.out.println(" ** Porcentaje del capital: " + percentage3 + "%");
		System.out.println(SEPARATOR_LINE);
		
		System.out.println(" ** MONTO TOTAL APORTADO: " + "$" + totalCapital);

    input.close();
  }
}
