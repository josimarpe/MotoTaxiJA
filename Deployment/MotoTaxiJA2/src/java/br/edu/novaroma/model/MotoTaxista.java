
package br.edu.novaroma.model;

import java.util.Date;

public class MotoTaxista {
    private String nome;
    private Date nascimento;
    private String telefone;
    private String cpf;
    private String emmail;
    private String login;
    private String senha;
    private String cnh;
    private Date validadeCnh;

    public MotoTaxista(){}
    
    public MotoTaxista(String nome, Date nascimento, String telefone, String cpf, String emmail, String login, String senha, String cnh, Date validadeCnh) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.telefone = telefone;
        this.cpf = cpf;
        this.emmail = emmail;
        this.login = login;
        this.senha = senha;
        this.cnh = cnh;
        this.validadeCnh = validadeCnh;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmmail() {
        return emmail;
    }

    public void setEmmail(String emmail) {
        this.emmail = emmail;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public Date getValidadeCnh() {
        return validadeCnh;
    }

    public void setValidadeCnh(Date validadeCnh) {
        this.validadeCnh = validadeCnh;
    }
    
}
