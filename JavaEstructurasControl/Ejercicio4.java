import java.util.Scanner;

/**
 * Aprobación.
 * @author Juan Pablo Zavala Pacheco
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nota: "); double nota=entrada.nextDouble();
        if(nota>=7){ System.out.println("Aprobado"); } else { System.out.println("Reprobado"); }
        entrada.close();
    }
}
