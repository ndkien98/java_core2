package testAdapter;

public class Adapter implements PhoneTarger {



    CheckNumberAdaptee checkNumberAdaptee;
    public Adapter(){
        checkNumberAdaptee = new CheckNumberAdaptee();
    }


    @Override
    public boolean checkPhoneNumber(String input) {
        if (!checkNumberAdaptee.checkNumber(input)){
            return false;
        }
        if (input.length()>11||input.length()<10){
            return false;
        }
        return true;
    }


    public static void main(String[] args) {

        PhoneTarger phoneTarger = new Adapter();
        String a="sdjfsdkjfnskdf";
        if (phoneTarger.checkPhoneNumber(a)){
            System.out.printf("daay la sdt");
        }else System.out.printf("day la ky tu");

        CheckNumberAdaptee checkNumberAdaptee = new CheckNumberAdaptee();
        checkNumberAdaptee.checkNumber("sdasdasd");

    }




}
