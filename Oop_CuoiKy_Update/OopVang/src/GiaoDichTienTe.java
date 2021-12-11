public class GiaoDichTienTe extends GiaoDich { //Class này được kế thừa từ class GiaoDich
    public enum LoaiTienTe{ //Dùng để định nghĩa các tập hợp loại tiền tệ
        VND,
        USD,
        EURO
    }
    //Khai báo các thuộc tính của giao dịch tiền tệ
    private double tiGia;
    private LoaiTienTe loaiTienTe;

    public GiaoDichTienTe() { //hàm khởi tạo không tham số để kế thừa class GiaoDich
    }



    public GiaoDichTienTe(int maGD, double donGia, int soLuong, double tiGia, LoaiTienTe loaiTienTe) {//Hàm khởi tạo có tham số thêm các thuộc tính được kế thừa từ class GiaoDich
        super(maGD, donGia, soLuong);
        this.tiGia = tiGia;
        this.loaiTienTe = loaiTienTe;
    }
    //Các phương thức dưới đây dùng để đóng gói các thuộc tính
    public double getTiGia() {
        return tiGia;
    }

    public void setTiGia(double tiGia) {
        this.tiGia = tiGia;
    }

    public LoaiTienTe getLoaiTienTe() {
        return loaiTienTe;
    }

    public void setLoaiTienTe(LoaiTienTe loaiTienTe) {
        this.loaiTienTe = loaiTienTe;
    }

    @Override
    public double thanhTien() {//Được override lại từ phương thức thanhTien bên class GiaoDich và dùng để tinh tiền,nếu là VND chỉ nhân số lượng với đơn giá,còn lại thì nhân thêm
        if(this.getLoaiTienTe().equals(LoaiTienTe.VND)){ // tỉ giá
            return this.getSoLuong()*this.getDonGia();
        }
        else
            return this.getSoLuong()*this.getDonGia()*this.getTiGia();
    }

    @Override
    public void inGiaoDich() { //Dùng để in ra các giá trị của thuộc tính giao dịch tiền tệ  và kế thừa thêm thuộc tính của class GiaoDich
        super.inGiaoDich();
        System.out.printf("|| %-15s || %-15s || %-15s \n",this.getTiGia(),this.getLoaiTienTe(),this.thanhTien());
    }
}

