import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
/**
 *
 * @author Stella Virginia
 */
public class frmDataObat extends javax.swing.JFrame {
     //membuat objek dari kelas clsDataObat
    clsDataObat objDataObat = new clsDataObat();
    //mendeklarasikan variabel
    private TableColumn column;
    /**
     * Creates new form frmDataObat
     */
    public frmDataObat() {
        initComponents();
        objDataObat.AksesData();
        objDataObat.TampilData();
        BersihIsian();
        IsiTabel();
        IsiComboKategoriObat();
        
         //Untuk mematikan tombol close
        setDefaultCloseOperation(frmPengguna.DO_NOTHING_ON_CLOSE);
        //koneksi ke database
     
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtHargaBeli = new javax.swing.JTextField();
        KodeObat = new javax.swing.JLabel();
        btnBaru = new javax.swing.JButton();
        NamaObat = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        KategoriObat = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        TglKadaluarsa = new javax.swing.JLabel();
        btnHapus = new javax.swing.JButton();
        Quantity = new javax.swing.JLabel();
        btnKeluar = new javax.swing.JButton();
        HargaBeli = new javax.swing.JLabel();
        txtKodeObat = new javax.swing.JTextField();
        txtNamaObat = new javax.swing.JTextField();
        cboKategoriObat = new javax.swing.JComboBox<>();
        txtTglKadaluarsa = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabel = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        txtHargaBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaBeliActionPerformed(evt);
            }
        });
        txtHargaBeli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHargaBeliKeyPressed(evt);
            }
        });

        KodeObat.setText("Kode Obat : ");

        btnBaru.setText("New");
        btnBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaruActionPerformed(evt);
            }
        });

        NamaObat.setText("Nama Obat : ");

        btnSimpan.setText("Save");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        btnSimpan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSimpanKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnSimpanKeyTyped(evt);
            }
        });

        KategoriObat.setText("Kategori Obat : ");

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        TglKadaluarsa.setText("Tanggal Kadaluarsa : ");

        btnHapus.setText("Delete");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        Quantity.setText("Quantity : ");

        btnKeluar.setText("Exit");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        HargaBeli.setText("Harga Beli : ");

        txtKodeObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeObatActionPerformed(evt);
            }
        });
        txtKodeObat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKodeObatKeyPressed(evt);
            }
        });

        txtNamaObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaObatActionPerformed(evt);
            }
        });
        txtNamaObat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNamaObatKeyPressed(evt);
            }
        });

        cboKategoriObat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboKategoriObat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboKategoriObatMouseClicked(evt);
            }
        });
        cboKategoriObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboKategoriObatActionPerformed(evt);
            }
        });
        cboKategoriObat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cboKategoriObatKeyPressed(evt);
            }
        });

        txtTglKadaluarsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTglKadaluarsaActionPerformed(evt);
            }
        });
        txtTglKadaluarsa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTglKadaluarsaKeyPressed(evt);
            }
        });

        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });
        txtQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQuantityKeyPressed(evt);
            }
        });

        jTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabelMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTabel);

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("FORM INPUT OBAT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(KodeObat)
                            .addComponent(NamaObat)
                            .addComponent(KategoriObat)
                            .addComponent(TglKadaluarsa)
                            .addComponent(Quantity)
                            .addComponent(HargaBeli))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKodeObat, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNamaObat, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtHargaBeli, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQuantity, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTglKadaluarsa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboKategoriObat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(btnEdit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnSimpan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 231, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KodeObat)
                    .addComponent(txtKodeObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NamaObat)
                    .addComponent(txtNamaObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KategoriObat)
                    .addComponent(cboKategoriObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TglKadaluarsa)
                    .addComponent(txtTglKadaluarsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBaru)
                    .addComponent(btnHapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Quantity)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSimpan)
                    .addComponent(btnKeluar))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HargaBeli)
                    .addComponent(txtHargaBeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelMouseClicked
        // TODO add your handling code here:

        int baris = jTabel.getSelectedRow();
        String kolom0 = jTabel.getValueAt(baris, 0).toString();
        String kolom1 = jTabel.getValueAt(baris, 1).toString();
        String kolom2 = jTabel.getValueAt(baris, 2).toString() + " - " + jTabel.getValueAt(baris, 3).toString();
        String kolom3 = jTabel.getValueAt(baris, 5).toString();
        String kolom4 = jTabel.getValueAt(baris, 4).toString();
        String kolom5 = jTabel.getValueAt(baris, 6 ).toString();

        txtKodeObat.setText(kolom0);
        txtNamaObat.setText(kolom1);
        cboKategoriObat.removeAllItems();
        cboKategoriObat.addItem(kolom2);
        txtQuantity.setText(kolom3);
        txtTglKadaluarsa.setText(kolom4);
        txtHargaBeli.setText(kolom5);


    }//GEN-LAST:event_jTabelMouseClicked

    private void txtQuantityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()== KeyEvent.VK_ENTER)
        {
            if ((txtQuantity.getText().length() < 1) || (txtQuantity.getText().isEmpty()))
            {
                JOptionPane.showMessageDialog(this, "Jumlah minimal 1 buah","Informasi",
                    JOptionPane.INFORMATION_MESSAGE);
                txtQuantity.requestFocus();
            }
            else
            {
                txtHargaBeli.requestFocus();
            }
        }
    }//GEN-LAST:event_txtQuantityKeyPressed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void txtTglKadaluarsaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTglKadaluarsaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()== KeyEvent.VK_ENTER)
        {
            txtQuantity.requestFocus();
        }
    }//GEN-LAST:event_txtTglKadaluarsaKeyPressed

    private void txtTglKadaluarsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTglKadaluarsaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTglKadaluarsaActionPerformed

    private void cboKategoriObatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboKategoriObatKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()== KeyEvent.VK_ENTER)
        {
            txtTglKadaluarsa.requestFocus();
        }
    }//GEN-LAST:event_cboKategoriObatKeyPressed

    private void cboKategoriObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboKategoriObatActionPerformed
        // TODO add your handling code here:
        //         IsiComboKategoriObat();
    }//GEN-LAST:event_cboKategoriObatActionPerformed

    private void cboKategoriObatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboKategoriObatMouseClicked
        // TODO add your handling code here:
        IsiComboKategoriObat();
    }//GEN-LAST:event_cboKategoriObatMouseClicked

    private void txtNamaObatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaObatKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()== KeyEvent.VK_ENTER)
        {
            if (txtNamaObat.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Nama masih kosong","Informasi",
                    JOptionPane.INFORMATION_MESSAGE);
                txtNamaObat.requestFocus();
            }
            else
            {
                cboKategoriObat.requestFocus();
            }
        }
    }//GEN-LAST:event_txtNamaObatKeyPressed

    private void txtNamaObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaObatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaObatActionPerformed

    private void txtKodeObatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKodeObatKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()== KeyEvent.VK_ENTER)
        {
            if ((txtKodeObat.getText().length() < 3) || (txtKodeObat.getText().isEmpty()))
            {
                JOptionPane.showMessageDialog(this, "Panjang Kode minimal harus 3 digit","Informasi",
                    JOptionPane.INFORMATION_MESSAGE);
                txtKodeObat.requestFocus();
            }
            else
            {
                txtNamaObat.requestFocus();
            }
        }
    }//GEN-LAST:event_txtKodeObatKeyPressed

    private void txtKodeObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeObatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeObatActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        try
        {
            objDataObat.Keluar();
            dispose();
        }
        catch (Exception e){
            {
                JOptionPane.showMessageDialog(null,"Terjadi kesalahan");
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        try
        {
            objDataObat.AksesData();
            objDataObat.NamaObat = txtNamaObat.getText();
            objDataObat.Hapus();
            objDataObat.res.executeUpdate(objDataObat.sql);
            objDataObat.conn.close();
            IsiTabel();
            BersihIsian();
            JOptionPane.showMessageDialog(null,"Data berhasil dihapus");
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Proses penghapusan gagal/koneksi gagal");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        if(txtKodeObat.getText().equals("")||txtNamaObat.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Masukkan Kode Obat");
        }
        else
        {
            try
            {
                objDataObat.AksesData();
                objDataObat.KodeObat = txtKodeObat.getText();
                objDataObat.NamaObat = txtNamaObat.getText();
                objDataObat.KodeKategori = cboKategoriObat.getSelectedItem().toString().substring(0, 3);
                objDataObat.TanggalKadaluarsa = txtTglKadaluarsa.getText();
                String mQuantity=txtQuantity.getText();
                objDataObat.Quantity = Integer.parseInt(mQuantity);
                String mHargaBeli=txtHargaBeli.getText();
                objDataObat.HargaBeli = Integer.parseInt(mHargaBeli);
                objDataObat.Edit();
                objDataObat.res.executeUpdate(objDataObat.sql);
                objDataObat.conn.close();
                BersihIsian();
                IsiTabel();
                JOptionPane.showMessageDialog(null,"Data berhasil diupdate");
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null,"Proses penyimpanan gagal/ koneksi gagal");
                System.out.println(e.getMessage());
            }
        }

    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSimpanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSimpanKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimpanKeyTyped

    private void btnSimpanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSimpanKeyPressed
        // TODO add your handling code here:
        SimpanData();
    }//GEN-LAST:event_btnSimpanKeyPressed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        SimpanData();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaruActionPerformed
        // TODO add your handling code here:
        try
        {
            BersihIsian();
            IsiTabel();
            txtKodeObat.requestFocus();
        }
        catch (Exception e)
        {
        }
    }//GEN-LAST:event_btnBaruActionPerformed

    private void txtHargaBeliKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHargaBeliKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()== KeyEvent.VK_ENTER)
        {
            if ((txtHargaBeli.getText().length() < 3) || (txtHargaBeli.getText().isEmpty()))
            {
                JOptionPane.showMessageDialog(this, "Masukkan nilai yang sesuai","Informasi",
                    JOptionPane.INFORMATION_MESSAGE);
                txtHargaBeli.requestFocus();
            }
            else
            {
                btnSimpan.requestFocus();
            }
        }
    }//GEN-LAST:event_txtHargaBeliKeyPressed

    private void txtHargaBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaBeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaBeliActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        Dimension posisi = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (posisi.width - this.getWidth())/2;
        int y = (posisi.height - this.getHeight())/2;
        this.setLocation(x,y);
    }//GEN-LAST:event_formWindowActivated

