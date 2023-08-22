package com.atividades.eduardocadilhe.atv01_nivelamento;
/*
 * @author 20202SI0011
 */

import java.util.Iterator;
import java.util.List;
import java.io.File;
import static LerArquivo.lerArquivo.readFileInList;

public class Pilha<T> implements EstruturaDeDados {
    private noPilha<T> noTopo;
    private int qtd;
    
    public void Pilha(){
        this.noTopo=null;
        this.qtd=0;
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
    
    //Métodos da Interface
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
        noPilha<T> novoNo = new noPilha(obj);
        if(noTopo==null){
            noTopo=novoNo;
        }
        else{
        novoNo.setNoProximo(noTopo);
        noTopo=novoNo;
        }
        incrementQuantidade();
        
        return true;
    }

    @Override
    public boolean remover(Object o) {
        if(noTopo==null) return false;
        
        noPilha<T> noAux=noTopo;
        
        noTopo=noTopo.getNoProximo();
        noAux.setNoProximo(null);
        decrementQuantidade();
        
        return true;
    }

    @Override
    public Object buscar(Object o) {
        if(noTopo==null) return null;
        
        return noTopo.getConteudo();
    }

    @Override
    public void imprimir() {
        if(noTopo==null||getQuantidade()==0){
            System.out.println("Fila Vazia");
        }
        
        String str="Pilha{";
        str+=(String)noTopo.getConteudo();
        noPilha<T> noAux = noTopo.getNoProximo();
        while(noAux!=null){
            str+=", "+noAux.getConteudo();
            noAux=noAux.getNoProximo();            
        }
        str+="}";
        System.out.println(str);
    }
    
    
}
