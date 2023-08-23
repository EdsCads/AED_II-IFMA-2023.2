package com.atividades.eduardocadilhe.atv01_nivelamento;

/*
 * @author 20202SI0011
 */

import java.util.Iterator;
import java.util.List;
import java.io.File;
import static LerArquivo.lerArquivo.readFileInList;

public class ArvBinaria<T extends Comparable<T>> implements EstruturaDeDados {
    
    private noArv<T> noRaiz;
    private int qtd;
    
    public void ArvBinaria(){
        this.noRaiz=null;
    }

    private void inserir(noArv<T> noAtual,noArv<T> novoNo){
        int res=novoNo.getConteudo().compareTo(noAtual.getConteudo());
        if(res<0){
            if(noAtual.getNoEsquerdo()!=null)
                inserir(noAtual.getNoEsquerdo(),novoNo);
            else
                noAtual.setNoEsquerdo(novoNo);
        }if(res>0){
            if(noAtual.getNoDireito()!=null)
                inserir(noAtual.getNoDireito(),novoNo);
            else
                noAtual.setNoDireito(novoNo);
        }
    }
    
    private noArv<T> remover(noArv<T> noAtual)    {
        noArv<T> no1,no2;
        if(noAtual.getNoEsquerdo()==null){
            no2 = noAtual.getNoDireito();
            noAtual.setNoEsquerdo(null);
            noAtual.setNoDireito(null);
            noAtual.setConteudo(null);
            return no2;
        }
        no1 = noAtual;
        no2 = noAtual.getNoEsquerdo();
        while(no2.getNoDireito() != null) {
            no1 = no2;
            no2 = no2.getNoDireito();
        }
        if(no1 != noAtual) {
            no1.setNoDireito(no2.getNoEsquerdo());
            no2.setNoEsquerdo(noAtual.getNoEsquerdo());
        }
        no2.setNoDireito(noAtual.getNoDireito());
        noAtual.setNoEsquerdo(null);
        noAtual.setNoDireito(null);
        return no2;        
    }
    private void exibirEmOrdem(noArv<T> noAtual) {
        if(noAtual != null){
            exibirEmOrdem(noAtual.getNoEsquerdo());
            String str = "";
            str += noAtual.getConteudo();
            System.out.printf("%s ", str);
            exibirEmOrdem(noAtual.getNoDireito());
        }
    }
    
    public void exibirEmOrdem() {
        System.out.println();
        System.out.printf("Em ordem: ");
        exibirEmOrdem(noRaiz);
        System.out.println();
    }

    private void exibirPosOrdem(noArv<T> noAtual) {
        if(noAtual != null){
            exibirPosOrdem(noAtual.getNoEsquerdo());
            exibirPosOrdem(noAtual.getNoDireito());
            String str = "";
            str += noAtual.getConteudo();
            System.out.printf("%s ", str);
        }
    }
    
    public void exibirPosOrdem() {
        System.out.println();
        System.out.printf("Pos ordem: ");
        exibirPosOrdem(noRaiz);
        System.out.println();
    }

    private void exibirPreOrdem(noArv<T> noAtual) {
        if(noAtual != null){
            String str = "";
            str += noAtual.getConteudo();
            System.out.printf("%s ", str);
            exibirPreOrdem(noAtual.getNoEsquerdo());
            exibirPreOrdem(noAtual.getNoDireito());
        }
    }
    
    public void exibirPreOrdem() {
        System.out.println();
        System.out.printf("Pre ordem: ");
        exibirPreOrdem(noRaiz);
        System.out.println();
    }
    
    private void limparNo(noArv<T> noAtual) {
        if(noAtual == null) return;
        limparNo(noAtual.getNoEsquerdo());
        limparNo(noAtual.getNoDireito());
        noAtual.setNoEsquerdo(null);
        noAtual.setNoDireito(null);
        decrementQuantidade();
    }
    
    public void limpar() {
        if(noRaiz == null) return;
        limparNo(noRaiz);
        noRaiz = null;
    }
    
    private void incrementQuantidade() {
        qtd++;
    }
    
    private void decrementQuantidade() {
        if(qtd > 0) qtd--;
    }
    
    public int totalNos() {
        return qtd;
        //return totalNos(noRaiz);
    }
    
    private int altura(noArv<T> noAtual) {
        if(noAtual == null) return 0;
        
        int altEsquerda = altura(noAtual.getNoEsquerdo());
        int altDireita = altura(noAtual.getNoDireito());
        
        if(altEsquerda > altDireita)
            return (altEsquerda + 1);
        else
            return (altDireita + 1);
    }
    
    public int altura() {
        return altura(noRaiz);
    }
    
    public boolean vazia() {
        return noRaiz == null;
    }

    @Override
    public boolean inserirArquivo() {
        File directory = new File("");
        String caminho = (String) directory.getAbsolutePath();
        // caminho += "//src//entrada//";
        caminho += "//dados_1.txt";
        
	List l = readFileInList(caminho);
        String[] dados = new String[l.size()];
        Iterator<String> itr = l.iterator();
        int i=0;
        while(itr.hasNext()) {
            dados[i] = itr.next();
            i++;
        }
        // carregar dados
        for(String valor: dados) {
            this.inserirObjeto(Integer.parseInt(valor));
        }
        return true;
    }

    @Override
    public boolean inserirObjeto(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean remover(Object o) {
         if(noRaiz == null) return false;
        
        noArv<T> noAnterior = null;
        noArv<T> noAtual = noRaiz;
        
        while(noAtual != null) {
            T obj = (T)o;
            if(obj.compareTo(noAtual.getConteudo()) == 0) {
                if(obj.compareTo(noRaiz.getConteudo()) == 0)
                    noRaiz = remover(noAtual);
                else {
                    if(noAnterior.getNoDireito() == noAtual)
                        noAnterior.setNoDireito(remover(noAtual));
                    else
                        noAnterior.setNoEsquerdo(remover(noAtual));
                }
                decrementQuantidade();
                return true;
            }
            noAnterior = noAtual;
            if(obj.compareTo(noAtual.getConteudo()) > 0)
                noAtual = noAtual.getNoDireito();
            else
                noAtual = noAtual.getNoEsquerdo();
        }
        return false;
    }

    @Override
    public Object buscar(Object o) {
        noArv<T> noAtual = noRaiz;
        while(noAtual != null) {
            T obj = (T) o;
            if(obj.compareTo(noAtual.getConteudo()) == 0)
                return noAtual.getConteudo();
            else if(obj.compareTo(noAtual.getConteudo()) < 0)
                noAtual = noAtual.getNoEsquerdo();
            else if(obj.compareTo(noAtual.getConteudo()) > 0)
                noAtual = noAtual.getNoDireito();
        }
        return null;
    }

    @Override
    public void imprimir() {
        this.exibirEmOrdem(noRaiz);
    }
    
    
    
}
