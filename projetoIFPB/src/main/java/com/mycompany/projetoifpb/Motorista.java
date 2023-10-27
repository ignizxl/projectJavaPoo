/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoifpb;

/**
 *
 * @author João Igor
 */
public class Motorista {
    private String nome;
    private String numeroHabilitacao;
    private int idade;

    public Motorista(String nome, String numeroHabilitacao, int idade) {
        this.nome = nome;
        this.numeroHabilitacao = numeroHabilitacao;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNumeroHabilitacao() {
        return numeroHabilitacao;
    }
    public void setNumeroHabilitacao(String numeroHabilitacao) {
        this.numeroHabilitacao = numeroHabilitacao;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
