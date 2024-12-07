/*
 * ## Ejercicio 10 - Almacenamiento de configuraciones de una aplicación
Crea un programa que gestione las configuraciones de una aplicación. 
El programa debe permitir agregar nuevas configuraciones, actualizar 
configuraciones existentes y mostrar todas las configuraciones almacenadas.
 * 
 */

 import java.util.HashMap;
 import java.util.Scanner;
 
 public class Ejercicio10 {
     public static void main(String[] args) {
         // HashMap para almacenar configuraciones en formato clave-valor
         HashMap<String, String> configuraciones = new HashMap<>();
         Scanner scanner = new Scanner(System.in);
         
         while (true) {
             System.out.println("\n=== Gestión de Configuraciones ===");
             System.out.println("1. Agregar nueva configuración");
             System.out.println("2. Actualizar configuración existente");
             System.out.println("3. Mostrar todas las configuraciones");
             System.out.println("4. Salir");
             System.out.print("Selecciona una opción: ");
             int opcion = scanner.nextInt();
             scanner.nextLine(); // Limpia el buffer
 
             switch (opcion) {
                 case 1 -> agregarConfiguracion(scanner, configuraciones);
                 case 2 -> actualizarConfiguracion(scanner, configuraciones);
                 case 3 -> mostrarConfiguraciones(configuraciones);
                 case 4 -> {
                     System.out.println("Saliendo del programa...");
                     scanner.close();
                     return;
                 }
                 default -> System.out.println("Opción no válida. Intenta nuevamente.");
             }
         }
     }
 
     // Método para agregar una nueva configuración
     public static void agregarConfiguracion(Scanner scanner, HashMap<String, String> configuraciones) {
         System.out.print("Introduce la clave de la configuración: ");
         String clave = scanner.nextLine();
         if (configuraciones.containsKey(clave)) {
             System.out.println("La clave ya existe. Usa la opción de actualizar.");
             return;
         }
         System.out.print("Introduce el valor de la configuración: ");
         String valor = scanner.nextLine();
         configuraciones.put(clave, valor);
         System.out.println("Configuración añadida correctamente.");
     }
 
     // Método para actualizar una configuración existente
     public static void actualizarConfiguracion(Scanner scanner, HashMap<String, String> configuraciones) {
         System.out.print("Introduce la clave de la configuración que deseas actualizar: ");
         String clave = scanner.nextLine();
         if (!configuraciones.containsKey(clave)) {
             System.out.println("La clave no existe. Usa la opción de agregar para crear una nueva configuración.");
             return;
         }
         System.out.print("Introduce el nuevo valor de la configuración: ");
         String nuevoValor = scanner.nextLine();
         configuraciones.put(clave, nuevoValor);
         System.out.println("Configuración actualizada correctamente.");
     }
 
     // Método para mostrar todas las configuraciones
     public static void mostrarConfiguraciones(HashMap<String, String> configuraciones) {
         if (configuraciones.isEmpty()) {
             System.out.println("No hay configuraciones almacenadas.");
             return;
         }
         System.out.println("\n=== Configuraciones Almacenadas ===");
         configuraciones.forEach((clave, valor) -> System.out.printf("Clave: %s | Valor: %s%n", clave, valor));
     }
 }
 
