import java.util.Scanner;

/**
 * Mayoría de edad.
 * @author Juan Pablo Zavala Pacheco
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Edad: "); int edad=entrada.nextInt();
        if(edad>=18){ System.out.println("Es mayor de edad."); }
        entrada.close();
    }
}
