/*
 * ## Ejercicio 4 - Verificación de duplicados en una lista de correos electrónicos.
Escribe un programa que verifique si hay correos electrónicos duplicados en una lista. 
El programa debe leer una lista de correos electrónicos y utilizar una estructura
 de datos adecuada para identificar y reportar cualquier duplicado encontrado.
 */

 import java.util.*;

 public class Ejercicio4 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         // Leer la lista de correos electrónicos
         System.out.print("Ingresa la cantidad de correos electrónicos: ");
         int cantidad = scanner.nextInt();
         scanner.nextLine(); // Limpiar el buffer del teclado
 
         List<String> correos = new ArrayList<>();
         System.out.println("Ingresa los correos electrónicos:");
 
         for (int i = 0; i < cantidad; i++) {
             System.out.print("Correo " + (i + 1) + ": ");
             correos.add(scanner.nextLine().trim()); // Agregar correo a la lista
         }
 
         // Verificar duplicados
         Set<String> unicos = new HashSet<>();
         Set<String> duplicados = new HashSet<>();
 
         for (String correo : correos) {
             if (!unicos.add(correo)) {
                 duplicados.add(correo); // Si no se puede agregar, es duplicado
             }
         }
 
         // Mostrar resultados
         if (duplicados.isEmpty()) {
             System.out.println("\nNo se encontraron correos duplicados.");
         } else {
             System.out.println("\nSe encontraron los siguientes correos duplicados:");
             for (String correo : duplicados) {
                 System.out.println("- " + correo);
             }
         }
 
         scanner.close();
     }
 }
 