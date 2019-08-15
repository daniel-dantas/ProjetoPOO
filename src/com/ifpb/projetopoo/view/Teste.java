/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.projetopoo.view;

import com.ifpb.projetopoo.model.*;
import java.time.LocalDate;

/**
 *
 * @author Cliente
 */
public class Teste {
    public static void main(String[] args) {
       Atendente pessoa = new Atendente(20000, LocalDate.now(), "111.111.111-12", "Pessoa 1", LocalDate.now(), "UsuarioPessoa1", "123456", new Endereco("rua", "cidade", "bairro", "estado"), new Contato("pessoa1@gmail.com", "1111-1111"));
        
       pessoa.create();
    }
}
