/*
 * ## Ejercicio 7 - Gestión de una lista de estudiantes en un curso
Desarrolla un programa que gestione una lista de estudiantes inscritos
 en un curso. El programa debe permitir agregar nuevos estudiantes, 
 eliminar estudiantes que se han dado de baja y mostrar todos los estudiantes 
 inscritos en el orden en que fueron agregados.
 */

 import java.util.ArrayList;
 import java.util.Scanner;
 
 public class Ejercicio7 {
 
     public static void main(String[] args) {
         // Lista para almacenar los nombres de los estudiantes
         ArrayList<String> listaEstudiantes = new ArrayList<>();
         Scanner scanner = new Scanner(System.in);
 
         while (true) {
             // Menú principal
             System.out.println("\n=== Gestión de Estudiantes en un Curso ===");
             System.out.println("1. Agregar nuevo estudiante");
             System.out.println("2. Eliminar estudiante");
             System.out.println("3. Mostrar lista de estudiantes");
             System.out.println("4. Salir");
             System.out.print("Elige una opción: ");
             int opcion = scanner.nextInt();
             scanner.nextLine(); // Consumir el salto de línea después del número
 
             switch (opcion) {
                 case 1 -> {
                     // Agregar nuevo estudiante
                     System.out.print("Introduce el nombre del estudiante: ");
                     String estudiante = scanner.nextLine();
                     listaEstudiantes.add(estudiante);
                     System.out.println("Estudiante agregado: " + estudiante);
                 }
                 case 2 -> {
                     // Eliminar estudiante
                     if (listaEstudiantes.isEmpty()) {
                         System.out.println("La lista de estudiantes está vacía.");
                     } else {
                         System.out.println("Introduce el número del estudiante a eliminar:");
                         for (int i = 0; i < listaEstudiantes.size(); i++) {
                             System.out.println((i + 1) + ". " + listaEstudiantes.get(i));
                         }
                         System.out.print("Número del estudiante: ");
                         int numero = scanner.nextInt();
                         scanner.nextLine(); // Consumir el salto de línea
 
                         if (numero > 0 && numero <= listaEstudiantes.size()) {
                             String eliminado = listaEstudiantes.remove(numero - 1);
                             System.out.println("Estudiante eliminado: " + eliminado);
                         } else {
                             System.out.println("Número inválido.");
                         }
                     }
                 }
                 case 3 -> {
                     // Mostrar lista de estudiantes
                     if (listaEstudiantes.isEmpty()) {
                         System.out.println("No hay estudiantes inscritos.");
                     } else {
                         System.out.println("\nLista de estudiantes inscritos:");
                         for (int i = 0; i < listaEstudiantes.size(); i++) {
                             System.out.println((i + 1) + ". " + listaEstudiantes.get(i));
                         }
                     }
                 }
                 case 4 -> {
                     // Salir
                     System.out.println("Saliendo del programa. ¡Hasta luego!");
                     scanner.close();
                     return;
                 }
                 default -> System.out.println("Opción inválida. Intenta nuevamente.");
             }
         }
     }
 }
 
