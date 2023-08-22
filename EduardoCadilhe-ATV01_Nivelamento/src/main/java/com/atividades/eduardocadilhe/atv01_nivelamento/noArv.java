/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atividades.eduardocadilhe.atv01_nivelamento;

/**
 *
 * @author Cadilhe
 */
public class noArv<T> {//T poderá assumir char,Int, DOuble...
    private noArv<T> noEsquerdo;
    private noArv<T> noDireito;
    private T conteudo;
    
    //Construtor
    public void noArv(T conteudo){
        this.noEsquerdo=null;
        this.noDireito=null;
        this.conteudo=null;
    }
        
    //getter e setter

    public noArv<T> getNoEsquerdo() {
        return noEsquerdo;
    }

    public void setNoEsquerdo(noArv<T> noEsquerdo) {
        this.noEsquerdo = noEsquerdo;
    }

    public noArv<T> getNoDireito() {
        return noDireito;
    }

    public void setNoDireito(noArv<T> noDireito) {
        this.noDireito = noDireito;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }
    
    
}