//Prosedur membersihkan isian data
    public void BersihIsian()
    {
       txtKodeObat.setText("");
       txtNamaObat.setText("");
       IsiComboKategoriObat();
       txtTglKadaluarsa.setText("");
       txtQuantity.setText("");
       txtHargaBeli.setText("");
       txtKodeObat.setText("");
    }

//Prosedur mengatur kolom jTable
    private void AturKolom() {
        jTabel.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        column = jTabel.getColumnModel().getColumn(0);
        column.setPreferredWidth(80);
        column = jTabel.getColumnModel().getColumn(1);
        column.setPreferredWidth(100);
        column = jTabel.getColumnModel().getColumn(2);
        column.setPreferredWidth(90);
        column = jTabel.getColumnModel().getColumn(3);
        column.setPreferredWidth(160);
        column = jTabel.getColumnModel().getColumn(4);
        column.setPreferredWidth(160);
        column = jTabel.getColumnModel().getColumn(5);
        column.setPreferredWidth(120);
        column = jTabel.getColumnModel().getColumn(6);
        column.setPreferredWidth(120);
       
    }

 //Prosedur menampilkan data ke jTable
    private void IsiTabel() {
     DefaultTableModel tabelmapel = new DefaultTableModel();
     
     tabelmapel.addColumn("KodeObat");
     tabelmapel.addColumn("NamaObat");
     tabelmapel.addColumn("KodeKategori");
      tabelmapel.addColumn("KategoriObat");
     tabelmapel.addColumn("TanggalKadaluarsa");
     tabelmapel.addColumn("Quantity");
     tabelmapel.addColumn("HargaBeli");
     
     try
     {
         objDataObat.AksesData();
         objDataObat.TampilData();
         Statement stat1 = objDataObat.conn.createStatement();
         ResultSet res1=stat1.executeQuery(objDataObat.sql);
         while (res1.next())
         {
             tabelmapel.addRow(new Object[]{res1.getString(1),res1.getString(2),res1.getString(3),res1.getString(4),res1.getString(5),res1.getString(6),res1.getString(7)});
         }
         jTabel.setModel(tabelmapel);
         AturKolom(); //atur kolom jTable
     }
     catch (Exception e)
     {
     }
         
    }
    
    //prosedur mengisi combobox dengan data
    public void IsiComboKategoriObat()
    {
        try
        {
            cboKategoriObat.removeAllItems();
            objDataObat.AksesData();
            String sql1 = "select * from tblkategori";
            Statement stat1 = objDataObat.conn.createStatement();
            ResultSet res1=stat1.executeQuery(sql1);
            cboKategoriObat.addItem("Pilih Kategori obat");
            while(res1.next())
            {
                cboKategoriObat.addItem(res1.getString("KodeKategori") + " - " + res1.getString("KategoriObat"));
            }
        }
        catch(Exception e)
        {
        }
    }

