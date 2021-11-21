import java.time.LocalDate;
public abstract class GiaoDich {
    private String maGD;
    private LocalDate ngayGD;
    private double donGia;
    private int soLuong;

    public String getMaGD() {
        return maGD;
    }
    public void setMaGD(String maGD) {
        this.maGD = maGD;
    }
    public LocalDate getNgayGD() {
        return ngayGD;
    }
    public void setNgayGD(LocalDate ngayGD) {
        this.ngayGD = ngayGD;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
