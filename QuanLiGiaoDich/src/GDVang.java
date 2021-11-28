import java.time.LocalDate;

public class GDVang extends GiaoDich{
    private String loaiVang;

    public String getLoaiVang() {
        return loaiVang;
    }
    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    public GDVang(String maGD, LocalDate ngayGD, int donGia, int soLuong, String loaiVang){
        super(maGD, ngayGD, donGia, soLuong);
        this.loaiVang = loaiVang;
    }

    @Override
    public int getThanhTien() {
        return getSoLuong()*getDonGia();
    }
    public static String getTitle(){
        return String.format("%10s||%15s||%15s",GiaoDich.getTitle(), "Loại Vàng", "Thành Tiền");
    }
    public String toString(){
        return String.format("%s||%15s||%15s", super.toString(),getLoaiVang(), getThanhTien());

    }
}
