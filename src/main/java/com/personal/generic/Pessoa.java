package com.personal.generic;

/**
 * representa uma pessoa 
 * 
 * @since 3.0.0
 */
public abstract class Pessoa{

    private String nome;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

}