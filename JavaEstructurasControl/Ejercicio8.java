import java.util.Scanner;

/**
 * Validación de contraseña.
 * @author Juan Pablo Zavala Pacheco
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String correcta="java2026";
        System.out.print("Ingrese la contraseña: "); String clave=entrada.nextLine();
        while(!clave.equals(correcta)){
            System.out.println("Contraseña incorrecta. Intente nuevamente.");
            System.out.print("Ingrese la contraseña: "); clave=entrada.nextLine();
        }
        System.out.println("Acceso concedido.");
        entrada.close();
    }
}
