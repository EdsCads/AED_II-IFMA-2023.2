/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.atividades.eduardocadilhe.atv01_nivelamento;

/**
 *
 * @author Cadilhe
 */
public interface EstruturaDeDados {
    public boolean inserirArquivo();
    //responsavel por lê os dados de um arquivo e adicionar na estrutura cada um na sua form
    public boolean inserirObjeto(Object o);
    //responsável por inserir o objeto passado por parâmetro na estrutura
    public boolean remover(Object o);
    //responsável por excluir o objeto passado por parâmetro da estrutura
    public Object buscar (Object o);
    //responsável por pesquisar e retornar o objeto passado por parâmetro
    public void imprimir(); //dando erros, necessário VOID?
    //responsável por imprimir os objetos presentes na estrutura   
}

