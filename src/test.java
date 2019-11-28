import java.util.Scanner;

public class test {

    static String  mess;
    static int n;
    public static void main(String[] args) {

        System.out.printf("Tôi là lapTop của bạn đây ");


        System.out.printf("Sao mà vẫn chưa ngủ thế ?");
        System.out.printf("\n");
        System.out.printf("1 : Làm điều có lỗi vs tró thảo");
        System.out.printf("\n2 :Không làm gì sai cả");
        do {
            n = new Scanner(System.in).nextInt();
            if (n == 2) {
                System.out.printf("Cho xem xét lại");
            }
        } while (n == 2);
        if (n == 1) {
            System.out.printf("Nhập vào điều muốn nói vs bạn thảo !");
            System.out.printf("\n rồi xin lỗi bạn thảo 10000 lần đê");
            test.mess = new Scanner(System.in).nextLine();
            for (int i = 0; i < 10000; i++) {
                int index=i+1;
                System.out.printf("\n");
                System.out.printf(index+":"+test.mess);
            }
            System.out.printf("\nLần sau còn làm bạn thảo giận không ");
            System.out.printf("\n1 : co ");
            System.out.printf("\n2: khong");
            test.mess = new Scanner(System.in).nextLine();

            if (mess.equals("co")) {
                System.out.printf("Cho trả lời lại ");
                test.mess = new Scanner(System.in).nextLine();
                if (test.mess.equals("khong")){
                    System.out.printf("Đệ tử đã trừng trị bạn kiên xong r \n");
                    System.out.printf("CHụy thảo đừng giận nữa :) ");
                }
            } else if (mess.equals("khong")) {
                System.out.printf("Đệ tử đã trừng trị bạn kiên xong r \n");
                System.out.printf("CHụy thảo đừng giận nữa :) ");
            }

        }

    }
    }
