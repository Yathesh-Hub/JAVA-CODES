class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
}

class Employee extends Person {
    private String employeeId;
    private String department;

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return this.employeeId;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return this.department;
    }
}

public class data {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setName("Alice");
        emp.setAge(30);
        emp.setEmployeeId("E123");
        emp.setDepartment("HR");

        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Department: " + emp.getDepartment());
    }
}
