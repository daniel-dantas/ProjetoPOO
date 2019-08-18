/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.projetopoo.view;

/**
 *
 * @author IGOR
 */
public class TelaCadastroAtendente extends javax.swing.JDialog {

    /**
     * Creates new form TelaCadastroAtendente
     */
    public TelaCadastroAtendente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Right_Menu = new javax.swing.JPanel();
        Usuario = new javax.swing.JLabel();
        Senha = new javax.swing.JLabel();
        CPF = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextPane_Usuario = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextPane_Nome = new javax.swing.JTextPane();
        Usuario1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        Usuario2 = new javax.swing.JLabel();
        Usuario3 = new javax.swing.JLabel();
        Usuario4 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TextPane_Nome3 = new javax.swing.JTextPane();
        Usuario5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        Usuario6 = new javax.swing.JLabel();
        Usuario7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        Left_Menu = new javax.swing.JPanel();
        Text_1 = new javax.swing.JLabel();
        Text_2 = new javax.swing.JLabel();
        Text_3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Right_Menu.setBackground(new java.awt.Color(102, 51, 153));

        Usuario.setFont(new java.awt.Font("Courier New", 1, 28)); // NOI18N
        Usuario.setForeground(new java.awt.Color(241, 231, 254));
        Usuario.setText("Usuario:");

        Senha.setFont(new java.awt.Font("Courier New", 1, 28)); // NOI18N
        Senha.setForeground(new java.awt.Color(241, 231, 254));
        Senha.setText("Senha:");

        CPF.setFont(new java.awt.Font("Courier New", 1, 26)); // NOI18N
        CPF.setForeground(new java.awt.Color(241, 231, 254));
        CPF.setText("CPF:");

        TextPane_Usuario.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(TextPane_Usuario);

        TextPane_Nome.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jScrollPane3.setViewportView(TextPane_Nome);

        Usuario1.setFont(new java.awt.Font("Courier New", 1, 28)); // NOI18N
        Usuario1.setForeground(new java.awt.Color(241, 231, 254));
        Usuario1.setText("Nome:");

