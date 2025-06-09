import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args){
        //ejercicio 9
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Ingrese un numero");
        double numero = scanner.nextDouble();
        System.out.println("Ingrese que porcentaje desea calcular");
        double porcentaje = scanner.nextDouble();
        double resultado = (numero * porcentaje) / 100;
        System.out.printf("El %.2f%% de %.2f es: %.2f\n", porcentaje, numero, resultado);
        scanner.close();*/

        //ejercicio 10
       /* System.out.println("Ingrese un numero");
        double num = scanner.nextDouble();
        double valorAbsoluto = Math.abs(num);
        System.out.printf("El valor absoluto de %.2f es: %.2f\n", num, valorAbsoluto);
        scanner.close();*/

        //ejercicio 11
        /*int dado1 = (int) (Math.random() * 6) + 1;
        int dado2 = (int) (Math.random() * 6) + 1;
        int suma = dado1 + dado2;
        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);
        System.out.println("Suma de los dados: " + suma);
        scanner.close();*/

        //ejercicio 12
        /*System.out.println("Ingrese la temperatura en grados Fahrenheit:");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.printf("La temperatura en grados Celsius es: %.2f°C%n", celsius);
        scanner.close();*/

        //ejercicio 13
        /*int num = 1;
        for(int i = 1; i < 6; i++){
            num *= i;
        }
        System.out.printf("El factorial de 5 es: %d%n", num);
        scanner.close();*/

        //ejercicio 14
        /*System.out.println("Ingrese el comienzo del rango de numeros aleatorios:");
        int inicio = scanner.nextInt();
        System.out.println("Ingrese el final del rango de numeros aleatorios:");
        int fin = scanner.nextInt();
        if (inicio >= fin) {
            System.out.println("El comienzo del rango debe ser menor que el final.");
            return;
        }
        int numeroAleatorio = (int) (Math.random() * (fin - inicio + 1)) + inicio;
        System.out.printf("El numero aleatorio generado entre %d y %d es: %d%n", inicio, fin, numeroAleatorio);
        scanner.close();*/

        //ejercico 15
        /*System.out.println("Ingrese los segundos a convertir");
        int segundos = scanner.nextInt();
        double minutos = segundos / 60.0;
        double horas = minutos / 60.0;
        System.out.printf("%d segundos son %.2f minutos y %.2f horas%n", segundos, minutos, horas);
        scanner.close();*/
    }
}
