package Pessoa;

// Herança: Veterinario é uma Pessoa
public class Veterinario extends Pessoa {
    private String especialidade;
    private String crmv;

    public Veterinario() {
        super();
    }

    public Veterinario(String nome, String cpf, String telefone, String especialidade, String crmv) {

        super(nome, cpf, telefone);//chamando o construtor da classe pessoa

        this.especialidade = especialidade;
        this.crmv = crmv;
    }

    @Override
    public String getDescricao() {
        return "Veterinário: " + getNome() +
                " | Especialidade: " + especialidade +
                " | CRMV: " + crmv;
    }


    // GETTERS
    public String getEspecialidade() {
        return especialidade;
    }

    public String getCrmv() {
        return crmv;
    }

    // SETTERS
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

}