/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atividades.eduardocadilhe.atv01_nivelamento;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import static LerArquivo.lerArquivo.readFileInList;
/*
 * @author Cadilhe
 */
public class ListaEncadeadaDupla<T> implements EstruturaDeDados{
    noLista<T> primeiro;
    noLista<T> ultimo;
    int tamanho;
    //Construtor
    public ListaEncadeadaDupla() {
        this.tamanho=0;
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
        noLista novoNo = new noLista<T>();
        novoNo.setValor(o);
        // verificar se esta vazio
        if(this.vazia()){
            primeiro = novoNo;
            ultimo = novoNo;
        }else{
            noLista noAux = new noLista<T>();
            noAux = primeiro;
            // vamos procurar o final da lista
            while (noAux.getProximo() != null){
                noAux = noAux.getProximo();
            }
            novoNo.setAnterior(noAux);
            noAux.setProximo(novoNo);
            ultimo = novoNo;
        }
        this.tamanho++;
        return true;
    }

    @Override
    public boolean remover(Object o) {
        if(this.tamanho > 0){
            noLista noAux = new noLista<T>();
            noAux = primeiro;
            while(noAux.getValor() != o && noAux != null){
                noAux = noAux.getProximo();
            }
            if(noAux == null){
                return false;// encerra o metodo pois o valor não foi encontrado
            }else{
                // TEM UMA BUG AQUI, SÓ NUM SEI ONDE É
                if(noAux == ultimo && noAux == ultimo){// so restou apenas um valor na lista
                    ultimo = null;
                    primeiro = null;
                }else{
                    if(noAux == ultimo){// o no esta no ultimo da lista
                        // atualizando o ultimo
                        ultimo = noAux.getAnterior();
                        noAux.setAnterior(null);
                        ultimo.setProximo(null);
                        noAux = null;
                    }else if(noAux == primeiro){// // o no esta no primeiro da lista
                        // atualizando o primeiro
                        primeiro = noAux.getProximo();
                        noAux.setProximo(null);
                        primeiro.setAnterior(null);
                    }else{// entre dois elementos;
                        noAux.getAnterior().setProximo(noAux.getProximo());
                        noAux.setProximo(noAux.getAnterior());
                        // desligando o elemnto da lista
                        noAux.setProximo(null);
                        noAux.setAnterior(null);
                    }
                }
            }
            this.tamanho--;
        }
        return true;
    }

    @Override
    public Object buscar(Object o) {
        noLista noAux = new noLista<T>();
        noAux = primeiro;
        while(noAux != null && !noAux.getValor().equals(o)){
            noAux = noAux.getProximo();
        }
        if(noAux == null){
            System.out.println("Valor não encontrado :(");
        }else{
            return noAux.getValor();
        }
        return null;
    }
    

    @Override
    public void imprimir() {
        if(this.tamanho > 0){
            noLista noAux = new noLista<T>();
            noAux = primeiro;
            while(noAux != null){
                System.out.println(noAux.getValor());
                noAux = noAux.getProximo();
            }
        }else{
            System.out.println("Nenhum item na lista :(");
        }
    }
  //   private No primeiro;
    public boolean vazia(){
        if(this.tamanho == 0)
            return true;
        return false;
    }
    
    
    
    
}
