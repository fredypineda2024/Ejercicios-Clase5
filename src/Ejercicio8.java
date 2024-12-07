/*
 * ## Ejercicio 8 - Encontrar elementos únicos en una lista de números.
Crea un programa que encuentre todos los elementos únicos en una lista de números.
 El programa debe leer una lista de números que puede contener duplicados 
 y utilizar una estructura de datos adecuada para identificar y mostrar los números únicos.
 */

 import java.util.*;

 public class Ejercicio8 {
 
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         // Leer la lista de números del usuario
         System.out.println("Introduce una lista de números separados por espacios:");
         String input = scanner.nextLine();
         String[] numerosStr = input.split(" ");
 
         // Convertir los números a una lista de enteros
         List<Integer> numeros = new ArrayList<>();
         for (String numStr : numerosStr) {
             numeros.add(Integer.parseInt(numStr));
         }
 
         // Encontrar elementos únicos
         Set<Integer> unicos = new LinkedHashSet<>();  // Mantiene el orden de inserción
         Set<Integer> duplicados = new HashSet<>();    // Para rastrear duplicados
 
         for (Integer numero : numeros) {
             if (!duplicados.add(numero)) {            // Si no se puede agregar a duplicados, ya es duplicado
                 unicos.remove(numero);                // Quitar de únicos si ya no es único
             } else {
                 unicos.add(numero);                   // Agregar a únicos si no está en duplicados
             }
         }
 
         // Mostrar los elementos únicos
         System.out.println("\nNúmeros únicos encontrados:");
         if (unicos.isEmpty()) {
             System.out.println("No se encontraron números únicos.");
         } else {
             for (Integer unico : unicos) {
                 System.out.println(unico);
             }
         }
 
         scanner.close();
     }
 }
 
