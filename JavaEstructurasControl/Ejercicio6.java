import java.util.Scanner;

/**
 * Día de la semana.
 * @author Juan Pablo Zavala Pacheco
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Número del 1 al 7: "); int n=entrada.nextInt();
        switch(n){
            case 1: System.out.println("Lunes"); break; case 2: System.out.println("Martes"); break;
            case 3: System.out.println("Miércoles"); break; case 4: System.out.println("Jueves"); break;
            case 5: System.out.println("Viernes"); break; case 6: System.out.println("Sábado"); break;
            case 7: System.out.println("Domingo"); break; default: System.out.println("Número incorrecto");
        }
        entrada.close();
    }
}
