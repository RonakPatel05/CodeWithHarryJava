// package .vscode;

public class overloadingg {
    static void foo() {
        System.out.println("good moring bro");
    }

    static void foo(int a) {
        System.out.println("good moring " + a + "bro");
    }

    public static void main(String[] args) {

        foo();
        foo(341);

    }

}
//same name but different argument
