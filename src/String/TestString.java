package String;

class A {
    void foo(int a){
        System.out.println(a);
        System.out.println(a%10);
        if(a%10!=0){
            System.out.println("inside foo!!");
            foo(a/10);
        }
        System.out.println("check before ");
        System.out.println(a%10);
        System.out.println("check after");
    }
}

public class TestString {
    public static void main(String[] args) {
//        String s = "this is indra";
//        System.out.println(s.substring(0, 10));
        A  a = new A();
        a.foo(1234);
    }
}

