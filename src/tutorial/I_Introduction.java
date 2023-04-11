package src.tutorial;

import java.util.Scanner;

public class I_Introduction {
  // Declaración de una constante:
  // se hace fuera del main para que pueda ser utilizada
  // en otras partes del programa
  final static int CURRENT_YEAR = 2023;
  final static String WELCOME_MESSAGE = "Hello f@%#ing world";
  final static String YEAR_MESSAGE = "Please, write your birth year:";

  // Creamos una nueva instancia del objeto Scanner
  // y le indicamos que "escanee/escuche" lo que el usuario
  // ingresa en el teclado (System.in)
  final static Scanner input = new Scanner(System.in);
  public static void main(String[] args) throws Exception {
    // De esta manera es como enviamos mensajes a la consola
    System.out.println(WELCOME_MESSAGE);
    // Declaro variables de tipo int (integer, número entero)
    int age;
    int birthYear;

    System.out.println(YEAR_MESSAGE);
    // Inicializo las varibles
    birthYear = input.nextInt(); // Almacenamos el valor int que el usuario ingresó en el Scanner
    age = CURRENT_YEAR - birthYear;

    // Concatenar texto literal y variable en la salida para ser mostrado
    // al finalizar el programa
    System.out.println("Tu edad es... " + "¡" + age + "!");

    // Finalmente, cerramos la conexión con el scanner
    // para que no quede permanentemente activo escuchando el teclado
    input.close();
  }
}
