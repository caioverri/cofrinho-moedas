/// importação necessária para usar arraylist
import java.util.ArrayList;
// cofrinho herda da classe abstrata moeda
public class Cofrinho extends Moeda {
    // valor total convertido em reais
    private double totalEmReais;
    // lista de moedas que recebe todo tipo de moeda (desde que tenha como herança)
    private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
    // adiciona uma nova moeda a lista de moedas
    public void adicionar(Moeda moeda) {
        listaMoedas.add(moeda);
    }
    // remove uma moeda da lista de moedas
    public void remover(Moeda moeda) {
        listaMoedas.remove(moeda);
    }
    // novo método para encontrar uma moeda sem ter que instanciar um moeda no programa princípal.
    // esse método recebe como parâmetro um tipo de classe que herda de moeda e o valor daquela moeda
    public Moeda encontrarMoeda(Class<? extends Moeda> tipoMoeda, double valorMoeda) {
        // laço para percorrer a lista de moedas
        for (Moeda moedaAtual : listaMoedas) {
            // condição em que, caso passe por uma moeda da lista cujo tipo e valor são iguais aos parâmetro fornecidos, o método retorna aquela moeda
            if (moedaAtual.getClass().equals(tipoMoeda) && moedaAtual.getValor() == valorMoeda) {
                // retorna a moeda
                return moedaAtual;
            }
        }
        // no caso de não achar aquela moeda, retorna nulo
        return null;
    }   
    // método para listar todas as moedas da lista de moedas
    public void listagemMoedas() {
        // percorre item por item na lista de moedas
        for (Moeda i : listaMoedas) {
            // para cada moeda da lista, utiliza o método info, que por sua vez imprime as informações daquela moedas
            i.info();
        }
    }
    // método para converter em real e somar o montante do valor das moedas
    public void totalConvertido() {
        // percorre item a item na lista de moedas
        for (Moeda i : listaMoedas) {
            // caso a instância dessa moeda seja dolar, utiliza o método de conversão daquela moeda para retornar o valor em real e somar no total em reais
            if(i instanceof Dolar) {
                totalEmReais+= i.converter();
            // caso a instância dessa moeda seja euro, utiliza o método de conversão daquela moeda para retornar o valor em real e somar no total em reais
            } else if (i instanceof Euro) {
                totalEmReais+=i.converter();
            // apenas retorna o valor e soma no total em reais
            } else if (i instanceof Real) {
                totalEmReais+= i.getValor();
            }            
        }
        // imprime o valor total convertido em reais
        System.out.println("O total em reais é de R$" + totalEmReais +".");
        System.out.println();
    }
}
