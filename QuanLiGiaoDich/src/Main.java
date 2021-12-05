import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        DanhSachGD GD = new DanhSachGD(10);
        GD.themDG(new GDTiente("GD01", LocalDate.now(),100,100,23000,"USD"));
        GD.themDG(new GDTiente("GD02", LocalDate.now(),100,100,26000,"EURO"));
        GD.themDG(new GDTiente("GD03", LocalDate.now(),1000000,100,1,"VND"));
        GD.themDG(new GDVang("GD04",LocalDate.now(),35500000,50,"SJC 14K"));
        GD.themDG(new GDVang("GD05",LocalDate.now(),39000000,20,"SJC 18K"));
        GD.themDG(new GDVang("GD06",LocalDate.now(),52500000,15,"SJC 24K"));

        System.out.println("Danh sách các giao dịch tiền tệ:\n" + GDTiente.getTitle());
        GD.xuatGDTT();
        System.out.println("Danh sách các giao dịch vàng :\n" + GDVang.getTitle());
        GD.xuatGDVang();
    }
}
