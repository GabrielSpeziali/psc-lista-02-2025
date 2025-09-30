import java.util.Scanner;

public class Eurotrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço da viagem para a Alemanha: ");
        double precoAlemanha = scanner.nextDouble();
        System.out.print("Digite a quantidade de pessoas que irão para a Alemanha: ");
        int pessoasAlemanha = scanner.nextInt();

        System.out.print("Digite o preço da viagem para Portugal: ");
        double precoPortugal = scanner.nextDouble();
        System.out.print("Digite a quantidade de pessoas que irão para Portugal: ");
        int pessoasPortugal = scanner.nextInt();

        System.out.print("Digite o preço da viagem para a Itália: ");
        double precoItalia = scanner.nextDouble();
        System.out.print("Digite a quantidade de pessoas que irão para a Itália: ");
        int pessoasItalia = scanner.nextInt();

        double totalAlemanha = precoAlemanha * pessoasAlemanha;
        double totalPortugal = precoPortugal * pessoasPortugal;
        double totalItalia = precoItalia * pessoasItalia;

        double valorTotal = totalAlemanha + totalPortugal + totalItalia;
        int pessoasTotal = pessoasAlemanha + pessoasPortugal + pessoasItalia;

        System.out.printf("%nTotal de pessoas: %d%n", pessoasTotal);
        System.out.printf("Valor total da viagem (todos os destinos): R$ %.2f%n", valorTotal);

        scanner.close();
    }
}
