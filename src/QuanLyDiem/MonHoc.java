package QuanLyDiem;

import java.util.Scanner;

public class MonHoc {

    private String maMH;
    private String tenMH;
    private int soTC;
    private int diemCC;
    private float gk;
    private float ck;
    private float diemHP;
    private String xepLoai;
    private float diemQD;



    public float getDiemQD() {
        return diemQD;
    }

    public void setDiemQD(float diemQD) {
        this.diemQD = diemQD;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }

    public int getDiemCC() {
        return diemCC;
    }

    public void setDiemCC(int diemCC) {
        this.diemCC = diemCC;
    }

    public float getGk() {
        return gk;
    }

    public void setGk(float gk) {
        this.gk = gk;
    }

    public float getCk() {
        return ck;
    }

    public void setCk(float ck) {
        this.ck = ck;
    }

    public float getDiemHP() {
        return diemHP;
    }

    public void setDiemHP(float diemHP) {
        this.diemHP = diemHP;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }

    public MonHoc(String maMH, String tenMH, int soTC, int diemCC, float gk, float ck) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soTC = soTC;
        this.diemCC = diemCC;
        this.gk = gk;
        this.ck = ck;
    }

    public MonHoc() {
    }

    public float tinhDiemHP(){
        return (this.diemCC + this.gk*3 + this.ck*6)/10;
    }

    public String xepLoai(){
        if (this.tinhDiemHP()<4 && this.tinhDiemHP()>0)return "F";
        else if (this.tinhDiemHP()>3.9 && this.tinhDiemHP()<=4.9) return "D";
        else if (this.tinhDiemHP()>4.9 && this.tinhDiemHP()<=5.4) return "D+";
        else if (this.tinhDiemHP()>5.4 && this.tinhDiemHP()<=6.4) return "C";
        else if (this.tinhDiemHP()>6.4 && this.tinhDiemHP()<=6.9) return "C+";
        else if (this.tinhDiemHP()>6.4 && this.tinhDiemHP()<=7.4) return "B";
        else if (this.tinhDiemHP()>7.4 && this.tinhDiemHP()<=8.4) return "B+";
        else if (this.tinhDiemHP()>8.4 && this.tinhDiemHP()<=10) return "A";
        return "Erro";
    }

    public float diemQD(){
        if (this.tinhDiemHP()<4 && this.tinhDiemHP()>0)return 0;
        else if (this.tinhDiemHP()>3.9 && this.tinhDiemHP()<=4.9) return 1;
        else if (this.tinhDiemHP()>4.9 && this.tinhDiemHP()<=5.4) return (float) 1.5;
        else if (this.tinhDiemHP()>5.4 && this.tinhDiemHP()<=6.4) return 2;
        else if (this.tinhDiemHP()>6.4 && this.tinhDiemHP()<=7.4) return (float) 2.5;
        else if (this.tinhDiemHP()>6.4 && this.tinhDiemHP()<=6.9) return 3;
        else if (this.tinhDiemHP()>7.4 && this.tinhDiemHP()<=8.4) return (float) 3.5;
        else if (this.tinhDiemHP()>8.4 && this.tinhDiemHP()<=10) return 4;

        return 0;
    }

    public void nhapTT_MD(){
        System.out.println("\nNhap ma MH : ");
        this.maMH = new Scanner(System.in).nextLine();
        System.out.println("\nNhap ten MH :");
        this.tenMH = new Scanner(System.in).nextLine();
        System.out.println("\nNhap so TC :");
        this.soTC = new Scanner(System.in).nextInt();
        System.out.println("\nNhap diem chuyen can:  ");
        this.diemCC = new Scanner(System.in).nextInt();
        System.out.println("\nNhap diem giua ky :");
        this.gk = new Scanner(System.in).nextFloat();
        System.out.println("\nNhap diem cuoi ky :");
        this.ck = new Scanner(System.in).nextFloat();
        diem_HP_XL_QD();
    }

    @Override
    public String toString() {
        return "MonHoc{" +
                "maMH='" + maMH + '\'' +
                ", tenMH='" + tenMH + '\'' +
                ", soTC=" + soTC +
                ", diemCC=" + diemCC +
                ", gk=" + gk +
                ", ck=" + ck +
                ", diemHP=" + diemHP +
                ", xepLoai='" + xepLoai + '\'' +
                ", diemQD=" + diemQD +
                '}';
    }

    public void inTT_MH(){
        System.out.println(this.toString());
    }

    public void diem_HP_XL_QD(){
        this.diemHP = this.tinhDiemHP();
        this.xepLoai = this.xepLoai();
        this.diemQD = this.diemQD();
    }

}
