class Student {

    int id;

    Student(int id) {
        this.id = id;
    }
}

public class garbageColl {

    public static void main(String[] args) {

        Student s1 = new Student(1);
        Student s2 = new Student(2);

        System.out.println("Objects created");

        s1 = null;
        s2 = null;

        System.out.println("Objects eligible for garbage collection");

        System.gc();

        System.out.println("Garbage collection requested");
    }
} 