import java.util.Scanner;

/**
 * Operaciones aritméticas.
 * @author Juan Pablo Zavala Pacheco
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Primer número: "); int a=entrada.nextInt();
        System.out.print("Segundo número: "); int b=entrada.nextInt();
        System.out.println("Suma: "+(a+b)); System.out.println("Resta: "+(a-b));
        System.out.println("Multiplicación: "+(a*b));
        if(b!=0){ System.out.println("División: "+((double)a/b)); System.out.println("Residuo: "+(a%b)); }
        else { System.out.println("No se puede dividir para cero."); }
        entrada.close();
    }
}
