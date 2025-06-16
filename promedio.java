import java.util.Scanner;
public class promedio {
    public static double calcularPromedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de estudiantes: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Estudiante " + i);
            System.out.print("Nota 1: ");
            double nota1 = sc.nextDouble();
            System.out.print("Nota 2: ");
            double nota2 = sc.nextDouble();
            System.out.print("Nota 3: ");
            double nota3 = sc.nextDouble();
            double promedio = calcularPromedio(nota1, nota2, nota3);
            System.out.println("Promedio: " + promedio);
        }
            sc.close();
        }
}
