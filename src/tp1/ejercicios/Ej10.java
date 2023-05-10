package src.tp1.ejercicios;

import java.util.Scanner;

/*
 * Realizá un programa que resuelva el siguiente problema: Nos piden desarrollar un programa 
 * que informe si un estacionamiento se encuentra o no abierto según la hora ingresada por el usuario. 
 * Nosotros sabemos que el estacionamiento se encuentra abierto entre las 10 y las 18hs. 
 * (Crear constante HORA_APERTURA = 10, y HORA_CIERRE = 18). 
 * Al iniciar el programa, se le pedirá al usuario que ingrese la hora, y deberemos 
 * setear una variable booleana llamada estaAbierto en true o false, según corresponda, 
 * e informar por pantalla mediante la misma si el estacionamiento se encuentra abierto o no. 
 *  Observación: En el caso de que el usuario ingrese una hora menor a 0 o mayor a 24, 
 *  mostrar el mensaje: “Ha ingresado una hora incorrecta” 
 */

public class Ej10 {
  final static int OPEN_HOUR = 10;
  final static int CLOSE_HOUR = 18;
  final static String REQUEST_MESSAGE = "Ingrese horario que desea averiguar (0 - 24): ";
  final static String ERROR_MESSAGE = "Ha ingresado una hora incorrecta. Debe ser un número entre 0 y 24.";
  final static String FINAL_MESSAGE = "El estacionamiento se encuentra ";
  final static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    boolean isOpen;
    double hour; 

    System.out.println(REQUEST_MESSAGE);
    hour = input.nextInt();

    if (hour < 0 || hour > 24) System.out.println(ERROR_MESSAGE);
    else {
      if (hour >= OPEN_HOUR && hour < CLOSE_HOUR) isOpen = true;
      else isOpen = false;
      
      if (isOpen) System.out.println(FINAL_MESSAGE + "¡¡abierto!!");
      else System.out.println(FINAL_MESSAGE + "cerrado. Lo sentimos :/");
    }
    
    
    input.close();
  }
}
