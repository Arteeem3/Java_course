package lesson4;

public class Student {
    int number;
    String name;
    String surname;
    int year;
    int midmath;
    int mideco;
    int mideng;
}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();

        st1.name = "a";
        st1.midmath = 2;
        st1.mideco = 2;
        st1.mideng = 2;

        st2.name = "b";
        st2.midmath = 5;
        st2.mideco = 4;
        st2.mideng = 5;

        st3.name = "c";
        st3.midmath = 3;
        st3.mideco = 4;
        st3.mideng = 5;

        System.out.println("Student " + st1.name + " mid score: " + (st1.midmath+st1.mideco+st1.mideng)/3);
        System.out.println("Student " + st2.name + " mid score: " + (st2.midmath+st2.mideco+st2.mideng)/3);
        System.out.println("Student " + st3.name + " mid score: " + (st3.midmath+st3.mideco+st3.mideng)/3);

    }
}