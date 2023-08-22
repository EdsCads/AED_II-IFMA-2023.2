/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atividades.eduardocadilhe.atv01_nivelamento;

/**
 *
 * @author Cadilhe
 */
public class noFila<T> {//T poderá assumir char,Int, DOuble...
    private noFila<T> noProximo;
    private T conteudo;
    
    public noFila(T obj){
        this.noProximo=null;
        this.conteudo=obj; 
    }
    //Getters e setter

    public noFila<T> getNoProximo() {
        return noProximo;
    }

    public void setNoProximo(noFila<T> noProximo) {
        this.noProximo = noProximo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }
    
    public void limparNoFila(){
        setNoProximo(null);
    }
}

