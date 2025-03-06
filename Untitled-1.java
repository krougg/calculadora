/**
 * Clase Calculadora con operaciones matemáticas básicas.
 * @author [Tu Nombre]
 * @version 1.0
 */
public class Calculadora {

    /**
     * Calcula la potencia de un número.
     * @param base Base de la potencia
     * @param exponente Exponente de la potencia
     * @return Resultado de base elevada a exponente
     */
    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    /**
     * Calcula la media de dos números.
     * @param num1 Primer número
     * @param num2 Segundo número
     * @return Media de los dos números
     */
    
    public static double media(double num1, double num2) {
        return (num1 + num2) / 2;
    }

    /**
     * Multiplica tres números.
     * @param a Primer número
     * @param b Segundo número
     * @param c Tercer número
     * @return Producto de los tres números
     */
    public static int multiplicacionDe3(int a, int b, int c) {
        return a * b * c;
    }

    /**
     * Método principal para probar la Calculadora.
     */
    public static void main(String[] args) {
        // Pruebas de los métodos
        System.out.println("Potencia de 2^3: " + potencia(2, 3)); // 8.0
        System.out.println("Media de 10 y 20: " + media(10, 20)); // 15.0
        System.out.println("Multiplicación de 3, 4 y 5: " + multiplicacionDe3(3, 4, 5)); // 60
    }

    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }
    
/**
 * Calcula la media de dos números.
 * @param num1 Primer número
 * @param num2 Segundo número
 * @return Media de los dos números
 */
public static double media(double num1, double num2) {
    return (num1 + num2) / 2;
}

}
