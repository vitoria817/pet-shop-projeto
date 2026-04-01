// Define o pacote onde a classe está organizada (estrutura do projeto)
package Pessoa;
// Classe Atendente HERDA (extends) de Pessoa
public class Atendente extends Pessoa {

    private String turno;
    // Construtor padrão (sem parâmetros)
    // Chama o construtor da classe mãe (Pessoa)
    public Atendente() {
        super();
    }
    // Construtor com parâmetros
    public Atendente(String nome, String cpf, String telefone, String turno) {
        super(nome, cpf, telefone);
        this.turno = turno;
    }
    // Sobrescrita de método (polimorfismo)
    @Override
    public String getDescricao() {
        return "Atendente: " + getNome() +
               " | Turno: " + turno;
    }

    //metodos getters e setters
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
