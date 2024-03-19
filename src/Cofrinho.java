import java.util.ArrayList;

public class Cofrinho extends Moeda {
    private double totalEmReais;
    private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();

    public void adicionar(Moeda moeda) {
        listaMoedas.add(moeda);
    }

    public void remover(Moeda moeda) {
        listaMoedas.remove(moeda);
    }

    public void listagemMoedas() {
        for (Moeda i : listaMoedas) {
            i.info();
        }
    }

    public void totalConvertido() {
        for (Moeda i : listaMoedas) {
            if(i instanceof Dolar) {
                totalEmReais+= i.converter();
            } else if (i instanceof Euro) {
                totalEmReais+=i.converter();
            } else if (i instanceof Real) {
                totalEmReais+= i.getValor();
            }
            System.out.println("O total em reais é de R$" + totalEmReais +".");
            System.out.println();
        }
    }
}
