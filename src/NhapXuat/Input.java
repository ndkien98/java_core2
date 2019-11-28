package NhapXuat;

import java.io.*;
import java.util.Scanner;

public class Input {

    static String  ten[] = new String [100];
    static int tuoi[] = new int [100];
  static   double luong[] = new double[100];
    int i=0;

    void read() throws FileNotFoundException {
        String line[] = new String [100];
        FileInputStream f = new FileInputStream("E:/javaCode/input.txt");
        Scanner input = new Scanner(f,"UTF-8");

        while (input.hasNextLine()){ // trong khi chua het file
            line[i]=input.nextLine(); // doc 1 dong
            if (line[i].trim()!=""){ // neu dong khong phai rong

                String item[] = line[i].split(",");// cat tat ca cac thong tin cua line bang dau ,
                ten[i] = item[0];
                tuoi[i]=Integer.parseInt(item[1]);
                luong[i]=Double.parseDouble(item[2]);
            }
            i++;
        }
        input.close();
    }

    void write() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("E:/javaCode/output.txt");
        PrintWriter printWriter = new PrintWriter(fileOutputStream);
        int j = 0;
        while (j < i) {
            printWriter.println(ten[j]);
            printWriter.println(tuoi[j]);
            printWriter.println(luong[j]);

            j++;
        }
        fileOutputStream.close();
    }

    public static void main(String[] args) throws IOException {

//        try {
//            BufferedReader in = new BufferedReader(new FileReader("E:/javaCode/input.txt"));
//            String srt;
//            while ((srt=in.readLine())!=null){
//                System.out.printf(srt);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        Input input = new Input();
//        input.read();
//        for (int i = 0; i <Input.ten.length ; i++) {
//            System.out.printf(Input.ten[i]+"");
//        }
        String i = "dm toy r";
        for (;;){
            System.out.printf(i);
            System.out.printf("\n");
        }

    }

}
