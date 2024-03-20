// euro herda da classe abstrata moeda
public class Euro extends Moeda {
    // contrutor do euro
    public Euro(double valor) {
        // honrando em passar o valor para o parâmetro da super classe
        super(valor);
    }
    // sobreescrita do método info. retorna o valor da moeda euro e também informar o valor convertido em real
    @Override
    public void info() {
        System.out.println(this.getValor() + "Euros.");
        System.out.println("Convertido para real: " + this.converter() + "Reais.");
        System.out.println();
    }
    // sobreescrita do método converter, onde converte o valor do euro em real e retorna esse valor convertido
    @Override
    public double converter() {
        // getvalor para pegar o valor da moeda multiplicando pelo valor "atual" do euro
        double convertido = this.getValor() * 5.47;
        // retornan o valor convertido para o método
        return convertido;
    }
}
