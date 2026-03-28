package Serviços;

import java.util.Date;

public abstract class Servico {

    private Date dataServico;

    public Servico() {}

    public Servico(Date dataServico) {
        this.dataServico = dataServico;
    }

    public Date getDataServico() {   //COLOCAR USO
        return dataServico;
    }

    public void setDataServico(Date dataServico) {
        this.dataServico = dataServico;
    }

    // MÉTODO ABSTRATO (obriga as subclasses)
    public abstract double calcularPreco();
}