        jSeparator1.setBackground(new java.awt.Color(140, 20, 252));
        jSeparator1.setForeground(new java.awt.Color(140, 20, 252));
        jSeparator1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        jPasswordField1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField2.setText("dd/mm/aaaa   ");
        jFormattedTextField2.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jFormattedTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField2ActionPerformed(evt);
            }
        });

        Usuario2.setFont(new java.awt.Font("Courier New", 1, 28)); // NOI18N
        Usuario2.setForeground(new java.awt.Color(241, 231, 254));
        Usuario2.setText("Data de Nascimento:");

        Usuario3.setFont(new java.awt.Font("Courier New", 1, 28)); // NOI18N
        Usuario3.setForeground(new java.awt.Color(241, 231, 254));
        Usuario3.setText("Email:");

        Usuario4.setFont(new java.awt.Font("Courier New", 1, 28)); // NOI18N
        Usuario4.setForeground(new java.awt.Color(241, 231, 254));
        Usuario4.setText("Telefone:");

        TextPane_Nome3.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jScrollPane6.setViewportView(TextPane_Nome3);

        Usuario5.setFont(new java.awt.Font("Courier New", 1, 28)); // NOI18N
        Usuario5.setForeground(new java.awt.Color(241, 231, 254));
        Usuario5.setText("Informações");

        jButton1.setBackground(new java.awt.Color(241, 231, 254));
        jButton1.setFont(new java.awt.Font("Courier New", 3, 24)); // NOI18N
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(241, 231, 254));
        jButton2.setFont(new java.awt.Font("Courier New", 3, 24)); // NOI18N
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        Usuario6.setFont(new java.awt.Font("Courier New", 1, 28)); // NOI18N
        Usuario6.setForeground(new java.awt.Color(241, 231, 254));
        Usuario6.setText("Data de Admissão:");

        Usuario7.setFont(new java.awt.Font("Courier New", 1, 28)); // NOI18N
        Usuario7.setForeground(new java.awt.Color(241, 231, 254));
        Usuario7.setText("Endereço:");

        jTextField2.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        try {
            jFormattedTextField4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField4.setText("dd/mm/aaaa   ");
        jFormattedTextField4.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jFormattedTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Right_MenuLayout = new javax.swing.GroupLayout(Right_Menu);
        Right_Menu.setLayout(Right_MenuLayout);
        Right_MenuLayout.setHorizontalGroup(
            Right_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right_MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Right_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(Right_MenuLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(Right_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Senha)
                            .addComponent(Usuario))
                        .addGap(37, 37, 37)
                        .addGroup(Right_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField1)
                            .addComponent(jScrollPane1)))
                    .addGroup(Right_MenuLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Usuario1)
                        .addGap(81, 81, 81)
                        .addComponent(jScrollPane3))
                    .addGroup(Right_MenuLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(Right_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Right_MenuLayout.createSequentialGroup()
                                .addGroup(Right_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Usuario3)
                                    .addComponent(Usuario4)
                                    .addComponent(Usuario7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(Right_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Right_MenuLayout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addGroup(Right_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField1)
                                            .addComponent(jScrollPane6)))
                                    .addGroup(Right_MenuLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField2))))
                            .addGroup(Right_MenuLayout.createSequentialGroup()
                                .addGroup(Right_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Usuario2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jFormattedTextField2))
                                .addGap(58, 58, 58)
                                .addGroup(Right_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CPF)
                                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(Right_MenuLayout.createSequentialGroup()
                                .addComponent(Usuario6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(Right_MenuLayout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(Usuario5, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Right_MenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(21, 21, 21))
        );
        Right_MenuLayout.setVerticalGroup(
            Right_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right_MenuLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(Right_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(Right_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Senha)
                    .addComponent(jPasswordField1))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Usuario5, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addGroup(Right_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Usuario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addGap(18, 18, 18)
                .addGroup(Right_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usuario2)
                    .addComponent(CPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Right_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Right_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Usuario3)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Right_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usuario4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Right_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Usuario7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Right_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usuario6)
                    .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(121, 121, 121)
                .addGroup(Right_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        Usuario5.getAccessibleContext().setAccessibleName("");

        Left_Menu.setBackground(new java.awt.Color(36, 37, 42));
        Left_Menu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));

        Text_1.setFont(new java.awt.Font("Courier New", 3, 36)); // NOI18N
        Text_1.setForeground(new java.awt.Color(241, 231, 254));
        Text_1.setText(" Cadastro");

        Text_2.setFont(new java.awt.Font("Courier New", 3, 36)); // NOI18N
        Text_2.setForeground(new java.awt.Color(241, 231, 254));
        Text_2.setText("    de");

        Text_3.setFont(new java.awt.Font("Courier New", 3, 36)); // NOI18N
        Text_3.setForeground(new java.awt.Color(241, 231, 254));
        Text_3.setText(" Atendente");

        javax.swing.GroupLayout Left_MenuLayout = new javax.swing.GroupLayout(Left_Menu);
        Left_Menu.setLayout(Left_MenuLayout);
        Left_MenuLayout.setHorizontalGroup(
            Left_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Text_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Left_MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Left_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Text_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Text_3, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                .addContainerGap())
        );
        Left_MenuLayout.setVerticalGroup(
            Left_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left_MenuLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(Text_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(241, 241, 241))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Left_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Right_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Right_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Left_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jFormattedTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jFormattedTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(TelaCadastroAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaCadastroAtendente dialog = new TelaCadastroAtendente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPF;
    private javax.swing.JPanel Left_Menu;
    private javax.swing.JPanel Right_Menu;
    private javax.swing.JLabel Senha;
    private javax.swing.JTextPane TextPane_Nome;
    private javax.swing.JTextPane TextPane_Nome3;
    private javax.swing.JTextPane TextPane_Usuario;
    private javax.swing.JLabel Text_1;
    private javax.swing.JLabel Text_2;
    private javax.swing.JLabel Text_3;
    private javax.swing.JLabel Usuario;
    private javax.swing.JLabel Usuario1;
    private javax.swing.JLabel Usuario2;
    private javax.swing.JLabel Usuario3;
    private javax.swing.JLabel Usuario4;
    private javax.swing.JLabel Usuario5;
    private javax.swing.JLabel Usuario6;
    private javax.swing.JLabel Usuario7;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
