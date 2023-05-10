package src.tp1.ejercicios;

import java.util.Scanner;

/*
 * Existen dos reglas que identifican dos conjuntos de valores: 
  * El número es de un solo dígito. 
  * El número es impar. 
 * A partir de estas reglas, creá un algoritmo que asigne a las variables booleanas 
 * estaEnA, estaEnB, estaEnAmbos y noEstaEnNinguno el valor verdadero o falso, 
 * según corresponda, para indicar si el valor ingresado pertenece al primer conjunto, 
 * al segundo, a ambos o a ninguno, respectivamente. Definí un lote de prueba de varios números 
 * y probá el algoritmo, escribiendo los resultados. 
 */

public class Ej15 {
  final static Scanner input = new Scanner(System.in);
  final static String REQUEST_MESSAGE = "Por favor, ingrese un número entero positivo: ";
  final static String RESPONSE_MESSAGE = "El número está en ";
  public static void main(String[] args) {
    int num;
    boolean isInA;
    boolean isInB;
    boolean isInBoth;
    boolean isInNone;

    System.out.println(REQUEST_MESSAGE);
    num = input.nextInt();

    isInA = num < 10;
    isInB = num % 2 != 0;
    isInBoth = isInA && isInB;
    isInNone = !isInA && !isInB;
    
    if (isInBoth) System.out.println(RESPONSE_MESSAGE + "<< AMBOS >>");
    else if (isInNone) System.out.println(RESPONSE_MESSAGE + "<< NINGUNO >>");
    else if (isInA) System.out.println(RESPONSE_MESSAGE + "<< A >>");
    else System.out.println(RESPONSE_MESSAGE + "<< B >>");
    

    input.close();
  }
}
