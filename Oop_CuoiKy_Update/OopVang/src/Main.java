import java.util.Scanner;
import java.lang.String;

public class Main {
    static Scanner sc = new Scanner(System.in); // Tạo 1 đối tượng Scanner có tên đầu vào,System.in được sử dụng để lấy đầu vào từ đầu vào tiêu chuẩn
    static GiaoDichTienTe nhapGD(GiaoDichTienTe gdtt) { //Dùng để nhập dữ liệu giao dịch tiền tệ từ bàn phím
        System.out.println("Nhập mã giao dịch: ");
        gdtt.setMaGD(sc.nextInt());
        System.out.println("Nhập đơn giá: ");
        gdtt.setDonGia(sc.nextInt());
        System.out.println("Nhập số lượng:");
        gdtt.setSoLuong(sc.nextInt());
        System.out.println("Nhập loại tiền: ");
        boolean flag=true;              //Đặt 3 dữ liệu bắt buộc nếu chọn khác 3 dữ liệu này thì cần chọn lại
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
    static GiaoDichVang nhapGD(GiaoDichVang gdv){//Dùng để nhập dữ liệu giao dịch vàng từ bàn phím
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
        DanhSachGiaoDich danhSachGiaoDich=new DanhSachGiaoDich(); //Tạo 1 danh sách giao dịch
        int a, n = 0;
        boolean flag = true;
        do {                                                //Các lựa chọn khi chạy chương trình
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
                case 1:                                         //Nhập số lương đơn giao dịch tiền tệ và mảng các giao dịch.Ví dụ khi điền số lượng đơn là 2 thì sẽ nhập
                    System.out.println("Nhập số lượng đơn cần nhập: "); // thông tin của 2 đơn giao dịch tiền tệ.Thông tin cần nhập được ghi ở
                    n = sc.nextInt();                                    // static GiaoDichTienTe nhapGD(GiaoDichTienTe gdtt)
                    for (int i=0;i<n;i++){
                        System.out.println("Nhập đơn thứ "+ (i+1)+": ");
                        GiaoDichTienTe gdtien = new GiaoDichTienTe();
                        danhSachGiaoDich.themGiaoDichTienTe(nhapGD(gdtien));
                    }
                    System.out.println("Đã nhập xong!\n");
                    break;
                case 2:                                            //Nhập số lương đơn giao dịch vàng và mảng các giao dịch
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
                    danhSachGiaoDich.xuatDanhSachGiaoDichTienTe();  //Xuất các giao dịch tiền tệ vừa mới nhập từ bàn phím
                    break;
                case 4:
                    danhSachGiaoDich.xuatDanhSachGiaoDichVang();   //Xuất các giao dịch vàng vừa mới nhập từ bàn phím
                    break;
                case 5:
                    danhSachGiaoDich.xuatTongSoLuongGiaoDich(true);  //Xuất tổng số giao dịch tiền tệ đã nhập
                    break;
                case 6:
                    danhSachGiaoDich.xuatTongSoLuongGiaoDich(false); //Xuất tổng số giao dịch vàng đã nhập
                    break;
                case 7:
                    danhSachGiaoDich.xuatTrungBinhThanhTienGiaoDich(true); //Xuất trung bình tiền đã giao dịch tiền tệ
                    break;
                case 8:
                    danhSachGiaoDich.xuatTrungBinhThanhTienGiaoDich(false); //Xuất trung bình tiền đã giao dịch vàng
                    break;
                case 9:
                    System.out.println("Nhập đơn giá: "); //Xuất theo các đơn giá mà giao dịch đã nhập.Ví dụ nhập đơn giá 20000 thì sẽ xuất ra các giao dịch có đơn giá là
                    n = sc.nextInt();                        // 20000
                    danhSachGiaoDich.xuatDanhSachGiaoDichTheoDG(n);
                    break;
                default:
                    System.out.println("Chào tạm biệt!");//Nếu lựa chọn khác các số trên sẽ xuất ra dòng này và kết thúc chương trình.
                    flag = false;
                    break;
            }
        } while (flag); //Dùng để chạy tiếp tục chương trình nếu có lựa chọn khác trong các số trên

    }
}