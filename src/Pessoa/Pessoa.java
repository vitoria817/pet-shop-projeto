package Pessoa;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;

    public Pessoa() {}

    public Pessoa(String nome, String cpf, String telefone) {
        this.nome = nome;
        setCpf(cpf);
        this.telefone = telefone;
    }

    public String getCpf() { return cpf; }
    public String getNome() { return nome; }
    public String getTelefone() { return telefone; }

    public void setCpf(String cpf) {
        if(cpf.length() != 11) throw new IllegalArgumentException("CPF deve ter 11 dígitos");
        this.cpf = cpf;
    }

    public void setNome(String nome) { this.nome = nome; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    // ABSTRAÇÃO
    public abstract String getDescricao();
}