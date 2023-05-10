package src.tp2.ejercicios;

import java.util.Scanner;

/*
 * Realizá un programa en el cual se pida el nombre y el promedio de 10 alumnos. 
 * Al finalizar, debe mostrar por pantalla el nombre y el promedio del mejor. 
 * 
 */

public class Ej6 {
  final static int STUDENTS_QUANTITY = 10;
  final static String REQUEST_MESSAGE = "Por favor ingrese ";
  final static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    String studentName;
    double studentAverage = 0;
    double highestAverage = 0;
    String highestAverageStudent = "";


    // TOFIX: Esto por alguna razón deja de funcionar bien al
    // querer ingresar más de un alumno
    for (int i = 0; i < STUDENTS_QUANTITY; i++) {
      System.out.println(REQUEST_MESSAGE + "nombre del alumno: ");
      studentName = input.nextLine();

      System.out.println(REQUEST_MESSAGE + "promedio del alumno " + studentName + ": ");
      studentAverage = input.nextDouble();

      if (studentAverage > highestAverage) {
        highestAverage = studentAverage;
        highestAverageStudent = studentName;
      }
    }

    System.out.println("** PROMEDIO MÁS ALTO **");
    System.out.println(">> Nota: " + highestAverage);
    System.out.println(">> Alumno: " + highestAverageStudent);

    input.close();
  }
}
