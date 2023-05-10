package src.tp2.demo.loops;

import java.util.Scanner;

/*
 *  Se ingresan los apellidos y las notas de los estudiantes de programación del curso A.
 * La carga de datos finaliza con apellido "ZZZ"
 * Esta última cadena debe ser fácil de modificar en futuras implementaciones del programa
 * Mostrar el porcentaje de reprobados y el promedio de notas de aprobados (Aprobación >=4)
 */

public class V_While_B {
  final static Scanner input = new Scanner(System.in);
  final static String END_OF_DATA = "ZZZ";
  public static void main(String[] args) {
    String name;
    double grade;
    int passingCounter = 0;
    int failedCounter = 0;
    int studentsQuantity;
    double passingGradesSum = 0;
    double failedPercentage;
    double passingGradesAverage;

    System.out.println("Enter last name...");
    name = input.nextLine();

    while (!name.equalsIgnoreCase(END_OF_DATA)) {
      System.out.println("Enter grade...");
      grade = input.nextDouble();

      // Para que no se "rompa" el scanner al pasar de nextDouble a nextLine (número a string)
      input.nextLine();

      if (grade >= 4) {
        passingCounter++;
        passingGradesSum+= grade;
      } else {
        failedCounter++;
      }

      System.out.println("Enter last name...");
      name = input.nextLine();
    }

    studentsQuantity = passingCounter + failedCounter;

    if (studentsQuantity > 0) {
      failedPercentage = (double) (failedCounter * 100) / studentsQuantity;
      System.out.println("Failed students percentage is " + failedPercentage);

      if (passingCounter > 0) {
        passingGradesAverage = (double) passingGradesSum / studentsQuantity;
        System.out.println("Average passing grades is " + passingGradesAverage);
      } else System.out.println("No one passed");
    } else {
      System.out.println("No students were entered.");
    }

    input.close();
  }
}
