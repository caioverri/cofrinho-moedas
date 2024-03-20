// real herda da classe abstrata moeda
public class Real extends Moeda {
    // contrutor do real
    public Real(double valor) {
        // honrando em passar o valor para o parâmetro da super classe
        super(valor);
    }
    // sobreescrita do método info. retorna o valor da moeda real
    @Override
    public void info() {
        System.out.println(this.getValor() + "Reais.");
        System.out.println();
    }
}
