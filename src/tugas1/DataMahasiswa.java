package tugas1;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
public class DataMahasiswa extends javax.swing.JFrame {
    private Object txtNPM;
   public DataMahasiswa() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner2 = new javax.swing.JSpinner();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        lableNPM = new javax.swing.JLabel();
        lableNama = new javax.swing.JLabel();
        lableProdi = new javax.swing.JLabel();
        lableAlamat = new javax.swing.JLabel();
        lableNo = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        txtNP = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtProdi = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        txtnom1 = new javax.swing.JTextField();
        txtnom2 = new javax.swing.JTextField();
        lableStip = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(204, 255, 255));

        lableNPM.setText("NPM");

        lableNama.setText("Nama");

        lableProdi.setText("Prodi");

        lableAlamat.setText("Alamat");

        lableNo.setText("No-Telp");

        btnSimpan.setText("Simpan");
        btnSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSimpanMouseClicked(evt);
            }
        });
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        txtNP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNPKeyPressed(evt);
            }
        });

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        txtNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNamaKeyPressed(evt);
            }
        });

        txtProdi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProdiKeyPressed(evt);
            }
        });

        txtAlamat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAlamatKeyPressed(evt);
            }
        });

        txtnom1.setEditable(false);
        txtnom1.setText("+62");
        txtnom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnom1ActionPerformed(evt);
            }
        });
        txtnom1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnom1KeyPressed(evt);
            }
        });

        txtnom2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnom2ActionPerformed(evt);
            }
        });
        txtnom2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnom2KeyPressed(evt);
            }
        });

        lableStip.setText("--");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lableNPM)
                                .addGap(31, 31, 31)
                                .addComponent(txtNP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lableProdi)
                                .addGap(28, 28, 28)
                                .addComponent(txtProdi, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lableNo)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtnom1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lableStip)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtnom2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lableNama)
                        .addGap(25, 25, 25)
                        .addComponent(txtNama)
                        .addGap(75, 75, 75))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lableAlamat)
                        .addGap(18, 18, 18)
                        .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 13, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lableNPM)
                    .addComponent(txtNP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lableNama)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lableProdi)
                    .addComponent(txtProdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lableAlamat)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lableNo)
                    .addComponent(txtnom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lableStip))
                .addGap(28, 28, 28)
                .addComponent(btnSimpan)
                .addContainerGap(25, Short.MAX_VALUE))
        );

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
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        if(txtNP.getText().length()== 0||txtNama.getText().length()== 0||txtProdi.getText().length()== 0||txtAlamat.getText().length()== 0||txtnom1.getText().length()== 0||txtnom2.getText().length()== 0)
            {
                JOptionPane.showMessageDialog(null, "Masukan Tidak Boleh Kosong","Konfirmasi",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
         String NP  = txtNP.getText();
         String Nama = txtNama.getText();
         String Prodi = txtProdi.getText();
         String Alamat = txtAlamat.getText();
         String Nom1 = txtnom1.getText();
         String Nom2 = txtnom2.getText();
        JOptionPane.showMessageDialog(this, Nama+"\n"+NP+"\n"+Prodi+"\n"+Alamat+"\n"+Nom1+"--"+Nom2);
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        txtNP.setText("");
        txtNama.setText("");
        txtAlamat.setText("");
        txtProdi.setText("");
        txtnom2.setText("");
    }//GEN-LAST:event_formWindowOpened

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtnom2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnom2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnom2ActionPerformed

    private void btnSimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMouseClicked
        // TODO add your handling code here:
         String NP  = txtNP.getText();
         String Nama = txtNama.getText();
         String Prodi = txtProdi.getText();
         String Alamat = txtAlamat.getText();
         String Nom1 = txtnom1.getText();
         String Nom2 = txtnom2.getText();
        JOptionPane.showMessageDialog(this,"NPM :"+NP+"\nNama :"+Nama+"\nProdi :"+Prodi+"\nAlamat :"+Alamat+"\nNo.Telp :+62"+Nom1+"--"+Nom2);
    }//GEN-LAST:event_btnSimpanMouseClicked

    private void txtNPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNPKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== evt.VK_ENTER)
            {
        if(txtNP.getText().length()== 0)
            {
                JOptionPane.showMessageDialog(null, "Masukan Tidak Boleh Kosong","Konfirmasi",JOptionPane.INFORMATION_MESSAGE);
                txtNP.requestFocus();
                return;
            }
            btnSimpan.requestFocus();
            }
    }//GEN-LAST:event_txtNPKeyPressed

    private void txtNamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== evt.VK_ENTER)
            {
        if(txtNama.getText().length()== 0)
            {
                JOptionPane.showMessageDialog(null, "Masukan Tidak Boleh Kosong","Konfirmasi",JOptionPane.INFORMATION_MESSAGE);
                txtNama.requestFocus();
                return;
            }
            btnSimpan.requestFocus();
            }
    }//GEN-LAST:event_txtNamaKeyPressed

    private void txtProdiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProdiKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== evt.VK_ENTER)
            {
        if(txtProdi.getText().length()== 0)
            {
                JOptionPane.showMessageDialog(null, "Masukan Tidak Boleh Kosong","Konfirmasi",JOptionPane.INFORMATION_MESSAGE);
                txtProdi.requestFocus();
                return;
            }
            btnSimpan.requestFocus();
            }
    }//GEN-LAST:event_txtProdiKeyPressed

    private void txtAlamatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAlamatKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== evt.VK_ENTER)
            {
        if(txtAlamat.getText().length()== 0)
            {
                JOptionPane.showMessageDialog(null, "Masukan Tidak Boleh Kosong","Konfirmasi",JOptionPane.INFORMATION_MESSAGE);
                txtAlamat.requestFocus();
                return;
            }
            btnSimpan.requestFocus();
            }
    }//GEN-LAST:event_txtAlamatKeyPressed

    private void txtnom1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnom1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== evt.VK_ENTER)
            {
        if(txtnom1.getText().length()== 0)
            {
                JOptionPane.showMessageDialog(null, "Masukan Tidak Boleh Kosong","Konfirmasi",JOptionPane.INFORMATION_MESSAGE);
                txtnom1.requestFocus();
                return;
            }
            btnSimpan.requestFocus();
            }
    }//GEN-LAST:event_txtnom1KeyPressed

    private void txtnom2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnom2KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== evt.VK_ENTER)
            {
        if(txtnom2.getText().length()== 0)
            {
                JOptionPane.showMessageDialog(null, "Masukan Tidak Boleh Kosong","Konfirmasi",JOptionPane.INFORMATION_MESSAGE);
                txtnom2.requestFocus();
                return;
            }
            btnSimpan.requestFocus();
            }
    }//GEN-LAST:event_txtnom2KeyPressed

    private void txtnom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnom1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnom1ActionPerformed

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
            java.util.logging.Logger.getLogger(DataMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSimpan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lableAlamat;
    private javax.swing.JLabel lableNPM;
    private javax.swing.JLabel lableNama;
    private javax.swing.JLabel lableNo;
    private javax.swing.JLabel lableProdi;
    private javax.swing.JLabel lableStip;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtNP;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtProdi;
    private javax.swing.JTextField txtnom1;
    private javax.swing.JTextField txtnom2;
    // End of variables declaration//GEN-END:variables
}
