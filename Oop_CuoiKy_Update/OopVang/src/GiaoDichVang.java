import java.text.DecimalFormat;
import java.lang.String;
public class GiaoDichVang extends GiaoDich {
    private String loaiVang;

    public GiaoDichVang() {
    }

    public GiaoDichVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    public GiaoDichVang(int maGD, double donGia, int soLuong, String loaiVang) {
        super(maGD, donGia, soLuong);
        this.loaiVang = loaiVang;
    }

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    @Override
    public double thanhTien() {
        return this.getSoLuong() * this.getDonGia();
    }

    @Override
    public void inGiaoDich() {
        super.inGiaoDich();
        System.out.printf("|| %-15s||%-15s\n",this.getLoaiVang(),this.thanhTien());
    }
}
