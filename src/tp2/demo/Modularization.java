package src.tp2.demo;

import java.util.Scanner;

public class Modularization {
  static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    String name;

    name = reqName("Enter name...");
    sayHello(name);

    input.close();
  }


  // DOCUMENTACIÓN CON JAVADOC. 
  // Documentar procedimientos
  // <Breve descripción del objetivo del procedimiento o función>
  // @param <parámetro>
      // Qué es el parámetro
      
  /**
   *  Este procedimiento se encarga de saludar al usuario mediante un mensaje con su nombre por pantalla.
   * @param name
   *    El nombre del usuario a imprimir
   */
  static void sayHello (String name) {
    System.out.println("Hello, " + name);
  }

  // Definición de la función reqName
  // Acá el tipo a retornar ya no es void, sino un string,
  // lo que diferencia a una función de un procedimiento (como sayHello),
  // que no retornan nada (void)

  // Documentar funciones
  //  @param <parámetro>
        // Qué es el parámetro
  // @return <valor de retorno>
      // Qué retorna
  /**
   *  Esta función se encarga de pedir un texto (String) de ingreso
   * @param message
   *    El mensaje que se imprimirá por pantalla
   * @return text
   *    La cadena de texto ingresada por teclado
   */
  static String reqName (String message) {
    String text;
    System.out.println(message);

    text = input.nextLine();
    
    return text;
  }
}