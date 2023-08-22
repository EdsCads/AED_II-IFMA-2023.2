/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atividades.eduardocadilhe.atv01_nivelamento;

/**
 *
 * @author Cadilhe
 */
public class noPilha<T> {//T poderá assumir char,Int, DOuble...
    private noPilha<T> noProximo;
    private T conteudo;
    
    //Construtor
    public noPilha(T conteudo) {
        this.noProximo = null;
        this.conteudo = conteudo;
    }
    
    //Getter e setters

    public noPilha<T> getNoProximo() {
        return noProximo;
    }

    public void setNoProximo(noPilha<T> noProximo) {
        this.noProximo = noProximo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }
        
}
