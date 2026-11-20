import java.util.Scanner;

/**
 * Clasificación de nota.
 * @author Juan Pablo Zavala Pacheco
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Calificación: "); double nota=entrada.nextDouble();
        if(nota<0 || nota>10) System.out.println("Fuera de rango");
        else if(nota>=9) System.out.println("Excelente");
        else if(nota>=8) System.out.println("Muy Bueno");
        else if(nota>=7) System.out.println("Bueno");
        else if(nota>=5) System.out.println("Regular");
        else System.out.println("Deficiente");
        entrada.close();
    }
}
