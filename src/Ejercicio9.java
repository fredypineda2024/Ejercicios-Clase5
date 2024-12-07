/*
 * ## Ejercicio 9 - Simulación de una cola de clientes en un banco.
Desarrolla un programa que simule la llegada y atención de clientes 
en un banco. El programa debe permitir agregar clientes a la cola cuando
 llegan y eliminar clientes de la cola cuando son atendidos, mostrando
  siempre el estado actual de la cola.
 */

 import java.util.LinkedList;
 import java.util.Queue;
 import java.util.Scanner;
 
 public class Ejercicio9 {
 
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         Queue<String> colaClientes = new LinkedList<>(); // Estructura de datos para la cola
 
         while (true) {
             System.out.println("\n===== Sistema de Gestión de Cola en el Banco =====");
             System.out.println("1. Agregar cliente a la cola");
             System.out.println("2. Atender cliente");
             System.out.println("3. Mostrar cola actual");
             System.out.println("4. Salir");
             System.out.print("Selecciona una opción: ");
             int opcion = scanner.nextInt();
             scanner.nextLine(); // Limpiar el buffer de entrada
 
             switch (opcion) {
                 case 1 -> {
                     System.out.print("Ingresa el nombre del cliente: ");
                     String nombre = scanner.nextLine();
                     colaClientes.add(nombre); // Agregar cliente al final de la cola
                     System.out.println("Cliente " + nombre + " agregado a la cola.");
                 }
                 case 2 -> {
                     if (!colaClientes.isEmpty()) {
                         String atendido = colaClientes.poll(); // Elimina y retorna el primer cliente
                         System.out.println("Cliente atendido: " + atendido);
                     } else {
                         System.out.println("No hay clientes en la cola.");
                     }
                 }
                 case 3 -> {
                     if (colaClientes.isEmpty()) {
                         System.out.println("La cola está vacía.");
                     } else {
                         System.out.println("Clientes en la cola: " + colaClientes);
                     }
                 }
                 case 4 -> {
                     System.out.println("Saliendo del sistema. ¡Gracias por usar el programa!");
                     scanner.close();
                     return;
                 }
                 default -> System.out.println("Opción inválida. Intenta nuevamente.");
             }
         }
     }
 }
 