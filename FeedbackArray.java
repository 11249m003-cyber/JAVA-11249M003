import java.util.Scanner;
class FeedbackArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ratings[] = new int[5];
        int sum = 0;
        double average;

        System.out.println("Enter 5 feedback ratings:");

        for (int i = 0; i < 5; i++) {
            ratings[i] = sc.nextInt();
            sum = sum + ratings[i];
        }

        average = sum / 5.0;

        System.out.println("Total Ratings: " + sum);
        System.out.println("Average Rating: " + average);
    }
}
