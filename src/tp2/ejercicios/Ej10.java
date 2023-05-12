package src.tp2.ejercicios;

import java.util.Scanner;

/*
 * El club de corredores nos pide un programa para obtener estadísticas de la carrera de 10 km. 
 * El mismo consiste en ingresar, por teclado, el número de corredor, las horas, los minutos 
 * y los segundos que tardo en realizar la carrera. Tener en cuenta que al ingresar 0 como el 
 * número de corredor, finaliza el programa y debe mostrar por pantalla: 
  * El ganador 
  * El promedio en segundos de los corredores. 
  * El porcentaje de corredores que realizaron la carrera en menos de una hora. 
 * Programar y utilizar la función devolverSegundos que recibe como parámetros horas, minutos y segundos. 
 * 
 */

public class Ej10 {
  final static int END_OF_PROGRAM = 0;
  final static String REQUEST_DATA = "Por favor ingrese ";
  final static String REQUEST_NUMBER = "Por favor ingrese número de corredor o " + END_OF_PROGRAM + " para finalizar el ingreso de datos...";
  final static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    int runnerNum;
    int hoursRan;
    int minutesRan;
    int secondsRan;

    do {
      System.out.println(REQUEST_NUMBER);
      runnerNum = input.nextInt();

      System.out.println(REQUEST_DATA + " horas corridas: ");
      hoursRan = input.nextInt();

      System.out.println(REQUEST_DATA + " minutos corridos: ");
      minutesRan = input.nextInt();

      System.out.println(REQUEST_DATA + " segundos corridos: ");
      secondsRan = input.nextInt();


    }
    while (runnerNum != 0);


    input.close();
  }

  // TODO
  static int returnSeconds (int hours, int minutes, int seconds) {
    return seconds;

  }

}
