package src.tp1.ejercicios;

import java.util.Scanner;

/*
 * En un casino de juegos se desea mostrar los mensajes respectivos por el puntaje obtenido 
 * en el lanzamiento de tres dados de un cliente, de acuerdo a los siguientes resultados: 
    * Si los tres dados son seis, mostrar el mensaje “Excelente” 
    * Si dos dados son seis, mostrar el mensaje “Muy bien” 
    * Si un dado es seis, mostrar el mensaje “Regular” 
    * Si ningún dado se obtiene seis, mostrar el mensaje “Insuficiente” 
 * 
 */

public class Ej12 {
  final static String REQUEST_MESSAGE = "Por favor, ingrese el valor del dado ";
  final static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    int sixesDiceCounter = 0;
    var responseMessage = "";
    int diceNumber;

    for (int i = 0; i < 3; i++) {
      System.out.println(REQUEST_MESSAGE + "número " + (i + 1) + ": ");
      diceNumber = input.nextInt();

      if (diceNumber == 6) sixesDiceCounter++;
    }

    if (sixesDiceCounter == 3) responseMessage = "¡¡¡EXCELENTE!!!";
    else if (sixesDiceCounter == 2) responseMessage = "¡Muy bien!";
    else if (sixesDiceCounter == 1) responseMessage = "Mmm... regular.";
    else responseMessage = "Insuficiente";

    System.out.println(responseMessage);

    input.close();
  }
}
