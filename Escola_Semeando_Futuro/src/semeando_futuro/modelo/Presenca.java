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
public class Presenca {
    int idPresenca,Aula,Falta;
    String Funcionario, Turma, RA_Aluno, Data;
    Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getIdPresenca() {
        return idPresenca;
    }

    public void setIdPresenca(int idPresenca) {
        this.idPresenca = idPresenca;
    }

    public int getAula() {
        return Aula;
    }

    public void setAula(int Aula) {
        this.Aula = Aula;
    }

    public int getFalta() {
        return Falta;
    }

    public void setFalta(int Falta) {
        this.Falta = Falta;
    }

    public String getFuncionario() {
        return Funcionario;
    }

    public void setFuncionario(String Funcionario) {
        this.Funcionario = Funcionario;
    }

    public String getTurma() {
        return Turma;
    }

    public void setTurma(String Turma) {
        this.Turma = Turma;
    }

    public String getRA_Aluno() {
        return RA_Aluno;
    }

    public void setRA_Aluno(String RA_Aluno) {
        this.RA_Aluno = RA_Aluno;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }
    
    
}
