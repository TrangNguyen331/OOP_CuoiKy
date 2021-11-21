import java.time.LocalDate;
public class GDTiente extends GiaoDich{
    private int tiGia;
    private String tienTe;

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
        if(tienTe.equalsIgnoreCase("VN") ||
                tienTe.equalsIgnoreCase("USA") ||
                tienTe.equalsIgnoreCase("VN"))
        this.tienTe = tienTe;
    else
        this.tienTe="-----";
    }
}
