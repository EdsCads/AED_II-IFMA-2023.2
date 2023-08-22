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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object buscar(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
