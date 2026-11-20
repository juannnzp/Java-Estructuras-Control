import java.util.Scanner;

/**
 * Números positivos.
 * @author Juan Pablo Zavala Pacheco
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidad=0, suma=0;
        System.out.print("Número (negativo para terminar): "); int n=entrada.nextInt();
        while(n>=0){ suma+=n; cantidad++; System.out.print("Otro número: "); n=entrada.nextInt(); }
        System.out.println("Cantidad: "+cantidad); System.out.println("Suma: "+suma);
        entrada.close();
    }
}
