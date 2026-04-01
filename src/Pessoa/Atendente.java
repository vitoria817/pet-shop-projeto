package Pessoa;


public class Atendente extends Pessoa {

    private String turno;

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


    public String getTurno() {
        return turno;
    }


    public void setTurno(String turno) {
        this.turno = turno;
    }
}