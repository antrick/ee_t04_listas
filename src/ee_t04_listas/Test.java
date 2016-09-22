/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee_t04_listas;

/**
 *
 * @author andy
 */
public class Test {
    private static ListaLigada lista=new ListaLigada();
    
    public static void main(String [] args){
        lista.InsertaOrdenado(5);
        lista.InsertaOrdenado(2);
        lista.InsertaOrdenado(10);
        lista.InsertaOrdenado(8);
        lista.InsertaOrdenado(12);
        lista.InsertaOrdenado(11);
        lista.InsertaOrdenado(20);
        
        //lista.agregarAntesDe(7,5);
        //lista.agregarDespuesDe(10,3);
        lista.RecorreIterativa();
        lista.BuscaRecursivo(lista.getInicio(),5);
        //lista.BorraAntes(10);
        //lista.RecorreIterativa();
        //lista.RecorreR(lista.getInicio());
    }
}
