import java.lang.String;
public class GiaoDichVang extends GiaoDich {//Class này được kế thừa từ class GiaoDich
    private String loaiVang; //khai báo thuộc tính

    public GiaoDichVang() {//hàm khởi tạo không tham số để kế thừa class GiaoDich
    }

    public GiaoDichVang(String loaiVang) {
        this.loaiVang = loaiVang;
    } //đóng gói thuộc tính

    public GiaoDichVang(int maGD, double donGia, int soLuong, String loaiVang) { //Hàm khởi tạo có tham số thêm các thuộc tính được kế thừa từ class GiaoDich
        super(maGD, donGia, soLuong);
        this.loaiVang = loaiVang;
    }
    // dùng để đóng gói các thuộc tính
    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    @Override
    public double thanhTien() {//Được override lại từ phương thức thanhTien bên class GiaoDich và tính tiền bằng số lượng nhân đơn giá
        return this.getSoLuong() * this.getDonGia();
    }

    @Override
    public void inGiaoDich() {//Dùng để in ra các giá trị của thuộc tính giao dịch vàng  và kế thừa thêm thuộc tính của class GiaoDich
        super.inGiaoDich();
        System.out.printf("|| %-15s||%-15s\n",this.getLoaiVang(),this.thanhTien());
    }
}
