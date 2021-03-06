/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.ThuPhi;

import services.ThuPhiService;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import models.ThuPhi.ThongTinThuPhiModel;
import models.ThuPhi.ThuPhiModel;
import services.MysqlConnection;
import services.StringService;
import utility.TableModelThuPhi;

/**
 *
 * @author ADMIN
 */
public class PhiDongGopController {

    //tab2
    private JPanel jpnView2;
    private JComboBox jcbDotDongGop;
    private JButton btnXemDanhSach;
    private JButton btnPrint2;

    private JLabel jlbsoHo;
    private JLabel jlbsoTien;

    //tab3
    private JPanel jpnView3;
    private JComboBox jcbTimKiem;
    private JTextField jtfTimKiem;
    private JButton btnThongKe;
    private JButton btnPrint3;
    private JLabel jlbKetQua;

    private TableModelThuPhi classTableModel = null;

    private ThuPhiService thuPhiService = null;

    private final String[] COLUMNS1 = {"ID hộ khẩu", "Tên chủ hộ", "Số tiền (VNĐ)", "Ngày thu", "Ghi chú"};

    private final String[] COLUMNS2 = {"ID hộ khẩu", "Tên chủ hộ", "Số tiền (VNĐ)", "Tên đợt thu", "Ngày thu"};

    public PhiDongGopController(JPanel jpnView2, JComboBox jcbDotDongGop, JButton btnXemDanhSach,
            JButton btnPrint2, JLabel jlbsoHo, JLabel jlbsoTien, JPanel jpnView3, JComboBox jcbTimKiem,
            JTextField jtfTimKiem, JButton btnThongKe, JButton btnPrint3, JLabel jlbKetQua) {
        this.jpnView2 = jpnView2;
        this.jcbDotDongGop = jcbDotDongGop;
        this.btnXemDanhSach = btnXemDanhSach;
        this.btnPrint2 = btnPrint2;
        this.jlbsoHo = jlbsoHo;
        this.jlbsoTien = jlbsoTien;

        this.jpnView3 = jpnView3;
        this.jcbTimKiem = jcbTimKiem;
        this.jtfTimKiem = jtfTimKiem;
        this.btnThongKe = btnThongKe;
        this.btnPrint3 = btnPrint3;
        this.jlbKetQua = jlbKetQua;

        this.classTableModel = new TableModelThuPhi();
        this.thuPhiService = new ThuPhiService();
    }

    public void setDataComboBox() {
        Connection cons = MysqlConnection.getMysqlConnection();
        String sql = "SELECT * FROM dot_thu WHERE loaiPhiThu = 0";
        try {
            PreparedStatement ps = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                jcbDotDongGop.addItem(rs.getString("tenDotThu"));
            }
            ps.close();
            cons.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //table thống kê theo đợt đóng góp
    public void setDataToTable1() {

        String dotDongGop = StringService.covertToString((String) this.jcbDotDongGop.getSelectedItem());
        List<ThongTinThuPhiModel> listItem = thuPhiService.getListDongGop(dotDongGop);

        DefaultTableModel model = classTableModel.setTablePhiDongGop(listItem, COLUMNS1);
        JTable table = new JTable(model);

        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        table.getTableHeader().setPreferredSize(new Dimension(100, 50));
        table.setRowHeight(50);
        table.validate();
        table.repaint();
        table.setFont(new Font("Arial", Font.PLAIN, 14));

        table.getColumnModel().getColumn(0).setMaxWidth(100);
        table.getColumnModel().getColumn(0).setMinWidth(100);
        table.getColumnModel().getColumn(0).setPreferredWidth(100);

        JScrollPane scroll = new JScrollPane();
        scroll.getViewport().add(table);

        jpnView2.removeAll();
        jpnView2.setLayout(new CardLayout());
        jpnView2.add(scroll);
        jpnView2.validate();
        jpnView2.repaint();

        //Tổng số số hộ, số tiền
        int soHo = table.getRowCount();
        jlbsoHo.setText(Integer.toString(soHo));
        int sum = 0;
        for (int i = 0; i < soHo; i++) {
            sum = sum + Integer.parseInt(table.getValueAt(i, 2).toString());
        }
        jlbsoTien.setText(Integer.toString(sum) + " đ");

        //button PRINT
        btnPrint2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                try {
                    table.print();
                } catch (PrinterException ex) {
                    Logger.getLogger(PhiVeSinhController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

    }

    //table thống kê theo từng hộ
    public void setDataToTable2() {
        String tenChuHo = "";
        int idHoKhau = 0;

        String Status = StringService.covertToString((String) this.jcbTimKiem.getSelectedItem());

        try {
            if (Status.equalsIgnoreCase("ID Ho khau")) {
                if (!this.jtfTimKiem.getText().trim().isEmpty()) {
                    idHoKhau = Integer.parseInt(this.jtfTimKiem.getText().trim());
                }
            }
            if (Status.equalsIgnoreCase("Ten chu ho")) {
                if (!this.jtfTimKiem.getText().trim().isEmpty()) {
                    tenChuHo = (this.jtfTimKiem.getText().trim());
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(jtfTimKiem, "Vui lòng nhập đúng kiểu dữ liệu!!", "Warring", JOptionPane.ERROR_MESSAGE);
        }

        List<ThongTinThuPhiModel> listItem = thuPhiService.thongKeThuPhiTheoHo(tenChuHo, idHoKhau, Status);

        DefaultTableModel model = classTableModel.setTableTKTheoHo(listItem, COLUMNS2);
        JTable table = new JTable(model);

        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        table.getTableHeader().setPreferredSize(new Dimension(100, 50));
        table.setRowHeight(50);
        table.validate();
        table.repaint();
        table.setFont(new Font("Arial", Font.PLAIN, 14));

        table.getColumnModel().getColumn(0).setMaxWidth(100);
        table.getColumnModel().getColumn(0).setMinWidth(100);
        table.getColumnModel().getColumn(0).setPreferredWidth(100);

        JScrollPane scroll = new JScrollPane();
        scroll.getViewport().add(table);

        jpnView3.removeAll();
        jpnView3.setLayout(new CardLayout());
        jpnView3.add(scroll);
        jpnView3.validate();
        jpnView3.repaint();

        //Số kết quả
        jlbKetQua.setText("Tìm thấy " + table.getRowCount() + " kết quả!");

        //button PRINT
        btnPrint3.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                try {
                    table.print();
                } catch (PrinterException ex) {
                    Logger.getLogger(PhiVeSinhController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

    }

    public void setEvent() {
        btnXemDanhSach.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                try {
                    setDataToTable1();
                } catch (Exception ex) {
                    Logger.getLogger(PhiVeSinhController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        btnThongKe.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (jtfTimKiem.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập thông tin cần tìm", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    try {
                        setDataToTable2();
                    } catch (Exception ex) {
                        Logger.getLogger(PhiVeSinhController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });

    }

}
