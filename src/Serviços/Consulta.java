package Serviços;

import Pessoa.Veterinario;
import java.util.ArrayList;
import java.util.Date;

public class Consulta extends Servico {

    private String diagnostico;
    private Veterinario veterinario;
    private ArrayList<Medicamento> medicamentos = new ArrayList<>();

    public Consulta() {
        super();
    }

    public Consulta(Date dataServico, String diagnostico) {
        super(dataServico);
        this.diagnostico = diagnostico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public void adicionarMedicamento(Medicamento m) {//COLOCAR USO
        medicamentos.add(m);
    }

    public ArrayList<Medicamento> getMedicamentos() {//COLOCAR USO
        return medicamentos;
    }

    @Override
    public double calcularPreco() {

        double total = 100.0; // base

        // agora soma preço dos medicamentos
        for (Medicamento m : medicamentos) {
            total += m.getReceita();
        }

        return total;
    }
}