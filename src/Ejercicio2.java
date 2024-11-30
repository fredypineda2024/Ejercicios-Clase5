/*
## Ejercicio 2 - Matriz de Rotación
Escribe un programa que tome una matriz cuadrada
 (array bidimensional) y la rote 90 grados en el sentido de las agujas del reloj.  
Pide al usuario el el tamaño de la dimensión de la matriz
 (ten en cuenta que si el usuario ingresa el valor 3, la matriz será de 3 x 3).  
/Todos los valores del contenido de la matriz, los cuales deben 
ser leídos por teclado con los valores ingresados por el usuario.

Por ejemplo, si la matriz de entrada es:
```
1  2  3
4  5  6
7  8  9
```

La matriz rotada debe ser:

```
7  4  1
8  5  2
9  6  3
```
 */
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el tamaño de la matriz
        System.out.print("Ingresa el tamaño de la matriz cuadrada (n): ");
        int n = scanner.nextInt();

        // Crear la matriz y llenarla con valores del usuario
        int[][] matriz = new int[n][n];
        System.out.println("Ingresa los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Mostrar la matriz original
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        // Rotar la matriz 90 grados en el sentido de las agujas del reloj
        int[][] matrizRotada = rotarMatriz90(matriz);

        // Mostrar la matriz rotada
        System.out.println("Matriz rotada 90 grados:");
        mostrarMatriz(matrizRotada);

        scanner.close();
    }

    // Método para mostrar una matriz en consola
    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    // Método para rotar una matriz 90 grados en el sentido de las agujas del reloj
    public static int[][] rotarMatriz90(int[][] matriz) {
        int n = matriz.length;
        int[][] matrizRotada = new int[n][n];

        // Realizar la rotación
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizRotada[j][n - 1 - i] = matriz[i][j];
            }
        }

        return matrizRotada;
    }
}


