package HomeworkLesson7;

public class Employee {

    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public Employee(int id2) {
        id = id2;
    }

    Employee (String surname2) {
        surname = surname2;
    }

    private Employee (double salary2) {
        salary = salary2;
    }

    double uveliczp() {
        salary *= 2;
        return salary;
    }

    public void getId() {
        System.out.println("ID = " + id);
    }


}
