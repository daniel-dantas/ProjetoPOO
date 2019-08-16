/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.projetopoo.view;

import com.ifpb.projetopoo.dao.*;
import com.ifpb.projetopoo.model.*;
import java.time.LocalDate;

/**
 *
 * @author Cliente
 */
public class Teste {
    public static void main(String[] args) {
       /*Medico pessoa = new Medico(20000, LocalDate.now(), "111.111.111-11", "Pessoa 2", LocalDate.now(), new Endereco("rua", "cidade", "bairro", "estado"), new Contato("pessoa1@gmail.com", "1111-1111"));
        
        DAO dao = new MedicoDAO();
        
        
        
        dao.create(pessoa);*/
        
       Paciente paciente = new Paciente("111.111.111-11", "Pessoa 2", LocalDate.now(), new Endereco("rua", "cidade", "bairro", "estado"), new Contato("pessoa1@gmail.com", "1111-1111"));
       
       DAO dao = new PacienteDAO();
       
       dao.create(paciente);
    }
}
