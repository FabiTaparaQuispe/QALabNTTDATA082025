public class EjemploArray {
    public static void main(String[] args) {
        // Declaración e inicialización de un array de enteros
        int[] numeros = {10, 20, 30, 40, 50};

        // Recorrer el array e imprimir cada elemento
        System.out.println("Contenido del array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento en posición " + i + ": " + numeros[i]);
        }

        // Otra forma usando for-each (más limpia)
        System.out.println("\nUsando for-each:");
        for (int num : numeros) {
            System.out.println(num);
        }
    }
}