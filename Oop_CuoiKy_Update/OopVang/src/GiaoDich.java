import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class GiaoDich { //Khai báo các thuộc tính của giao dịch ở phạm vi private
    private int maGD;
    private Date ngayGD=new Date();
    private double donGia;
    private int soLuong;

    public GiaoDich() { // Hàm khởi tạo không tham số dùng để khởi tạo đối tượng để mấy class con kế thừa
    }

    public GiaoDich(int maGD, double donGia, int soLuong) { //Hàm khởi tạo có tham số
        super();
        this.maGD = maGD;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
    //Các phương thức dưới đây dùng để đóng gói các thuộc tính
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

    public abstract double thanhTien(); //Dùng để trừu tượng cho 2 lớp con override lại phương thức này
    public void inGiaoDich(){ //Dùng để in ra các giá trị của thuộc tính theo từng cột tiêu đề
        Format formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //Dùng để tạo ra ngày tháng,giờ đã nhập giao dịch
        String ngayGD = formatter.format(this.getNgayGD());
        System.out.printf("%-15s || %-30s || %-15s || %-15s ",this.getMaGD(),ngayGD,this.getDonGia(),this.getSoLuong());
    };

}
