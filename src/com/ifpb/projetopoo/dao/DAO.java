/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.projetopoo.dao;

import java.util.List;

/**Interface que todo DAO precisa ter
 *
 * @author daniel
 */
public interface DAO<T>{
    
    /** Metodo com finalidade de inserir dados em uma tabela
     * 
     * @param elemento Elemento a ser inserido na tabela
     * @return Confirmação se a inserção foi concluida com sucesso
     */
    boolean create(T elemento);
    
    /**Metodo com finalidade de atualizar um elemento em uma tabel
     * 
     * @param elemento elemento no qual quer atualizar
     * @param novoElemento elemento que contem as modifições
     * @return Confirmação se a atualização foi feita com sucesso! 
     */
    boolean update(String elemento, T novoElemento);
    
    /** Metodo com finalidade de remover um elemento em um tabela
     * 
     * @param elemento Elemento a ser removido
     * @return Confirmação se a remoção foi realizada com sucesso
     */
    boolean remove(String elemento);
    /**
     * 
     * @return Retorna um List de elementos de determinada tabela
     */
    List<T> read();
    
    
    
}