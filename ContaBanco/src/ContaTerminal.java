import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao terminal!");
        System.out.println("Vamos criar sua conta do banco, para isso, siga o seguinte passo a passo:");
        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();

        System.out.println("Agora, sua agência");
        String agencia = scanner.nextLine();

        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Número da conta");
        int numero = scanner.nextInt();

        System.out.println("\nOlá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + String.format("R$ %.2f", saldo)
                + " já está disponível para saque.");

        scanner.close();
         /*
        * abra o cmd
        * C:\seu diretório> cd Banco Via Terminal
        * C:\seu diretório\Banco Via Terminal>cd out
        C:\seu diretório\Banco Via Terminal\out>cd production
        C:\seu diretório\Banco Via Terminal\out\production> cd ContaBanco
        C:\seu diretório\Banco Via Terminal\out\production\ContaBanco>java ContaTerminal
        *
        * */


    }
}