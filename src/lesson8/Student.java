package lesson8;

public class Student {

    String name;
    int course;
    static int count;
    int a;

    public Student(String name2, int course2) {
        count++;
        name = name2;
        course = course2;
        System.out.println("Student # " + count + " created");

    }

    public static void showCount() {
        System.out.println("Overall students created " + count);
    }

    public void showInfo() {
        System.out.println("Welcome to the student class!!!");
    }

    void abc() {
        a++;
        count++;
    }

    static void abcd() {
        count++;
        Student st2 = new Student("Kat", 3);
        st2.a++;
    }
    public static void main(String[] args) {
        abcd();
        Student st3 = new Student("Petr", 1);
        st3.abc();
    }
}

