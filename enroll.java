class Student {
    private String name;
    private int id;

    private static int totalStudentsEnrolled = 0;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        totalStudentsEnrolled++;
    }
    public static int getEnroll() {
        return totalStudentsEnrolled;
    }
    public void displayInfo() {
        System.out.println("Student Name: " + this.name + ", ID: " + this.id);
    }
}

class Course {
    private String title;
    private String code;
    private static int totalCoursesOffered = 0;

    public Course(String title, String code) {
        this.title = title;
        this.code = code;
        totalCoursesOffered++;
    }

    public static int getOffered() {
        return totalCoursesOffered;
    }
    public void displayInfo() {
        System.out.println("Course Title: " + this.title + ", Code: " + this.code);
    }
}

public class enroll{
    public static void main(String[] args) {

        Student s1 = new Student("Alice", 101);
        Student s2 = new Student("Bob", 102);

        int totalStudents = Student.getEnroll();

        System.out.println("Total Students Enrolled: " + totalStudents);
    }
}
