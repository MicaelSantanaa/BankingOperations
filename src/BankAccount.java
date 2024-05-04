import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        String cliente = "Micael Santana";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int opcao = 0;

        System.out.println("******************************************");
        System.out.println("Dados inicias do cliente:\n");
        System.out.println("Nome:                 " + cliente);
        System.out.println("Tipo da conta:        " + tipoConta);
        System.out.println("Saldo inicial:        R$ " + saldo);

        System.out.println("******************************************");

        String menu = """
                \n Operações
                
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                
                Digite a opção desejada!
               
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();
            {
                if (opcao == 1) {
                    System.out.println("\n Seu saldo atual é de " + saldo + " reais ");
                } else if (opcao == 2) {
                    System.out.println("Qual o valor que  deseja transferir?");
                    double valor = leitura.nextDouble();
                    if (valor > saldo) {
                        System.out.println("Não há saldo suficiente para realizar a transferência!");
                    } else {
                        saldo -= valor;
                        System.out.println("Transferência realizada com sucesso!");
                        System.out.println("Seu saldo atual é de " + saldo + " reais");
                    }
                } else if (opcao == 3) {
                    System.out.println("Digite o valor que você receberá: ");
                    double valor = leitura.nextDouble();
                    saldo += valor;
                    System.out.println("Depósito efetuado com sucesso!");
                    System.out.println("Seu saldo atual é de " + saldo + " reais");
                } else if (opcao == 4) {
                    System.out.println("Atendimento finalizado!");
                } else {
                    System.out.println("Opção inválida!");
                }

            }
        }
    }
}