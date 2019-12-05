package Demo_CK14;

import java.util.Scanner;

public class DaGiac {

     protected  int soCanh;
    protected int [] kichThuocCacCanh;



    public  DaGiac(int soCanh){
        this.soCanh=soCanh;
        this.kichThuocCacCanh = new int[soCanh];
    }

    public int getSoCanh() {
        return soCanh;
    }

    public void setSoCanh(int soCanh) {
        this.soCanh = soCanh;
    }

    public int[] getKichThuocCacCanh() {
        return kichThuocCacCanh;
    }

    public void setKichThuocCacCanh(int[] kichThuocCacCanh) {
        this.kichThuocCacCanh = kichThuocCacCanh;
    }

    public void inSoCanh(){
        for (int i=0;i<this.soCanh;i++){
            System.out.printf("\nDo dai : "+this.kichThuocCacCanh[i]);
        }

        System.out.printf("\nChu vi : "+tinhChuVi());
    }

    public void nhapTTCacCanh(){
        for (int i=0;i<this.soCanh;i++){
            System.out.printf("\nNhap TT canh :\n");
            this.kichThuocCacCanh[i] = new Scanner(System.in).nextInt();
        }
    }

    public int tinhChuVi(){
            int chuvi=0;
        for (int i=0;i<this.soCanh;i++){
           chuvi = chuvi+this.kichThuocCacCanh[i];
        }
        return chuvi;
    }



}
