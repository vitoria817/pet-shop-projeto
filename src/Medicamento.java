public class Medicamento {
    private String nome;
    private String fabricante;
    private String dosagem; // Ex: "2x ao dia"

    public Medicamento(String nome, String fabricante, String dosagem) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.dosagem = dosagem;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getFabricante() { return fabricante; }
    public void setFabricante(String fabricante) { this.fabricante = fabricante; }

    public String getDosagem() { return dosagem; }
    public void setDosagem(String dosagem) { this.dosagem = dosagem; }
}