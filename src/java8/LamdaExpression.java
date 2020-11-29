package java8;

public class LamdaExpression {


    public static void main(String[] args) {

        MathOperation mathOperation = (a, b) -> a + b;

        GreetingService greetingService = (message) -> "hi " + message;

        GreetingService greetingService1 = (message -> "i am missing " + message);

        System.out.println(greetingService.sayHello("Hieu"));
        System.out.println(greetingService1.sayHello("you"));
        System.out.println(mathOperation.add(0,3000));


        SayHelloMethodReferent methodReferent = (System.out::println);

        methodReferent.sayHello("kien");
    }

    @FunctionalInterface
    interface MathOperation{

        int add (int a,int b);
    }

    interface GreetingService {
        String sayHello(String message);
    }

    interface SayHelloMethodReferent{

        void sayHello(String message);

    }

}
