public class Pet {
    private String nome;
    private String tipo; // cachorro, gato, etc
    private int idade;
    private Pessoa dono;

    public Pet(String nome, String tipo, int idade, Pessoa dono) {
        this.nome = nome;
        this.tipo = tipo;
        this.idade = idade;
        this.dono = dono;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public Pessoa getDono() { return dono; }
    public void setDono(Pessoa dono) { this.dono = dono; }
}