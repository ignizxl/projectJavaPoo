/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoifpb;

/**
 *
 * @author João Igor
 */
public class Onibus {
    private int numeroOnibus;
    private int capacidade;
    private String trajeto;

    public Onibus(int numeroOnibus, String trajeto, int capacidade) {
        this.numeroOnibus = numeroOnibus;
        this.trajeto = trajeto;
        this.capacidade = capacidade;
    }

    public int getNumeroOnibus() {
        return numeroOnibus;
    }
    public void setNumeroOnibus(int numeroOnibus) {
        this.numeroOnibus = numeroOnibus;
    }
    public String getTrajeto() {
        return trajeto;
    }
    public void setTrajeto(String trajeto) {
        this.trajeto = trajeto;
    }
    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    @Override
    public String toString() {
        return " Informações do ônibus {" + "\n Número do Ônibus: " + this.getNumeroOnibus() + 
               "\n Trajeto: " + this.getTrajeto() + "\n Capacidade Máxima: " + this.getCapacidade() + " Passageiros" + "\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= \n" + '}';
    }
}
