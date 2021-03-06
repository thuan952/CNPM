/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.ThuPhi;

import models.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class ThuPhiModel implements Serializable {
    private int idHoKhau;
    private int idChuHo;
    private String hoTenChuHo;
    private String diaChiHienNay;
    private int soThanhVien;
    private int soTien;
//    private boolean trangThai;
    private Date ngayNop;
    private String ghiChu;
    private int idDotThu;
    private String tenDotThu;
    private String loaiPhiThu;

    public int getIdDotThu() {
        return idDotThu;
    }

    public void setIdDotThu(int idDotThu) {
        this.idDotThu = idDotThu;
    }

    public String getTenDotThu() {
        return tenDotThu;
    }

    public void setTenDotThu(String tenDotThu) {
        this.tenDotThu = tenDotThu;
    }

    public String getLoaiPhiThu() {
        return loaiPhiThu;
    }

    public void setLoaiPhiThu(String loaiPhiThu) {
        this.loaiPhiThu = loaiPhiThu;
    }
    
    

    public int getIdHoKhau() {
        return idHoKhau;
    }

    public void setIdHoKhau(int idHoKhau) {
        this.idHoKhau = idHoKhau;
    }

    public int getIdChuHo() {
        return idChuHo;
    }

    public void setIdChuHo(int idChuHo) {
        this.idChuHo = idChuHo;
    }

    public String getHoTenChuHo() {
        return hoTenChuHo;
    }

    public void setHoTenChuHo(String hoTenChuHo) {
        this.hoTenChuHo = hoTenChuHo;
    }

    public String getDiaChiHienNay() {
        return diaChiHienNay;
    }

    public void setDiaChiHienNay(String diaChiHienNay) {
        this.diaChiHienNay = diaChiHienNay;
    }

    public int getSoThanhVien() {
        return soThanhVien;
    }

    public void setSoThanhVien(int soThanhVien) {
        this.soThanhVien = soThanhVien;
    }

    public int getSoTien() {
        return soTien;
    }

    public void setSoTien(int soTien) {
        this.soTien = soTien;
    }

    public Date getNgayNop() {
        return ngayNop;
    }

    public void setNgayNop(Date ngayNop) {
        this.ngayNop = ngayNop;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
    
    
}
