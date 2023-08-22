package com.atividades.eduardocadilhe.atv01_nivelamento;
/*
 *@author Cadilhe
 */

import java.io.File;
import java.util.List;
import java.util.Iterator;
import static LerArquivo.lerArquivo.readFileInList;

public class Filas<T> implements EstruturaDeDados {
    noFila<T> noInicio;
    noFila<T> noFim;
    int qtd;
    
    public void Filas(){
        noInicio=null;
        noFim=null;
    }
    
    public void limpar(){
        if(noInicio==null){System.out.println("Já está vazia");return;}
        
        noFila<T> noAux;
        
        while(noInicio!=null){
            noAux=noInicio;
            noInicio=noInicio.getNoProximo();
            noAux.limparNoFila();
        }
        noFim=null;
        qtd=0;
    }

    public int getQuantidade(){
        return qtd;
    }
    
    public void incrementQuantidade(){
        this.qtd++;
    }
    
    public void decrementQuantidade(){
        this.qtd--;
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
        T obj = (T) o;
        noFila<T> novoNo = new noFila(obj);
        if(noInicio==null){
            noInicio=novoNo;
            noFim=novoNo;
        }
        noFim.setNoProximo(novoNo);
        noFim=novoNo;
        incrementQuantidade();
        
        return true;
    }

    @Override
    public boolean remover(Object o) {
        if(noInicio == null) return false;
        
        noFila<T> noAux = noInicio;
        if(noAux == noFim) {
            noInicio = null;
            noFim = null;
        }
        else {
            noInicio = noInicio.getNoProximo();
            noAux.limparNoFila();
        }
        decrementQuantidade();
        return true;
    }

    @Override
    public Object buscar(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void imprimir() {
        if(noInicio==null||getQuantidade()==0){
            System.out.println("Fila Vazia");
        }
        
        String str="Fila{";
        str+=(String)noInicio.getConteudo();
        noFila<T> noAux = noInicio.getNoProximo();
        while(noAux!=null){
            str+=","+noAux.getConteudo();
            noAux=noAux.getNoProximo();            
        }
        str+="}";
        System.out.println(str);
    }
    
    
}
