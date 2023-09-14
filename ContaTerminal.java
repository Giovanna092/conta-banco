import java.util.Scanner;

public class ContaTerminal {

    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    ContaTerminal(int n, String a, String nome, double s) {
        this.numero = n;
        this.agencia = a;
        this.nomeCliente = nome;
        this.saldo = s;
    }

    public static void main(String[] args) {

        int num;
        String agen, nome;
        double sal;

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da Agencia: ");
        num = scan.nextInt();
        System.out.println("Por favor, digite o nome da Agencia: ");
        scan.nextLine(); // Consumir a quebra de linha pendente
        agen = scan.nextLine();
        System.out.println("Por favor, digite o seu nome: ");
        nome = scan.nextLine();
        System.out.println("Por favor, digite o seu saldo: ");
        sal = scan.nextDouble();

        ContaTerminal conta = new ContaTerminal(num, agen, nome, sal);

        System.out.println("Olá " + conta.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + conta.agencia + ", conta " + conta.numero + " e seu saldo " + conta.saldo
                + " já está disponível para saque");

		scan.close();
    }

}