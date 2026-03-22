public class Pet {
    private String nome;
    private String tipo;
    private int idade;
    private Cliente dono;

    public Pet(String nome, String tipo, int idade, Cliente dono) {
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

    public Cliente getDono() { return dono; }
    public void setDono(Cliente dono) { this.dono = dono; }
}