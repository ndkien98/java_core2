package QuanLyDiem;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class main {
    public static void main(String[] args) throws ParseException {
        Scanner giris = new Scanner(System.in);
//        System.out.println("ngay:");
//        int d = giris.nextInt();
//        System.out.println("thang:");
//        int m = giris.nextInt();
//        System.out.println("nam:");
//        int y = giris.nextInt();
//        String tarih;
//        tarih = Integer.toString(d) + "/" + Integer.toString(m) + "/" + Integer.toString(y);
//        System.out.println("Tarih : " + tarih);
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        Date girilentarih = null;
//        girilentarih = dateFormat.parse(tarih);
//        System.out.println(dateFormat.format(girilentarih));
//
//        Nguoi nguoi = new Nguoi();
//        nguoi.nhapTT();
//        nguoi.inTT();

//        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
//        Calendar calendar = new GregorianCalendar();
//        //update a date
//        calendar.set(Calendar.YEAR, 1998);
//        calendar.set(Calendar.MONTH, 1);
//        calendar.set(Calendar.DAY_OF_MONTH,25 );
//        System.out.println("\ntest : ");
//        String test = new Scanner(System.in).nextLine();
//        System.out.println(test);
//        System.out.println(sdf.format(calendar.getTime()));
//
//        float a = (float) 20.5;
//        float b= 11;
//        float c = a/b;
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);



//        SinhVien sinhVien = new SinhVien();
//        sinhVien.nhapTTSV();
//        sinhVien.inTTSV();

//        MonHoc monHoc = new MonHoc("1","java",3,10, (float) 3.5,4);
//        monHoc.diem_HP_XL_QD();
//        monHoc.inTT_MH();


        QLSV qlsv = new QLSV();
        qlsv.nhapTT();
        qlsv.inDSSV();
        qlsv.timSVTheoMSV("611292");
        qlsv.timSVTheoNgayThangNamSinh(25,02,1998);

//        Nguoi nguoi = new Nguoi();
//        nguoi.nhapTT();
//        nguoi.inTTN();

    }
}
