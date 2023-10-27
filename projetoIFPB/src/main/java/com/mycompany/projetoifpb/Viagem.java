/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoifpb;



/**
 *
 * @author João Igor
 */
public class Viagem {
    private String origem;
    private String destino;
    private boolean emDeslocamento;
    private Motorista motorista;
    private double valorPassagem;
    private Passageiro passageiro;
    private boolean meiaPassagem;

    public Viagem(String origem, String destino, Motorista motorista, Passageiro passageiro, double valorPassagem, boolean meiaPassagem) {
        this.origem = origem;
        this.destino = destino;
        this.motorista = motorista;
        this.passageiro = passageiro;
        this.valorPassagem = valorPassagem;
        this.meiaPassagem = meiaPassagem;
    }
    
    public String getOrigem() {
        return origem;
    }
    public void setOrigem(String origem) {
        this.origem = origem;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public boolean isEmDeslocamento() {
        return emDeslocamento;
    }
    public void setEmDeslocamento(boolean emDeslocamento) {
        this.emDeslocamento = emDeslocamento;
    }
    public Motorista getMotorista() {
        return motorista;
    }
    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }
    public double getValorPassagem() {
        return valorPassagem;
    }
    public void setValorPassagem(double valorPassagem) {
        this.valorPassagem = valorPassagem;
    }
    public Passageiro getPassageiro() {
        return passageiro;
    }
    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    } 
    public boolean isMeiaPassagem() {
        return meiaPassagem;
    }
    public void setMeiaPassagem(boolean meiaPassagem) {
        this.meiaPassagem = meiaPassagem;
    }
    
    @Override
    public String toString() {
        return "Viagem{" + "\n Origem : " + origem + "\n Destino: " + destino + "\n Em Deslocamento: " + emDeslocamento +
                "\n Motorista: " + this.getMotorista().getNome() + "\n Valor da Passagem: " + valorPassagem  
                + "\n Passageiro: " + this.passageiro.getNome() + "\n =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=" + '}';
    }
}
