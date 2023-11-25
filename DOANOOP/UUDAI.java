package DOANOOP;

public class UU_DAI extends KH {
    private int diem;
    
    public UU_DAI() {
        super();
    }
    
    public UU_DAI(String loai, String maKH, String tenKH, String SDT, String DiaChi, Boolean GioiTinh, int diem) {
        super(loai, maKH, tenKH, SDT, DiaChi, GioiTinh);
        this.diem = diem;
    }
    
    public UU_DAI(UU_DAI uuDai) {
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

