public class GiaoDichTienTe extends GiaoDich {
    public enum LoaiTienTe{
        VND,
        USD,
        EURO
    }

    private double tiGia;
    private LoaiTienTe loaiTienTe;

    public GiaoDichTienTe() {
    }

    public GiaoDichTienTe(double tiGia, LoaiTienTe loaiTienTe) {
        this.tiGia = tiGia;
        this.loaiTienTe = loaiTienTe;
    }

    public GiaoDichTienTe(int maGD, double donGia, int soLuong, double tiGia, LoaiTienTe loaiTienTe) {
        super(maGD, donGia, soLuong);
        this.tiGia = tiGia;
        this.loaiTienTe = loaiTienTe;
    }

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
    public double thanhTien() {
        if(this.getLoaiTienTe().equals(LoaiTienTe.VND)){
            return this.getSoLuong()*this.getDonGia();
        }
        else
            return this.getSoLuong()*this.getDonGia()*this.getTiGia();
    }

    @Override
    public void inGiaoDich() {
        super.inGiaoDich();
        System.out.printf("|| %-15s || %-15s || %-15s \n",this.getTiGia(),this.getLoaiTienTe(),this.thanhTien());
    }
}

