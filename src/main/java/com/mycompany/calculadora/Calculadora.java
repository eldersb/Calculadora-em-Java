package com.mycompany.calculadora;


import javax.swing.JButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author elder
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
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

        jButton9 = new javax.swing.JButton();
        txtTela = new javax.swing.JTextField();
        btnValue7 = new javax.swing.JButton();
        btnValue8 = new javax.swing.JButton();
        btnValue9 = new javax.swing.JButton();
        btnDivisao = new javax.swing.JButton();
        btnValue4 = new javax.swing.JButton();
        btnValue5 = new javax.swing.JButton();
        btnValue6 = new javax.swing.JButton();
        btnMultiplicacao = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        btnValue3 = new javax.swing.JButton();
        btnValue2 = new javax.swing.JButton();
        btnValue1 = new javax.swing.JButton();
        btnValue0 = new javax.swing.JButton();
        btnPonto = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnSoma = new javax.swing.JButton();

        jButton9.setText("jButton9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelaActionPerformed(evt);
            }
        });

        btnValue7.setText("7");
        btnValue7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValue7ActionPerformed(evt);
            }
        });

        btnValue8.setText("8");
        btnValue8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValue8ActionPerformed(evt);
            }
        });

        btnValue9.setText("9");
        btnValue9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValue9ActionPerformed(evt);
            }
        });

        btnDivisao.setText("/");
        btnDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisaoActionPerformed(evt);
            }
        });

        btnValue4.setText("4");
        btnValue4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValue4ActionPerformed(evt);
            }
        });

        btnValue5.setText("5");
        btnValue5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValue5ActionPerformed(evt);
            }
        });

        btnValue6.setText("6");
        btnValue6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValue6ActionPerformed(evt);
            }
        });

        btnMultiplicacao.setText("*");
        btnMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacaoActionPerformed(evt);
            }
        });

        btnSub.setText("-");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });

        btnValue3.setText("3");
        btnValue3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValue3ActionPerformed(evt);
            }
        });

        btnValue2.setText("2");
        btnValue2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValue2ActionPerformed(evt);
            }
        });

        btnValue1.setText("1");
        btnValue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValue1ActionPerformed(evt);
            }
        });

        btnValue0.setText("0");
        btnValue0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValue0ActionPerformed(evt);
            }
        });

        btnPonto.setText(".");
        btnPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPontoActionPerformed(evt);
            }
        });

        btnIgual.setText("=");
        btnIgual.setToolTipText("");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnSoma.setText("+");
        btnSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTela, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnValue0, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnValue4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnValue5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnValue7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnValue8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnValue1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnValue2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnValue6, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(btnValue9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnValue3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtTela, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnValue8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnValue9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnValue7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnValue4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnValue5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnValue6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnValue3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnValue1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnValue2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPonto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnValue0, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(btnSoma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    
    public void setNumero(JButton btn){
        txtTela.setText(txtTela.getText() + btn.getText());
    }
    
    
    private void btnValue7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValue7ActionPerformed

          setNumero(btnValue7);
//        int valorint7 = 7;
      
//        btnValue7.setText(String.valueOf(valorint7));
//        txtTela.setText(String.valueOf(valorint7));  
        
//        valorAnterior = String.valueOf(valorint7);
        
//        if(valorAnterior >= valorint7 || valorAnterior <= valorint7){;
//                
//        }
// TODO add your handling code here:
    }//GEN-LAST:event_btnValue7ActionPerformed
     
        
    private void txtTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelaActionPerformed
//        String operador = "";
//        double resultado = 0;
//        
//        if("0123456789".contains()){
//            
//        }
        

        
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelaActionPerformed

    private void btnValue8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValue8ActionPerformed
        setNumero(btnValue8);


//        int valorint8 = 8;
      
//        jButton2.setText(String.valueOf(valorint8));
//        txtTela.setText(String.valueOf(valorint8));   
        
// TODO add your handling code here:
    }//GEN-LAST:event_btnValue8ActionPerformed

    private void btnValue9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValue9ActionPerformed
         setNumero(btnValue9);

//        int valorint9 = 9;
//      
//        btnValue9.setText(String.valueOf(valorint9));
//        txtTela.setText(String.valueOf(valorint9));   
// TODO add your handling code here:
    }//GEN-LAST:event_btnValue9ActionPerformed

    private void btnDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisaoActionPerformed
        setNumero(btnDivisao);

