package com.personal.util;

import java.util.List;
import java.util.Set;

import com.personal.generic.Conta;

/**
 * classe reponsavel por gerar um relatorio de contas
 * 
 * @since 3.0.0
 */
public class RelatorioContas{

    public void exibirListagem(Set<Conta> contas){
        System.out.println("Relatorios de conta a pagar e receber");

        contas.forEach(f ->{
            f.exibirDetalhes();
        });
    }

}