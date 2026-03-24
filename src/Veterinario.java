public class Veterinario {

    private String Vetnome;
    private String Vetcpf;
    private String Vettelefone;
    private String Vetespecialidade;
    private String Vetcrmv;

    public Veterinario() {
    }

    public String getNome() {
        return Vetnome;
    }

    public void setNome(String Vetnome) {
        this.Vetnome = Vetnome;
    }

    public String getCpf() {
        return Vetcpf;
    }

    public void setCpf(String Vetcpf) {
        this.Vetcpf = Vetcpf;
    }

    public String getTelefone() {
        return Vettelefone;
    }

    public void setTelefone(String Vettelefone) {
        this.Vettelefone = Vettelefone;
    }

    public String getEspecialidade() {
        return Vetespecialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.Vetespecialidade = especialidade; //corrigido
    }

    public String getCrmv() {
        return Vetcrmv;
    }

    public void setCrmv(String Vetcrmv) {
        this.Vetcrmv = Vetcrmv;
    }
}