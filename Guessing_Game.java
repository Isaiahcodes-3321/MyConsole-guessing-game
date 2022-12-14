/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ISAIAH SHELL
 */
import java.awt.event.KeyEvent;
import java.util.Random;

public class Guessing_Game extends javax.swing.JFrame {

    /**
     * Creates new form Guessing_Game
     */
    public Guessing_Game() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userNum = new javax.swing.JTextField();
        enter = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Isaiah Guessing Game");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Eras Demi ITC", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Guess the output from 0 to 5");

        userNum.setBackground(new java.awt.Color(255, 255, 255));
        userNum.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        userNum.setForeground(new java.awt.Color(0, 0, 0));
        userNum.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)));
        userNum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enter_key(evt);
            }
        });

        enter.setBackground(new java.awt.Color(0, 0, 0));
        enter.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        enter.setForeground(new java.awt.Color(255, 255, 255));
        enter.setText("Enter");
        enter.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 204, 0)));
        enter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enter_button(evt);
            }
        });

        display.setBackground(new java.awt.Color(255, 255, 255));
        display.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        display.setForeground(new java.awt.Color(0, 0, 0));
        display.setLineWrap(true);
        display.setWrapStyleWord(true);
        display.setBorder(null);
        display.setCaretColor(new java.awt.Color(204, 0, 0));
        display.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        display.setSelectionColor(new java.awt.Color(0, 204, 0));
        jScrollPane2.setViewportView(display);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNum, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(userNum, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Random random = new Random();
    int counter;
    int counter1;

    String output = " Correct ";
    String output1 = "  Was the hidden number";
    String output2 = " Wrong the hidden number it's : ";

    private void enter_button(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enter_button
        // TODO add your handling code here:
        // get text from JTextField
        String userInput = userNum.getText();

        try {
            int random_number = Integer.parseInt(userInput);
            // convert user JtextField to int
            int random_number_outPut = random.nextInt(6);

            counter++;
            // Update the label with a message
            if (random_number_outPut == random_number) {
                counter1++;
                display.setText("  " + output + random_number_outPut + output1 + " you made " + counter + " trials "
                        + "\n  Total win " + counter1);
            } else {
                display.setText("  Opps  you're dull than the program " + output2 + random_number_outPut + " try again");
            }
        } catch (Exception e) {
        }

        userNum.setText("");
    }//GEN-LAST:event_enter_button

    private void enter_key(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enter_key
        // TODO add your handling code here:
           String userInput = userNum.getText();
        // get text from JTextField

        userNum.setText("");
        try {
            // convert user JtextField to int
            int random_number = Integer.parseInt(userInput);
            int random_number_outPut = random.nextInt(6);

            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                // Update the label with a message
                 
                counter++;
                if (random_number_outPut == random_number) {
                    counter1++;
                    display.setText("  " + output + random_number_outPut + output1 + " you made " + counter + " trials "
                            + "\n  Total win " + counter1);
                } 
                else {
                    display.setText("  Opps  you're dull than the program " + output2 + random_number_outPut + " try again");
                }
            }
        } catch (Exception e) {
          
        }
    }//GEN-LAST:event_enter_key

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
            java.util.logging.Logger.getLogger(Guessing_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Guessing_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Guessing_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Guessing_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guessing_Game().setVisible(true);
            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea display;
    private javax.swing.JButton enter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField userNum;
    // End of variables declaration//GEN-END:variables
}
