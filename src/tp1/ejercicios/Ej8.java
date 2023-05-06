package src.tp1.ejercicios;

import java.util.Scanner;

/*
 * Suponiendo que el primer día de la semana es el Domingo, pedir un número 
 * entre 1 y 7 (inclusive) y mostrar el nombre del día correspondiente. 
 * Si el día no está en el rango permitido debe emitir por pantalla el mensaje de error 
 * "El día ingresado no es válido". 
 * 
 */

public class Ej8 {
  final static Scanner input = new Scanner(System.in);
  final static String REQUEST_MESSAGE = "Ingrese un número entre 1 y 7: ";
  final static String RESPONSE_MESSAGE = "Día ";
  final static String ERROR_MESSAGE = "El día ingresado no es válido.";
  public static void main(String[] args) {
    int day;
    
    System.out.println(REQUEST_MESSAGE);
    day = input.nextInt();

    if (day < 1 || day > 7) System.out.println(ERROR_MESSAGE);
    else {
      if (day == 1) System.out.println(RESPONSE_MESSAGE + "domingo.");
      else if (day == 2) System.out.println(RESPONSE_MESSAGE + "lunes.");
      else if (day == 3) System.out.println(RESPONSE_MESSAGE + "martes.");
      else if (day == 4) System.out.println(RESPONSE_MESSAGE + "miércoles.");
      else if (day == 5) System.out.println(RESPONSE_MESSAGE + "jueves.");
      else if (day == 6) System.out.println(RESPONSE_MESSAGE + "viernes.");
      else System.out.println(RESPONSE_MESSAGE + "sábado.");
    }

    input.close();
  }
}
