import java.util.Scanner;
public class promedioDeDiez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese número " + i + ": ");
            suma += sc.nextDouble();
        }
        double promedio = suma / 10;
        System.out.println("El promedio es: " + promedio);
        sc.close();
    }
}
