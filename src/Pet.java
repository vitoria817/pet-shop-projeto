public class Pet {
    private String Petnome;
    private String Pettipo;
    private int Petidade;
    private Cliente Petdono;
    private String Petporte;

    public Pet() {

    }

    // GETTERS

    public String getPetporte() {
        return Petporte;
    }

    public String getNome() {
        return Petnome;
    }

    public String getTipo() {
        return Pettipo;
    }

    public int getIdade() {
        return Petidade;
    }

    public Cliente getDono() {
        return Petdono;
    }

    // SETTERS

    public void setPetporte(String petporte) {
        Petporte = petporte;
    }

    public void setNome(String nome) {
        this.Petnome = nome;
    }

    public void setTipo(String tipo) {
        this.Pettipo = tipo;
    }

    public void setIdade(int idade) {
        this.Petidade = idade;
    }

    public void setDono(Cliente dono) {
        this.Petdono = dono;
    }
}