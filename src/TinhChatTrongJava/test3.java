package TinhChatTrongJava;

import TinhChatTrongJava.DongGoi.Cha;
import TinhChatTrongJava.DongGoi.ClassCon;
import TinhChatTrongJava.DongGoi.TestDefaul;

public class test3 extends Cha {
    TestDefaul testDefaul = new TestDefaul();
    Cha cha = new Cha();
    ClassCon classCon = new ClassCon();

    public void inra (){
        System.out.println(this.BienProtected);
        this.methodProtected();
    }


}
