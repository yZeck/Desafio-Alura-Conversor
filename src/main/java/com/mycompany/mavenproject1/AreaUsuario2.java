/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class AreaUsuario2 extends javax.swing.JFrame {

    /**
     * Creates new form AreaUsuario2
     */
    public AreaUsuario2() {
        initComponents();
    }
        ConversorMoedas obj = new ConversorMoedas();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        textValor10 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textResultado = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        cbMoedas = new javax.swing.JComboBox<>();
        bsair = new javax.swing.JButton();
        bsair1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        textValor = new javax.swing.JTextField();
        cbMoedas1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        bReConverter = new javax.swing.JButton();
        textResultado1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(656, 400));

        jPanel2.setBackground(new java.awt.Color(228, 193, 249));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("Digite o valor que vc quer converter:");

        textValor10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textValor10ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("NetConvertBaiano");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("Escolha a moeda em que o valor está:");

        textResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textResultadoActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 255));
        jButton4.setText("Converter");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        cbMoedas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha...", "DOLLAR", "LIBRAS", "ARGENTINO", "CHILENO", "EURO", " " }));
        cbMoedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMoedasActionPerformed(evt);
            }
        });

        bsair.setBackground(new java.awt.Color(208, 244, 222));
        bsair.setText("Voltar para tela anterior");
        bsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsairActionPerformed(evt);
            }
        });

        bsair1.setBackground(new java.awt.Color(208, 244, 222));
        bsair1.setText("Voltar para página principal");
        bsair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsair1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("De real para moedas:");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Convert-Moedas");

        textValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textValorActionPerformed(evt);
            }
        });

        cbMoedas1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha...", "DOLLAR", "LIBRAS", "ARGENTINO", "CHILENO", "EURO", " " }));
        cbMoedas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMoedas1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel10.setText("Escolha a moeda em que irá converter:");

        bReConverter.setBackground(new java.awt.Color(204, 204, 255));
        bReConverter.setText("Converter");
        bReConverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bReConverterActionPerformed(evt);
            }
        });

        textResultado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textResultado1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Valor");

        jLabel3.setText("Em Reais(R$):");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(textValor, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(cbMoedas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(cbMoedas1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(35, 35, 35)
                                        .addComponent(textValor10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(bsair, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bsair1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                .addGap(20, 20, 20))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(textResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bReConverter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(textResultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bsair)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bsair1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(textValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(textResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMoedas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbMoedas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bReConverter)
                                    .addComponent(textResultado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textValor10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textValor10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textValor10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textValor10ActionPerformed

    private void textResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textResultadoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       try{
        obj.setValor(Double.parseDouble(textValor.getText()));
       }catch(ArithmeticException O){
              
           O.getMessage();
       }catch(NullPointerException P){
           P.getMessage();
       }
       
       try{
        if (cbMoedas.getSelectedIndex() == 1) {
            obj.ConversorRealMoedaInt(obj.getDOLLAR());
            textResultado.setText("" + obj.getValorConvertido());
        } else if (cbMoedas.getSelectedIndex() == 2) {
            obj.ConversorRealMoedaInt(obj.getLIBRAESTERLINA());
            textResultado.setText("" + obj.getValorConvertido());
        } else if (cbMoedas.getSelectedIndex() == 3) {
            obj.ConversorRealMoedaInt(obj.getPESOARGENTINO());
            textResultado.setText("" + obj.getValorConvertido());
        } else if (cbMoedas.getSelectedIndex() == 4) {
            obj.ConversorRealMoedaInt(obj.getCHILENO());
            textResultado.setText("" + obj.getValorConvertido());
        } else if (cbMoedas.getSelectedIndex() == 5) {
            obj.ConversorRealMoedaInt(obj.getEURO());
            textResultado.setText("" + obj.getValorConvertido());
        }else{
            JOptionPane.showMessageDialog(null, "Escolha uma opção!");
        }
       }catch(IndexOutOfBoundsException O){
           O.getMessage();
       }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cbMoedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMoedasActionPerformed

    }//GEN-LAST:event_cbMoedasActionPerformed

    private void bsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsairActionPerformed
        TelaIntermediária obj = new TelaIntermediária();
        this.dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_bsairActionPerformed

    private void bsair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsair1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bsair1ActionPerformed

    private void textValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textValorActionPerformed

    private void cbMoedas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMoedas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMoedas1ActionPerformed

    private void bReConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bReConverterActionPerformed
          obj.setReal(Double.parseDouble(textValor10.getText()));
        if (cbMoedas.getSelectedIndex() == 1) {
            obj.ConversorMoedaReal(obj.getDOLLAR());
            textResultado1.setText("" + Math.round(obj.getRealConvertido()));
        } else if (cbMoedas.getSelectedIndex() == 2) {
            obj.ConversorMoedaReal(obj.getLIBRAESTERLINA());
            textResultado1.setText("" + Math.round(obj.getRealConvertido()));
        } else if (cbMoedas.getSelectedIndex() == 3) {
            obj.ConversorMoedaReal(obj.getPESOARGENTINO());
            textResultado1.setText("" + Math.round(obj.getRealConvertido()));
        } else if (cbMoedas.getSelectedIndex() == 4) {
            obj.ConversorMoedaReal(obj.getCHILENO());
            textResultado1.setText("" + Math.round(obj.getRealConvertido()));
        } else if (cbMoedas.getSelectedIndex() == 5) {
            obj.ConversorMoedaReal(obj.getEURO());
            textResultado1.setText("" + Math.round(obj.getRealConvertido()));
        }else{
            JOptionPane.showMessageDialog(null, "Escolha uma opção!");
        }
    }//GEN-LAST:event_bReConverterActionPerformed

    private void textResultado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textResultado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textResultado1ActionPerformed

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
            java.util.logging.Logger.getLogger(AreaUsuario2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AreaUsuario2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AreaUsuario2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AreaUsuario2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AreaUsuario2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bReConverter;
    private javax.swing.JButton bsair;
    private javax.swing.JButton bsair1;
    private javax.swing.JComboBox<String> cbMoedas;
    private javax.swing.JComboBox<String> cbMoedas1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField textResultado;
    private javax.swing.JTextField textResultado1;
    private javax.swing.JTextField textValor;
    private javax.swing.JTextField textValor10;
    // End of variables declaration//GEN-END:variables
}