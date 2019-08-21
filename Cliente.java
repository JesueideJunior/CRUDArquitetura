/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaarquitetura;

/**
 *
 * @author jjuni
 */
public class Cliente {
    private int Codigo;
    private String Nome;
    private String Sexo;
    private int idade;

    public Cliente() {
    }

    public Cliente(int Codigo, String Nome, String Sexo, int idade) {
        this.Codigo = Codigo;
        this.Nome = Nome;
        this.Sexo = Sexo;
        this.idade = idade;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
