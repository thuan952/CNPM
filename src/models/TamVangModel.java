package models;

import java.util.Date;

/**
 *
 * @author Khac Tao
 */
public class TamVangModel {
    private int maGiayTamVang;
    private String noiTamTru;
    private Date vangTuNgay;
    private Date vangDenNgay;
    private String lyDo;
    private String trangThai;
    private int idNhanKhau;

    public int getIdNhanKhau() {
        return idNhanKhau;
    }

    public void setIdNhanKhau(int idNhanKhau) {
        this.idNhanKhau = idNhanKhau;
    }

    public TamVangModel() {
        
    }

    public int getMaGiayTamVang() {
        return maGiayTamVang;
    }

    public void setMaGiayTamVang(int maGiayTamVang) {
        this.maGiayTamVang = maGiayTamVang;
    }

    public String getNoiTamTru() {
        return noiTamTru;
    }

    public void setNoiTamTru(String noiTamTru) {
        this.noiTamTru = noiTamTru;
    }

    public Date getVangTuNgay() {
        return vangTuNgay;
    }

    public void setVangTuNgay(Date vangTuNgay) {
        this.vangTuNgay = vangTuNgay;
    }

    public Date getVangDenNgay() {
        return vangDenNgay;
    }

    public void setVangDenNgay(Date vangDenNgay) {
        this.vangDenNgay = vangDenNgay;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}
