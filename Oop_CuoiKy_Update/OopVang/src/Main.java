import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.lang.String;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static GiaoDichTienTe nhapGD(GiaoDichTienTe gdtt) {
        System.out.println("Nhập mã giao dịch: ");
        gdtt.setMaGD(sc.nextInt());
        System.out.println("Nhập đơn giá: ");
        gdtt.setDonGia(sc.nextInt());
        System.out.println("Nhập số lượng:");
        gdtt.setSoLuong(sc.nextInt());
        System.out.println("Nhập loại tiền: ");
        boolean flag=true;
        int select=0;
        do {
            System.out.println(
                    "1. USD.\n" +
                            "2. EURO.\n" +
                            "3. VND.\n");
            select = sc.nextInt();
            switch (select){
                case 1:
                    gdtt.setLoaiTienTe(GiaoDichTienTe.LoaiTienTe.USD);
                    flag=false;
                    break;
                case 2:
                    gdtt.setLoaiTienTe(GiaoDichTienTe.LoaiTienTe.EURO);
                    flag=false;
                    break;
                case 3:
                    gdtt.setLoaiTienTe(GiaoDichTienTe.LoaiTienTe.VND);
                    flag=false;
                    break;
                default:
                    System.out.println("Không có trong lựa chọn, vui lòng chọn lại");
                    break;
            }
        }
        while (flag);
        System.out.println("Nhập tỉ giá: ");
        gdtt.setTiGia(sc.nextInt());
        return gdtt;
    }
    static GiaoDichVang nhapGD(GiaoDichVang gdv){
        System.out.println("Nhập mã giao dịch: ");
        gdv.setMaGD(sc.nextInt());
        System.out.println("Nhập đơn giá: ");
        gdv.setDonGia(sc.nextInt());
        System.out.println("Nhập số lượng: ");
        gdv.setSoLuong(sc.nextInt());
        System.out.println("Nhập loại vàng: ");
        gdv.setLoaiVang(sc.next());
        return gdv;
    }

    public static void main(String[] args){
        DanhSachGiaoDich danhSachGiaoDich=new DanhSachGiaoDich();
        int a, n = 0;
        boolean flag = true;
        do {
            System.out.println("Bạn chọn làm gì?");
            System.out.println(
                    "1. Nhập giao dịch tiền tệ.\n" +
                            "2. Nhập giao dịch vàng.\n" +
                            "3. Xuất giao dịch tiền tệ.\n" +
                            "4. Xuất giao dịch vàng.\n" +
                            "5. Xuất tổng só giao dịch tiền tệ.\n" +
                            "6. Xuất tổng số giao dịch vàng.\n" +
                            "7. Xuất trung bình thành tiền giao dịch tiền tệ.\n" +
                            "8. Xuất trung bình thành tiền giao dịch vàng.\n" +
                            "9. Xuất giao dịch theo đơn giá.\n"
            );
            a = sc.nextInt();
            switch (a){
                case 1:
                    System.out.println("Nhập số lượng đơn cần nhập: ");
                    n = sc.nextInt();
                    for (int i=0;i<n;i++){
                        System.out.println("Nhập đơn thứ "+ (i+1)+": ");
                        GiaoDichTienTe gdtien = new GiaoDichTienTe();
                        danhSachGiaoDich.themGiaoDichTienTe(nhapGD(gdtien));
                    }
                    System.out.println("Đã nhập xong!\n");
                    break;
                case 2:
                    System.out.println("Nhập số lượng đơn cần nhập: ");
                    n = sc.nextInt();
                    for (int i=0;i<n;i++){
                        System.out.println("Nhập đơn thứ "+ (i+1)+": ");
                        GiaoDichVang gdVang = new GiaoDichVang();
                        danhSachGiaoDich.themGiaoDichVang(nhapGD(gdVang));
                    }
                    System.out.println("Đã nhập xong!\n");
                    break;

                case 3:
                    danhSachGiaoDich.xuatDanhSachGiaoDichTienTe();
                    break;
                case 4:
                    danhSachGiaoDich.xuatDanhSachGiaoDichVang();
                    break;
                case 5:
                    danhSachGiaoDich.xuatTongSoLuongGiaoDich(true);
                    break;
                case 6:
                    danhSachGiaoDich.xuatTongSoLuongGiaoDich(false);
                    break;
                case 7:
                    danhSachGiaoDich.xuatTrungBinhThanhTienGiaoDich(true);
                    break;
                case 8:
                    danhSachGiaoDich.xuatTrungBinhThanhTienGiaoDich(false);
                    break;
                case 9:
                    System.out.println("Nhập đơn giá: ");
                    n = sc.nextInt();
                    danhSachGiaoDich.xuatDanhSachGiaoDichTheoDG(n);
                    break;
                default:
                    System.out.println("Chào tạm biệt!");
                    flag = false;
                    break;
            }
        } while (flag);

    }
}