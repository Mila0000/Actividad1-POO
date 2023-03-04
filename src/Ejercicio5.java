import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args){
        double X,Y,SUMA;
        SUMA = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un valor X: ");
        X = entrada.nextDouble();

        SUMA = SUMA + X;
        System.out.println("Ingrese un valor Y: ");

        Y = entrada.nextDouble();
        X = X + Math.pow(Y,2);
        SUMA = SUMA + X / Y;

        System.out.println("EL VALOR DE A SUMA ES: " + SUMA);
    }

}