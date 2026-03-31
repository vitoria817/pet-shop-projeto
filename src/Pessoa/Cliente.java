package Pessoa;

// Classe Cliente herda de Pessoa
public class Cliente extends Pessoa {

    public Cliente() {
        super();
    }

    public Cliente(String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
    }

    // Implementação obrigatória da classe abstrata
    @Override
    public String getDescricao() {
        return "Cliente: " + getNome()+ " | CPF: " + getCpf();
        //get descrição vem da classe abstrata
        //@Override sobrescreve um metodo existente da super() classe pessoa
    }
}

