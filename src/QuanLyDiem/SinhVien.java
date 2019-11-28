package QuanLyDiem;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SinhVien extends Nguoi {

    private String msv;
    private String lop;
    private String khoa;
    private List<MonHoc> dsMonHoc;


    public SinhVien(String msv, String lop, String khoa, List<MonHoc> dsMonHoc) {
        this.msv = msv;
        this.lop = lop;
        this.khoa = khoa;
        this.dsMonHoc = dsMonHoc;
    }

    public SinhVien() {
        this.dsMonHoc = new ArrayList<>();
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public List<MonHoc> getDsMonHoc() {
        return dsMonHoc;
    }

    public void setDsMonHoc(List<MonHoc> dsMonHoc) {
        this.dsMonHoc = dsMonHoc;
    }

    public void nhapDSMH(){
        int n ;
        System.out.println("Nhap vao so mon hoc : ");
        n = new Scanner(System.in).nextInt();
        for (int i=0;i<n;i++){
            MonHoc monHoc = new MonHoc();
            monHoc.nhapTT_MD();
            dsMonHoc.add(monHoc);
        }
    }

    public void nhapTTSV(){
        try {
            this.nhapTT();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("\nNhap MSV : ");
        this.msv = new Scanner(System.in).nextLine();
        System.out.println("\nNhap lop : ");
        this.lop = new Scanner(System.in).nextLine();
        System.out.println("\nNhap khoa :");
        this.khoa = new Scanner(System.in).nextLine();

        this.nhapDSMH();
    }


    public String toString() {
        return "SinhVien{" +
                "msv='" + msv + '\'' +
                ", lop='" + lop + '\'' +
                ", khoa='" + khoa + '\'' +
                '}';
    }

    public void inTTSV(){
        this.inTTN();
        System.out.println(this.toString());
        for (MonHoc m:dsMonHoc
             ) {
            m.inTT_MH();
        }
        System.out.println("\nDiem trung binh HK : "+this.tinhTBHK());
        this.xepLoaiHK();
    }

    public float tinhTBHK(){
        float Tong_diem_QD = 0,Tong_TC=0;

        for (MonHoc m:this.dsMonHoc
             ) {
            Tong_diem_QD=+(m.diemQD()+m.getSoTC());
            Tong_TC=+m.getSoTC();
        }
        return Tong_diem_QD/Tong_TC;
    }

    public void xepLoaiHK(){

        if (this.tinhTBHK()<=1){
            System.out.println("\nXep loai kem");
        }else if (this.tinhTBHK()<=2&&this.tinhTBHK()>1){
            System.out.println("\nXep loai :Yeu");
        }else if (this.tinhTBHK()<=2.5&&this.tinhTBHK()>2){
            System.out.println("\nXep loai : trung binh");
        }else if (this.tinhTBHK()<3.2&&this.tinhTBHK()>2.5){
            System.out.println("\nXep loai  : kha");
        }else if (this.tinhTBHK()>3.2&&this.tinhTBHK()<3.6){
            System.out.println("\nXep loai gioi");
        }else if (this.tinhTBHK()>3.6) System.out.println("\nXep loai : xuat sac");
    }


}
