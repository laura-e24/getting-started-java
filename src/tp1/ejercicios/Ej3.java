package src.tp1.ejercicios;

import java.util.Scanner;

/*
 * Realizá un programa que muestre por pantalla un mensaje pidiéndole al usuario que ingrese su nombre, 
 * y luego muestre un mensaje de bienvenida incluyendo el mismo. 
 */

public class Ej3 {
  final static Scanner input = new Scanner(System.in);
  final static String REQUEST_MESSAGE = "Please, enter your name...";
  public static void main(String[] args) {
    String name;
    System.out.println(REQUEST_MESSAGE);
    name = input.nextLine();

    if (name.equals("")) System.out.println("YOU DIDN'T ENTER ANY NAME");
    else System.out.println("Hello, " + name + "!" + " Have a good day :)");
    input.close();
  }
}
