
import java.util.Scanner;

class StringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first employee name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter second employee name: ");
        String name2 = sc.nextLine();

        System.out.println("First Name: " + name1);
        System.out.println("Second Name: " + name2);

        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Both names are same.");
        } else {
            System.out.println("Both names are different.");
        }

        System.out.println("Length of first name: " + name1.length());
        System.out.println("Uppercase: " + name1.toUpperCase());
        System.out.println("Lowercase: " + name2.toLowerCase());
    }
}
