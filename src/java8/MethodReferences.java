package java8;

import java.util.Arrays;

/**
 * https://gpcoder.com/3882-phuong-thuc-tham-chieu-trong-java-8-method-references/
 */

public class MethodReferences {


    public static void main(String[] args) {

        String[] stringArray = { "Java", "C++", "PHP", "C#", "Javascript" };

        Arrays.sort(stringArray, String::compareToIgnoreCase);
        for (String str : stringArray) {
            System.out.println(str);
        }
    }
}

 class StringV2 {

    int compareToIgnoreCase(String a){
        return -1;
    }

}
