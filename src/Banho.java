public class Banho {

    private String tipoBanho;   // ex.: Banho Simples, Hidratação
    private double preco;       // preço do serviço
    private String tosa;        // tipo da tosa

    // Construtor vazio
    public Banho() {
    }

    // Getters e Setters
    public String getTipoBanho() {
        return tipoBanho;
    }

    public void setTipoBanho(String tipoBanho) {
        this.tipoBanho = tipoBanho;
        // Preço do banho (opcional)
        switch (tipoBanho) {
            case "Banho Simples":
                this.preco = 30.0;
                break;
            case "Banho com Hidratação":
                this.preco = 50.0;
                break;
            case "Banho Desembaraçante":
                this.preco = 40.0;
                break;
            case "Banho Antipulgas":
                this.preco = 45.0;
                break;
            default:
                this.preco = 0.0;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTosa() {
        return tosa;
    }

    public void setTosa(String tosa) {
        this.tosa = tosa;
        // Define o preço automaticamente com base no tipo de tosa
        switch (tosa) {
            case "Tosa Higiênica":
                this.preco = 25.0;
                break;
            case "Tosa Racional":
                this.preco = 40.0;
                break;
            case "Tosa Estilizada":
                this.preco = 50.0;
                break;
            case "Tosa Completa":
                this.preco = 60.0;
                break;
            default:
                this.preco = 0.0; // tipo inválido
        }
    }
}