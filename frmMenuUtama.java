import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
/**
 *
 * @author Stella Virginia
 */
public class frmMenuUtama extends javax.swing.JFrame {
    public frmMenuUtama() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        //Untuk mematikan tombol close
        setDefaultCloseOperation(frmPengguna.DO_NOTHING_ON_CLOSE);
        //koneksi ke database
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        frmSubPengguna = new javax.swing.JCheckBoxMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        frmSubDataObat = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        frmSubKategoriObat = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        frmSubStokObat = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        frmSubIdentitasProduk = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        frmSubKeluar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        frmSubCetak = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 203, 167));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logo_png-removebg-preview (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );

        jRadioButton1.setText("jRadioButton1");

        jMenuBar1.setBackground(new java.awt.Color(255, 204, 204));

        jMenu1.setText("File");

        frmSubPengguna.setBackground(new java.awt.Color(205, 153, 219));
        frmSubPengguna.setText("Pengguna");
        frmSubPengguna.setContentAreaFilled(false);
        frmSubPengguna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/USER1.png"))); // NOI18N
        frmSubPengguna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmSubPenggunaActionPerformed(evt);
            }
        });
        jMenu1.add(frmSubPengguna);
        jMenu1.add(jSeparator1);

        frmSubDataObat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/DATAOBAT.png"))); // NOI18N
        frmSubDataObat.setText("Input Data");
        frmSubDataObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmSubDataObatActionPerformed(evt);
            }
        });
        jMenu1.add(frmSubDataObat);
        jMenu1.add(jSeparator2);

        frmSubKategoriObat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/KATEGORI.png"))); // NOI18N
        frmSubKategoriObat.setText("Input Kategori");
        frmSubKategoriObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmSubKategoriObatActionPerformed(evt);
            }
        });
        jMenu1.add(frmSubKategoriObat);
        jMenu1.add(jSeparator6);

        frmSubStokObat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/stock.png"))); // NOI18N
        frmSubStokObat.setText("Stock Obat");
        frmSubStokObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmSubStokObatActionPerformed(evt);
            }
        });
        jMenu1.add(frmSubStokObat);
        jMenu1.add(jSeparator3);

        frmSubIdentitasProduk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/HOSPITAL.png"))); // NOI18N
        frmSubIdentitasProduk.setText("Identitas Apotek");
        frmSubIdentitasProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmSubIdentitasProdukActionPerformed(evt);
            }
        });
        jMenu1.add(frmSubIdentitasProduk);
        jMenu1.add(jSeparator4);

        frmSubKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/EXIT.png"))); // NOI18N
        frmSubKeluar.setText("Keluar");
        frmSubKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmSubKeluarActionPerformed(evt);
            }
        });
        jMenu1.add(frmSubKeluar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Laporan");

        frmSubCetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/print.png"))); // NOI18N
        frmSubCetak.setText("Cetak");
        frmSubCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmSubCetakActionPerformed(evt);
            }
        });
        jMenu2.add(frmSubCetak);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void frmSubPenggunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmSubPenggunaActionPerformed
        // TODO add your handling code here:
        frmPengguna objPengguna = new frmPengguna();
        objPengguna.show();
    }//GEN-LAST:event_frmSubPenggunaActionPerformed

    private void frmSubDataObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmSubDataObatActionPerformed
        // TODO add your handling code here:
        frmDataObat objDataObat = new frmDataObat();
        objDataObat.show();
    }//GEN-LAST:event_frmSubDataObatActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        /*Dimension posisi = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (posisi.width - this.getWidth())/2;
        int y = (posisi.height - this.getHeight())/2;
        this.setLocation(x,y);
        */
    }//GEN-LAST:event_formWindowActivated

    private void frmSubKategoriObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmSubKategoriObatActionPerformed
        // TODO add your handling code here:
        frmKategoriObat objKategoriObat = new frmKategoriObat();
        objKategoriObat.show();
    }//GEN-LAST:event_frmSubKategoriObatActionPerformed

    private void frmSubIdentitasProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmSubIdentitasProdukActionPerformed
        // TODO add your handling code here:
        frmIdentitasApotek objIdentitasApotek = new frmIdentitasApotek();
        objIdentitasApotek.show();
    }//GEN-LAST:event_frmSubIdentitasProdukActionPerformed

    private void frmSubKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmSubKeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_frmSubKeluarActionPerformed

    private void frmSubStokObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmSubStokObatActionPerformed
        // TODO add your handling code here:
        frmStockObat objStockObat = new frmStockObat();
        objStockObat.show();
    }//GEN-LAST:event_frmSubStokObatActionPerformed

    private void frmSubCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmSubCetakActionPerformed
        // TODO add your handling code here:
        frmCetak objCetak = new frmCetak();
        objCetak.show();
    }//GEN-LAST:event_frmSubCetakActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuUtama().setVisible(true);
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem frmSubCetak;
    private javax.swing.JMenuItem frmSubDataObat;
    private javax.swing.JMenuItem frmSubIdentitasProduk;
    private javax.swing.JMenuItem frmSubKategoriObat;
    private javax.swing.JMenuItem frmSubKeluar;
    private javax.swing.JCheckBoxMenuItem frmSubPengguna;
    private javax.swing.JMenuItem frmSubStokObat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    // End of variables declaration//GEN-END:variables
}
