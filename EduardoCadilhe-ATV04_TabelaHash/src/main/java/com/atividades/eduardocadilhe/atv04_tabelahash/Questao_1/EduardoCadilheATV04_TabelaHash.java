package com.atividades.eduardocadilhe.atv04_tabelahash.Questao_1;
/*
 * @author Cadilhe
 */

import java.util.ArrayList;
import java.util.Scanner;

public class EduardoCadilheATV04_TabelaHash {

    public static void main(String[] args) {
        int sair;
        MyHashMap mapa_1=new MyHashMap();
        Scanner sc = new Scanner(System.in);
        Aluno alun=new Aluno();
        while(sair!=0){
            System.out.println("Matricula: ");
            alun.setMatricula(sc.nextLine());
            System.out.println("Nome: ");
            alun.setNome(sc.nextLine());
            System.out.println("Nota: ");
            alun.setNota(Double.parseDouble(sc.nextLine()));
            System.out.println("ADicioanndo no array");
            aluno.add(alun);
            System.out.println("0 para sair");
            sair=Integer.parseInt(sc.nextLine());
        }
        
        
        System.out.println("Instanciando hash");
        System.out.println("...");
        
        mapa_1.Put(chave[0], aluno.get(chave[0]));
        mapa_1.Put(chave[1], aluno.get(chave[1]));
        mapa_1.Put(chave[2], aluno.get(chave[2]));
        mapa_1.Put(chave[3], aluno.get(chave[3]));
        
        System.out.println(mapa_1.Get(chave[2]).);
    }
}
