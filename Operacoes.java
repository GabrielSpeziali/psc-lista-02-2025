import java.util.Scanner;

public class Operacoes {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;

        System.out.println("\nResultados: \nSoma: " + soma + "\nSubtração: " + subtracao + "\nMultiplicacao: " + multiplicacao);
    
        scanner.close();
    }
}
