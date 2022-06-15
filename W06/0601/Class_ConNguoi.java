public class Class_ConNguoi {

    String HoTen;
    int  Tuoi;
    String  GioiTinh;
    String CCCD;
    int SoChan, SoTay;    
    int SoCon;
    String [] dsCCCDcuaCon;
    


    public  Class_ConNguoi(String ten, String gioi, int tuoi, String CCCD) 
    {
        this.HoTen = ten;
        this.GioiTinh = gioi;
        this.Tuoi = tuoi;
        this.SoTay = 2;
        this.SoChan = 2;
        this.CCCD = CCCD;
        this.SoCon = 0;
        this.dsCCCDcuaCon = null;
    }

    public void suaThongTinConCai(int socon, String [] ds) {
        this.SoCon = socon>0?socon:0;
        this.dsCCCDcuaCon = ds;
    }

    public String  GioiThieu() {
        return "Toi la " + this.HoTen
        + ".\n\t " + this.Tuoi + " tuoi. "
        + "\n\t " + this.GioiTinh   + " gioi. "  
        + "\n\t CCCD " + this.CCCD   
        + ".\n\t co " + this.SoCon   + " nguoi con. "    
        ;
    }
}