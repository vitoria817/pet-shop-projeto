package Serviços;

// Classe filha de Servico
public class Banho extends Servico {

    private String tipoBanho;
    private String tosa;
    private double preco;

    public Banho() {
        super();
    }

    public Banho(String tipoBanho, String tosa) {//COLOCAR USO
        super();
        this.tipoBanho = tipoBanho;
        this.tosa = tosa;
    }

    // GETTERS e SETTERS
    public String getTipoBanho() { return tipoBanho; }//COLOCAR USO
    public void setTipoBanho(String tipoBanho) { this.tipoBanho = tipoBanho; }//COLOCAR USO

    public String getTosa() { return tosa; }
    public void setTosa(String tosa) { this.tosa = tosa; }

    // Regra de negócio para cálculo de preço
    @Override
    public double calcularPreco() {
        switch (tosa) {
            case "Tosa Higiênica": preco = 25.0; break;
            case "Tosa Racional": preco = 40.0; break;
            case "Tosa Estilizada": preco = 50.0; break;
            case "Tosa Completa": preco = 60.0; break;
            default: preco = 0.0;
        }
        return preco;
    }
}