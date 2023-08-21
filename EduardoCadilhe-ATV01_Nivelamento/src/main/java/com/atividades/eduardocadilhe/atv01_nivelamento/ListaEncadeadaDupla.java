/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atividades.eduardocadilhe.atv01_nivelamento;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import static LerArquivo.lerArquivo.readFileInList;
/**
 *
 * @author Cadilhe
 */
public class ListaEncadeadaDupla {
    public ListaEncadeadaDupla(int tam){
        Object[] lista;
        lista = new Object [tam];
    }
    
    private int listaVazia(Object[] lista){
        if(lista.length==0){
            return 1;
        }
        else{
            return 0;
        }
    }
    
    public void InserirListaDup(Object[] lista,Object elemento ){
        if(listaVazia(lista)==0){
            for(int i=0;i<lista.length;i++){
                
            }
        }
        
    }
}
