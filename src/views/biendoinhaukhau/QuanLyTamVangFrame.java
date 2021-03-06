/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.biendoinhaukhau;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.TamVangModel;
import services.TamVangService;

/**
 *
 * @author Khac Tao
 */
public class QuanLyTamVangFrame extends javax.swing.JFrame {
    TamVangService tamVangService;
    DefaultTableModel defaultTableModel;
    /**
     * Creates new form QuanLyTamVangFrame
     */
    public QuanLyTamVangFrame() {
        initComponents();
        tamVangService = new TamVangService();
        
        defaultTableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        tamVangTable.setModel(defaultTableModel);
        
        defaultTableModel.addColumn("ID Nhân khẩu");
        defaultTableModel.addColumn("Mã giấy tạm vắng");
        defaultTableModel.addColumn("Vắng từ ngày");
        defaultTableModel.addColumn("Vắng đến ngày");
        defaultTableModel.addColumn("Nơi tạm trú");
        defaultTableModel.addColumn("Trạng thái");
        
        setTableData(tamVangService.getAllTamVang());
    }
    private void setTableData(List<TamVangModel> tamVangList){
        for(TamVangModel tamvang : tamVangList){
            defaultTableModel.addRow(new Object[]{tamvang.getIdNhanKhau(), tamvang.getMaGiayTamVang(), tamvang.getVangTuNgay(),
            tamvang.getVangDenNgay(), tamvang.getNoiTamTru(), tamvang.getTrangThai()});
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tamVangTable = new javax.swing.JTable();
        maGiayText = new javax.swing.JTextField();
        maGiaySearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        maNhanKhauText = new javax.swing.JTextField();
        maNhanKhauSearch = new javax.swing.JButton();
        addButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("DANH SÁCH ĐĂNG KÍ TẠM VẮNG TRÊN ĐỊA BÀN");

        backButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 51, 51));
        backButton.setText("Quay lại");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        tamVangTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã đơn", "Họ tên", "Tạm vắng từ ngày", "Đến ngày", "Nơi thường trú", "Mã hộ"
            }
        ));
        jScrollPane1.setViewportView(tamVangTable);

        maGiaySearch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        maGiaySearch.setText("Tìm kiếm");
        maGiaySearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maGiaySearchActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Tìm kiếm theo mã giấy");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Tìm kiếm theo mã nhân khẩu");

        maNhanKhauSearch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        maNhanKhauSearch.setText("Tìm kiếm");
        maNhanKhauSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maNhanKhauSearchActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(76, 76, 76)
                        .addComponent(addButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(maNhanKhauText, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(maNhanKhauSearch)))
                        .addGap(329, 329, 329)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(maGiayText, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maGiaySearch))
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backButton)
                    .addComponent(addButton)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maGiayText, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maGiaySearch))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maNhanKhauText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maNhanKhauSearch))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        new DangKiTamVangFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void maNhanKhauSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maNhanKhauSearchActionPerformed
        // TODO add your handling code here:
        int maNhanKhau = Integer.parseInt(maNhanKhauText.getText());
        defaultTableModel.setRowCount(0);
        setTableData(tamVangService.searchNhanKhau(maNhanKhau));
    }//GEN-LAST:event_maNhanKhauSearchActionPerformed

    private void maGiaySearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maGiaySearchActionPerformed
        // TODO add your handling code here:
        String maGiay = maGiayText.getText();
        defaultTableModel.setRowCount(0);
        setTableData(tamVangService.searchTamVang(maGiay));
    }//GEN-LAST:event_maGiaySearchActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int a = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không?", "Chú ý", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            dispose();
        } else {
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton maGiaySearch;
    private javax.swing.JTextField maGiayText;
    private javax.swing.JButton maNhanKhauSearch;
    private javax.swing.JTextField maNhanKhauText;
    private javax.swing.JTable tamVangTable;
    // End of variables declaration//GEN-END:variables
}
