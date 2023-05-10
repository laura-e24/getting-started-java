package src.tp1.ejercicios;

import java.util.Scanner;

/*
 * Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: 
    * Si trabaja 40 horas o menos se le paga $16 por hora (crear una constante para almacenar el 16) 
    * Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada 
      hora extra. (crear una constante para almacenar el 20) 
  * Pedir al usuario que ingrese la cantidad de horas trabajadas en la semana, 
  * y mostrar por pantalla el salario correspondiente.
  *
 */

public class Ej13 {
  final static Scanner input = new Scanner(System.in);
  final static String REQUEST_MESSAGE = "Por favor ingrese la cantidad de horas trabajadas en la semana: ";
  final static String RESPONSE_MESSAGE = "El salario a pagar por esta semana es: $";
  final static int HOURLY_RATE_REGULAR_HOURS = 16;
  final static int HOURLY_RATE_EXTRA_HOURS = 20;
  public static void main(String[] args) {
    int hoursWorked;
    int salaryToPay = 0;

    System.out.println(REQUEST_MESSAGE);
    hoursWorked = input.nextInt();

    if (hoursWorked <= 40) salaryToPay = hoursWorked * HOURLY_RATE_REGULAR_HOURS;
    else {
      int extraHoursWorked;
      extraHoursWorked = hoursWorked - 40;
      salaryToPay = (40 * HOURLY_RATE_REGULAR_HOURS) + (extraHoursWorked * HOURLY_RATE_EXTRA_HOURS); 
    }

    System.out.println(RESPONSE_MESSAGE + salaryToPay);

    input.close();
  }
}
