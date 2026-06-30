package model;

import java.util.Date;

public class Usuario {
    //Atributos 
    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private Date dataNasc;
    private String senha;
    private boolean avisos;
    
    //Método construtor
    public Usuario(){}

    public Usuario(int id, String nome, String cpf, String telefone, String email, Date dataNasc, String senha, boolean avisos) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.dataNasc = dataNasc;
        this.senha = senha;
        this.avisos = avisos;
    }

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
    
    //Getters e Setters
    public int getId(){
        return this.id;
    }
    public Date dataNasc(){
        return this.dataNasc;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getEmail() {
        return this.email;
    }

    public Date getDataNasc() {
        return this.dataNasc;
    }

    public String getSenha() {
        return this.senha;
    }

    public boolean isAvisos() {
        return this.avisos;
    }
    
    public void setID(int id){
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setAvisos(boolean avisos) {
        this.avisos = avisos;
    }

    @Override
    public String toString() {
        return "<hr><ul> <li>id=" + id +
                "</li> <li> nome=" + nome +
                "</li> <li> cpf=" + cpf + 
                "</li> <li> telefone=" + telefone + 
                "</li> <li> email=" + email +
                "</li> <li> dataNasc=" + dataNasc + 
                "</li> <li> senha=" + senha +
                "</li> <li> avisos=" + avisos + 
                "</ul>";
    }
    
    
}
