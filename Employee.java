class Employee {
    int empId;
    String name;
    double basicSalary;

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class PermanentEmployee extends Employee {
    double HRA, DA, grossSalary;

    void calculateSalary() {
        HRA = basicSalary * 0.20;
        DA = basicSalary * 0.10;
        grossSalary = basicSalary + HRA + DA;
    }

    void displayDetails() {
        display();
        System.out.println("HRA: " + HRA);
        System.out.println("DA: " + DA);
        System.out.println("Gross Salary: " + grossSalary);
    }

    public static void main(String[] args) {
        PermanentEmployee e = new PermanentEmployee();

        e.empId = 101;
        e.name = "Rahul";
        e.basicSalary = 20000;

        e.calculateSalary();
        e.displayDetails();
    }
}
