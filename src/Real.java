public class Real extends Moeda {

    public Real(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println(this.getValor() + "Reais.");
        System.out.println();
    }
}
