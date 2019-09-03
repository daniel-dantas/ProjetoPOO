

package com.ifpb.projetopoo.util;


import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public abstract class Tabela{
    
    
    
    
    public static String retornarValorIdentificador(JTable tabela){
        
        
        int indice = tabela.getSelectedRow();
        
        if(indice >= 0){
            return (String) tabela.getValueAt(indice, 0);
        }
        
        return null;
        
        
        
        
    }
    
    
    public static void addTabela(JTable tabela, String[] dicionario){
        
        DefaultTableModel val = (DefaultTableModel) tabela.getModel();
        val.addRow( dicionario );
        
        
        
        
    }
    
    
    public static void limparTabela(JTable tabela){
        
        DefaultTableModel tab = (DefaultTableModel)tabela.getModel();
        tab.setNumRows(0);
            
        
    }
    
    
    public static void removeDado(JTable tabela, String nomeDoArquivo){
        
        String nome = (String) tabela.getValueAt(tabela.getSelectedRow(), 0);
        ((DefaultTableModel) tabela.getModel()).removeRow(tabela.getSelectedRow());
        
        
        
        
        //Operacao.excluir(nome, nomeDoArquivo);
        
    }
    
    
    
    
}
