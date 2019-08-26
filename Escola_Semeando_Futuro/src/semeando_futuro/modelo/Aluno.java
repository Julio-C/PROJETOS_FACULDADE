/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semeando_futuro.modelo;

import com.mysql.jdbc.Blob;


/**
 *
 * @author Thiago
 */
public class Aluno {
    Integer idAluno, idTurmaFK, idMaeFK, idPaiFK;
    String Nome, Sobrenome, RA, Turma, RG_Mae, RG_Pai;
    String Nascimento;
    Double Mensalidade;       
    Blob Foto,Residencia, Certidao, Vacina, Matricula;
    String CaminhoFoto, CaminhoRes, CaminhoCert, CaminhoVac, CaminhoMatri;

    public String getTurma() {
        return Turma;
    }

    public void setTurma(String Turma) {
        this.Turma = Turma;
    }

    public String getRG_Mae() {
        return RG_Mae;
    }

    public void setRG_Mae(String RG_Mae) {
        this.RG_Mae = RG_Mae;
    }

    public String getRG_Pai() {
        return RG_Pai;
    }

    public void setRG_Pai(String RG_Pai) {
        this.RG_Pai = RG_Pai;
    }

    
    
    public Blob getMatricula() {
        return Matricula;
    }

    public void setMatricula(Blob Matricula) {
        this.Matricula = Matricula;
    }

    public String getCaminhoMatri() {
        return CaminhoMatri;
    }

    public void setCaminhoMatri(String CaminhoMatri) {
        this.CaminhoMatri = CaminhoMatri;
    }

    
    public Blob getFoto() {
        return Foto;
    }

    public void setFoto(Blob Foto) {
        this.Foto = Foto;
    }

    public Blob getResidencia() {
        return Residencia;
    }

    public void setResidencia(Blob Residencia) {
        this.Residencia = Residencia;
    }

    public Blob getCertidao() {
        return Certidao;
    }

    public void setCertidao(Blob Certidao) {
        this.Certidao = Certidao;
    }

    public Blob getVacina() {
        return Vacina;
    }

    public void setVacina(Blob Vacina) {
        this.Vacina = Vacina;
    }

    public String getCaminhoFoto() {
        return CaminhoFoto;
    }

    public void setCaminhoFoto(String CaminhoFoto) {
        this.CaminhoFoto = CaminhoFoto;
    }

    public String getCaminhoRes() {
        return CaminhoRes;
    }

    public void setCaminhoRes(String CaminhoRes) {
        this.CaminhoRes = CaminhoRes;
    }

    public String getCaminhoCert() {
        return CaminhoCert;
    }

    public void setCaminhoCert(String CaminhoCert) {
        this.CaminhoCert = CaminhoCert;
    }

    public String getCaminhoVac() {
        return CaminhoVac;
    }

    public void setCaminhoVac(String CaminhoVac) {
        this.CaminhoVac = CaminhoVac;
    }

    public Integer getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Integer idAluno) {
        this.idAluno = idAluno;
    }

    public Integer getIdTurmaFK() {
        return idTurmaFK;
    }

    public void setIdTurmaFK(Integer idTurmaFK) {
        this.idTurmaFK = idTurmaFK;
    }

    public Integer getIdMaeFK() {
        return idMaeFK;
    }

    public void setIdMaeFK(Integer idMaeFK) {
        this.idMaeFK = idMaeFK;
    }

    public Integer getIdPaiFK() {
        return idPaiFK;
    }

    public void setIdPaiFK(Integer idPaiFK) {
        this.idPaiFK = idPaiFK;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    } 

    public Double getMensalidade() {
        return Mensalidade;
    }

    public void setMensalidade(Double Mensalidade) {
        this.Mensalidade = Mensalidade;
    }

    public String getNascimento() {
        return Nascimento;
    }

    public void setNascimento(String Nascimento) {
        this.Nascimento = Nascimento;
    }
    
    
    
    
}
