/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package views.biendoinhaukhau;

import View.ChucNang;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import models.TamTruModel;
import services.TamTruService;

/**
 *
 * @author Khac Tao
 */
public class QuanLyTamTruFrame extends javax.swing.JFrame {
    TamTruService tamTruService;
    DefaultTableModel defaultTableModel;
    /** Creates new form QuanLyTamTruFrame */
    public QuanLyTamTruFrame() {
        initComponents();
        tamTruService = new TamTruService();
        defaultTableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        tamTruTable.setModel(defaultTableModel);
        defaultTableModel.addColumn("Mã Hộ khẩu tạm trú");
        defaultTableModel.addColumn("Mã giấy tạm trú");
        defaultTableModel.addColumn("Họ tên");
        defaultTableModel.addColumn("Ngày chuyển đến");
        defaultTableModel.addColumn("Ngày chuyển đi");
        defaultTableModel.addColumn("Trạng thái");
        
        setTableData(tamTruService.getAllTamTru());
    }
    private void setTableData(List<TamTruModel> tamTruList){
        for(TamTruModel tamtru : tamTruList){
            defaultTableModel.addRow(new Object[]{tamtru.getMaHoKhauTamTru(), tamtru.getMaGiayTamTru(), tamtru.getHoten(), tamtru.getNgayChuyenDen(),
            tamtru.getNgayChuyenDi(), tamtru.getTrangThai()});
        }
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tamTruTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        maGiayText = new javax.swing.JTextField();
        maDonSearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        maChuHoText = new javax.swing.JTextField();
        maChuHoSearch = new javax.swing.JButton();
        addButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("DANH SÁCH TẠM TRÚ TRÊN ĐỊA BÀN");

        tamTruTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã đơn", "Họ tên", "Từ ngày", "Đến ngày", "Trạng thái đơn", "Thời gian còn lại"
            }
        ));
        tamTruTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tamTruTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tamTruTable.setShowGrid(false);
        jScrollPane1.setViewportView(tamTruTable);

        backButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 51, 51));
        backButton.setText("Quay lại");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        maDonSearch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        maDonSearch.setText("Tìm kiếm");
        maDonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maDonSearchActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Tìm kiếm theo mã giấy");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Tìm kiếm theo mã chủ hộ");

        maChuHoSearch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        maChuHoSearch.setText("Tìm kiếm");
        maChuHoSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maChuHoSearchActionPerformed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(51, 51, 255));
        addButton.setText("Thêm mới");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(92, 92, 92)
                                .addComponent(addButton)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(maChuHoText, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(maChuHoSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(maGiayText, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maDonSearch)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(62, 62, 62))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backButton)
                    .addComponent(addButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maGiayText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maDonSearch)
                    .addComponent(maChuHoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maChuHoSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        new DangKiTamTruFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
       new ChucNang().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void maChuHoSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maChuHoSearchActionPerformed
        // TODO add your handling code here:
        String maChuHo = maChuHoText.getText();
        defaultTableModel.setRowCount(0);
        setTableData(tamTruService.searchTamTru(maChuHo));
    }//GEN-LAST:event_maChuHoSearchActionPerformed

    private void maDonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maDonSearchActionPerformed
        // TODO add your handling code here:
        String maGiay = maGiayText.getText();
        defaultTableModel.setRowCount(0);
        setTableData(tamTruService.searchMaGiay(maGiay));
    }//GEN-LAST:event_maDonSearchActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyTamTruFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyTamTruFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyTamTruFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyTamTruFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyTamTruFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton maChuHoSearch;
    private javax.swing.JTextField maChuHoText;
    private javax.swing.JButton maDonSearch;
    private javax.swing.JTextField maGiayText;
    private javax.swing.JTable tamTruTable;
    // End of variables declaration//GEN-END:variables

}
