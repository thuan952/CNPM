/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.biendoinhaukhau;

import Controller.KhaiTuController;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.KhaiTuModel;
import models.NhanKhauModel1;
import services.MysqlConnection;
import utility.TableKhaiTu;

/**
 *
 * @author THUAN.HQ183840
 */
public class KhaiTuFrame extends javax.swing.JFrame {

    KhaiTuModel kt = new KhaiTuModel();
    KhaiTuController ktc = new KhaiTuController();
    NhanKhauModel1 nk = new NhanKhauModel1();

    public KhaiTuFrame() {
        initComponents();
        btnDangKy.setEnabled(false);
        jdNgayChet.setEnabled(false);
        jdNgayKhai.setEnabled(false);
        txtLyDoChet.setEnabled(false);
        btnCheckNC.setEnabled(false);
        txtCMNDNguoiChet.setEnabled(false);
        txtID.setEnabled(false);
        btnCheckID.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
     public boolean checkDate() {
       if(jdNgayChet.getDate().before(jdNgayKhai.getDate()))
           return true;
       else
           return false;
   }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCMNDNguoiKhai = new javax.swing.JTextField();
        txtCMNDNguoiChet = new javax.swing.JTextField();
        jdNgayKhai = new com.toedter.calendar.JDateChooser();
        jdNgayChet = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLyDoChet = new javax.swing.JTextArea();
        btnCheckNK = new javax.swing.JButton();
        btnCheckNC = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnCheckID = new javax.swing.JButton();
        btnDangKy = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Đăng ký khai tử");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Đăng Ký Khai Tử");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nhập số CMND / CCCD người khai");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nhập số CMND / CCCD người chết");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Ngày khai tử");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Ngày chết");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Lý do chết");

        jdNgayKhai.setDateFormatString("yyyy-MM-dd");

        jdNgayChet.setDateFormatString("yyyy-MM-dd");

        txtLyDoChet.setColumns(20);
        txtLyDoChet.setRows(5);
        jScrollPane1.setViewportView(txtLyDoChet);

        btnCheckNK.setText("Kiểm tra");
        btnCheckNK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckNKActionPerformed(evt);
            }
        });

        btnCheckNC.setText("Kiểm tra");
        btnCheckNC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckNCActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 0, 51));
        jLabel25.setText("*");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 0, 51));
        jLabel26.setText("*");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 0, 51));
        jLabel27.setText("*");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 0, 51));
        jLabel28.setText("*");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 0, 51));
        jLabel29.setText("*");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Nhập ID nhân khẩu người chết");

        jLabel8.setText("hoặc");

        btnCheckID.setText("Kiểm tra");
        btnCheckID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jdNgayKhai, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel27))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jdNgayChet, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel28))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(txtCMNDNguoiChet)
                                    .addComponent(txtCMNDNguoiKhai))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnCheckID)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel25)
                                                .addComponent(jLabel26))
                                            .addGap(42, 42, 42)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(btnCheckNK)
                                                .addComponent(btnCheckNC)))))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCMNDNguoiKhai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCheckNK)
                            .addComponent(jLabel25))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCMNDNguoiChet, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCheckNC)
                            .addComponent(jLabel26))
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(btnCheckID))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdNgayKhai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdNgayChet, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );

        btnDangKy.setBackground(new java.awt.Color(255, 0, 51));
        btnDangKy.setForeground(new java.awt.Color(255, 255, 255));
        btnDangKy.setText("Đăng ký");
        btnDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKyActionPerformed(evt);
            }
        });

        btnHuy.setBackground(new java.awt.Color(0, 51, 255));
        btnHuy.setForeground(new java.awt.Color(255, 255, 255));
        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnHuy)
                        .addGap(58, 58, 58)
                        .addComponent(btnDangKy)))
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangKy)
                    .addComponent(btnHuy))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   public void reset() {
        txtCMNDNguoiChet.setText("");
        txtCMNDNguoiKhai.setText("");
        txtLyDoChet.setText("");
        jdNgayChet.setCalendar(null);
        jdNgayKhai.setCalendar(null);
        btnDangKy.setEnabled(false);
        jdNgayChet.setEnabled(false);
        jdNgayKhai.setEnabled(false);
        txtCMNDNguoiChet.setEnabled(false);
        txtLyDoChet.setEnabled(false);
        btnCheckNC.setEnabled(false);
        txtID.setEnabled(false);
         btnCheckID.setEnabled(false);
    }
    private void btnCheckNKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckNKActionPerformed
        String tempCMT = this.txtCMNDNguoiKhai.getText().trim();

        if (tempCMT.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin số CMND/CCCD!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            try {
                int cmt = Integer.parseInt(tempCMT);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập số CMND/CCCD đúng định dạng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                if (JOptionPane.showConfirmDialog(null, "Bạn có muốn tiếp tục không ?", "Xác nhận", JOptionPane.YES_NO_OPTION) != 0) {
                    dispose();

                }
                txtCMNDNguoiKhai.setText("");
                return;
            }
        }
        nk.setSoCMT(txtCMNDNguoiKhai.getText());
        kt.setSoCMND(txtCMNDNguoiChet.getText());
        
        if (ktc.checkCMND(nk)) {
            kt.setIdNguoiKhai(nk.getID());
            btnCheckNC.setEnabled(true);
            txtCMNDNguoiChet.setEnabled(true);
            txtID.setEnabled(true);
             btnCheckID.setEnabled(true);
        }
     else {
            JOptionPane.showMessageDialog(null, "Không tìm thấy nhân khẩu trong hệ thống", "Lỗi",JOptionPane.ERROR_MESSAGE);
           if (JOptionPane.showConfirmDialog(null, "Bạn có muốn tiếp tục không ?", "Xác nhận", JOptionPane.YES_NO_OPTION) != 0) {
                    dispose();
                }
                txtCMNDNguoiKhai.setText("");
                return;
        }
        

    }//GEN-LAST:event_btnCheckNKActionPerformed

    private void btnCheckNCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckNCActionPerformed
        String tempCMT = this.txtCMNDNguoiChet.getText().trim();
        if (tempCMT.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin số CMND/CCCD!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            try {
                int cmt = Integer.parseInt(tempCMT);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập số CMND/CCCD đúng định dạng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                if (JOptionPane.showConfirmDialog(null, "Bạn có muốn tiếp tục không ?", "Xác nhận", JOptionPane.YES_NO_OPTION) != 0) {
                    dispose();

                }
                txtCMNDNguoiChet.setText("");
                return;
            }
        }

         nk.setSoCMT(txtCMNDNguoiChet.getText());
         kt.setSoCMND(txtCMNDNguoiChet.getText());
         kt.setIdNguoiChet(nk.getID());
       
        if (ktc.checkID(kt)) {
            if(ktc.checkCMND(nk)) {
            kt.setIdNguoiChet(nk.getID());
            kt.setHoTen(nk.getHoTen());
            kt.setNgaySinh(nk.getNamSinh());
            kt.setGioiTinh(nk.getGioiTinh());
            kt.setSoCMND(nk.getSoCMT());
            txtID.setEnabled(false);
            btnCheckID.setEnabled(false);
            if (kt.getIdNguoiChet() == kt.getIdNguoiKhai()) {
                JOptionPane.showMessageDialog(null, "Số CMND / CCCD người khai và người chết phải khác nhau !", "Lỗi", JOptionPane.ERROR_MESSAGE);
                if (JOptionPane.showConfirmDialog(null, "Bạn có muốn tiếp tục không ?", "Xác nhận", JOptionPane.YES_NO_OPTION) != 0) {
                    dispose();
                    }
               txtCMNDNguoiChet.setText("");
                return;
                }
             else {
              
                btnDangKy.setEnabled(true);
                jdNgayChet.setEnabled(true);
                jdNgayKhai.setEnabled(true);
                txtLyDoChet.setEnabled(true);
            } 
             
            }
            else {
                   JOptionPane.showMessageDialog(null, "Không tìm thấy nhân khẩu trong hệ thống !", "Lỗi",JOptionPane.ERROR_MESSAGE);
                if (JOptionPane.showConfirmDialog(null, "Bạn có muốn tiếp tục không ?", "Xác nhận", JOptionPane.YES_NO_OPTION) != 0) {
                    dispose();
                    }
                txtCMNDNguoiChet.setText("");
                txtID.setEnabled(true);
                btnCheckID.setEnabled(true);   
                return;
                    }
        }
         else {
                JOptionPane.showMessageDialog(null, "Nhân khẩu đã được khai tử trước đây !", "Lỗi",JOptionPane.ERROR_MESSAGE);
                if (JOptionPane.showConfirmDialog(null, "Bạn có muốn tiếp tục không ?", "Xác nhận", JOptionPane.YES_NO_OPTION) != 0) {
                    dispose();
                    }
                txtCMNDNguoiChet.setText("");
                return;
                 }

    }//GEN-LAST:event_btnCheckNCActionPerformed

    private void btnDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyActionPerformed

        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        kt.setNgayKhai(jdNgayKhai.getDate());
        kt.setNgayChet(jdNgayChet.getDate());
        kt.setLyDoChet(txtLyDoChet.getText());
        
        String d = "0000-00-00";

        try {
            if (txtCMNDNguoiKhai.getText().trim().isEmpty()
                    || jdNgayChet.getDate() == null || jdNgayKhai.getDate() == null || txtLyDoChet.getText().trim().isEmpty()) {
                java.util.Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(d);
                kt.setNgayKhai(date2);
                kt.setNgayChet(date2);
                JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin các trường bắt buộc!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                if (JOptionPane.showConfirmDialog(null, "Bạn có muốn tiếp tục không ?", "Xác nhận", JOptionPane.YES_NO_OPTION) != 0) {
                    dispose();
                }
            } 
            else {
                if(checkDate()) {
                 if(ktc.dangKyKhaiTu(kt)) {
                     JOptionPane.showMessageDialog(null, "Đăng ký khai tử thành công!");
                     ktc.xoaThanhVien(nk);
                     ktc.xoaNhanKhau(nk);
                     TableKhaiTu tb = new TableKhaiTu();
                     tb.setLocationRelativeTo(null);
                     tb.setResizable(true);
                     tb.setVisible(true);
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, "Ngày chết phải trước ngày khai !", "Lỗi",JOptionPane.ERROR_MESSAGE);
                    if (JOptionPane.showConfirmDialog(null, "Bạn có muốn tiếp tục không ?", "Xác nhận", JOptionPane.YES_NO_OPTION) != 0) {
                    dispose();
               }
                jdNgayChet.setCalendar(null);
                return;
            }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Đăng ký khai tử thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btnDangKyActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        reset();
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnCheckIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckIDActionPerformed
      
        if (txtID.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin ID nhân khẩu !", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            try {
                int cmt = Integer.parseInt(txtID.getText().trim());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập ID đúng định dạng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                if (JOptionPane.showConfirmDialog(null, "Bạn có muốn tiếp tục không ?", "Xác nhận", JOptionPane.YES_NO_OPTION) != 0) {
                    dispose();

                }
                txtID.setText("");
                return;
            }
        }
         nk.setID(Integer.parseInt(txtID.getText()));
         nk.setSoCMT(txtCMNDNguoiChet.getText());
         kt.setSoCMND(txtCMNDNguoiChet.getText());
         kt.setIdNguoiChet(nk.getID());
         txtCMNDNguoiChet.setEnabled(false);
         btnCheckNC.setEnabled(false);
       
        if (ktc.IDNC(kt)) {
            if(ktc.CheckIDNC(nk)) {
            kt.setIdNguoiChet(nk.getID());
            kt.setHoTen(nk.getHoTen());
            kt.setNgaySinh(nk.getNamSinh());
            kt.setGioiTinh(nk.getGioiTinh());
            kt.setSoCMND(nk.getSoCMT());
            btnDangKy.setEnabled(true);
            jdNgayChet.setEnabled(true);
            jdNgayKhai.setEnabled(true);
            txtLyDoChet.setEnabled(true);
            
             
            }
            else {
                   JOptionPane.showMessageDialog(null, "Không tìm thấy nhân khẩu trong hệ thống !", "Lỗi",JOptionPane.ERROR_MESSAGE);
                if (JOptionPane.showConfirmDialog(null, "Bạn có muốn tiếp tục không ?", "Xác nhận", JOptionPane.YES_NO_OPTION) != 0) {
                    dispose();
                    }
                txtCMNDNguoiChet.setEnabled(true);
                btnCheckNC.setEnabled(true);    
                txtID.setText("");
                return;
                    }
        }
         else {
                JOptionPane.showMessageDialog(null, "Nhân khẩu đã được khai tử trước đây !", "Lỗi",JOptionPane.ERROR_MESSAGE);
                if (JOptionPane.showConfirmDialog(null, "Bạn có muốn tiếp tục không ?", "Xác nhận", JOptionPane.YES_NO_OPTION) != 0) {
                    dispose();
                    }
                txtID.setText("");
                return;
                 }
    }//GEN-LAST:event_btnCheckIDActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckID;
    private javax.swing.JButton btnCheckNC;
    private javax.swing.JButton btnCheckNK;
    private javax.swing.JButton btnDangKy;
    private javax.swing.JButton btnHuy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private com.toedter.calendar.JDateChooser jdNgayChet;
    private com.toedter.calendar.JDateChooser jdNgayKhai;
    private javax.swing.JTextField txtCMNDNguoiChet;
    private javax.swing.JTextField txtCMNDNguoiKhai;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextArea txtLyDoChet;
    // End of variables declaration//GEN-END:variables
}
