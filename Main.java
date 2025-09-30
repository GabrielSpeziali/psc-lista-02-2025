import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = numero = scanner.nextInt();

        System.out.print("O número digitado foi: " + numero);
    
        scanner.close();
    }
}
