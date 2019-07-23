package com.ifpb.projetopoo.view;


import com.ifpb.projetopoo.model.Consulta;
import com.ifpb.projetopoo.model.Exame;
import com.ifpb.projetopoo.model.Procedimento;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author daniel
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Procedimento> historicoDeProcedimentos = new ArrayList<>();
        
        historicoDeProcedimentos.add(new Consulta("111", LocalDateTime.now(), "Dor de barriga", "222"));
        historicoDeProcedimentos.add(new Exame("111", "Colesterol", "Sangue", LocalDateTime.now()));
        
        historicoDeProcedimentos.forEach(p->{
            System.out.println(p);
        });
        
    }
    
}
