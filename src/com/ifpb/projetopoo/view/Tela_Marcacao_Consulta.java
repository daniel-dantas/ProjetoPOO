/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.projetopoo.view;

import com.ifpb.projetopoo.dao.ConsultaDAO;
import com.ifpb.projetopoo.dao.MedicoDAO;
import com.ifpb.projetopoo.model.Consulta;
import com.ifpb.projetopoo.model.Medico;
import com.ifpb.projetopoo.model.Paciente;
import com.ifpb.projetopoo.util.Tabela;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class Tela_Marcacao_Consulta extends javax.swing.JFrame {

    /**
     * Creates new form Tela_MarcacaoConsulta
     */
    private final Paciente paciente;
    private final ConsultaDAO dao;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    private final Consulta consulta;
    private final boolean editar;

    public Tela_Marcacao_Consulta(Paciente paciente) {
        this.paciente = paciente;
        dao = new ConsultaDAO();
        this.consulta = null;
        this.editar = false;
        initComponents();
        btnAgendar.setEnabled(false);
        preencherTabela();
    }

    public Tela_Marcacao_Consulta() {
        paciente = null;
        dao = null;
        this.consulta = null;
        this.editar = false;
        initComponents();
        btnAgendar.setEnabled(false);
        preencherTabela();
    }

    public Tela_Marcacao_Consulta(Consulta c) {
        paciente = null;
        dao = new ConsultaDAO();
        this.consulta = c;
        this.editar = true;
        initComponents();
        btnAgendar.setEnabled(false);
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Text_1 = new javax.swing.JLabel();
        Text_2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        Usuario45 = new javax.swing.JLabel();
        campoNascimento = new javax.swing.JFormattedTextField();
        Usuario46 = new javax.swing.JLabel();
        campoHora = new javax.swing.JFormattedTextField();
        btnAgendar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaDeBusca = new javax.swing.JTable();
        Usuario48 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(36, 37, 42));

        Text_1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        Text_1.setForeground(new java.awt.Color(241, 231, 254));
        Text_1.setText("Marcar");

        Text_2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        Text_2.setForeground(new java.awt.Color(241, 231, 254));
        Text_2.setText("Consulta");

        jSeparator1.setForeground(new java.awt.Color(250, 250, 250));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(Text_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Text_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(22, 22, 22)))))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(Text_1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text_2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 51, 153));

        Usuario45.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        Usuario45.setForeground(new java.awt.Color(241, 231, 254));
        Usuario45.setText("Hora:");

        try {
            campoNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoNascimento.setText("dd/mm/aaaa   ");
        campoNascimento.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        campoNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNascimentocampoNascimentoActionPerformed(evt);
            }
        });

        Usuario46.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        Usuario46.setForeground(new java.awt.Color(241, 231, 254));
        Usuario46.setText("Data:");

        try {
            campoHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoHora.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        campoHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoHoracampoNascimentoActionPerformed(evt);
            }
        });

        btnAgendar.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnAgendar.setText("Agendar");
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tabelaDeBusca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
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
        jScrollPane2.setViewportView(tabelaDeBusca);

        Usuario48.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        Usuario48.setForeground(new java.awt.Color(241, 231, 254));
        Usuario48.setText("Medicos:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(Usuario46)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(Usuario45)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addComponent(btnAgendar))
                    .addComponent(campoHora, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoNascimento, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(159, 159, 159))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Usuario48)
                .addGap(256, 256, 256))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(Usuario46)
                .addGap(18, 18, 18)
                .addComponent(campoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Usuario45)
                .addGap(18, 18, 18)
                .addComponent(campoHora, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(Usuario48)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btnAgendar))
                .addContainerGap(61, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNascimentocampoNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNascimentocampoNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNascimentocampoNascimentoActionPerformed

    private void campoHoracampoNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoHoracampoNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoHoracampoNascimentoActionPerformed

    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed
        // TODO add your handling code here:

        if (verificarCampos()) {

            if (editar) {
                if (dao.update((int) consulta.getId(),new Consulta("", Tabela.retornarValorIdentificador(tabelaDeBusca), consulta.getCpfDoPaciente(), LocalDateTime.parse(campoNascimento.getText() + " " + campoHora.getText(), formatter)))) {
                    JOptionPane.showMessageDialog(this, "Consulta agendada com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(this, "Problema ao agendar consulta!");
                }
            } else {
                System.out.println(Tabela.retornarValorIdentificador(tabelaDeBusca));
                if (dao.create(new Consulta("", Tabela.retornarValorIdentificador(tabelaDeBusca),paciente.getCpf(), LocalDateTime.parse(campoNascimento.getText()+" "+campoHora.getText(), formatter)))) {
                    JOptionPane.showMessageDialog(this, "Consulta agendada com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(this, "Problema ao agendar consulta!");
                }
            }

        } else {
            JOptionPane.showMessageDialog(this, "Algum campo não está preenchido!");
        }


    }//GEN-LAST:event_btnAgendarActionPerformed

    private void tabelaDeBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaDeBuscaMouseClicked
        // TODO add your handling code here:
        
        btnAgendar.setEnabled(true);
        
        
        
    }//GEN-LAST:event_tabelaDeBuscaMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Marcacao_Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Marcacao_Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Marcacao_Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Marcacao_Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Marcacao_Consulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text_1;
    private javax.swing.JLabel Text_2;
    private javax.swing.JLabel Usuario45;
    private javax.swing.JLabel Usuario46;
    private javax.swing.JLabel Usuario48;
    private javax.swing.JButton btnAgendar;
    private javax.swing.JFormattedTextField campoHora;
    private javax.swing.JFormattedTextField campoNascimento;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabelaDeBusca;
    // End of variables declaration//GEN-END:variables
    private boolean verificarCampos() {

        if (campoHora.equals("  :  ") || campoNascimento.equals("  /  /   ")) {

            return false;
        }

        return true;
    }
    
    private void preencherTabela() {
        Tabela.limparTabela(tabelaDeBusca);
        MedicoDAO medicoDAO = new MedicoDAO();
        List<Medico> medicos = medicoDAO.read();

        for (Medico m : medicos) {
            Tabela.addTabela(tabelaDeBusca, new String[]{m.getCpf(), m.getNome()});
        }
    }
    
}
