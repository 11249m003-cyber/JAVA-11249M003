Interface Student {
    void studentDetails();
}
Interface Sports {
    void sportsDetails();
}

class Result implements Student, Sports {

    public void studentDetails() {
        System.out.println("Student Name: Rahul");
        System.out.println("Roll Number: 101");
    }

    public void sportsDetails() {
        System.out.println("Sports: Cricket");
        System.out.println("Score: 90");
    }

    public static void main(String[] args) {
        Result r = new Result();

        r.studentDetails();
        r.sportsDetails();
    }
}
