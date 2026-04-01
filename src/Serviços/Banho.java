package Serviços;

// HERANÇA: Banho é uma especialização de Servico
public class Banho extends Servico {

    // ENCAPSULAMENTO: atributos privados
    private String tipoBanho;
    private String tosa;
    private double preco;

    // Construtor padrão
    public Banho() {
        super(); // HERANÇA: chama o construtor da classe Servico
    }

    // Construtor com parâmetros
    public Banho(String tipoBanho, String tosa) {
        super(); // HERANÇA: reaproveita estrutura da classe mãe
        this.tipoBanho = tipoBanho;
        this.tosa = tosa;
    }

    // ENCAPSULAMENTO: métodos de acesso (getters e setters)
    public String getTipoBanho() {
        return tipoBanho;
    }

    public void setTipoBanho(String tipoBanho) {
        this.tipoBanho = tipoBanho;
    }

    public String getTosa() {
        return tosa;
    }

    public void setTosa(String tosa) {
        this.tosa = tosa;
    }

    // POLIMORFISMO: sobrescrita do método da classe Servico
    @Override
    public double calcularPreco() {

        // ABSTRAÇÃO: regra de negócio simplificada para cálculo do preço
        switch (tosa) {

            case "Tosa Higiênica":
                preco = 25.0;
                break;

            case "Tosa Racional":
                preco = 40.0;
                break;

            case "Tosa Estilizada":
                preco = 50.0;
                break;

            case "Tosa Completa":
                preco = 60.0;
                break;

            default:
                preco = 0.0; // caso não reconheça o tipo
        }

        return preco;
    }
}