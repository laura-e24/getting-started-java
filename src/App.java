import java.util.Scanner;

public class App {
  // Declaración de una constante:
  // se hace fuera del main para que pueda ser utilizada
  // en otras partes del programa
  final static int CURRENT_YEAR = 2023;
  final static String WELCOME_MESSAGE = "Hello f@%#ing world";
  final static String YEAR_MESSAGE = "Please, write your birth year:";

  final static Scanner input = new Scanner(System.in);
  public static void main(String[] args) throws Exception {
    System.out.println(WELCOME_MESSAGE);
    // Declaro variables de tipo int (integer, número entero)
    int age;
    int birthYear;

    System.out.println(YEAR_MESSAGE);
    // Inicializo las varibles
    birthYear = input.nextInt(); // Almacenamos el valor int que el usuario ingresó en el Scanner
    age = CURRENT_YEAR - birthYear;

    // Concatenar texto literal y variable en la salida
    System.out.println("Tu edad es... " + "¡" + age + "!");
  }
}
