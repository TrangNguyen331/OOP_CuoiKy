import java.util.ArrayList;
import java.util.List;

public class DanhSachGiaoDich {

    private List<GiaoDich> giaoDichs=new ArrayList<>(); //Tạo 1 danh sách giao dịch và duy trì thứ tự danh sách được thêm vào

    public void themGiaoDichVang(GiaoDichVang giaoDichVang){this.giaoDichs.add(giaoDichVang);}//Dùng để thêm giao dich vàng vào danh sách

    public void themGiaoDichTienTe(GiaoDichTienTe giaoDichTienTe){
        this.giaoDichs.add(giaoDichTienTe);
    } //Dùng để thêm giao dịch tiền tệ vào danh sách

    public void xuatDanhSachGiaoDichTienTe(){ //Sẽ xuất ra màn hình các cột tiêu đề của thuộc tính và khoảng các từng cột
        System.out.printf("%-15s || %-30s || %-15s || %-15s || %-15s || %-15s || %-15s \n","Mã giao dịch","Ngày giao dịch","Đơn giá","Số Lượng","Tỉ Giá","Loại Tiền Tệ","Thành tiền");


        for (GiaoDich giaoDich: giaoDichs //Duyệt danh sách giao dịch,giao dịch nào thuộc giao dịch tiền tệ thì xuất ra màn hình
        ) {
            if(giaoDich instanceof GiaoDichTienTe){
                giaoDich.inGiaoDich();
            }
        }
    }
    public void xuatDanhSachGiaoDichVang(){ //Sẽ xuất ra màn hình các cột tiêu đề của thuộc tính và khoảng các từng cột
        System.out.printf("%-15s || %-30s || %-15s || %-15s || %-15s || %-15s\n","Mã giao dịch","Ngày giao dịch","Đơn giá","Số Lượng","Loại Vàng","Thành tiền");

        for (GiaoDich giaoDich: giaoDichs) { //Duyệt danh sách giao dịch,giao dịch nào thuộc giao dịch vàng thì xuất ra màn hình
            if(giaoDich instanceof GiaoDichVang){
                giaoDich.inGiaoDich();
            }
        }
    }
    public void xuatTongSoLuongGiaoDich(boolean giaoDichTien){ // Duyệt danh sách giao dịch,nếu nó là giao dịch nào thì số lượng giao dịch đó sẽ tăng lên
        int soLuong=0;                                          //nếu true thì sẽ xuất ra giao dịch tiền tệ,false thì xuất ra giao dịch vàng
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
    public void xuatTrungBinhThanhTienGiaoDich(boolean giaoDichTien){ //Duyệt danh sách giao dịch,nếu nó là giao dịch nào thì sẽ xuất ra trung bình tiền của giao dịch đó
        int soLuong=0;                                                 //Nếu true thì xuất ra giao dịch tiền tệ,false thì xuất ra giao dịch vàng
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
    public void xuatDanhSachGiaoDichTheoDG(int n){      //Duyệt danh sach giao dịch, nếu đơn giá bằng với đơn giá cần tìm thì sẽ xuất ra giao dịch đó
        for (GiaoDich giaoDich: giaoDichs) {
            if(giaoDich.getDonGia()== n){
                giaoDich.inGiaoDich();
            }
        }
    }


}
