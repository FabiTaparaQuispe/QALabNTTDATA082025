public class ArrayMultidimensional {
    public static void main(String[] args) {
        // Declaración e inicialización de un array 2D (3 filas x 3 columnas)
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Recorrer e imprimir la matriz usando bucles for anidados
        System.out.println("Matriz 3x3:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }

        // Opcional: usando for-each para recorrer la matriz
        System.out.println("\nUsando for-each:");
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}