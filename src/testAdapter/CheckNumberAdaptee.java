package testAdapter;

public class CheckNumberAdaptee {

    public boolean checkNumber(String stirng){

        String regex="[0-9]+";
        return stirng.matches(regex);

    }


}
