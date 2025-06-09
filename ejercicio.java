import java.util.Scanner;
public class ejercicio {
    public static void main(String[] args) {
        //ejercicio 1
        Scanner scanner = new Scanner(System.in);
        //System.out.print("¿Cuál es tu edad actual? ");
        //int edadActual = scanner.nextInt();
        //System.out.print("¿Cuántos años en el futuro quieres saber tu edad? ");
        //int aniosFuturos = scanner.nextInt();
        //int edadFutura = edadActual + aniosFuturos;
        //System.out.println("En " + aniosFuturos + " años tendrás " + edadFutura + " años.");
        //scanner.close();

        //ejercicio 2
        /*System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();
        int suma = num1 + num2;
        int resta = num1 - num2;
        int producto = num1 * num2;
        if (num2 != 0) {
            int cociente = num1 / num2;
            int modulo = num1 % num2;
            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Producto: " + producto);
            System.out.println("Cociente: " + cociente);
            System.out.println("Módulo: " + modulo);
        } else {
            System.out.println("No se puede dividir por cero (ni cociente ni módulo).");
            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Producto: " + producto);
        }
       scanner.close();*/

        //ejercicio 3
        /*System.out.println("Ingrese el precio del electrodoméstico:");
        double precio = scanner.nextDouble();
        System.out.println("¿Pagará el electrodoméstico a crédito? (si/no):");
        String credito = scanner.next();
        if (credito.equalsIgnoreCase("si")) {
            System.out.println("Ingrese a cuántos meses pagará:");
            int meses = scanner.nextInt();
            double aumentoMensual = 0.05;
            double precioFinal = precio + (precio * aumentoMensual * meses);
            double cuotaMensual = precioFinal / meses;
            System.out.printf("Precio total a pagar: %.2f\n", precioFinal);
            System.out.printf("Cuota mensual fija: %.2f\n", cuotaMensual);
        } else {
            System.out.printf("El precio final a pagar es: %.2f\n", precio);
        }
        scanner.close();*/

        //ejercicio 4
        /*System.out.println("ingrese la base del triangulo");
        int base = scanner.nextInt();
        System.out.println("ingrese la altura del triangulo");
        int altura = scanner.nextInt();
        int area = (base * altura) / 2;
        System.out.println("la area del triangulo es: " + area);
        scanner.close();*/

        //ejercicio 5
        /*System.out.println("introduce el radio del circulo");
        int radio = scanner.nextInt();
        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;
        System.out.println("El area es: " + area);
        System.out.println("El perimetro es: " + perimetro);
         scanner.close()*/

        //ejercicio 6
        /*System.out.print("Ingrese el lado del cubo: ");
        double lado = scanner.nextDouble();
        double volumen = Math.pow(lado, 3); // volumen = lado³
        System.out.printf("El volumen del cubo es: %.2f\n", volumen);
        scanner.close();*/

        //ejercicio 7
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto");
        double precio = scanner.nextDouble();
        double iva = precio * 0.19;
        double precioFinal = precio + iva;
        System.out.printf("El precio del producto es: %.2f\n", precio);
        System.out.printf("El IVA del producto es: %.2f\n", iva);
        System.out.printf("El precio final del producto es: %.2f\n", precioFinal);
        scanner.close();*/

        //ejercicio 8
        /*System.out.println("Ingrese el precio del producto");
        double precio = scanner.nextDouble();
        double descuento = precio * 0.10;
        double precioFinal = precio - descuento;
        System.out.printf("El precio del producto es: %.2f\n", precio);
        System.out.printf("El descuento del producto es: %.2f\n", descuento);
        System.out.printf("El precio final del producto es: %.2f\n", precioFinal);
        scanner.close();*/
    }
}

