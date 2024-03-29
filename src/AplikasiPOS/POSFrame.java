package AplikasiPOS;

import java.util.ArrayList;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;


public class POSFrame extends javax.swing.JFrame {
    ArrayList<Barang> daftarBarang;
    
    TableModel daftarModel;
    
    int jumlahBelanja = 0;
    /**
     * Creates new form POSFrame
     */
    public POSFrame() {
        
        DBConnector.initDBConnection();
        
        Barang.loadBarangFromDB();
        System.out.println(Barang.daftarBarang.size());
        
        daftarBarang = Barang.daftarBarang;
        
//        Barang i1 = new Barang();
//        i1.kode = "000";
//        i1.nama = "milo";
//        i1.harga = 10000.0f;
//        daftarBarang.add(i1);
//        
//        Barang i2 = new Barang();
//        i2.kode = "001";
//        i2.nama = "chiki";
//        i2.harga = 12000.0f;
//        daftarBarang.add(i2);
//        
//        Barang i3 = new Barang();
//        i3.kode = "002";
//        i3.nama = "oreo";
//        i3.harga = 11000.0f;
//        daftarBarang.add(i3);
        
        System.out.println(daftarBarang.size());
        
        initComponents();
        
        daftarModel = daftarTable.getModel();
        daftarModel.addTableModelListener(new TableModelListener()
            {
                
            @Override
            public void tableChanged(TableModelEvent e) {
                
                if (e.getColumn() == 4)
                {  
                    int baris = e.getFirstRow();
                    
                    float harga = (float)daftarModel.getValueAt(baris, 3);
                    int jumlah = (int)daftarModel.getValueAt(baris, 4);
                    
                    float total = harga * jumlah;
                    daftarModel.setValueAt(total, baris, 5);
                    
                    float totalBelanja = 0.0f;
                    total = 0.0f;
                    for (int i = 0; i < jumlahBelanja; i++)
                    {
                        System.out.println("TOTAL " + i);
                        total = (float)daftarModel.getValueAt(i, 5);
                        totalBelanja = totalBelanja + total;
                    }
                    int totalBelanjaInt = (int)totalBelanja;
                    
                    totalBelanjaTextField.setText(String.format("%,d", totalBelanjaInt));
                }
            }  

        }

        );
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        kodeTextField = new javax.swing.JTextField();
        NamaTextField = new javax.swing.JTextField();
        HargaTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        daftarTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        totalBelanjaTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dibayarTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        kembalianTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Kode");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Harga");

        kodeTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        kodeTextField.setSelectionColor(new java.awt.Color(0, 0, 0));
        kodeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeTextFieldActionPerformed(evt);
            }
        });

        NamaTextField.setEditable(false);
        NamaTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        NamaTextField.setSelectionColor(new java.awt.Color(0, 0, 0));

        HargaTextField.setEditable(false);
        HargaTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        HargaTextField.setSelectionColor(new java.awt.Color(0, 0, 0));

        jScrollPane1.setBackground(new java.awt.Color(230, 230, 230));
        jScrollPane1.setBorder(null);

        daftarTable.setAutoCreateRowSorter(true);
        daftarTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        daftarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No.", "Kode", "Nama", "Harga Satuan", "Kuantitas", "Harga Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        daftarTable.setToolTipText("");
        daftarTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        daftarTable.setGridColor(new java.awt.Color(222, 222, 222));
        daftarTable.setShowGrid(true);
        jScrollPane1.setViewportView(daftarTable);
        if (daftarTable.getColumnModel().getColumnCount() > 0) {
            daftarTable.getColumnModel().getColumn(0).setResizable(false);
            daftarTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            daftarTable.getColumnModel().getColumn(1).setResizable(false);
            daftarTable.getColumnModel().getColumn(1).setPreferredWidth(50);
            daftarTable.getColumnModel().getColumn(2).setResizable(false);
            daftarTable.getColumnModel().getColumn(2).setPreferredWidth(250);
            daftarTable.getColumnModel().getColumn(3).setResizable(false);
            daftarTable.getColumnModel().getColumn(3).setPreferredWidth(70);
            daftarTable.getColumnModel().getColumn(4).setResizable(false);
            daftarTable.getColumnModel().getColumn(4).setPreferredWidth(50);
            daftarTable.getColumnModel().getColumn(5).setPreferredWidth(70);
        }

        totalBelanjaTextField.setEditable(false);

        jLabel4.setText("Total Belanja");

        dibayarTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dibayarTextFieldActionPerformed(evt);
            }
        });
        dibayarTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dibayarTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dibayarTextFieldKeyTyped(evt);
            }
        });

        jLabel5.setText("Jumlah Yang Dibayar");

        kembalianTextField.setEditable(false);
        kembalianTextField.setSelectionColor(new java.awt.Color(0, 0, 0));

        jLabel6.setText("Kembalian");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NamaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HargaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kembalianTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(dibayarTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(totalBelanjaTextField, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(kodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NamaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HargaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(totalBelanjaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dibayarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(kembalianTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
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
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kodeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeTextFieldActionPerformed
        String kodeInput = kodeTextField.getText();

        Barang tempBarang;

        for (int i = 0; i < daftarBarang.size(); i++)
        {
            tempBarang = daftarBarang.get(i);

            //Warning: tempIndex digunakan untuk indexing baris
            //dimulai dari index 0

            int tempIndex = 0;

            if (tempBarang.kode.equals(kodeInput))
            {
                tempIndex = jumlahBelanja;
                
                System.out.println("Barang ditemukan");
                i = daftarBarang.size();
                NamaTextField.setText(tempBarang.nama);
                HargaTextField.setText(Float.toString(tempBarang.harga));
                
                daftarModel.setValueAt(jumlahBelanja+1, tempIndex, 0);
                jumlahBelanja++;
                daftarModel.setValueAt(kodeInput, tempIndex, 1);
                daftarModel.setValueAt(tempBarang.nama, tempIndex, 2);
                daftarModel.setValueAt(tempBarang.harga, tempIndex, 3);
                daftarModel.setValueAt(1, tempIndex, 4);

            }
        }
    }//GEN-LAST:event_kodeTextFieldActionPerformed

    private void dibayarTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dibayarTextFieldActionPerformed
        // TODO add your handling code here:

        String totalBelanjaString = totalBelanjaTextField.getText();
        String dibayarString = dibayarTextField.getText();

        // Replace comma with dot (assuming US locale)
        totalBelanjaString = totalBelanjaString.replaceAll(",", "");
        dibayarString = dibayarString.replaceAll(",", "");

        try {
            float totalBelanja = Float.valueOf(totalBelanjaString);
            float dibayar = Float.valueOf(dibayarString);

            float kembalianFloat = dibayar - totalBelanja;
            int kembalianInt = (int) kembalianFloat;
            kembalianTextField.setText(String.format("%,d", kembalianInt)); // Format kembalian with 2 decimal places

        } catch (NumberFormatException e) {
            System.out.println("Error mengkalkulasi.");
        }

    }//GEN-LAST:event_dibayarTextFieldActionPerformed

    private void dibayarTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dibayarTextFieldKeyTyped
        // TODO add your handling code here:  
    }//GEN-LAST:event_dibayarTextFieldKeyTyped

    private void dibayarTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dibayarTextFieldKeyReleased
        // TODO add your handling code here:
        
        String dibayarString = dibayarTextField.getText();
        dibayarString = dibayarString.replace(",", "");
        
        int dibayarInput = Integer.valueOf(dibayarString);
        dibayarTextField.setText(String.format("%,d", dibayarInput));
        Object[] kembalianInt = null;

    }//GEN-LAST:event_dibayarTextFieldKeyReleased

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
            java.util.logging.Logger.getLogger(POSFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POSFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POSFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POSFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new POSFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField HargaTextField;
    private javax.swing.JTextField NamaTextField;
    private javax.swing.JTable daftarTable;
    private javax.swing.JTextField dibayarTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField kembalianTextField;
    private javax.swing.JTextField kodeTextField;
    private javax.swing.JTextField totalBelanjaTextField;
    // End of variables declaration//GEN-END:variables

}