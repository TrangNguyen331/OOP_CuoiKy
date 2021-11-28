import java.time.LocalDate;
public abstract class GiaoDich {
    private String maGD;
    private LocalDate ngayGD;
    private int donGia;
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
    public int getDonGia() {
        return donGia;
    }
    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public GiaoDich(String maGD, LocalDate ngayGD, int donGia, int soLuong){
        super();
        this.maGD = maGD;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
    public GiaoDich(int i, int count){
        this("-----", LocalDate.now(),0,0);
    }

    public int getThanhTien(){
        return getSoLuong()*getDonGia();
    }

    public static String getTitle() {
        return String.format("%10s||%15s||%15s||%15s","Mã GD", "Ngày GD","Đơn Giá","Số Lượng" );
    }
    public String toString(){
        return String.format("%10s||%15s||%15s||%15d",maGD, ngayGD,donGia,soLuong);
    }
}
