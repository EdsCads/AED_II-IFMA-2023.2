/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atividades.eduardocadilhe.atv01_nivelamento;

/**
 *
 * @author Cadilhe
 */
public class noLista<T> { //T poderá assumir char,Int, DOuble...
    private T valor;
    
    private noLista<T> proximo;
    private noLista<T> anterior;

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public noLista<T> getProximo() {
        return proximo;
    }

    public void setProximo(noLista<T> proximo) {
        this.proximo = proximo;
    }

    public noLista<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(noLista<T> anterior) {
        this.anterior = anterior;
    }

}
