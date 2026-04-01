package Serviços; // Organização em pacote

import Pessoa.Veterinario;
import java.util.ArrayList;
import java.util.Date;

// HERANÇA: Consulta herda de Servico
public class Consulta extends Servico {

    // ENCAPSULAMENTO: atributos privados
    private String diagnostico;
    private Veterinario veterinario;

    // RELACIONAMENTO (associação): uma consulta pode ter vários medicamentos
    private ArrayList<Medicamento> medicamentos = new ArrayList<>();

    // Construtor padrão
    public Consulta() {
        super(); // HERANÇA: chama construtor da classe Servico
    }

    // Construtor com parâmetros
    public Consulta(Date dataServico, String diagnostico) {
        super(dataServico); // HERANÇA: reaproveita data do serviço
        this.diagnostico = diagnostico;
    }

    // ENCAPSULAMENTO: acesso controlado ao diagnóstico
    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    // ENCAPSULAMENTO: acesso ao veterinário responsável
    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    // USO DA LISTA: adiciona um medicamento na consulta
    public void adicionarMedicamento(Medicamento m) {
        medicamentos.add(m);
    }

    // USO DA LISTA: retorna todos os medicamentos da consulta
    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    // POLIMORFISMO: sobrescrita do método da classe Servico
    @Override
    public double calcularPreco() {
        double total = 100.0; // valor base da consulta

        // ABSTRAÇÃO: cálculo considera apenas o essencial (preço dos medicamentos)
        for (Medicamento m : medicamentos) {
            total += m.getReceita(); // soma o valor de cada medicamento
        }

        return total;
    }
}