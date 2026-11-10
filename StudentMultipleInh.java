class Student {
    int rollNo;
    String name;

    void displayStudent() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
    }
}
class Marks extends Student {
    int m1, m2, m3, m4, m5;

    void displayMarks() {
        System.out.println("Marks: " + m1 + " " + m2 + " " + m3 + " " + m4 + " " + m5);
    }
}
class Result extends Marks {
    int total;
    double average;
    String grade;
    void calculate() {
        total = m1 + m2 + m3 + m4 + m5;
        average = total / 5.0;

        if (average >= 90)
            grade = "A";
        else if (average >= 75)
            grade = "B";
        else if (average >= 60)
            grade = "C";
        else if (average >= 40)
            grade = "D";
        else
            grade = "F";
    }

    void displayResult() {
        displayStudent();
        displayMarks();
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
    public static void main(String[] args) {
        Result r = new Result();

        r.rollNo = 101;
        r.name = "Rahul";

        r.m1 = 90;
        r.m2 = 85;
        r.m3 = 80;
        r.m4 = 95;
        r.m5 = 90;

        r.calculate();
        r.displayResult();
    }
}
