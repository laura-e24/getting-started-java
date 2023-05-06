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
  final static int PEOPLE_QUANTITY = 3;
  public static void main(String[] args) {
    String name;
    int contributedCapital;
    double capitalPercentage;
    int totalCapital = 0;

    // TODO: FIX esto. no funciona como corresponde
    for (int i = 0; i < PEOPLE_QUANTITY; i++) {
      System.out.println(REQUEST_MESSAGE + "nombre: ");
      name = input.nextLine();

      System.out.println(REQUEST_MESSAGE + "capital aportado: ");
      contributedCapital = input.nextInt();

      totalCapital+= contributedCapital;

      capitalPercentage = (double) (contributedCapital * 100) / totalCapital;

      System.out.println("Nombre: " + name);
      System.out.println("Capital aportado: " + contributedCapital);
      System.out.println("Porcentaje del capital: " + capitalPercentage);
      System.out.println("Monto total aportado: " + totalCapital);

      System.out.println(REQUEST_MESSAGE + "nombre: ");
    }

    input.close();
  }
}
