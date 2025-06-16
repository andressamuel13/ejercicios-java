import java.util.Scanner;
public class deseaSalir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta;
        do {
            System.out.print("¿Desea salir? (S/N): ");
            respuesta = sc.nextLine().toUpperCase();
        } while (!respuesta.equals("S"));
            System.out.println("Programa finalizado.");
            sc.close();
    }
}
