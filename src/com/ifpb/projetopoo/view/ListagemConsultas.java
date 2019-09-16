/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.projetopoo.view;

import com.ifpb.projetopoo.dao.AtendenteDAO;
import com.ifpb.projetopoo.dao.ConsultaDAO;
import com.ifpb.projetopoo.dao.ExameDAO;
import com.ifpb.projetopoo.dao.PacienteDAO;
import com.ifpb.projetopoo.model.Consulta;
import com.ifpb.projetopoo.model.Exame;
import com.ifpb.projetopoo.model.Paciente;
import com.ifpb.projetopoo.util.Tabela;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author daniel
 */
public class ListagemConsultas extends javax.swing.JFrame {

    /**
     * Creates new form ListagemPacientes
     */
    public ListagemConsultas() {

        setTitle("PACIENTES");
        this.setExtendedState(MAXIMIZED_BOTH);
        initComponents();
        btnEditar.setEnabled(false);
        btnDeletar.setEnabled(false);
        preencherTabela();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Text_1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Text_4 = new javax.swing.JLabel();
        campoBusca = new javax.swing.JFormattedTextField();
        btnVoltar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnBusca = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDeBusca = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(36, 37, 42));

        Text_1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        Text_1.setForeground(new java.awt.Color(241, 231, 254));
        Text_1.setText("Exames");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(Text_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(Text_1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(291, 291, 291))
        );

        jPanel2.setBackground(new java.awt.Color(102, 51, 153));

        Text_4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Text_4.setForeground(new java.awt.Color(241, 231, 254));
        Text_4.setText("CPF do Paciente:");

        try {
            campoBusca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoBusca.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N

        btnVoltar.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnEditar.setText("Remarcar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnDeletar.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnBusca.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnBusca.setText("Buscar");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });

        tabelaDeBusca.setBackground(new java.awt.Color(160, 184, 177));
        tabelaDeBusca.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tabelaDeBusca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CPF", "Nome", "Horário"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaDeBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaDeBuscaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaDeBusca);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Text_4)
                        .addGap(18, 18, 18)
                        .addComponent(campoBusca)
                        .addGap(18, 18, 18)
                        .addComponent(btnBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                        .addGap(165, 165, 165)
                        .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(166, 166, 166)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_4)
                    .addComponent(campoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        new Tela_Principal().setVisible(true);

    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
        // TODO add your handling code here:

        if (!campoBusca.getText().equals("   .   .   -  ")) {
            Tabela.limparTabela(tabelaDeBusca);
            btnDeletar.setEnabled(false);
            btnEditar.setEnabled(false);
            
            ConsultaDAO dao = new ConsultaDAO();
            PacienteDAO pacienteDAO = new PacienteDAO();
            List<Consulta> consultas = dao.fullRead();
            
            
            for(Consulta e: consultas){
                Paciente paciente = pacienteDAO.search(campoBusca.getText());
                Tabela.addTabela(tabelaDeBusca, new String[]{e.getId()+"",paciente.getCpf(), paciente.getNome(), e.getHorario().toString()});
            }
            
            
            
        } else {
            Tabela.limparTabela(tabelaDeBusca);
            preencherTabela();
        }


    }//GEN-LAST:event_btnBuscaActionPerformed

    private void tabelaDeBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaDeBuscaMouseClicked
        // TODO add your handling code here:

        btnEditar.setEnabled(true);
        btnDeletar.setEnabled(true);

    }//GEN-LAST:event_tabelaDeBuscaMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        
        ConsultaDAO dao = new ConsultaDAO();
        
        System.out.println(Tabela.retornarValorIdentificador(tabelaDeBusca));
        
        List<Consulta> consultas = dao.fullRead();
        
        
        
        for(Consulta e: consultas){
            if(e.getId() == Long.parseLong(Tabela.retornarValorIdentificador(tabelaDeBusca))){
                new Tela_Marcacao_Consulta(e).setVisible(true);
            }
        }
        
        

        


    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // TODO add your handling code here:

        ConsultaDAO dao = new ConsultaDAO();

        int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente exclui a consulta?");

        if (opcao == JOptionPane.YES_OPTION) {
            dao.remove(Long.parseLong(Tabela.retornarValorIdentificador(tabelaDeBusca)));
            preencherTabela();
            btnEditar.setEnabled(false);
            btnDeletar.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Consulta excluido com sucesso!");
        }


    }//GEN-LAST:event_btnDeletarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListagemConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListagemConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListagemConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListagemConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListagemConsultas().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text_1;
    private javax.swing.JLabel Text_4;
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JFormattedTextField campoBusca;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaDeBusca;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {
        Tabela.limparTabela(tabelaDeBusca);
        ConsultaDAO dao = new ConsultaDAO();
        List<Consulta> consultas = filtrarHorario(dao.fullRead());
        PacienteDAO daoPaciente = new PacienteDAO();
        
        
        for (Consulta e : filtrarHorario(consultas)) {
            Paciente pac = daoPaciente.search(e.getCpfDoPaciente());
            Tabela.addTabela(tabelaDeBusca, new String[]{e.getId()+"",pac.getCpf(), pac.getNome(), e.getHorario().toString()});

        }
    }

    private List<Consulta> filtrarHorario(List<Consulta> fullRead) {
        
        List<Consulta> consultashj = new ArrayList<>();
        
        for(Consulta e : fullRead){
            if(verificarHorario(e.getHorario())){
                consultashj.add(e);
            }
        }
        return consultashj;
        
    }
    
    private boolean verificarHorario(LocalDateTime horario){
        
        LocalDate hj = LocalDate.now();
        
        if(horario.getDayOfMonth() == hj.getDayOfMonth() && horario.getMonthValue() == hj.getMonthValue() && horario.getYear() == hj.getYear()){
            return true;
        }
        
        
        return false;
        
    }

}