//        String valorstring = "/";
//      
//        btnValue8.setText(valorstring);
//        txtTela.setText(valorstring);   

        // TODO add your handling code here:
    }//GEN-LAST:event_btnDivisaoActionPerformed

    private void btnValue4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValue4ActionPerformed
        setNumero(btnValue4);

//        int valorint4 = 4;
//      
//        btnValue4.setText(String.valueOf(valorint4));
//        txtTela.setText(String.valueOf(valorint4));           // TODO add your handling code here:
    }//GEN-LAST:event_btnValue4ActionPerformed

    private void btnValue5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValue5ActionPerformed
        setNumero(btnValue5);
   
//        int valorint5 = 5;
//      
//        btnValue5.setText(String.valueOf(valorint5));
//        txtTela.setText(String.valueOf(valorint5));   

        // TODO add your handling code here:
    }//GEN-LAST:event_btnValue5ActionPerformed

    private void btnValue6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValue6ActionPerformed
        setNumero(btnValue6);

//        int valorint6 = 6;
//      
//        btnValue5.setText(String.valueOf(valorint6));
//        txtTela.setText(String.valueOf(valorint6));   
        
// TODO add your handling code here:
    }//GEN-LAST:event_btnValue6ActionPerformed

    private void btnMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacaoActionPerformed
        setNumero(btnMultiplicacao);

//        String valorstring2 = "*";
//      
//        btnMultiplicacao.setText(valorstring2);
//        txtTela.setText(valorstring2); 

        // TODO add your handling code here:
    }//GEN-LAST:event_btnMultiplicacaoActionPerformed

    private void btnValue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValue1ActionPerformed
        setNumero(btnValue1);
 
//        int valorint1 = 1;
//      
//        btnValue1.setText(String.valueOf(valorint1));
//        txtTela.setText(String.valueOf(valorint1));  

        // TODO add your handling code here:
    }//GEN-LAST:event_btnValue1ActionPerformed

    private void btnValue2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValue2ActionPerformed
        setNumero(btnValue2);
 
//        int valorint2 = 2;
//      
//        btnValue2.setText(String.valueOf(valorint2));
//        txtTela.setText(String.valueOf(valorint2));  
        // TODO add your handling code here:
    }//GEN-LAST:event_btnValue2ActionPerformed

    private void btnValue3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValue3ActionPerformed
        setNumero(btnValue3);

//        int valorint3 = 3;
//      
//        btnValue3.setText(String.valueOf(valorint3));
//        txtTela.setText(String.valueOf(valorint3));  

        // TODO add your handling code here:
    }//GEN-LAST:event_btnValue3ActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
        setNumero(btnSub);
//        String valorstring3 = "-";
//      
//        btnSub.setText(valorstring3);
//        txtTela.setText(valorstring3); 
//        
// TODO add your handling code here:
    }//GEN-LAST:event_btnSubActionPerformed

    private void btnValue0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValue0ActionPerformed
        setNumero(btnValue0);
//        int valorint0 = 0;
//      
//        btnValue0.setText(String.valueOf(valorint0));
//        txtTela.setText(String.valueOf(valorint0));  
        // TODO add your handling code here:
    }//GEN-LAST:event_btnValue0ActionPerformed

    private void btnPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPontoActionPerformed
        setNumero(btnPonto);
//        String valorstring4 = ".";
//      
//        btnPonto.setText(valorstring4);
//        txtTela.setText(valorstring4); 

        // TODO add your handling code here:
    }//GEN-LAST:event_btnPontoActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
         setNumero(btnIgual);
//        String valorstring4 = "=";
//      
//        btnIgual.setText(valorstring4);
//        txtTela.setText(valorstring4);

     
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomaActionPerformed
        setNumero(btnSoma);
        
//        String valorstring5 = "+";
//      
//        btnSoma.setText(valorstring5);
//        txtTela.setText(valorstring5); 
                    
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSomaActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDivisao;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMultiplicacao;
    private javax.swing.JButton btnPonto;
    private javax.swing.JButton btnSoma;
    private javax.swing.JButton btnSub;
    private javax.swing.JButton btnValue0;
    private javax.swing.JButton btnValue1;
    private javax.swing.JButton btnValue2;
    private javax.swing.JButton btnValue3;
    private javax.swing.JButton btnValue4;
    private javax.swing.JButton btnValue5;
    private javax.swing.JButton btnValue6;
    private javax.swing.JButton btnValue7;
    private javax.swing.JButton btnValue8;
    private javax.swing.JButton btnValue9;
    private javax.swing.JButton jButton9;
    private javax.swing.JTextField txtTela;
    // End of variables declaration//GEN-END:variables

    private String gettxtTela() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
