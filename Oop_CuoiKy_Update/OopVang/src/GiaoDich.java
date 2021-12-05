import java.text.DecimalFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public abstract class GiaoDich {
    private int maGD;
    private Date ngayGD=new Date();
    private double donGia;
    private int soLuong;

    public GiaoDich() {
    }

    public GiaoDich(int maGD, double donGia, int soLuong) {
        super();
        this.maGD = maGD;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public int getMaGD() {
        return maGD;
    }

    public void setMaGD(int maGD) {
        this.maGD = maGD;
    }

    public Date getNgayGD() {
        return ngayGD;
    }

    public void setNgayGD(Date ngayGD) {
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

    public abstract double thanhTien();
    public void inGiaoDich(){
        Format formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String ngayGD = formatter.format(this.getNgayGD());
        System.out.printf("%-15s || %-30s || %-15s || %-15s ",this.getMaGD(),ngayGD,this.getDonGia(),this.getSoLuong());
    };

}
