/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author AWIEZ FATHWA ZEIN
 */
public class stackGUI extends javax.swing.JFrame {
    int xMouse;
    int yMouse;
    int timeRun = 0;

    /**
     * Creates new form stackGUI
     */
    public stackGUI() {
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

        jPanel1 = new javax.swing.JPanel();
        note = new javax.swing.JLabel();
        cek = new javax.swing.JLabel();
        pop = new javax.swing.JLabel();
        inputcd = new javax.swing.JTextField();
        top = new javax.swing.JLabel();
        ar = new javax.swing.JLabel();
        vary = new javax.swing.JTextField();
        varx = new javax.swing.JTextField();
        var6 = new javax.swing.JTextField();
        var5 = new javax.swing.JTextField();
        var4 = new javax.swing.JTextField();
        var3 = new javax.swing.JTextField();
        var1 = new javax.swing.JTextField();
        var2 = new javax.swing.JTextField();
        layer = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        note.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        note.setForeground(new java.awt.Color(0, 0, 128));
        note.setText("FULL");
        jPanel1.add(note, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 210, -1, -1));
        jPanel1.add(cek, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 420, 50));
        jPanel1.add(pop, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 250, 60));
        jPanel1.add(inputcd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 120, 50));
        jPanel1.add(top, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 270, 40));
        jPanel1.add(ar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 270, 40));

        vary.setEditable(false);
        jPanel1.add(vary, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 110, 70, 50));

        varx.setEditable(false);
        jPanel1.add(varx, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, 70, 50));

        var6.setEditable(false);
        jPanel1.add(var6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 470, 60, 50));

        var5.setEditable(false);
        jPanel1.add(var5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 410, 60, 50));

        var4.setEditable(false);
        jPanel1.add(var4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 340, 60, 50));

        var3.setEditable(false);
        jPanel1.add(var3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 270, 60, 50));

        var1.setEditable(false);
        jPanel1.add(var1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 110, 70, 50));

        var2.setEditable(false);
        jPanel1.add(var2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 200, 60, 50));

        layer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stack/layer2.png"))); // NOI18N
        jPanel1.add(layer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stack/bg2.jpg"))); // NOI18N
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(stackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stackGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ar;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel cek;
    private javax.swing.JTextField inputcd;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel layer;
    private javax.swing.JLabel note;
    private javax.swing.JLabel pop;
    private javax.swing.JLabel top;
    private javax.swing.JTextField var1;
    private javax.swing.JTextField var2;
    private javax.swing.JTextField var3;
    private javax.swing.JTextField var4;
    private javax.swing.JTextField var5;
    private javax.swing.JTextField var6;
    private javax.swing.JTextField varx;
    private javax.swing.JTextField vary;
    // End of variables declaration//GEN-END:variables
}
