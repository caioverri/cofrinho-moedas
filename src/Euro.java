public class Euro extends Moeda {

    public Euro(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println(this.getValor() + "Euros.");
        System.out.println("Convertido para real: " + this.converter() + "Reais.");
        System.out.println();
    }

    @Override
    public double converter() {
        double convertido = this.getValor() * 5.47;
        return convertido;
    }
}
