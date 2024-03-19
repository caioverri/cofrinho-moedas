public class Dolar extends Moeda {

    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println(this.getValor() + "Dolares.");
        System.out.println("Convertido para real: " + this.converter() + "Reais.");
        System.out.println();
    }

    @Override
    public double converter() {
        double convertido = this.getValor() * 5.03;
        return convertido;
    }
}
