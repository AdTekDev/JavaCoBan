public class Class_ConNguoi {

    String HoTen;
    int  Tuoi;
    int SoChan, SoTay;
    String  GioiTinh;

    public  Class_ConNguoi(String ten, String gioi, int tuoi) 
    {
        this.HoTen = ten;
        this.GioiTinh = gioi;
        this.Tuoi = tuoi;
        this.SoTay = 2;
        this.SoChan = 2;
    }

    public String  GioiThieu() {
        return "Toi la " + this.HoTen;
    }
}