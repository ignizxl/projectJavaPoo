/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoifpb;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author João Igor
 */
public class CadastroDeViagens {
    private List<Viagem> totalDeViagens;
    private int totalDePassageiros;
    private double totalArrecadado; 
    
    public CadastroDeViagens() {
        this.totalDeViagens = new ArrayList<Viagem>();
        this.totalDePassageiros = 0;
    }
    public void adicionarViagem(Viagem novaViagem){
        this.totalDeViagens.add(novaViagem);
    }
    public List<Viagem> getTotalDeViagens() {
        return totalDeViagens;
    }
    public void setTotalDeViagens(List<Viagem> totalDeViagens) {
        this.totalDeViagens = totalDeViagens;
    }
    public double getTotalArrecadado() {
        return totalArrecadado;
    }
    public void setTotalArrecadado(double totalArrecadado) {
        this.totalArrecadado = totalArrecadado;
    }
    public int getTotalDePassageiros() {
        return totalDePassageiros;
    }
    public void setTotalDePassageiros(int totalDePassageiros) {
        this.totalDePassageiros = totalDePassageiros;
    }
        
    public double calcularArrecadacao(){
        for (Viagem index : totalDeViagens){
           this.setTotalArrecadado(index.getValorPassagem() + this.getTotalArrecadado());
        }
        return this.getTotalArrecadado();
    }
    
    public void imprimeTodasAsViagensDisponiveis(){
        for (Viagem index : totalDeViagens){
            System.out.println(index.toString());
        }

        System.out.println("Total Arrecadado: R$ " + this.calcularArrecadacao());
    }
}
        