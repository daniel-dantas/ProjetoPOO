/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.projetopoo.view;

import com.ifpb.projetopoo.dao.*;
import com.ifpb.projetopoo.model.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Cliente
 */
public class Teste {
    public static void main(String[] args) {
       
       /*
        Medico pessoa = new Medico(20000, LocalDate.now(), "211.111.111-11", "Pessoa 2", LocalDate.now(), new Endereco("rua", "cidade", "bairro", "estado"), new Contato("pessoa7.tudook", "1111-1111"));
       
        DAO dao = new MedicoDAO();
        
        dao.create(pessoa);
        */
       
       /*
       DAO dao = new MedicoDAO();
       
       
       */
       
       /*
       MedicoDAO dao = new MedicoDAO();
       
       
       
       System.out.println(dao.read());
       */
       
       /*
       Paciente paciente = new Paciente("211.111.111-11", "Pessoa 2", LocalDate.now(), new Endereco("rua", "cidade", "bairro", "estado"), new Contato(null, "1111-1111"));
       paciente.addDescricao("Pressão alta");
       paciente.addDescricao("Enxaqueca");

       
       DAO dao = new PacienteDAO();
       
       dao.create(paciente);
       */
       
       /*
       DAO dao = new PacienteDAO();
       
       System.out.println(dao.update("711.111.111-11", new Paciente("711.111.111-11", "Pessoa 8", LocalDate.now(), new Endereco("tal", "cidade", "bairro", "estado"), new Contato("pessoa@outlook.com", null))));
       */
       
       /*
       PacienteDAO dao = new PacienteDAO();
       
       Paciente teste = dao.read("711.111.111-11");
       
       System.out.println(teste.getNome());
       */
        
       /*
       Atendente atendente = new Atendente(20000, LocalDate.now(), "411.111.111-11", "Pessoa 6", LocalDate.now(), "atendente1.com", "123", new Endereco("rua", "cidade", "bairro", "estado"), new Contato("1111-1111", null));
       
       DAO dao = new AtendenteDAO();
       
       dao.create(atendente);
       */
       
       /*
       
       AtendenteDAO dao = new AtendenteDAO();
       
       System.out.println(dao.authentication("atendente1.com", "123"));
       */
       
       /*
       DAO dao = new AtendenteDAO();
       
       System.out.println(dao.update("411.111.111-11", new Atendente(50000, LocalDate.now(), "411.111.111-11", "Pessoa 5", LocalDate.now(), "atendente5.com", "123", new Endereco("rua", "cidade", "bairro", "estado"), new Contato("1111-1111", "5555555"))));
       */
       
       /*
       AtendenteDAO dao = new AtendenteDAO();
       
       Atendente teste = dao.read("411.111.111-11");
       
       System.out.println(teste);
       */
       
       /*
       ConsultaDAO teste = new ConsultaDAO();
        
       teste.create(new Consulta("Pressão Alta", "111.111.111-11", "711.111.111-11", LocalDateTime.now()));
       */
        
       /*
       ExameDAO teste = new ExameDAO();
       
       teste.create(new Exame(null, "Sangue", "Tudo em harmonia, meu bom", "711.111.111-11", LocalDateTime.now()));
       */
       
       /*
       ConsultaDAO teste = new ConsultaDAO();
       
       teste.update(3, new Consulta("Nada", "711.111.111-11", "711.111.111-11", LocalDateTime.now()));
       */
       
       /*
       ExameDAO teste = new ExameDAO();
       
       teste.update(1, new Exame(null, "Sangue", "oops", "711.111.111-11", LocalDateTime.now()));
       */
       
       
       ExameDAO teste = new ExameDAO();
       
       System.out.println(teste.read("711.111.111-11"));
       
       
       /*
       ConsultaDAO teste = new ConsultaDAO();
       
       System.out.println(teste.read("711.111.111-11"));
       */
    }
}