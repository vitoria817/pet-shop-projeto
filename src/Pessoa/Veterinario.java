package Pessoa;
public class Veterinario extends Pessoa {
    private String especialidade;
    private String crmv;

    public Veterinario(String nome, String cpf, String telefone, String especialidade, String crmv) {
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
        this.especialidade = especialidade;
        this.crmv = crmv;
    }
//polimorismo pegar um metodo que existe e alterar/modificar
    @Override
    public String Vetespecialiadade() {
        return "";
    }

    @Override
    public String Vetcrmv() {
        return "";
    }
    // Getters e setters adicionais se precisar
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }
    public void setCrmv(String crmv) { this.crmv = crmv; }
}

