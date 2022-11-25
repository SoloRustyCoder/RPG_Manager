package com.rusty.view;

public class Dice extends javax.swing.JFrame {
    public Dice() {
        initComponents();
        randomNum.setText(String.valueOf((int)(Math.random() * 20 ) + 1));
        //Gera inicialmente já com um número aleatório
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRoll = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        randomNum = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRoll.setText("Rolar");
        btnRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRollActionPerformed(evt);
            }
        });
        getContentPane().add(btnRoll, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 235, -1, -1));

        btnReturn.setText("Voltar");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        getContentPane().add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 235, -1, -1));

        randomNum.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        randomNum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        randomNum.setText("0");
        getContentPane().add(randomNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 210));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Dado:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        this.dispose();
        Menu menu = new Menu();
        menu.setVisible(true);
        //Retorna para o menu
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRollActionPerformed
        randomNum.setText(String.valueOf((int)(Math.random() * 20 ) + 1));
        //Gera e exibe um número aleatório de 1 a 20
    }//GEN-LAST:event_btnRollActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnRoll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel randomNum;
    // End of variables declaration//GEN-END:variables
}
