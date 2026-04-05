package Pessoa;

// Classe Cliente herda de Pessoa
public class Cliente extends Pessoa {

    private String endereco;

    public Cliente() {
        super();
    }

    public Cliente(String nome, String cpf, String telefone, String endereco) {
        super(nome, cpf, telefone);
        this.endereco = endereco;
    }

    // Implementação obrigatória da classe abstrata
    @Override
    public String getDescricao() {
        return "Cliente: " + getNome()+ " | CPF: " + getCpf();
        //get descrição vem da classe abstrata
        //@Override sobrescreve um metodo existente da super() classe pessoa
    }

    public static class Atendente extends Pessoa {

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
            return "Pessoa.Pessoa.Atendente: " + getNome() +
                    " | Turno: " + turno;
        }


        public String getTurno() {
            return turno;
        }


        public void setTurno(String turno) {
            this.turno = turno;
        }
    }
}