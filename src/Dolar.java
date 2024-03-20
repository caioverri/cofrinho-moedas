// dolar herda da classe abstrata moeda
public class Dolar extends Moeda {
    // contrutor do dolar
    public Dolar(double valor) {
        // honrando em passar o valor para o parâmetro da super classe
        super(valor);
    }
    // sobreescrita do método info. retorna o valor da moeda dolar e também informar o valor convertido em real
    @Override
    public void info() {
        System.out.println(this.getValor() + "Dolares.");
        System.out.println("Convertido para real: " + this.converter() + "Reais.");
        System.out.println();
    }
    // sobreescrita do método converter, onde converte o valor do dolar em real e retorna esse valor convertido
    @Override
    public double converter() {
        // getvalor para pegar o valor da moeda multiplicando pelo valor "atual" do dolar
        double convertido = this.getValor() * 5.03;
        // retornan o valor convertido para o método
        return convertido;
    }
}
