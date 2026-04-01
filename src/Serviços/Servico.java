package Serviços;

import java.util.Date;

// ABSTRAÇÃO: classe abstrata (não pode ser instanciada diretamente)
// Representa um modelo genérico de serviço
public abstract class Servico {

    // ENCAPSULAMENTO: atributo privado (protegido contra acesso direto)
    private Date dataServico;

    // Construtor padrão
    public Servico() {}

    // Construtor com parâmetro
    public Servico(Date dataServico) {
        this.dataServico = dataServico;
    }

    // ENCAPSULAMENTO: método para acessar a data
    public Date getDataServico() {
        return dataServico;
    }

    // ENCAPSULAMENTO: método para alterar a data com validação
    public void setDataServico(Date dataServico) {
        if (dataServico != null) { // evita valor nulo
            this.dataServico = dataServico;
        }
    }

    // ABSTRAÇÃO + POLIMORFISMO:
    // método abstrato (sem implementação)
    // obriga todas as subclasses a implementarem seu próprio cálculo de preço
    public abstract double calcularPreco();
}