package LopVaDoiTuong;

import java.util.Scanner;

public class CD {

    private int id;
    private String tuaCD;
    private String tenCS;
    private int soBai;
    private double giaThanh;

    public CD(int id, String tuaCD, String tenCS, int soBai, double giaThanh) {
        this.id = id;
        this.tuaCD = tuaCD;
        this.tenCS = tenCS;
        this.soBai = soBai;
        this.giaThanh = giaThanh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }

    public String getTenCS() {
        return tenCS;
    }

    public void setTenCS(String tenCS) {
        this.tenCS = tenCS;
    }

    public int getSoBai() {
        return soBai;
    }

    public void setSoBai(int soBai) {
        this.soBai = soBai;
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(double giaThanh) {
        this.giaThanh = giaThanh;
    }


    @Override
    public String toString() {
        return "CD{" +
                "id=" + id +
                ", tuaCD='" + tuaCD + '\'' +
                ", tenCS='" + tenCS + '\'' +
                ", soBai=" + soBai +
                ", giaThanh=" + giaThanh +
                '}';
    }

    public void input(){
        System.out.printf("nhap id:");
        this.id=new Scanner(System.in).nextInt();
        System.out.println("Nhập tựa cd :");
        this.tuaCD= new Scanner(System.in).nextLine();
        System.out.println("Nhập tên cs : ");
        this.tenCS= new Scanner(System.in).nextLine();
    }

}
