/*
 * ## Ejercicio 5 - Gestión de una cola de impresión
Desarrolla un programa que gestione una cola de documentos para imprimir.
 El programa debe permitir agregar documentos a la cola, eliminar el documento
  que se está imprimiendo actualmente y mostrar todos los documentos en la cola 
  en el orden en que fueron agregados.

 */


 import java.util.LinkedList;
 import java.util.Queue;
 import java.util.Scanner;
 
 public class Ejercicio5 {
 
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         Queue<String> colaImpresion = new LinkedList<>();
 
         int opcion;
 
         do {
             System.out.println("\n============================");
             System.out.println("=== Gestión de Cola de Impresión ===");
             System.out.println("1. Agregar documento a la cola");
             System.out.println("2. Imprimir el siguiente documento");
             System.out.println("3. Mostrar documentos en la cola");
             System.out.println("4. Salir");
             System.out.print("Selecciona una opción: ");
             opcion = scanner.nextInt();
             scanner.nextLine(); // Consumir el salto de línea
 
             switch (opcion) {
                 case 1 -> { // Agregar documento
                     System.out.print("Ingresa el nombre del documento: ");
                     String documento = scanner.nextLine();
                     colaImpresion.add(documento);
                     System.out.println("Documento \"" + documento + "\" agregado a la cola.");
                 }
                 case 2 -> { // Imprimir documento
                     if (!colaImpresion.isEmpty()) {
                         String documentoImpreso = colaImpresion.poll(); // Elimina y devuelve el primer documento
                         System.out.println("Imprimiendo documento: " + documentoImpreso);
                     } else {
                         System.out.println("La cola de impresión está vacía.");
                     }
                 }
                 case 3 -> { // Mostrar documentos
                     if (!colaImpresion.isEmpty()) {
                         System.out.println("Documentos en la cola:");
                         for (String documento : colaImpresion) {
                             System.out.println("- " + documento);
                         }
                     } else {
                         System.out.println("No hay documentos en la cola.");
                     }
                 }
                 case 4 -> System.out.println("Saliendo del programa. ¡Adiós!");
                 default -> System.out.println("Opción inválida. Intenta nuevamente.");
             }
         } while (opcion != 4);
 
         scanner.close();
     }
 }
 