/*
 * ## Ejercicio 1 - Funciones con uso de arrays
Escribe un programa que para un array de tamaño `n` 
(dado por el usuario) de números enteros que son ingresados por teclado,
 realice las siguientes funciones e imprime el resultado en pantalla:
- La suma de todos los elementos.
- Encontrar el valor máximo
- Encontrar el valor mínimo.
- Invertir por completo el array.
- Ordenar el array de mayor a menor.
- Obtener el promedio de los elementos del array.
- Encontrar la moda (el número que mas se repite)

 */

 import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el tamaño del array al usuario
        System.out.print("Ingresa el tamaño del array: ");
        int n = scanner.nextInt();

        // Crear el array y llenarlo con los valores ingresados por el usuario
        int[] array = new int[n];
        System.out.println("Ingresa los cuatro elementos del array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Llamar a las funciones para realizar las operaciones y mostrar resultados
        System.out.println("Suma de los elementos: " + sumarArray(array));
        System.out.println("Valor máximo: " + encontrarMaximo(array));
        System.out.println("Valor mínimo: " + encontrarMinimo(array));
        System.out.println("Array invertido: " + Arrays.toString(invertirArray(array)));
        System.out.println("Array ordenado de mayor a menor: " + Arrays.toString(ordenarMayorAMenor(array)));
        System.out.println("Promedio de los elementos: " + calcularPromedio(array));
        System.out.println("Moda: " + encontrarModa(array));

        scanner.close();
    }

    // Sumar todos los elementos del array
    public static int sumarArray(int[] array) {
        int suma = 0;
        for (int num : array) {
            suma += num; // Acumular la suma de cada elemento
        }
        return suma;
    }

    // Encontrar el valor máximo del array
    public static int encontrarMaximo(int[] array) {
        int maximo = array[0]; // Inicializar con el primer elemento
        for (int num : array) {
            if (num > maximo) {
                maximo = num; // Actualizar si se encuentra un número mayor
            }
        }
        return maximo;
    }

    // Encontrar el valor mínimo del array
    public static int encontrarMinimo(int[] array) {
        int minimo = array[0]; // Inicializar con el primer elemento
        for (int num : array) {
            if (num < minimo) {
                minimo = num; // Actualizar si se encuentra un número menor
            }
        }
        return minimo;
    }

    // Invertir el array por completo
    public static int[] invertirArray(int[] array) {
        int[] invertido = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            invertido[i] = array[array.length - 1 - i]; // Copiar elementos en orden inverso
        }
        return invertido;
    }

    // Ordenar el array de mayor a menor
    public static int[] ordenarMayorAMenor(int[] array) {
        int[] copia = Arrays.copyOf(array, array.length); // Crear una copia del array original
        Arrays.sort(copia); // Ordenar de menor a mayor
        // Invertir el orden para obtener mayor a menor
        for (int i = 0; i < copia.length / 2; i++) {
            int temp = copia[i];
            copia[i] = copia[copia.length - 1 - i];
            copia[copia.length - 1 - i] = temp;
        }
        return copia;
    }

    // Calcular el promedio de los elementos del array
    public static double calcularPromedio(int[] array) {
        int suma = sumarArray(array); // Reutilizar la función de suma
        return (double) suma / array.length; // Dividir la suma por la cantidad de elementos
    }

    // Encontrar la moda del array
    public static int encontrarModa(int[] array) {
        int moda = array[0];
        int maxFrecuencia = 0;

        for (int num : array) {
            int frecuencia = 0;
            // Contar cuántas veces aparece 'num' en el array
            for (int elemento : array) {
                if (elemento == num) {
                    frecuencia++;
                }
            }
            // Actualizar la moda si encontramos un número con mayor frecuencia
            if (frecuencia > maxFrecuencia) {
                maxFrecuencia = frecuencia;
                moda = num;
            }
        }
        return moda;
    }
}
