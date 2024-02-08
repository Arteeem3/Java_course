package lesson5;

public class Test20 {

    int summa(int a, int b, int c) {
        return a+b+c;
    }

    int srednee(int a1, int b1, int c1) {
        int result2 = summa(a1, b1, c1)/3;
        return result2;
    }
}

class Test21{

    public static void main(String[] args) {
        Test20 t = new Test20();
        int sum = t.summa(1, 2, 3);
        System.out.println(t.summa(5, 6, 7));

        System.out.println(t.srednee(20, 40, 60));
    }

}