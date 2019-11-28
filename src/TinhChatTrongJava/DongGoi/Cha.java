package TinhChatTrongJava.DongGoi;

public class Cha {

    public static int bienStactic=0;
    private int private1;
    int defaul;
    protected  int proteted;
    protected String BienProtected="Day la protected";

    public void ouput(){
        System.out.println(this.BienProtected);
    }

    protected void methodProtected(){
        System.out.println("day la ");
    }

    public int insert(int a ){
        return a;
    }

    public int insert(int a,int b ){
        return a+b;
    }

    public int insert(int a,int b,int c ){
        return a+b+c;
    }

    private int mtPrivate(){
        return 0;
    }

}
