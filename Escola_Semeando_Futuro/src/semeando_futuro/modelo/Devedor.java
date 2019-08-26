/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semeando_futuro.modelo;

/**
 *
 * @author Thiago
 */
public class Devedor {
    Integer idDevedor;
    Double Mensalidade;
    String Obs,Estado;
    Integer idAlunoFK;

    public Integer getIdDevedor() {
        return idDevedor;
    }

    public void setIdDevedor(Integer idDevedores) {
        this.idDevedor = idDevedores;
    }

    public Double getMensalidade() {
        return Mensalidade;
    }

    public void setMensalidade(Double Mensalidade) {
        this.Mensalidade = Mensalidade;
    }

    public String getObs() {
        return Obs;
    }

    public void setObs(String Obs) {
        this.Obs = Obs;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public Integer getIdAluno() {
        return idAlunoFK;
    }

    public void setIdAluno(Integer idAluno) {
        this.idAlunoFK = idAluno;
    }
    
    

    
}
