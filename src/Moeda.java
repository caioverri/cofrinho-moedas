// classe abstrata para que não possa ser instãnciada
public abstract class Moeda {
    // atributo do valor da moeda
    private double valor;
    // retorna o valor através do encapsulamento
    public double getValor() {
        return valor;
    }
    // construtor vazio para que a classe cofrinho consiga ser instânciada
    public Moeda() {}
    // contrutor com parâmetro valor para que as classes dolar, euro e real recebam um valor ao instância-las
    public Moeda(double valor) {
        this.valor = valor;
    }
    // método para informações que será sobreescrista nas classes filhas
    public void info() {}
    // método que retorna um valor convertido e que também será sobreescrito nas classes filhas
    public double converter() {
        double convertido = 0;
        return convertido;
    }
}