//Prosedur simpan data
    private void SimpanData()
    {
        if(txtKodeObat.getText().equals("")||txtNamaObat.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Data harus diisi semua");
        }
        else
        {
            try
            {
                objDataObat.AksesData();
                objDataObat.KodeObat = txtKodeObat.getText();
                objDataObat.NamaObat = txtNamaObat.getText();
                objDataObat.KodeKategori = cboKategoriObat.getSelectedItem().toString().substring(0, 3);
                objDataObat.TanggalKadaluarsa = txtTglKadaluarsa.getText();
                String mQuantity=txtQuantity.getText();
                objDataObat.Quantity = Integer.parseInt(mQuantity);
                String mHargaBeli=txtHargaBeli.getText();
                objDataObat.HargaBeli = Integer.parseInt(mHargaBeli);
                objDataObat.Simpan();
                objDataObat.res.executeUpdate(objDataObat.sql);
                objDataObat.conn.close();
                BersihIsian();
                IsiTabel();
                JOptionPane.showMessageDialog(null,"Data berhasil disimpan");
            }
            catch (Exception e)
            {
              JOptionPane.showMessageDialog(null,"Proses penyimpanan gagal/koneksi gagal");
              System.out.println(e.getMessage());
            }
        }
    }

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
            java.util.logging.Logger.getLogger(frmDataObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDataObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDataObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDataObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDataObat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HargaBeli;
    private javax.swing.JLabel KategoriObat;
    private javax.swing.JLabel KodeObat;
    private javax.swing.JLabel NamaObat;
    private javax.swing.JLabel Quantity;
    private javax.swing.JLabel TglKadaluarsa;
    private javax.swing.JButton btnBaru;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cboKategoriObat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabel;
    private javax.swing.JTextField txtHargaBeli;
    private javax.swing.JTextField txtKodeObat;
    private javax.swing.JTextField txtNamaObat;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtTglKadaluarsa;
    // End of variables declaration//GEN-END:variables
}
