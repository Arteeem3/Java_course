package lesson6;

public class MethodOverLoading {
    void show(int i1) {
        System.out.println(i1);
    }

    void show(boolean b1) {
        System.out.println(b1);
    }

    void show(String s1) {
        System.out.println(s1);
    }
}

class MethodOverLoadingTest {
    public static void main(String[] args) {
        MethodOverLoading mO = new MethodOverLoading();
        int a=500;
        mO.show(a);
        boolean b=true;
        mO.show(b);


    }
}