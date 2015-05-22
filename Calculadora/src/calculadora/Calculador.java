/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author oscar
 */
public class Calculador extends javax.swing.JFrame {

    
    double plusminus;
    double FirstDouble;
    double SecondDouble;
    double TotalDouble;
    int plusclick;
    int minusclick;
    int multiplyclick;
    int divideclick;
    int decimalclick;
    
    
    
    public Calculador() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        display = new javax.swing.JTextField();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        plus = new java.awt.Button();
        button5 = new java.awt.Button();
        button7 = new java.awt.Button();
        button8 = new java.awt.Button();
        button9 = new java.awt.Button();
        minus = new java.awt.Button();
        button11 = new java.awt.Button();
        multiply = new java.awt.Button();
        button13 = new java.awt.Button();
        clear = new java.awt.Button();
        button15 = new java.awt.Button();
        decimal = new java.awt.Button();
        divide = new java.awt.Button();
        posneg = new java.awt.Button();
        equals = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        display.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        display.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        button1.setActionCommand("1");
        button1.setFont(new java.awt.Font("Liberation Mono", 1, 18)); // NOI18N
        button1.setLabel("1");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setActionCommand("1");
        button2.setFont(new java.awt.Font("Liberation Mono", 1, 18)); // NOI18N
        button2.setLabel("2");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setActionCommand("1");
        button3.setFont(new java.awt.Font("Liberation Mono", 1, 18)); // NOI18N
        button3.setLabel("3");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        plus.setActionCommand("1");
        plus.setFont(new java.awt.Font("Liberation Mono", 1, 18)); // NOI18N
        plus.setLabel("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        button5.setActionCommand("1");
        button5.setFont(new java.awt.Font("Liberation Mono", 1, 18)); // NOI18N
        button5.setLabel("4");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button7.setActionCommand("1");
        button7.setFont(new java.awt.Font("Liberation Mono", 1, 18)); // NOI18N
        button7.setLabel("6");
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        button8.setActionCommand("1");
        button8.setFont(new java.awt.Font("Liberation Mono", 1, 18)); // NOI18N
        button8.setLabel("5");
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        button9.setActionCommand("1");
        button9.setFont(new java.awt.Font("Liberation Mono", 1, 18)); // NOI18N
        button9.setLabel("7");
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        minus.setActionCommand("1");
        minus.setFont(new java.awt.Font("Liberation Mono", 1, 18)); // NOI18N
        minus.setLabel("-");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        button11.setActionCommand("1");
        button11.setFont(new java.awt.Font("Liberation Mono", 1, 18)); // NOI18N
        button11.setLabel("9");
        button11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button11ActionPerformed(evt);
            }
        });

        multiply.setActionCommand("1");
        multiply.setFont(new java.awt.Font("Liberation Mono", 1, 18)); // NOI18N
        multiply.setLabel("*");
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });

        button13.setActionCommand("1");
        button13.setFont(new java.awt.Font("Liberation Mono", 1, 18)); // NOI18N
        button13.setLabel("0");
        button13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button13ActionPerformed(evt);
            }
        });

        clear.setActionCommand("1");
        clear.setFont(new java.awt.Font("Liberation Mono", 1, 18)); // NOI18N
        clear.setLabel("c");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        button15.setActionCommand("1");
        button15.setFont(new java.awt.Font("Liberation Mono", 1, 18)); // NOI18N
        button15.setLabel("8");
        button15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button15ActionPerformed(evt);
            }
        });

        decimal.setActionCommand("1");
        decimal.setFont(new java.awt.Font("Liberation Mono", 1, 18)); // NOI18N
        decimal.setLabel(".");
        decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalActionPerformed(evt);
            }
        });

        divide.setActionCommand("1");
        divide.setFont(new java.awt.Font("Liberation Mono", 1, 18)); // NOI18N
        divide.setLabel("/");
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        posneg.setActionCommand("1");
        posneg.setFont(new java.awt.Font("Liberation Mono", 1, 18)); // NOI18N
        posneg.setLabel("+/-");
        posneg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posnegActionPerformed(evt);
            }
        });

        equals.setActionCommand("1");
        equals.setFont(new java.awt.Font("Liberation Mono", 1, 18)); // NOI18N
        equals.setLabel("=");
        equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(display)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(button7, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                    .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(button13, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(posneg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(equals, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(posneg, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed

        // TODO add your handling code here
        display.setText(display.getText()+button1.getLabel());
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        display.setText(display.getText()+button2.getLabel());
    }//GEN-LAST:event_button2ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        display.setText(display.getText()+button5.getLabel());
    }//GEN-LAST:event_button5ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        display.setText(display.getText()+button7.getLabel());
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        display.setText(display.getText()+button8.getLabel());
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        display.setText(display.getText()+button9.getLabel());
    }//GEN-LAST:event_button9ActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        // TODO add your handling code here:
         FirstDouble=(Double.parseDouble(String.valueOf(display.getText())));
        display.setText("");
        minusclick=1;
        decimalclick=0;

        
    }//GEN-LAST:event_minusActionPerformed

    private void button11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button11ActionPerformed
        display.setText(display.getText()+button11.getLabel());
    }//GEN-LAST:event_button11ActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed
        // TODO add your handling code here:
        
         FirstDouble=(Double.parseDouble(String.valueOf(display.getText())));
        display.setText("");
        multiplyclick=1;
        decimalclick=0;

    }//GEN-LAST:event_multiplyActionPerformed

    private void button13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button13ActionPerformed
        display.setText(display.getText()+button13.getLabel());
    }//GEN-LAST:event_button13ActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:t
        display.setText("");
        decimalclick=0;
    }//GEN-LAST:event_clearActionPerformed
    
    private void button15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button15ActionPerformed
        display.setText(display.getText()+button15.getLabel());
    }//GEN-LAST:event_button15ActionPerformed

    private void decimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalActionPerformed
        if(decimalclick==0){
        
        display.setText(display.getText()+decimal.getLabel());
        decimalclick=1;
        }
    }//GEN-LAST:event_decimalActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
        // TODO add your handling code here:
        
         FirstDouble=(Double.parseDouble(String.valueOf(display.getText())));
        display.setText("");
        divideclick=1;
        decimalclick=0;

    }//GEN-LAST:event_divideActionPerformed

    private void posnegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posnegActionPerformed
        // TODO add your handling code here:
        plusminus=(Double.parseDouble(String.valueOf(display.getText())));
        plusminus= plusminus * (-1);
        display.setText(String.valueOf(plusminus));
    }//GEN-LAST:event_posnegActionPerformed

    private void equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsActionPerformed
        // TODO add your handling code here:
     
        SecondDouble=(Double.parseDouble(String.valueOf(display.getText())));
        if(plusclick>0){
            TotalDouble=FirstDouble+SecondDouble;
            display.setText(String.valueOf(TotalDouble));
            FirstDouble=0;
            SecondDouble=0;
            plusclick=0;
            
        }
         if(minusclick>0){
            TotalDouble=FirstDouble-SecondDouble;
            display.setText(String.valueOf(TotalDouble));
            FirstDouble=0;
            SecondDouble=0;
            minusclick=0;
        
    }//GEN-LAST:event_equalsActionPerformed
     if(multiplyclick>0){
            TotalDouble=FirstDouble*SecondDouble;
            display.setText(String.valueOf(TotalDouble));
            FirstDouble=0;
            SecondDouble=0;
            multiplyclick=0;
    
    
    }
     if(divideclick>0){
            TotalDouble=FirstDouble/SecondDouble;
            display.setText(String.valueOf(TotalDouble));
            FirstDouble=0;
            SecondDouble=0;
            divideclick=0;
     }
    }
    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        display.setText(display.getText()+button3.getLabel());
    }//GEN-LAST:event_button3ActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        // TODO add your handling code here:
       
        FirstDouble=(Double.parseDouble(String.valueOf(display.getText())));
        display.setText("");
        plusclick=1;
        decimalclick=0;
        
    }//GEN-LAST:event_plusActionPerformed

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
            java.util.logging.Logger.getLogger(Calculador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button11;
    private java.awt.Button button13;
    private java.awt.Button button15;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button5;
    private java.awt.Button button7;
    private java.awt.Button button8;
    private java.awt.Button button9;
    private java.awt.Button clear;
    private java.awt.Button decimal;
    private javax.swing.JTextField display;
    private java.awt.Button divide;
    private java.awt.Button equals;
    private javax.swing.JPanel jPanel1;
    private java.awt.Button minus;
    private java.awt.Button multiply;
    private java.awt.Button plus;
    private java.awt.Button posneg;
    // End of variables declaration//GEN-END:variables
}
