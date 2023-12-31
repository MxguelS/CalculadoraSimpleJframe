/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.calculadora2;

import com.sun.source.tree.BreakTree;

/**
 *
 * @author an976
 */
public class Claculadora extends javax.swing.JFrame {

   public float primernumero;
   public float segundoNumero;
   public String operador;
   
    public Claculadora() {
       
        initComponents();
        this.setLocationRelativeTo(null);
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
        salida = new javax.swing.JLabel();
        menos = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        dividir = new javax.swing.JButton();
        Multi = new javax.swing.JButton();
        casilla7 = new javax.swing.JButton();
        casilla8 = new javax.swing.JButton();
        casilla9 = new javax.swing.JButton();
        casilla4 = new javax.swing.JButton();
        casilla5 = new javax.swing.JButton();
        casilla6 = new javax.swing.JButton();
        mas = new javax.swing.JButton();
        casilla1 = new javax.swing.JButton();
        casilla2 = new javax.swing.JButton();
        casilla3 = new javax.swing.JButton();
        cero = new javax.swing.JButton();
        coma = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        Entrada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salida.setBackground(new java.awt.Color(255, 255, 255));
        salida.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        salida.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        salida.setOpaque(true);
        jPanel1.add(salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 250, 60));

        menos.setFont(new java.awt.Font("Hack Nerd Font", 1, 18)); // NOI18N
        menos.setForeground(new java.awt.Color(255, 255, 255));
        menos.setText("-");
        menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosActionPerformed(evt);
            }
        });
        jPanel1.add(menos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 50, 50));

        borrar.setBackground(new java.awt.Color(204, 204, 255));
        borrar.setFont(new java.awt.Font("Hack Nerd Font", 1, 18)); // NOI18N
        borrar.setForeground(new java.awt.Color(255, 255, 255));
        borrar.setText("C");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        jPanel1.add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 50, 50));

        dividir.setFont(new java.awt.Font("Hack Nerd Font", 1, 18)); // NOI18N
        dividir.setForeground(new java.awt.Color(255, 255, 255));
        dividir.setText("/");
        dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividirActionPerformed(evt);
            }
        });
        jPanel1.add(dividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 50, 50));

        Multi.setFont(new java.awt.Font("Hack Nerd Font", 1, 18)); // NOI18N
        Multi.setForeground(new java.awt.Color(255, 255, 255));
        Multi.setText("*");
        Multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiActionPerformed(evt);
            }
        });
        jPanel1.add(Multi, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 50, 50));

        casilla7.setFont(new java.awt.Font("Hack Nerd Font", 1, 18)); // NOI18N
        casilla7.setForeground(new java.awt.Color(255, 255, 255));
        casilla7.setText("7");
        casilla7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla7ActionPerformed(evt);
            }
        });
        jPanel1.add(casilla7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 50, 50));

        casilla8.setFont(new java.awt.Font("Hack Nerd Font", 1, 18)); // NOI18N
        casilla8.setForeground(new java.awt.Color(255, 255, 255));
        casilla8.setText("8");
        casilla8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla8ActionPerformed(evt);
            }
        });
        jPanel1.add(casilla8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 50, 50));

        casilla9.setFont(new java.awt.Font("Hack Nerd Font", 1, 18)); // NOI18N
        casilla9.setForeground(new java.awt.Color(255, 255, 255));
        casilla9.setText("9");
        casilla9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla9ActionPerformed(evt);
            }
        });
        jPanel1.add(casilla9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 50, 50));

        casilla4.setFont(new java.awt.Font("Hack Nerd Font", 1, 18)); // NOI18N
        casilla4.setForeground(new java.awt.Color(255, 255, 255));
        casilla4.setText("4");
        casilla4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla4ActionPerformed(evt);
            }
        });
        jPanel1.add(casilla4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 50, 50));

        casilla5.setFont(new java.awt.Font("Hack Nerd Font", 1, 18)); // NOI18N
        casilla5.setForeground(new java.awt.Color(255, 255, 255));
        casilla5.setText("5");
        casilla5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla5ActionPerformed(evt);
            }
        });
        jPanel1.add(casilla5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 50, 50));

        casilla6.setFont(new java.awt.Font("Hack Nerd Font", 1, 18)); // NOI18N
        casilla6.setForeground(new java.awt.Color(255, 255, 255));
        casilla6.setText("6");
        casilla6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla6ActionPerformed(evt);
            }
        });
        jPanel1.add(casilla6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 50, 50));

        mas.setFont(new java.awt.Font("Hack Nerd Font", 1, 36)); // NOI18N
        mas.setText("+");
        mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masActionPerformed(evt);
            }
        });
        jPanel1.add(mas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 50, 120));

        casilla1.setBackground(new java.awt.Color(255, 255, 255));
        casilla1.setFont(new java.awt.Font("Hack Nerd Font Mono", 1, 18)); // NOI18N
        casilla1.setForeground(new java.awt.Color(255, 255, 255));
        casilla1.setText("1");
        casilla1.setBorderPainted(false);
        casilla1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla1ActionPerformed(evt);
            }
        });
        jPanel1.add(casilla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 50, 50));

        casilla2.setBackground(new java.awt.Color(255, 255, 255));
        casilla2.setFont(new java.awt.Font("Hack Nerd Font Propo", 1, 18)); // NOI18N
        casilla2.setForeground(new java.awt.Color(255, 255, 255));
        casilla2.setText("2");
        casilla2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla2ActionPerformed(evt);
            }
        });
        jPanel1.add(casilla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 50, 50));

        casilla3.setFont(new java.awt.Font("Hack Nerd Font", 1, 18)); // NOI18N
        casilla3.setForeground(new java.awt.Color(255, 255, 255));
        casilla3.setText("3");
        casilla3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla3ActionPerformed(evt);
            }
        });
        jPanel1.add(casilla3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 50, 50));

        cero.setFont(new java.awt.Font("Hack Nerd Font", 1, 18)); // NOI18N
        cero.setText("0");
        cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroActionPerformed(evt);
            }
        });
        jPanel1.add(cero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 120, 50));

        coma.setFont(new java.awt.Font("Hack Nerd Font", 1, 18)); // NOI18N
        coma.setText(".");
        coma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comaActionPerformed(evt);
            }
        });
        jPanel1.add(coma, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 50, 50));

        igual.setFont(new java.awt.Font("Hack Nerd Font", 1, 36)); // NOI18N
        igual.setText("=");
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });
        jPanel1.add(igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 50, 120));

        Entrada.setBackground(new java.awt.Color(255, 255, 255));
        Entrada.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        Entrada.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Entrada.setOpaque(true);
        jPanel1.add(Entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        this.Entrada.setText("");
        this.salida.setText("");
    }//GEN-LAST:event_borrarActionPerformed

    private void comaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comaActionPerformed
        if (!(this.Entrada.getText().contains("."))) {
            this.Entrada.setText(this.Entrada.getText()+".");
            
        }
    }//GEN-LAST:event_comaActionPerformed

    private void ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroActionPerformed
        this.Entrada.setText(this.Entrada.getText()+"0");
    }//GEN-LAST:event_ceroActionPerformed

    private void casilla1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla1ActionPerformed
        this.Entrada.setText(this.Entrada.getText()+"1");
    }//GEN-LAST:event_casilla1ActionPerformed

    private void casilla2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla2ActionPerformed
        this.Entrada.setText(this.Entrada.getText()+"2");
    }//GEN-LAST:event_casilla2ActionPerformed

    private void casilla3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla3ActionPerformed
        this.Entrada.setText(this.Entrada.getText()+"3");
    }//GEN-LAST:event_casilla3ActionPerformed

    private void casilla4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla4ActionPerformed
        this.Entrada.setText(this.Entrada.getText()+"4");
    }//GEN-LAST:event_casilla4ActionPerformed

    private void casilla5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla5ActionPerformed
        this.Entrada.setText(this.Entrada.getText()+"5");
    }//GEN-LAST:event_casilla5ActionPerformed

    private void casilla6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla6ActionPerformed
        this.Entrada.setText(this.Entrada.getText()+"6");
    }//GEN-LAST:event_casilla6ActionPerformed

    private void casilla7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla7ActionPerformed
        this.Entrada.setText(this.Entrada.getText()+"7");
    }//GEN-LAST:event_casilla7ActionPerformed

    private void casilla8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla8ActionPerformed
        this.Entrada.setText(this.Entrada.getText()+"8");
    }//GEN-LAST:event_casilla8ActionPerformed

    private void casilla9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla9ActionPerformed
        this.Entrada.setText(this.Entrada.getText()+"9");
    }//GEN-LAST:event_casilla9ActionPerformed

    private void masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masActionPerformed
        this.primernumero=Float.parseFloat(this.Entrada.getText());
        this.operador="+";
        this.Entrada.setText("");
        
    }//GEN-LAST:event_masActionPerformed

    private void menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosActionPerformed
        this.primernumero=Float.parseFloat(this.Entrada.getText());
        this.operador="-";
        this.Entrada.setText("");
    }//GEN-LAST:event_menosActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        this.segundoNumero=Float.parseFloat(this.Entrada.getText());
        switch (this.operador) {
            case "+": this.salida.setText(sincero(this.primernumero + this.segundoNumero)); break;
            case "-": this.salida.setText(sincero(this.primernumero + this.segundoNumero));break;
            case "*": this.salida.setText(sincero(this.primernumero + this.segundoNumero));break;
            case "/":
                if (this.segundoNumero==0) { this.salida.setText("indefinido");
                    
                }
                else
                this.salida.setText(sincero(this.primernumero + this.segundoNumero));break;
        }
        
    }//GEN-LAST:event_igualActionPerformed
    
    
    
    private void MultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiActionPerformed
        this.primernumero=Float.parseFloat(this.Entrada.getText());
        this.operador="*";
        this.Entrada.setText("");
    }//GEN-LAST:event_MultiActionPerformed

    private void dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividirActionPerformed
        this.primernumero=Float.parseFloat(this.Entrada.getText());
        this.operador="/";
        this.Entrada.setText("");
    }//GEN-LAST:event_dividirActionPerformed

    public String sincero(float resultado){
        String retorno="";
        
        retorno= Float.toString(resultado);
        
        if (resultado%1==0) {
            retorno=retorno.substring(0, retorno.length()-2);
            
        }
        
        return retorno;
        
  
    }
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
            java.util.logging.Logger.getLogger(Claculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Claculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Claculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Claculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Claculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Entrada;
    private javax.swing.JButton Multi;
    private javax.swing.JButton borrar;
    private javax.swing.JButton casilla1;
    private javax.swing.JButton casilla2;
    private javax.swing.JButton casilla3;
    private javax.swing.JButton casilla4;
    private javax.swing.JButton casilla5;
    private javax.swing.JButton casilla6;
    private javax.swing.JButton casilla7;
    private javax.swing.JButton casilla8;
    private javax.swing.JButton casilla9;
    private javax.swing.JButton cero;
    private javax.swing.JButton coma;
    private javax.swing.JButton dividir;
    private javax.swing.JButton igual;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mas;
    private javax.swing.JButton menos;
    private javax.swing.JLabel salida;
    // End of variables declaration//GEN-END:variables
}
