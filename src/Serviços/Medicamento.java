package Serviços;

public class Medicamento {
    private String nome;
    private String dosagem;
    private double receita; // agora usado

    public Medicamento(String nome, String dosagem, double receita) {//COLOCAR USO
        this.nome = nome;
        this.dosagem = dosagem;
        this.receita = receita;
    }
    //COLOCAR USO
    public String getNome() { return nome; }//COLOCAR USO
    public void setNome(String nome) { this.nome = nome; }

    public String getDosagem() { return dosagem; }
    public void setDosagem(String dosagem) { this.dosagem = dosagem; }//COLOCAR USO

    public double getReceita() { return receita; }
    public void setReceita(double receita) { this.receita = receita; }//COLOCAR USO
}