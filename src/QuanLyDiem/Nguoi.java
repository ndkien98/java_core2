package QuanLyDiem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Nguoi {

    private String hoTen;
    private Date ngaySinh;
    private String queQuan;
    private int day,month,year;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Nguoi() {
    }

    public String toStringN() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "Nguoi{" +
                "hoTen='" + hoTen + '\'' +
                ", ngaySinh=" + simpleDateFormat.format(this.ngaySinh) +
                ", queQuan='" + queQuan + '\'' +
                '}';
    }

    public void nhapTT() throws ParseException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Nhap ho ten : ");
        this.hoTen =scanner.nextLine();

        System.out.println("\nNhap vao ngay sinh : ");
        this.day = scanner.nextInt();
        System.out.println("\nNhap vao thang sinh :");
        this.month = scanner.nextInt();
        System.out.println("\nNhap nam sinh :");
        this.year = scanner.nextInt();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String date_S = Integer.toString(day)+"/"+Integer.toString(month)+"/"+Integer.toString(year);
        ngaySinh=sdf.parse(date_S);
        System.out.println("\nNhap vao que quan :");
        this.queQuan = new Scanner(System.in).nextLine();


    }

    public void inTTN(){
        System.out.println(this.toStringN());
    }

}
