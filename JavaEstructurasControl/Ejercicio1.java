import java.util.Scanner;

/**
 * Datos personales.
 * @author Juan Pablo Zavala Pacheco
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: "); String nombre=entrada.nextLine();
        System.out.print("Edad: "); int edad=entrada.nextInt(); entrada.nextLine();
        System.out.print("Carrera: "); String carrera=entrada.nextLine();
        System.out.print("Estatura: "); double estatura=entrada.nextDouble();
        System.out.println("Nombre: "+nombre+"\nEdad: "+edad+"\nCarrera: "+carrera+"\nEstatura: "+estatura);
        entrada.close();
    }
}
