// importação necessária para usar o scanner
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // variável para encerrar ou não o programa
        boolean cofrinhoAtivo = true;
        // recebe a opção do usuário
        int opcaoDesejada;
        // recebe o valor da moeda
        double valorMoeda;
        // lê a entrada do usuário
        Scanner readLine = new Scanner(System.in);
        // instância de cofrinho
        Cofrinho cofrinho = new Cofrinho();

        System.out.println("----- Meu Cofrinho -----");
        System.out.println();

        while (cofrinhoAtivo) {
            System.out.println("[1] Adicionar moedas");
            System.out.println("[2] Remover moedas");
            System.out.println("[3] Listar moedas");
            System.out.println("[4] Total em R$");
            System.out.println("[5] Fechar cofrinho");

            System.out.println();
            // lê a entrada do usuário de acordo com o número escolhido da lista acima
            opcaoDesejada = readLine.nextInt();
            // condição de acordo com o valor da entrada do usuário
            switch (opcaoDesejada) {
                // para adicionar uma moeda
                case 1:
                    System.out.println("Moeda que deseja adicionar:");
                    System.out.println("[1] Dolar");
                    System.out.println("[2] Euro");
                    System.out.println("[3] Real");

                    System.out.println();
                    // recebe a opção para verificar o tipo da moeda
                    opcaoDesejada = readLine.nextInt();
                    // recebe o valor da moeda
                    System.out.println("Valor que deseja adicionar: ");
                    valorMoeda = readLine.nextDouble();
                    // aqui entrara na opção em que contém o resultado fornecido pelo usuário
                    switch (opcaoDesejada) {
                        case 1:
                            // adiciona uma nova moeda da classe dolar e o valor que foi capturado anteriormente
                            cofrinho.adicionar(new Dolar(valorMoeda));
                            break;
                        case 2:
                            // adiciona uma nova moeda da classe euro e o valor que foi capturado anteriormente
                            cofrinho.adicionar(new Euro(valorMoeda));
                            break;
                        case 3:
                            // adiciona uma nova moeda da classe real e o valor que foi capturado anteriormente
                            cofrinho.adicionar(new Real(valorMoeda));
                            break;
                        default:
                            // caso o usuário não coloque um valor válido
                            System.out.println("Moeda ou valor invalido.");
                            break;                        
                    }
                    break;
                // para remover um moeda
                case 2:
                    System.out.println("Moeda que deseja remover:");
                    System.out.println("[1] Dolar");
                    System.out.println("[2] Euro");
                    System.out.println("[3] Real");

                    System.out.println();

                    opcaoDesejada = readLine.nextInt();

                    System.out.println("Valor que deseja remover: ");
                    valorMoeda = readLine.nextDouble();
                    // variável do tipo moeda que recebe nulo
                    Moeda moedaParaRemover = null;
                    // entra na opção de acordo com o valor da entrada do usuário
                    switch (opcaoDesejada) {
                        case 1:
                            // a variável nula recebe uma moeda de acordo com o método encontrar moeda, que por sua vez retorna uma moeda. Tem como parâmetro o tipo e o valor da moeda
                            // poderia usar cofrinho.remover(cofrinho.encontrarMoeda(Dolar.class, valorMoeda)) também, mas para melhor leitura criei uma variável do tipo moeda para receber a moeda retornate do método
                            moedaParaRemover = cofrinho.encontrarMoeda(Dolar.class, valorMoeda);
                            // essa moeda é passada para o remover, evitando ter que instânciar qualquer coisa a mais
                            cofrinho.remover(moedaParaRemover);
                            break;
                        case 2:
                            // mesma funcionalidade do case 1, mas passa por parâmetro a classe euro
                            moedaParaRemover = cofrinho.encontrarMoeda(Euro.class, valorMoeda);
                            cofrinho.remover(moedaParaRemover);
                            break;
                        case 3:
                            // mesma funcionalidade do case 1, mas passa por parâmetro a classe real
                            moedaParaRemover = cofrinho.encontrarMoeda(Real.class, valorMoeda);
                            cofrinho.remover(moedaParaRemover);
                            break;
                        default:
                            //caso o usuário não coloque um valor válido
                            System.out.println("Moeda ou valor invalido.");
                            break;                        
                    }
                    
                    break;
                // para imprimir todas as moedas adicionadas ao cofrinho
                case 3:
                    // método para imprimir toda a listagem das moedas adicionadas
                    cofrinho.listagemMoedas();
                    break;
                // valor total de todas as moedas em real, sendo que euro e doalr são convertidos para real
                case 4:
                    // método para imprimir o valor total junto com o convertido em real
                    cofrinho.totalConvertido();
                    break;
                // no caso do usuário querer encerrar o programa
                case 5:
                // troca a variável para falso, logo fazendo o laço while se encerrar
                    cofrinhoAtivo = false;
                    break;
                // caso o usuário coloque um valor inválido
                default:
                    System.out.println("Opcao invalida.");
            }
        }
        // encerra o scanner readline. coloquei ele porque estava acusando como "erro" por não encerrar ele em momento algum
        readLine.close();
        // mensagem e despedida
        System.out.println("Até mais!");
    }
}
