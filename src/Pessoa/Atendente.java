package Pessoa;

// Atendente também é uma Pessoa
public class Atendente extends Pessoa {

    private String turno; // exemplo: manhã, tarde, noite

    public Atendente() {
        super();
    }

    public Atendente(String nome, String cpf, String telefone, String turno) {
        super(nome, cpf, telefone);
        this.turno = turno;
    }

    @Override
    public String getDescricao() {
        return "Atendente: " + getNome() +
               " | Turno: " + turno;
    }

    // GETTER
    public String getTurno() {
        return turno;
    }

    // SETTER
    public void setTurno(String turno) {
        this.turno = turno;
    }
}
