public class Veterinario {

    private String nome;
    private String cpf;
    private String telefone;
    private String especialidade;
    private String crmv; // registro profissional do veterinário

    // Construtor
    public Veterinario(String nome, String cpf, String telefone, String especialidade, String crmv) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.especialidade = especialidade;
        this.crmv = crmv;
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }
}