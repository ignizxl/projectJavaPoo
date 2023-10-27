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
public class CadastroDeOnibus {
    private List<Onibus> onibusDisponiveis;
    //construtor
    
    public CadastroDeOnibus(){
        //fazendo a instância do arraylist
        this.onibusDisponiveis = new ArrayList<Onibus>();
    }
    
    public void adicionarNovoOnibus(Onibus novoOnibus){
        this.onibusDisponiveis.add(novoOnibus);
    }
    
    public void imprimeTodosOsOnibusDisponiveis(){
        for (Onibus index : onibusDisponiveis){
            System.out.println(index.toString());
        }
    }
}
