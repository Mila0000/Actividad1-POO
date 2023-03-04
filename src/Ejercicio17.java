import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        float radio;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el radio del círculo: ");
        radio = entrada.nextFloat();

        System.out.println("El área del círculo es: " + (Math.PI * Math.pow(radio,2)));

        System.out.println("La logitud de la circunferencia es: " + (Math.PI *radio*2));
    }

}