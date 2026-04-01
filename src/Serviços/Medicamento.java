package Serviços;

// Classe simples (modelo de dados)
public class Medicamento {

    // ENCAPSULAMENTO: atributos privados
    private String nome;
    private String dosagem;
    private double receita;

    // Construtor: inicializa os atributos do medicamento
    public Medicamento(String nome, String dosagem, double receita) {
        this.nome = nome;
        this.dosagem = dosagem;
        this.receita = receita;
    }

    // ENCAPSULAMENTO: métodos de acesso (getters e setters)

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDosagem() {
        return dosagem;
    }

    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }

    public double getReceita() {
        return receita;
    }

    public void setReceita(double receita) {
        this.receita = receita;
    }
}