import java.util.ArrayList;
import java.util.Date;

public class Consulta {
    private Date data;
    private String diagnostico;
    private Veterinario veterinario;
    private Pet pet;
    private ArrayList<Medicamento> medicamentos;

    public Consulta() {

    }
    public void mostrarConsulta() {
        System.out.println("Data da consulta: " + data);
    }

    public Date getData() { return data; }
    public void setData(Date data) { this.data = data; }

    public String getDiagnostico() { return diagnostico; }
    public void setDiagnostico(String diagnostico) { this.diagnostico = diagnostico; }

    public Veterinario getVeterinario() { return veterinario; }
    public void setVeterinario(Veterinario veterinario) { this.veterinario = veterinario; }

    public Pet getPet() { return pet; }
    public void setPet(Pet pet) { this.pet = pet; }

    public ArrayList<Medicamento> getMedicamentos() { return medicamentos; }
    public void adicionarMedicamento(Medicamento m) { this.medicamentos.add(m); }}