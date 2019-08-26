
package semeando_futuro.modelo;

import java.util.Date;


public class Desligamento {
    Integer idDesligamento, idAluno;
    String Motivo, Data_Desligamento,RAALuno;
    Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    

    public String getRAALuno() {
        return RAALuno;
    }

    public void setRAALuno(String RAALuno) {
        this.RAALuno = RAALuno;
    }

    public Integer getIdDesligamento() {
        return idDesligamento;
    }

    public void setIdDesligamento(Integer idDesligamento) {
        this.idDesligamento = idDesligamento;
    }

    public Integer getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Integer idAluno) {
        this.idAluno = idAluno;
    }

    public String getMotivo() {
        return Motivo;
    }

    public void setMotivo(String Motivo) {
        this.Motivo = Motivo;
    }

    public String getData_Desligamento() {
        return Data_Desligamento;
    }

    public void setData_Desligamento(String Data_Desligamento) {
        this.Data_Desligamento = Data_Desligamento;
    }
    
    
    
}
