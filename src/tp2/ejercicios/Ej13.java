package src.tp2.ejercicios;

import java.util.Scanner;

/*
 * Se desea realizar un programa para saber qué prioridad darle a cada materia en cuanto a clases 
 * de apoyo de acuerdo a la necesidad de los alumnos. Al comenzar el programa, se pedirá la cantidad 
 * de alumnos que desea cargar. Luego, por cada alumno, se pedirá curso (a/b/c/d. Validar), 
 * y materia en la cual necesita clase de apoyo (taller/fundamentos/matemática). Una vez realizado 
 * el ingreso de datos, se deberá mostrar por pantalla cuál fue la materia más requerida.
 * 
 */

public class Ej13 {
  final static String CLASS_TALLER = "Taller";
  final static char A = 'a';
  final static char B = 'b';
  final static char C = 'c';
  final static char D = 'd';
  final static String CLASS_FUNDAMENTOS = "Fundamentos";
  final static String CLASS_MATEMATICA = "Matemática";
  final static String REQUEST_STUDENTS = ">> Por favor indique cuántos alumnos va a ingresar: ";
  final static String REQUEST_CLASS = ">> Por favor indique el curso del/a alumno/a (a, b, c, d): ";
  final static String REQUEST_SUBJECT = ">> Por favor indique la materia para la cual el/la alumno/a necesita apoyo: ";
  final static String RESPONSE_MESSAGE = ">> La materia más requerida fue ";
  final static String ERROR_MESSAGE = ">>> [ERROR] Ingrese un curso válido: a, b, c, d <<<";
  final static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    int studentsQuantity;
   
    
    System.out.println(REQUEST_STUDENTS);
    studentsQuantity = input.nextInt();
    input.nextLine();

    evalSubject(studentsQuantity);

    input.close();
  }

  /**
   * Evalúa cuál de las materias fue la más requerida por los estudiantes
   * @param studentsQuantity
   *    Cantidad de estudiantes a ingresar
   */
  public static void evalSubject(int studentsQuantity) {
    String studentClass;
    String studentSubject;
     
    int counterTaller = 0;
    int counterFundamentos = 0;
    int counterMatematica = 0;
    int highest = 0;

    for (int i = 0; i < studentsQuantity; i++) {
      System.out.println(REQUEST_CLASS);
      studentClass = input.nextLine().toLowerCase();

      validateClass(studentClass);

      System.out.println(REQUEST_SUBJECT);
      studentSubject = input.nextLine();

      if ((studentSubject.toLowerCase()).equals(CLASS_TALLER.toLowerCase())) counterTaller++;
      else if ((studentSubject.toLowerCase()).equals(CLASS_FUNDAMENTOS.toLowerCase())) counterFundamentos++;
      else if ((studentSubject.toLowerCase()).equals(CLASS_MATEMATICA.toLowerCase())) counterMatematica++;
    }

    returnMostRequired(counterFundamentos, counterMatematica, counterTaller, highest);    
  }

  /**
   * Evalúa cuál materia fue más requerida o si todas fueron igualmente requeridas 
   * y muestra el resultado por pantalla
   * @param fundamentos
   *    Contador de la materia Fundamentos
   * @param matematica
   *    Contador de la materia Matematica
   * @param taller
   *    Contador de la materia Taller
   * @param highest
   *    Acumulador del valor más alto
   */
  public static void returnMostRequired(int fundamentos, int matematica, int taller, int highest) {
    String mostRequired = findMax(fundamentos, matematica, taller, highest);

    if (mostRequired.equals(CLASS_FUNDAMENTOS)) {
      System.out.println(RESPONSE_MESSAGE + CLASS_FUNDAMENTOS + "<<");
    } 
    else if (mostRequired.equals(CLASS_MATEMATICA)) {
      System.out.println(RESPONSE_MESSAGE + CLASS_MATEMATICA + "<<");
    }
    else if (mostRequired.equals(CLASS_TALLER)) {
      System.out.println(RESPONSE_MESSAGE + CLASS_TALLER + "<<");
    }
    else System.out.println(">> Todas fueron igual de requeridas <<");
  }


  /**
   * Halla el valor máximo entre las materias requeridas
   * @param fundamentos
   *    Contador de la materia Fundamentos
   * @param matematica
   *    Contador de la materia Matematica
   * @param taller
   *    Contador de la materia Taller
   * @param highest
   *    Acumulador del valor más alto
   * @return
   *    Cuál materia fue más requerida
   */
  public static String findMax(int fundamentos, int matematica, int taller, int highest) {
    highest = Math.max(fundamentos, Math.max(matematica, taller));    
    if (fundamentos == taller && taller == matematica) {
      return "Todas";
    } else {
      if (highest == fundamentos) return CLASS_FUNDAMENTOS;
      if (highest == matematica) return CLASS_MATEMATICA;
      else return CLASS_TALLER;
    }
  }


  /**
   * Valida si el curso ingresado es válido (a, b, c, d)
   * @param studentClass
   *    Curso a validar
   */
  public static void validateClass(String studentClass) {
    while (!studentClass.equals(parseChar(A)) && !studentClass.equals(parseChar(B))
    && !studentClass.equals(parseChar(C)) && !studentClass.equals(parseChar(D))
    ) {
      // Mandamos el mensaje de error
      System.out.println(ERROR_MESSAGE);
      // Volvemos a pedir el dato luego de lanzar el error, cortando el bucle
      studentClass = input.nextLine();
    }
    
  }

  /**
   * Convierte un tipo char a tipo String
   * @param charToParse
   *    Valor char a convertir
   * @return
   *    El valor ingresado convertido a formato string
   */
  public static String parseChar(char charToParse) {
    return String.valueOf(charToParse);
  }
}