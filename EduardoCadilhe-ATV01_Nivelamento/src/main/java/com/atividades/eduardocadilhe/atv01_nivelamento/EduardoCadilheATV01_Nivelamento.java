package com.atividades.eduardocadilhe.atv01_nivelamento;
/*
 * @author Cadilhe
 */
public class EduardoCadilheATV01_Nivelamento {

    public static void main(String[] args) {
        
        if(args.length>3){
            System.out.println("Numero de Argumentos incorreta");
            return;
        }
        
        String estrutura = args[0];
        String operacao= args[1];
        String valor;
        
        switch(estrutura){
            case "Lista":
                ListaEncadeadaDupla listaDupEnc = new ListaEncadeadaDupla<Integer>();
                listaDupEnc.inserirArquivo();
                // operações
                switch(operacao){
                    case "imprimir":
                        listaDupEnc.imprimir();
                    break;
                    case "remover" :
                        valor = args[2];
                        listaDupEnc.remover(Integer.parseInt(valor));
                        System.out.println("valor "+ valor +" removido!");
                        listaDupEnc.imprimir();
                        // codigo aqui
                    break;
                    case "inserir" :
                        valor = args[2];
                        listaDupEnc.inserirObjeto(Integer.parseInt(valor));
                        listaDupEnc.imprimir();
                        // codigo aqui
                    break;
                    case "buscar" :
                        valor = args[2];
                        Object res = listaDupEnc.buscar(Integer.parseInt(valor));
                        System.out.println(res);
                        // codigo aqui
                    break;
                }
            break;
            
            case "Arvore":
                ArvBinaria arv = new ArvBinaria<Integer>();
                arv.inserirArquivo();
                 switch(operacao){
                    case "imprimir":
                        arv.imprimir();
                    break;
                    case "remover" :
                        valor = args[2];
                        arv.remover(Integer.parseInt(valor));
                        System.out.println("valor "+ valor +" removido!");
                        arv.imprimir();
                        // codigo aqui
                    break;
                    case "inserir" :
                        valor = args[2];
                        arv.inserirObjeto(Integer.parseInt(valor));
                        arv.imprimir();
                        // codigo aqui
                    break;
                    case "buscar" :
                        valor = args[2];
                        Object res = arv.buscar(Integer.parseInt(valor));
                        System.out.println(res);
                        // codigo aqui
                    break;
                }
            break;
            case "Pilha":
                Pilha pilha = new Pilha<Integer>();
                pilha.inserirArquivo();
                 switch(operacao){
                    case "imprimir":
                        pilha.imprimir();
                    break;
                    case "remover" :
                        pilha.remover(0);
                        pilha.imprimir();
                        // codigo aqui
                    break;
                    case "inserir" :
                        valor = args[2];
                        pilha.inserirObjeto(Integer.parseInt(valor));
                        pilha.imprimir();
                        // codigo aqui
                    break;
                    case "buscar" :
                        valor = args[2];
                        Object res = pilha.buscar(Integer.parseInt(valor));
                        System.out.println(res);
                    break;
                }
            break;
            case "Fila":
                Filas fila = new Filas<Integer>();
                fila.inserirArquivo();
                 switch(operacao){
                    case "imprimir":
                        fila.imprimir();
                    break;
                    case "remover" :
                        fila.remover(0);
                        fila.imprimir();
                        // codigo aqui
                    break;
                    case "inserir" :
                        valor = args[2];
                        fila.inserirObjeto(Integer.parseInt(valor));
                        fila.imprimir();
                        // codigo aqui
                    break;
                    case "buscar" :
                        valor = args[2];
                        Object res = fila.buscar(Integer.parseInt(valor));
                        System.out.println(res);
                    break;
                }
            break;

        }

        
    }
}
