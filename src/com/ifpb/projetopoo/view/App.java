package com.ifpb.projetopoo.view;


import com.ifpb.projetopoo.dao.DAO;
import com.ifpb.projetopoo.model.Consulta;
import com.ifpb.projetopoo.model.Contato;
import com.ifpb.projetopoo.model.Endereco;
import com.ifpb.projetopoo.model.Exame;
import com.ifpb.projetopoo.model.MarcacaoProcedimento;
import com.ifpb.projetopoo.model.Paciente;
import java.time.LocalDate;
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
        /*
        List<MarcacaoProcedimento> historicoDeProcedimentos = new ArrayList<>();
        
        historicoDeProcedimentos.add(new Consulta("Dor de barriga", "23123", "2123", LocalDateTime.now()));
        historicoDeProcedimentos.add(new Exame("Exame de Colesterol", "Sangue", "Positivo", "23132", LocalDateTime.now()));
        
        historicoDeProcedimentos.forEach(System.out::println);
        */
        
        Paciente paciente = new Paciente("abc", "def", LocalDate.now(), new Endereco("a", "b", "c", "d"), new Contato("a", "b"));
        
        paciente.addProcedimento(new Exame("Exame de Colesterol", "Sangue", "Positivo", "23132", LocalDateTime.now()));
        paciente.addProcedimento(new Consulta("Dor de barriga", "23123", "2123", LocalDateTime.now()));
        
        System.out.println(paciente.getProcedimentos());
    }
    
}
