
/*
 * ## Ejercicio 6 - Contar la frecuencia de palabras en un texto.
Escribe un programa que cuente la frecuencia de cada palabra en un texto dado.
 El programa debe leer el texto, dividirlo en palabras y utilizar una estructura 
 de datos adecuada para almacenar y contar la frecuencia de cada palabra. 
 Finalmente, debe mostrar la frecuencia de cada palabra.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el texto del usuario
        System.out.println("Ingrese el texto:");
        String texto = scanner.nextLine();

        // Dividir el texto en palabras usando expresiones regulares
        // Se eliminan puntuaciones y se convierte todo a minúsculas para contar correctamente
        String[] palabras = texto.toLowerCase().replaceAll("[^a-záéíóúüñ\\s]", "").split("\\s+");

        // Crear un mapa para almacenar la frecuencia de cada palabra
        Map<String, Integer> frecuenciaPalabras = new HashMap<>();

        // Recorrer cada palabra y contar su frecuencia
        for (String palabra : palabras) {
            if (!palabra.isEmpty()) { // Evitar palabras vacías
                frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);
            }
        }

        // Mostrar la frecuencia de cada palabra
        System.out.println("\nFrecuencia de palabras:");
        for (Map.Entry<String, Integer> entrada : frecuenciaPalabras.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }

        scanner.close();
    }
}
