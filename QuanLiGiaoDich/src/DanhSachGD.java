public class DanhSachGD {
    private GiaoDich[] danhSach;
    private int count;
    public DanhSachGD(int n){
        danhSach = new GiaoDich[n];
        count = 0;
    }
    public boolean themDG(GiaoDich a){
        for(int i = 0; i<count;i++){
            if(danhSach[i].getMaGD().equalsIgnoreCase(a.getMaGD()))
                return false;
        }
        danhSach[count] = a;
        count++;
        return true;
    }
    public  void xuatGDTT() {
        for (int i = 0; i < count; i++) {
            if(danhSach[i] instanceof GDTiente)
                System.out.println(danhSach[i]);
        }
    }
    public  void xuatGDVang() {
        for (int i = 0; i < count; i++) {
            if(danhSach[i] instanceof GDVang)
                System.out.println(danhSach[i]);
        }
    }
}
