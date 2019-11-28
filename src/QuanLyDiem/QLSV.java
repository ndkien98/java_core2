package QuanLyDiem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLSV {

    private List<SinhVien> list;


    public List<SinhVien> getList() {
        return list;
    }

    public void setList(List<SinhVien> list) {
        this.list = list;
    }

    public QLSV(){
        list = new ArrayList<>();
    }

    public QLSV(List list){
        this.list=list;
    }

    public void nhapTT(){
        System.out.println("\nNhap vao so luong sinh vien :");
        int n = new Scanner(System.in).nextInt();
        System.out.println("\nNhap vao thong tin tung nhan vien : ");
        for (int i = 0; i < n; i++) {
            int j=i+1;
            System.out.println("\nSinh vien thứ "+j);
            SinhVien sinhVien = new SinhVien();
            sinhVien.nhapTTSV();
            list.add(sinhVien);
        }
    }

    public void inDSSV(){
        int i=0;
        System.out.println("\nThong tin ds sinh vien");
        for (SinhVien s:this.list
             ) {
            i++;
            System.out.println("\nSinh vien thứ :"+i);
            s.inTTSV();
        }
    }

    public void timSVTheoMSV(String msv){
        SinhVien sinhVien = null ;
        for (SinhVien s:this.list
             ) {
            if (s.getMsv().equals(msv)){
                sinhVien=s;
            }
        }
        if (sinhVien==null){
            System.out.println("\n Không tìm thấy sv : ");
        }else if (sinhVien!= null){
            System.out.println("\n Thong tin sv cần tìm : ");
            sinhVien.inTTSV();
        }
    }

    public void timSVTheoNgayThangNamSinh(int ngay,int thang,int nam){

        List<SinhVien> list = new ArrayList<>();
        for (SinhVien sinhVien:this.list
             ) {
            if (sinhVien.getDay()==ngay){
                if (sinhVien.getMonth()==thang){
                    if (sinhVien.getYear()==nam){
                        list.add(sinhVien);
                    }
                }
            }
        }

        System.out.println("\nDanh sách thông tin tìm theo ngày tháng năm sinh");
        for (SinhVien s:list
             ) {
            s.inTTSV();
        }
    }

}


