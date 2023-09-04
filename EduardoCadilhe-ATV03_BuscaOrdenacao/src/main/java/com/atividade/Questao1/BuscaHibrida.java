/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atividade.Questao1;

/**
 *
 * @author 20202SI0011
 */
public class BuscaHibrida {

    public BuscaHibrida() {
        
    }
    
    public int BuscaBinariaRec (int dados[],int inicio,int fim,int chave){
        int meio = (inicio + fim) / 2;
        if (dados[meio] == chave){
            return meio; // elemento encontrado
        }else{ 
            if(dados[meio] > chave){
                return BuscaBinariaRec(dados, inicio, meio-1, chave);
            }else{
                return BuscaBinariaRec(dados, meio +1, fim, chave);
            }
        }
    }
}
