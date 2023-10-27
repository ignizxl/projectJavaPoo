/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projetoifpb;

/**
 *
 * @author João Igor
 */
public class Main {

    public static void main(String[] args) {
        CadastroDeOnibus onibusDisponiveis = new CadastroDeOnibus();
        Onibus onibus00 = new Onibus(01, "Guarabira - JoãoPessoa - Guarabira", 22);
        Onibus onibus01 = new Onibus(02, "Guarabira - Campina Grande - Guarabira", 15);
        Onibus onibus02 = new Onibus(03, "Guarabira - Natal - Guarabira", 20);
        
        onibusDisponiveis.adicionarNovoOnibus(onibus00);
        onibusDisponiveis.adicionarNovoOnibus(onibus01);
        onibusDisponiveis.adicionarNovoOnibus(onibus02);
        
        onibusDisponiveis.imprimeTodosOsOnibusDisponiveis();
        
        
    }
}
 