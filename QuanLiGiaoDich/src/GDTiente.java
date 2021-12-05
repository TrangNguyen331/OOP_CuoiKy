import java.time.LocalDate;
public class GDTiente extends GiaoDich{
    private int tiGia;
    private String tienTe;
    //đóng gói
    public int getTiGia() {
        return tiGia;
    }
    public void setTiGia(int tiGia) {
        this.tiGia = tiGia;
    }

    public String getTienTe() {
        return tienTe;
    }
    public void setTienTe(String tienTe) {
        if(tienTe.equalsIgnoreCase("VND") ||
                tienTe.equalsIgnoreCase("USD") ||
                tienTe.equalsIgnoreCase("EURO"))
            this.tienTe = tienTe;
        else
            this.tienTe="-----";
    }
    //khởi tạo
    public GDTiente(String maGD, LocalDate ngayGD, int donGia, int soLuong, int tiGia, String tienTe){
        super(maGD, ngayGD, donGia, soLuong);
        this.tiGia = tiGia;
        this.tienTe = tienTe;
    }
    public GDTiente(){
        this("-----", LocalDate.now(), 0, 0,0, "-----");
    }

    @Override
    public int getThanhTien() {
        if(tienTe == "USD" || tienTe == "EURO")
            return getSoLuong()*getTiGia()*getDonGia();
        else
            return getSoLuong()*getDonGia();
    }

    public static String getTitle(){
        return String.format("%10s||%15s||%15s||%15s",GiaoDich.getTitle(), "Tỉ Giá", "Loại Tiền ", "Thành Tiền");
    }
    public String toString(){
        return String.format("%s||%15s||%15s||%15s", super.toString(),getTiGia(), getTienTe(), getThanhTien());
    }
}
