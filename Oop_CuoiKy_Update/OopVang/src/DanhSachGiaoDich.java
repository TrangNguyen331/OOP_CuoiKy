import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DanhSachGiaoDich {

    private List<GiaoDich> giaoDichs=new ArrayList<>();

    public void themGiaoDichVang(GiaoDichVang giaoDichVang){
        this.giaoDichs.add(giaoDichVang);
    }

    public void themGiaoDichTienTe(GiaoDichTienTe giaoDichTienTe){
        this.giaoDichs.add(giaoDichTienTe);
    }

    public void xuatDanhSachGiaoDichTienTe(){
        System.out.printf("%-15s || %-30s || %-15s || %-15s || %-15s || %-15s || %-15s \n","Mã giao dịch","Ngày giao dịch","Đơn giá","Số Lượng","Tỉ Giá","Loại Tiền Tệ","Thành tiền");
        giaoDichs.sort(new Comparator<GiaoDich>() {
            @Override
            public int compare(GiaoDich o1, GiaoDich o2) {
                return o1.getMaGD()>o2.getMaGD()?1:0;
            }
        });
        for (GiaoDich giaoDich: giaoDichs
        ) {
            if(giaoDich instanceof GiaoDichTienTe){
                giaoDich.inGiaoDich();
            }
        }
    }
    public void xuatDanhSachGiaoDichVang(){
        System.out.printf("%-15s || %-30s || %-15s || %-15s || %-15s || %-15s\n","Mã giao dịch","Ngày giao dịch","Đơn giá","Số Lượng","Loại Vàng","Thành tiền");
        giaoDichs.sort(new Comparator<GiaoDich>() {
            @Override
            public int compare(GiaoDich o1, GiaoDich o2) {
                return o1.getMaGD()>o2.getMaGD()?1:0;
            }
        });
        for (GiaoDich giaoDich: giaoDichs) {
            if(giaoDich instanceof GiaoDichVang){
                giaoDich.inGiaoDich();
            }
        }
    }
    public void xuatTongSoLuongGiaoDich(boolean giaoDichTien){ // true thi in tong giao dich tien, false tong giao dich vang
        int soLuong=0;
        for (GiaoDich giaoDich : giaoDichs){
            if(giaoDichTien){
                if(giaoDich instanceof GiaoDichTienTe){
                    soLuong++;
                }
            }else {
                if(giaoDich instanceof GiaoDichVang){
                    soLuong++;
                }
            }
        }
        if(giaoDichTien){
            System.out.printf("Tổng giao dịch tiền tệ là:"+soLuong+"\n");
        }
        else {
            System.out.printf("Tổng giao dịch vàng là:"+soLuong+"\n");
        }
    }
    public void xuatTrungBinhThanhTienGiaoDich(boolean giaoDichTien){
        int soLuong=0;
        double tong=0;
        for (GiaoDich giaoDich : giaoDichs){
            if(giaoDichTien){
                if(giaoDich instanceof GiaoDichTienTe){
                    tong+=giaoDich.thanhTien();
                    soLuong++;
                }
            }else {
                if(giaoDich instanceof GiaoDichVang){
                    tong+=giaoDich.thanhTien();
                    soLuong++;
                }
            }
        }

        if(giaoDichTien){
            System.out.printf("Tổng trung bình giao dịch tiền tệ là:"+tong/soLuong+"\n");
        }
        else {
            System.out.printf("Tổng trung bình giao dịch vàng là:"+tong/soLuong+"\n");
        }
    }
    public void xuatDanhSachGiaoDichTheoDG(int n){
        for (GiaoDich giaoDich: giaoDichs) {
            if(giaoDich.getDonGia()== n){
                giaoDich.inGiaoDich();
            }
        }
    }


}
