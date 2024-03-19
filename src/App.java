import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean cofrinhoAtivo = true;
        int opcaoDesejada;
        double valorMoeda;
        Scanner readLine = new Scanner(System.in);
        Cofrinho meuCofrinho = new Cofrinho();

        System.out.println("----- Meu Cofrinho -----");
        System.out.println();

        while (cofrinhoAtivo) {
            System.out.println("[1] Adicionar moedas");
            System.out.println("[2] Remover moedas");
            System.out.println("[3] Listar moedas");
            System.out.println("[4] Total em R$");
            System.out.println("[5] Fechar cofrinho");

            System.out.println();

            opcaoDesejada = readLine.nextInt();

            switch (opcaoDesejada) {
                case 1:
                    System.out.println("Moeda que deseja adicionar:");
                    System.out.println("[1] Dolar");
                    System.out.println("[2] Euro");
                    System.out.println("[3] Real");

                    System.out.println();

                    opcaoDesejada = readLine.nextInt();

                    System.out.println("Valor que deseja adicionar: ");
                    valorMoeda = readLine.nextDouble();

                    switch (opcaoDesejada) {
                        case 1:
                            meuCofrinho.adicionar(new Dolar(valorMoeda));
                            break;
                        case 2:
                            meuCofrinho.adicionar(new Euro(valorMoeda));
                            break;
                        case 3:
                            meuCofrinho.adicionar(new Real(valorMoeda));
                            break;
                        default:
                            System.out.println("Moeda ou valor invalido.");
                            break;                        
                    }
                    break;

                case 2:
                    System.out.println("Moeda que deseja remover:");
                    System.out.println("[1] Dolar");
                    System.out.println("[2] Euro");
                    System.out.println("[3] Real");

                    System.out.println();

                    opcaoDesejada = readLine.nextInt();

                    System.out.println("Valor que deseja remover: ");
                    valorMoeda = readLine.nextDouble();
                    
                    switch (opcaoDesejada) {
                        case 1:
                            meuCofrinho.remover(new Dolar(valorMoeda));
                            break;
                        case 2:
                            meuCofrinho.remover(new Euro(valorMoeda));
                            break;
                        case 3:
                            meuCofrinho.remover(new Real(valorMoeda));
                            break;
                        default:
                            System.out.println("Moeda ou valor invalido.");
                            break;                        
                    }
                    break;
                case 3:
                    meuCofrinho.listagemMoedas();
                    break;
                case 4:
                    meuCofrinho.totalConvertido();
                    break;
                case 5:
                    cofrinhoAtivo = false;
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        }
        System.out.println("Até mais!");
    }
}
