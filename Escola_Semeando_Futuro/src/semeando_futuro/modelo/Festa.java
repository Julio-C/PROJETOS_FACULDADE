/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semeando_futuro.modelo;

import java.util.Date;

/**
 *
 * @author Thiago
 */
public class Festa {
    Integer id_Festa,id_AlunoFK;
    String Nome,Observacao, Data_Festa,RAAluno;    
    Double Pagamento;
    Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    
    public Integer getId_AlunoFK() {
        return id_AlunoFK;
    }

    public void setId_AlunoFK(Integer id_AlunoFK) {
        this.id_AlunoFK = id_AlunoFK;
    }

    public String getRAAluno() {
        return RAAluno;
    }

    public void setRAAluno(String RAAluno) {
        this.RAAluno = RAAluno;
    }

    
    public Integer getId_Festa() {
        return id_Festa;
    }

    public void setId_Festa(Integer id_Festa) {
        this.id_Festa = id_Festa;
    }

    public Integer getId_Aluno() {
        return id_AlunoFK;
    }

    public void setId_Aluno(Integer id_Aluno) {
        this.id_AlunoFK = id_Aluno;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getObservacao() {
        return Observacao;
    }

    public void setObservacao(String Observacao) {
        this.Observacao = Observacao;
    }

    public String getData_Festa() {
        return Data_Festa;
    }

    public void setData_Festa(String Data_Festa) {
        this.Data_Festa = Data_Festa;
    }

    public Double getPagamento() {
        return Pagamento;
    }

    public void setPagamento(Double Pagamento) {
        this.Pagamento = Pagamento;
    }
    
    
    
}
