package TinhChatTrongJava.DongGoi;

public class ClassCon extends Cha {

    @Override
    public int insert(int a) {
        return a+10;
    }

    @Override
    public int insert(int a, int b) {
        return super.insert(a, this.defaul);
    }




}
