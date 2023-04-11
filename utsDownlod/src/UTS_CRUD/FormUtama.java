/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_CRUD;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author musa
 */
public class FormUtama extends javax.swing.JFrame {
    private DefaultTableModel tableModel;
    private Connection connection;
    /**
     * Creates new form FormUtama
     */
    public FormUtama() {
        initComponents();
        initTable();
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textidguru = new javax.swing.JTextField();
        textNamaguru = new javax.swing.JTextField();
        textmapel = new javax.swing.JTextField();
        textTelepon = new javax.swing.JTextField();
        textTanggal = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAlamat = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabeldataguru = new javax.swing.JTable();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("id guru");

        jLabel2.setText("Nama Guru");

        jLabel3.setText("Mata pelajaran");

        jLabel4.setText("Tanggal Lahir");

        jLabel5.setText("No. Telepon");

        jLabel6.setText("Alamat");

        textmapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textmapelActionPerformed(evt);
            }
        });

        textTanggal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.LONG))));
        textTanggal.setValue(new java.util.Date());

        textAlamat.setColumns(20);
        textAlamat.setRows(5);
        jScrollPane1.setViewportView(textAlamat);

        tabeldataguru.setModel(new javax.swing.table.DefaultTableModel(
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
        tabeldataguru.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabeldataguruAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tabeldataguru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeldataguruMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabeldataguru);

        btnSimpan.setText("Insert");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnUbah.setText("Update");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setText("Delete");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jLabel8.setText("DATA GURU");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(textidguru, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textNamaguru, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                        .addComponent(textmapel)
                                        .addComponent(textTelepon)
                                        .addComponent(textTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(btnSimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUbah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHapus)))
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnHapus, btnSimpan, btnUbah});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textidguru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNamaguru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textmapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnUbah)
                    .addComponent(btnHapus))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        
        //mengambil inputan dari form
        String id_guru           = textidguru.getText();
        String nama_guru         = textNamaguru.getText();
        String mata_pelajaran    = textmapel.getText();
        Date tanggal_lahir       = (Date) textTanggal.getValue();
        String no_telepon        = textTelepon.getText();
        String alamat            = textAlamat.getText();

        //masukkan data ke database
        connection = RiniSukmaAyu_dbguru.getConnection();
        String query = "INSERT INTO dataguru"
                + "(id_guru, nama_guru, mata_pelajaran, tanggal_lahir, no_telepon, alamat)"
                + "VALUES (?,?,?,?,?,?)";
        try {
          PreparedStatement statement= (PreparedStatement) connection.prepareStatement(query);
          
          statement.setString(1, id_guru);
          statement.setString(2, nama_guru);
          statement.setString(3, mata_pelajaran);
          statement.setDate(4, new java.sql.Date(tanggal_lahir.getTime()));
          statement.setString(5, no_telepon);
          statement.setString(6, alamat);
          
          statement.executeUpdate();
        } catch (SQLException ex){
          JOptionPane.showMessageDialog(this, "Terjadi error pada saat input data");
          
        } finally {
          loadData();
          reset();
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        
        //method untuk menyeleksi data yg akan diubah
        int row = tabeldataguru.getSelectedRow();
        if (row==-1){
            return;
        }
        
        //mengambil inputan untuk data yg akan diubah
        String id_guru          = (String) tableModel.getValueAt(row, 0);
        String nama_guru        = textNamaguru.getText();
        String mata_pelajaran   = textmapel.getText();
        Date tanggal_lahir      = (Date) textTanggal.getValue();
        String no_telepon       = textTelepon.getText();
        String alamat           = textAlamat.getText();

        //lakukan perubahan data ke database
        connection = RiniSukmaAyu_dbguru.getConnection();
        String query = "UPDATE dataguru SET "
            + "nama_guru=?,mata_pelajaran=?,tanggal_lahir=?,no_telepon=?,alamat=? "
            + "WHERE id_guru=?";
        try {
            PreparedStatement statement = (PreparedStatement) connection.prepareStatement(query);
            statement.setString(1, nama_guru);
            statement.setString(2, mata_pelajaran);
            statement.setDate(3, new java.sql.Date(tanggal_lahir.getTime()));
            statement.setString(4, no_telepon);
            statement.setString(5, alamat);
            statement.setString(6, id_guru);
            statement.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi error pada saat update data");
        } finally {
            loadData();
            reset();
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        
        //method seleksi data yg akan diubah
        int row = tabeldataguru.getSelectedRow();
        if (row==-1){
            return;
        }
        
        //mengambil inputan untuk data yg akan diubah
        String id_guru = (String) tableModel.getValueAt(row, 0);
        
        //lakukan perubahan data ke db
        connection = RiniSukmaAyu_dbguru.getConnection();
        String query = "DELETE FROM dataguru WHERE id_guru=?";
        
        try {
            PreparedStatement statement = (PreparedStatement) connection.prepareStatement(query);
            statement.setString(1, id_guru);
            statement.executeUpdate();            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi error pada saat delete data");
        } finally {
          loadData();  
          reset();
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tabeldataguruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeldataguruMouseClicked
        // TODO add your handling code here:
        try {
            //mendapatkan baris yang terseleksi
            int row=tabeldataguru.getSelectedRow();
            if (row==-1) {
                return;
            }
        
            //mengambil data dan ditampung
            String noInduk = (String) tableModel.getValueAt(row, 0);
            String nama = (String) tableModel.getValueAt(row, 1);
            String namaWali = (String) tableModel.getValueAt(row, 2);
            String tanggal= (String) tableModel.getValueAt(row, 3);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date=sdf.parse(tanggal);
            String telepon = (String) tableModel.getValueAt(row, 4);
            String alamat = (String) tableModel.getValueAt(row, 5);

            //memberi data di setiap inputan
            textidguru.setText(noInduk);
            textNamaguru.setText(nama);
            textmapel.setText(namaWali);
            textTanggal.setValue(date);
            textTelepon.setText(telepon);
            textAlamat.setText(alamat);
        } catch (ParseException ex) {
            Logger.getLogger(FormUtama.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_tabeldataguruMouseClicked

    private void tabeldataguruAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabeldataguruAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tabeldataguruAncestorAdded

    private void textmapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textmapelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textmapelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FormUtama().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabeldataguru;
    private javax.swing.JTextArea textAlamat;
    private javax.swing.JTextField textNamaguru;
    private javax.swing.JFormattedTextField textTanggal;
    private javax.swing.JTextField textTelepon;
    private javax.swing.JTextField textidguru;
    private javax.swing.JTextField textmapel;
    // End of variables declaration//GEN-END:variables

    private void initTable(){
        tableModel = new DefaultTableModel();
        tabeldataguru.setModel(tableModel);
        tableModel.addColumn("ID Guru");
        tableModel.addColumn("Nama Guru");
        tableModel.addColumn("Mata Pelajaran");
        tableModel.addColumn("Tanggal Lahir");
        tableModel.addColumn("No. Telepon");
        tableModel.addColumn("Alamat");
    }
    
    private void loadData(){
        //menghapus seluruh data yg ada di tabel
        tableModel.getDataVector().removeAllElements();
        //pemberitahuan tabel telah kosong
        tableModel.fireTableDataChanged();
        
        try{
            connection = RiniSukmaAyu_dbguru.getConnection();
            String query = "SELECT * FROM dataguru";
            
            Statement statement = (Statement) connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            //mengisi tabel dgn data hasil query
            while (resultSet.next()){
                Object[] dataguru = new Object[6];
                dataguru[0] = resultSet.getString("id_guru");
                dataguru[1] = resultSet.getString("nama_guru");
                dataguru[2] = resultSet.getString("mata_pelajaran");
                dataguru[3] = resultSet.getString("tanggal_lahir");
                dataguru[4] = resultSet.getString("no_telepon");
                dataguru[5] = resultSet.getString("alamat");
                tableModel.addRow(dataguru);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    private void reset(){
        textidguru.setText("");
        textNamaguru.setText("");
        textTanggal.setValue(new java.util.Date());
        textTelepon.setText("");
        textmapel.setText("");
        textAlamat.setText("");
    }
}