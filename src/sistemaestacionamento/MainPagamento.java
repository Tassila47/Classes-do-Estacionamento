package Pagamento;

import java.util.Scanner;

public class MainPagamento{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Digite o ID do pagamento: ");
            String id = scanner.nextLine();
            
            System.out.println("Digite o método de pagamento (ex: pix, cartão...): ");
            String metodo = scanner.nextLine();
            
            System.out.println("Digite o valor do pagamento: ");
            double valor = scanner.nextDouble();
            scanner.nextLine();

            Pagamento pagamento1 = new Pagamento(metodo, id, valor);
            
            pagamento1.registrar();
            System.out.println(pagamento1.listar());
            
            System.out.println("\n_______Alterando pagamento_______");
            System.out.println("Novo método: ");
            String novoMetodo = scanner.nextLine();
            
            System.out.println("Novo valor: ");
            double novoValor = scanner.nextDouble();
            scanner.nextLine();
            
            pagamento1.alterar(novoMetodo, novoValor);
            pagamento1.emitirRelatorio();
            
            System.out.println("\nDigite um ID para pesquisar: ");
            String idBusca = scanner.nextLine();
            System.out.println(pagamento1.pesquisar(idBusca));
            
            pagamento1.excluir();
        }
    }
}