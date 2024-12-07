
/*
 * ## Ejercicio 3 - Gestión de una lista de tareas pendientes.
Desarrolla un programa que gestione una lista de tareas pendientes. 
El programa debe permitir agregar nuevas tareas, eliminar tareas completadas 
y mostrar todas las tareas pendientes en el orden en que fueron agregadas. 
Además, debe permitir acceder a una tarea específica por su posición en la lista.
 */


 import java.util.ArrayList;
 import java.util.Scanner;
 
 public class Ejercicio3 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         ArrayList<String> tareas = new ArrayList<>();
         boolean salir = false;
 
         while (!salir) {
             System.out.println("\nGestión de Tareas Pendientes");
             System.out.println("1. Agregar tarea");
             System.out.println("2. Eliminar tarea");
             System.out.println("3. Mostrar todas las tareas");
             System.out.println("4. Ver tarea específica");
             System.out.println("5. Salir");
             System.out.print("Selecciona una opción: ");
             int opcion = scanner.nextInt();
             scanner.nextLine(); // Limpiar el buffer del teclado
 
             switch (opcion) {
                 case 1:
                     System.out.print("Ingresa la descripción de la nueva tarea: ");
                     String nuevaTarea = scanner.nextLine();
                     tareas.add(nuevaTarea);
                     System.out.println("Tarea agregada.");
                     break;
 
                 case 2:
                     System.out.print("Ingresa la posición de la tarea a eliminar (1 a " + tareas.size() + "): ");
                     int posicionEliminar = scanner.nextInt();
                     scanner.nextLine(); // Limpiar el buffer del teclado
                     if (posicionEliminar >= 1 && posicionEliminar <= tareas.size()) {
                         tareas.remove(posicionEliminar - 1); // Convertir a índice basado en 0
                         System.out.println("Tarea eliminada.");
                     } else {
                         System.out.println("Posición inválida.");
                     }
                     break;
 
                 case 3:
                     System.out.println("\nTareas pendientes:");
                     for (int i = 0; i < tareas.size(); i++) {
                         // Mostrar la posición desde 1
                         System.out.printf("%d. %s%n", i + 1, tareas.get(i));
                     }
                     break;
 
                 case 4:
                     System.out.print("Ingresa la posición de la tarea a consultar es (1 a " + tareas.size() + "): ");
                     int posicionConsultar = scanner.nextInt();
                     scanner.nextLine(); // Limpiar el buffer del teclado
                     if (posicionConsultar >= 1 && posicionConsultar <= tareas.size()) {
                         // Convertir a índice basado en 0
                         System.out.printf("Tarea en posición %d: %s%n", posicionConsultar, tareas.get(posicionConsultar - 1));
                     } else {
                         System.out.println("Posición inválida.");
                     }
                     break;
 
                 case 5:
                     salir = true;
                     System.out.println("Saliendo del programa...");
                     break;
 
                 default:
                     System.out.println("Opción no válida. Intenta de nuevo.");
             }
         }
 
         scanner.close();
     }
 }
 
