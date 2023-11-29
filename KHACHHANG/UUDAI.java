package DOANOOP.KHACHHANG;

public class UUDAI extends KHACHHANG {
    private int diem;
    
    public UUDAI() {
        super();
    }
    
    public UUDAI(String loai, String maKH, String tenKH, String SDT, String DiaChi, Boolean GioiTinh, int diem) {
        super(loai, maKH, tenKH, SDT, DiaChi, GioiTinh);
        this.diem = diem;
    }
    
    public UUDAI(UUDAI uuDai) {
        super(uuDai);
        this.diem = uuDai.diem;
    }
    
    public int getDiem() {
        return diem;
    }
    
    public void setDiem(int diem) {
        this.diem = diem;
    }
}
