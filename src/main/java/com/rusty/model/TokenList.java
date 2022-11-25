package com.rusty.model;

import java.util.List;
import java.util.ArrayList;

public class TokenList {
    public static List<Class> lista;
    
    //Declaração e implementação de um singleton para gerar apenas uma vez uma lista
    
    private TokenList(){}

    public static List<Class> getInstance(){
            if(lista == null){
                lista = new ArrayList<>();
            }
        return lista;
    }
}